package accenture;

public class replace_character {

	public static void main(String[] args) {
		String str="apples";
		char[] ch=str.toCharArray();
		char c1='a',c2='p';
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==c1) {
				ch[i]=c2;
			}
			else if(ch[i]==c2) {
				ch[i]=c1;
			}
		}
		String res=new String(ch);
		System.out.println(res);

	}

}
