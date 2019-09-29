package TimeConvert;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int BJT;
		int UTC;

		Scanner in = new Scanner(System.in);
		BJT = in.nextInt();
		UTC = 0;
		
		int h = BJT / 100;
		int m = BJT % 100;
		
		if (BJT < 800 && m <=60) {
			UTC = BJT + 1600;
			System.out.println(UTC);
		}
		else if (BJT >= 800 && BJT <=2359 && m <= 60) {
			UTC = BJT - 800;
			System.out.println(UTC);
			
		}
		else {
			System.out.println("输入时间错误");
		}

	}

}
