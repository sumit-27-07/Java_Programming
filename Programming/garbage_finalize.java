package hit;

public class garbage_finalize {
	public void finalize() {
		System.out.println("Garbage Collection");
	}
	public static void main(String[] args) {
		/*garbage_finalize g1=new garbage_finalize();
		g1=null;
		garbage_finalize g2=new garbage_finalize();
		g2=null;
		System.gc();*/
	}

}
