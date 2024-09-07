package hit;
class object{
	int x;
}
public class test {
	public static void method(object o) {
		System.out.println("Object method");
	}
	public static void method(String s) {
		System.out.println("Object method");
	}
	public static void main(String[] args) {
		object obj=new object();
		method(obj);

	}

}
