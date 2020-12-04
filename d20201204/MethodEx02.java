package d20201204;

import java.util.Scanner;

//1. 임의의 두 정수 3번 입력받기
//2. 두 수 차의 절대값을 출력하는 메소드
// 메소드명: abs()

public class MethodEx02 {
	void abs(int a, int b) {
		if(a>=b) System.out.println("abs="+(a-b));
		else 	System.out.println("abs="+(b-a));
	}
	
	public static void main(String[] args) {
		MethodEx02 M2=new MethodEx02();
		Scanner sc= new Scanner(System.in);
		int[] num = new int [6];
		
		for(int i=0; i<3; i++) {
			System.out.println((i+1)+"번째 임의의 정수 2개 입력:");
			num[i]=sc.nextInt();
			num[i+3]=sc.nextInt();
		}
		sc.close();
		
		for(int j=0; j<3; j++) {
			M2.abs(num[j], num[j+3]);
		}
		
	}
}
