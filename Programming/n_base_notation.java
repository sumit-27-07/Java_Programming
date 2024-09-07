package accenture;

public class n_base_notation {

	public static void main(String[] args) {
		StringBuilder st=new StringBuilder();
		int num=718,n=12;
		while(num>0) {
			int rem=num%n;
			if(rem>9) {
				int x=rem-10;
				char ch=(char)(65+x);
				st.append(ch);
			}
			else {
				st.append(rem);
			}
			num=num/12;
		}
		System.out.println(st.reverse().toString());
	}

}
