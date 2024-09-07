package accenture.pattern;

public class pattern1 {

	public static void main(String[] args) {
		int n=4;
		for(int i=n;i>0;i--) {
			for(int j=n;j>0;j--) {
				int x=i;
				while(x>0) {
					System.out.print(j+" ");
					x--;
				}
			}
			System.out.println();
		}

	}

}
