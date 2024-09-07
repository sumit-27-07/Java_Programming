package accenture;

import java.util.HashMap;
import java.util.HashSet;

public class cost_string_match {

	public static void main(String[] args) {
		String s1="ABD",s2="AABCCAD";
		HashMap<Character,Integer> hm1=new HashMap<>();
		HashMap<Character,Integer> hm2=new HashMap<>();
		for(int i=0;i<s1.length();i++) {
			if (hm1.containsKey(s1.charAt(i))){
				hm1.put(s1.charAt(i),hm1.get(s1.charAt(i))+1);
			}
			else {
				hm1.put(s1.charAt(i),1);
			}
		}
		System.out.println(hm1);
		for(int i=0;i<s2.length();i++) {
			if (hm2.containsKey(s2.charAt(i))){
				hm2.put(s2.charAt(i),hm2.get(s2.charAt(i))+1);
			}
			else {
				hm2.put(s2.charAt(i),1);
			}
		}
		System.out.println(hm2);
		HashSet<Character> hs=new HashSet<>();
		int sum=0;
		for(int i=0;i<s2.length();i++) {
			if(hs.contains(s2.charAt(i))) {
				continue;
			}
			else if(hm1.containsKey(s2.charAt(i))) {
				int x=hm2.get(s2.charAt(i))-hm1.get(s2.charAt(i));
				sum+=x;
				hs.add(s2.charAt(i));
			}
			else {
				sum+=hm2.get(s2.charAt(i));
				hs.add(s2.charAt(i));
			}
		}
		System.out.println(sum);
	}

}
