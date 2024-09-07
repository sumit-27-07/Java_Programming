package accenture;

public class longest_substring_ascii {

	public static void main(String[] args) {
		String str1="adventure",str2="turefu";
		/*if(str1.length()>str2.length()) {
			lstr=str1;
			mstr=str2;
		}
		else {
			lstr=str2;
			mstr=str1;
		}*/
		int max=0;
		for(int i=str2.length();i>0;i--) {
			String sb=str2.substring(0,i);
			if(str1.indexOf(sb)!=-1) {
				int sum=0;
				for(int j=0;j<sb.length();j++) {
					sum+=sb.charAt(j);
				}
				if(max<sum) {
					max=sum;
				}
				break;
			}
		}
		for(int i=0;i<str2.length();i++) {
			String sb=str2.substring(i,str2.length());
			if(str1.indexOf(sb)!=-1) {
				int sum=0;
				for(int j=0;j<sb.length();j++) {
					sum+=sb.charAt(j);
				}
				if(max<sum) {
					max=sum;
				}
				break;
			}
		}
		System.out.println(max);
	}

}
