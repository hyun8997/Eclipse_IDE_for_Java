package d20201202;

import java.util.Scanner;

public class ForEx01 {
	public static void main(String[] args) {
		// 사용자로부터 숫자를 하나 입력받아 해당 구구단 출력하세요
		System.out.println("몇 단 출력? : ");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		sc.close();
		
		System.out.println("구구단 "+dan+"단");
		for(int k=1; k<=9; k++) {
			System.out.println(dan + "  * " + k + " = " + (dan*k));
		}
		
	}
}
