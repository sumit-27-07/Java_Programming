package hit;
class humanbody{
	public void displayhuman() {
		System.out.println("Human Body Class");
	}
}
interface male {
	public void show();
}
interface female {
	public void show();
}
class child extends humanbody implements male,female{
	public void show() {
		System.out.println("Hybrid interface created");
	}
	public void child_show(){
		System.out.println("Child class Method");
	}
}
public class hybrid_inheritance {

	public static void main(String[] args) {
		child c1=new child();
		c1.show();
		c1.child_show();
	}

}
