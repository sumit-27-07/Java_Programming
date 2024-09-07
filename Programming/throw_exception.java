package hit;

public class throw_exception {
	public static int divide(int a, int b) throws ArithmeticException{
		int c=a/b;
		return c;
	}
	public static void main(String[] args) {
		int x;
		try {
			x=divide(5,0);
			System.out.println(x);
		}
		catch(Exception e) {
			System.out.println("Exception occur");
		}
	}

}
