package hit;
abstract class car{
	car(){
		System.out.println("Car Details:");
	}
	abstract void model();
	void wheel() {
		System.out.println("Four Wheel");
	}
}
class Hyundai extends car{
	Hyundai(){
		System.out.println("Hyundai company car is very stylish");
	}
	void model() {
		System.out.println("Model: Creta");
	}
}
public class abstract_code {

	public static void main(String[] args) {
		Hyundai c1=new Hyundai();
		c1.model();
		c1.wheel();

	}

}
