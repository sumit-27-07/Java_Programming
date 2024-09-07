package accenture;

import java.util.Arrays;

//Longest Substring without repeating character
public class longest_substring {

	public static void main(String[] args) {
		String str="abcabxyzmn";
		boolean[] ch=new boolean[26];
		Arrays.fill(ch, false);
		int count=0,max=0;
		for(int i=0;i<str.length();i++) {
			if(ch[str.charAt(i)-'a']==true) {
				if(count>max) {
					max=count;
				}
				count=0;
			}
			else {
				count++;
				ch[str.charAt(i)-'a']=true;
			}
			if(i==str.length()-1) {
				if(count>max) {
					max=count;
				}
			}
		}
		System.out.println(max);
	}

}
