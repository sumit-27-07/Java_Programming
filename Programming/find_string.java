package accenture;

public class find_string {

	public static void main(String[] args) {
		String str1="Hello, World Sumit",str2="Sumit";
		for(int i=0;i<str1.length();i++) {
			int j=0;
			if(str1.charAt(i)==str2.charAt(j)) {
				String x=str1.substring(i, i+str2.length());
				boolean ch=str2.equals(x);
				if(ch) {
					System.out.println(i);
					break;
				}
			}
		}
		System.out.println(str1.indexOf("Sumit"));
	}

}
