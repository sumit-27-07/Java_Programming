package hit;

public class finally_block {
	public static int divide() {
		int a,b,x;
		try {
			a=5;
			b=0;
			x=a/b;
			return x;
		}
		catch(Exception e) {
			System.out.println("Exception occur");
		}
		finally {
			System.out.println("Code run successfully");
		}
		return -1;
	}
	public static void main(String[] args) {
		divide();
		/*if(divide()!=-1) {
			System.out.println(divide());
		}*/

	}

}
