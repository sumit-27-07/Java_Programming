package accenture;

public class decode_string {

	public static void main(String[] args) {
		String str="1011011101111111110",res="";
		int i=0;
		while(i<str.length()) {
			int c=0;
			while(str.charAt(i)!='0' && i<str.length()) {
				c++;
				
				if(i==str.length()-1) {
					break;
				}
				i++;
			}
			char ch=(char) (64+c);
			res=res+ch;
			i++;
		}
		System.out.println(res);
	}

}
