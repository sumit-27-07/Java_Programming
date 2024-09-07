package accenture;

public class password_generate_ascii {

	public static void main(String[] args) {
		String ascii=" 787968021";
		String res="";
		for(int i=ascii.length()-1;i-1>=0;i-=2) {
			String x=String.valueOf(ascii.charAt(i))+String.valueOf(ascii.charAt(i-1));
			int y=Integer.parseInt(x);
			if(y<65 && i-2>=0) {
				x+=String.valueOf(ascii.charAt(i-2));
				y=Integer.parseInt(x);
				i--;
			}
			res+= (char)y;
			
		}
		System.out.println(res);
		
	}

}
