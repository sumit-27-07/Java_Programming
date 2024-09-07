package hit;
class mythread1 extends Thread{
	public void run() {
		System.out.println("Thread using extending Thread class execute");
	}
}
class mythread2 implements Runnable{
	public void run() {
		System.out.println("Thread Using Runnable Interface execute");
	}
}
public class thread_implement {

	public static void main(String[] args) {
		mythread1 mt=new mythread1();
		mt.start();
		
		mythread2 mt2=new mythread2();
		Thread t=new Thread(mt2);
		t.start();
	}

}
