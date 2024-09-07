package accenture;

public class decode_message {

	public static void main(String[] args) {
		String input="2 1 4 _ 3 1 20 _ @ #4 5 9";
		String res="";
		for(int i=0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i))) {
				if(i+1<input.length()  && input.charAt(i+1)!=' ') {
					int x=Integer.parseInt(String.valueOf(input.charAt(i))+
							String.valueOf(input.charAt(i+1)));
					Character ch=(char) (64+x);
					res+=ch;
					i++;
				}
				else {
					Character c=(char) (64+Integer.parseInt(String.valueOf(input.charAt(i))));
					res+=c;
				}
			}
			else if(input.charAt(i)==' ') {
				continue;
			}
			else if(input.charAt(i)=='_') {
				res+=" ";
			}
			else if(input.charAt(i)=='#' && i+1<input.length()) {
				res+=String.valueOf(input.charAt(i+1));
				i++;
			}
			else {
				res+=input.charAt(i);
			}
		}
		System.out.println(res);

	}

}
