package accenture;

import java.util.*;

public class gcd {

	public static void main(String[] args) {
		int a,b;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		a=sc.nextInt();
		System.out.println("Enter 2nd Number:");
		b=sc.nextInt();
		int max=0,min=0;
		if(a>b) {
			max=a;
			min=b;
		}
		else {
			max=b;
			min=a;
		}
		for(int i=min;i>0;i--) {
			if(max%i==0 && min%i==0) {
				System.out.println("GCD:"+i);
				return;
			}
		}

	}

}
