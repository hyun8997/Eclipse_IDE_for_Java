package homework;

import java.util.Scanner;

public class HW201202 {
	public static void main(String[] args) {
		//1. 자바에서 사용되는 식별자의 종류?
		// 정수형, 실수형, 문자형, 논리형
		
		//2.  8개의 변수의 종류와 크기는?
		// 정수형: byte-8bit, short-16bit, int-32bit, long-64bit~
		// 실수형: float-32bit, double-64bit~
		// 문자형: char-2byte
		// 논리형: boolean-1bit
		
		//3. 연산자의 우선순위가 높은 순으로 나열하시요
		// ( ) , +, >>, &, +=
		
		//4. byte  의 최대값과 최소값은 얼마인가?  그 이유는?
		// -128~127, 0이 있어서
		
//		System.out.println("5---------------------------------------------");
		
//		5.
//		1
//		12
//		123
//		1234
//		12345
//		123456
		
//		for(int i=1; i<=6; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		System.out.println("6---------------------------------------------");
		
//		6.
//		*
//		**
//		***
//		****
//		***** 
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		System.out.println("7---------------------------------------------");
		
//		  7. 몇줄 출력? 3
//
//				  *
//				  **
//				  ***
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇줄 출력? ");
//		int a_7=sc.nextInt();
//		sc.close();
//		for(int i=1; i<=a_7; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		System.out.println("8---------------------------------------------");
		
//		  8.   
//		  *****
//		  ****
//		  ***
//		  **
//		  *
		
//		for(int i=5; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		System.out.println("9---------------------------------------------");
		
//		9. 구구단 2단 부터 9단까지 출력하는 코드를 작성하시오
		
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.print(i + " * " + j + " = " + (i*j)+ " \t");
//			}
//			System.out.println();
//		}

//		System.out.println("10---------------------------------------------");
		
//		10. 사용자로부터 값을 입력받아 해당 단을 출력하는 코드를 작성하시오
//		몇단? 3
//		3단 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇단? ");
//		int a_10=sc.nextInt();
//		sc.close();
//		for(int i=2; i<=9; i++) {
//				System.out.println(a_10 + " * " + i + " = " + (a_10*i)+ " \t");
//			}
	
//		System.out.println("11---------------------------------------------");
		
//		11.  1부터 입력한 숫자까지의 누적합을 출력하시요
//		출력 결과
//		얼마?  100
//		1부터 100까지 합은 5050 입니다. 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("얼마? ");
//		int a_11=sc.nextInt();
//		int sum_11=0;
//		
//		for(int i=1; i<=a_11; i++) {
//			sum_11+=i;
//		}
//		System.out.println("1부터 "+ a_11+"까지 합은 "+sum_11+" 입니다.");
		
		
//		System.out.println("12---------------------------------------------");		
		
//		12. (while문)
//		1)1000 이하의 정수 중에서 2의 배수이면서 7의 배수인 숫자 출력
//		2)그 숫자들의 합을 구해보세요 
		
		int a_12=1;
		int count=0;
		int sum_12=0;
		while(a_12<=1000) {
			if(a_12%2==0 && a_12%7==0) {
				System.out.printf("%10d\t", a_12);
				count++;
				sum_12+=a_12;
			}
			if(count==10) {
				count=0;
				System.out.println();
			}
			a_12++;
		}
		System.out.println();
		System.out.println(sum_12);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
