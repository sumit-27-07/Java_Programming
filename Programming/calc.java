package hit;

import java.util.Scanner;

public class calc {

	public static void sum(int a,int b) {
		System.out.println("Sum of "+a+" and "+b+" = "+(a+b));
	}
	public static void sub(int a,int b) {
		System.out.println("Substraction of "+a+" and "+b+" = "+(a-b));
	}
	public static void mul(int a,int b) {
		System.out.println("Multiplication of "+a+" and "+b+" = "+(a*b));
	}
	public static void div(int a,int b) {
		System.out.println("Quotient of "+a+" divisible by "+b+" = "+(a/b));
	}
	public static void main(String[] args) {
		int choice,x,y;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n"
					+ "4.Division\nEnter choice:");
			choice=sc.nextInt();
			System.out.println("Enter two numbers:");
			x=sc.nextInt();
			y=sc.nextInt();
		}
		switch(choice) {
		case 1:
			sum(x,y);
			break;
		case 2:
			sub(x,y);
			break;
		case 3:
			mul(x,y);
			break;
		case 4:
			div(x,y);
			break;
		}
		
	}

}
