package accenture;

public class string_decrypt {

	public static void main(String[] args) {
		String str="vmxibkgrlm",res="";
		for(int i=0;i<str.length();i++) {
			int x=26-(str.charAt(i)-'a');
			char ch=(char) (96+x);
			res+=ch;
		}
		System.out.println(res);
	}

}
