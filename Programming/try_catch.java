package hit;

public class try_catch {

	public static void main(String[] args) {
		try {
			int x=5/0;
			System.out.println(x);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		try {
			int arr[]=new int[5];
			arr[6]=56;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
