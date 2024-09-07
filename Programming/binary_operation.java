package accenture;

public class binary_operation {

	public static void main(String[] args) {
		String str="0C1A1B0";
		int res=-1;
		res=Integer.parseInt(String.valueOf(str.charAt(0)));
		
		for(int i=1;i<str.length();i=i+2) {
			Character op=str.charAt(i);
			int sec=Integer.parseInt(String.valueOf(str.charAt(i+1)));
			if(op=='A') {
				res=res&sec;
			}
			else if(op=='B') {
				res=res|sec;
			}
			else if(op=='C'){
				res=res^sec;
			}
		}
		System.out.println(res);
	}

}
