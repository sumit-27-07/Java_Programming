package accenture.pattern;

public class floyd_triangle {

	public static void main(String[] args) {
		int k=1,n=4;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print((k++)+" ");
			}
			System.out.println();
		}
		float height=1.54f,weight=80;
		System.out.println("BMI:"+weight/(height*height));
	}

}
