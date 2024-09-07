package accenture;

public class palindrome_string {

	public static void main(String[] args) {
		String str="abba";
		int start=0,end=str.length()-1;
		boolean ch=true;
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				ch=false;
				break;
			}
			start++;
			end--;
			
		}
		if(ch) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		
	}

}
