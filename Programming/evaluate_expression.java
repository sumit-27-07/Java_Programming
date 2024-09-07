package accenture;
import java.util.*;
public class evaluate_expression {
	public static void main(String[] args) {
		String str = "2+3+5*4/2";
        ArrayList<Character> arrc = new ArrayList<>();
        ArrayList<Integer> arrn = new ArrayList<>();
        int cn = 0;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                arrn.add(cn);
                cn = 0;
                arrc.add(str.charAt(i));
            }
            if (Character.isDigit(str.charAt(i))) {
                char ch = str.charAt(i);
                cn = cn*10 + (ch - '0');
                if (i == str.length() - 1) {
                    arrn.add(cn);
                }
            }
        }

        // Step 1: Process * and /
        for (int i = 0; i < arrc.size(); i++) {
            char operator = arrc.get(i);
            if (operator == '*' || operator == '/') {
                int left = arrn.get(i);
                int right = arrn.get(i + 1);
                int result = 0;

                if (operator == '*') {
                    result = left * right;
                } else if (operator == '/') {
                    result = left / right;
                }

                arrn.set(i, result);
                arrn.remove(i + 1);
                arrc.remove(i);
                i--;
            }
        }
        System.out.println(arrn);
        // Step 2: Process + and -
        int finalResult = arrn.get(0);
        for (int i = 0; i < arrc.size(); i++) {
            char operator = arrc.get(i);
            int right = arrn.get(i + 1);

            if (operator == '+') {
                finalResult += right;
            } else if (operator == '-') {
                finalResult -= right;
            }
        }

        // Final output
        System.out.println(finalResult); // Output: 15
    

		
		
	}
}
