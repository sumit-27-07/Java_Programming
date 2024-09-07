package accenture;

import java.util.*;

public class lettered_number {

	public static void main(String[] args) {
		HashMap<Character,Integer> hm=new HashMap<>();
		hm.put('A', 1);
		hm.put('B', 10);
		hm.put('C', 100);
		hm.put('D', 1000);
		hm.put('E', 10000);
		hm.put('F', 100000);
		hm.put('G', 1000000);
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.next();
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(hm.containsKey(str.charAt(i))) {
				sum+=hm.get(str.charAt(i));
			}
		}
		System.out.println(sum);
		
	}

}
