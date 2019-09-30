package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		int foot;
		double inch;
		
		Scanner in  = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextDouble();
		System.out.println(10/3);
		System.out.println("foot=" + foot +", inch=" + inch);
		System.out.println((int)((foot + inch / 12) * 0.3048 * 100) + "cm");
		

	}

}
