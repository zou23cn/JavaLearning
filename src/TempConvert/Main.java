package TempConvert;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int F;
		int C;
		Scanner in = new Scanner(System.in);
		F = in.nextInt();
		C = (int)((F - 32) * 5 /9.0);
		System.out.println(C);

	}

}
