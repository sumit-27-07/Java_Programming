package hit;

import java.util.Random;

class thread1 extends Thread{
	public void run() {
		Random rand = new Random();
        int ri = rand.nextInt(100);
        System.out.println("Random Integers: "+ri);
	}
}
class thread2 extends Thread{
	int a;
	public void run() {
		int x=this.a;
		int sq=x*x;
		if (sq%2==1) {
			System.out.println("Square of "+x+": "+sq);
		}
	}
}
class thread3 extends Thread{
	int x;
	public void run() {
		int y=this.x;
		int cb=y*y*y;
		System.out.println("Cube of "+y+": "+cb);
	}
}
public class multithread {
	public static void main(String[] args) {
		thread1 t1=new thread1();
		t1.start();
		thread2 t2=new thread2();
		t2.a=15;
		t2.start();
		thread3 t3=new thread3();
		t3.x=5;
		t3.start();
		
	}

}
