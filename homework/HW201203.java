package homework;

import java.util.Scanner;

public class HW201203 {
	public static void main(String[] args) {
		
		
//		1. 사용자로부터 입력받은 값이 3의 배수인지 아닌지 출력
//	     ex1) 입력: 9
//	     9는 3의배수입니다.
//	     ex2) 입력: 7
//	     7은 3의배수가 아닙니다.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력 : ");
//		int a_1=sc.nextInt();
//		if(a_1%3==0) {
//			System.out.println(a_1+"는(은) 3의 배수입니다.");
//		}
//		else {
//			System.out.println(a_1+"는(은) 3의 배수가 아닙니다.");
//		}
		
//		2. 1부터 100사이의 정수 중 2 또는 3의 배수가 아닌 수의 합계를 구하시오.
		
//		int sum_2=0;
//		for(int i=1; i<=100;i++) {
//			if(i%2!=0 || i%3!=0) {
//				sum_2+=i;
//			}
//		}
//		System.out.println(sum_2);
		
//		3. 두개 주사위를 던졌을때 합이 4가 되는 모든 경우의수를 출력하는 프로그램을 작성하시오.
		
//		for(int i=1; i<=6; i++) {
//			for(int j=1; j<=6;j++) {
//				if(i+j==4) {
//					System.out.println(i+" + "+j+" = "+4);
//				}
//			}
//		}
		
//		4. 구구단 3단을 옆으로 출력하기
		
//		for(int i=1; i<10; i++) {
//			System.out.print("3 * "+i+" = "+(3*i)+"    ");
//		}
		
//		5. 구구단 옆으로 출력하기
		
//		for(int j=2;j<10;j++) {
//			for(int i=1; i<10; i++) {
//				System.out.print(j+" * "+i+" = "+(i*j)+"    ");
//			}
//			System.out.println();
//		}
		
//		6. 화페교환기
//		사용자로부터 숫자를 입력받아  화폐 몇장으로 교환가능한지 메세지를 출력하시는 코드를 작성하시오
//		ex) 78500
//		오만원권 1장
//		만원권  2장
//		오천원권 1장
//		천원권 3장
//		오백원권 1장
//		백원권 0장
//		오십원권 0장
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력 : ");
//		int a_6=sc.nextInt();
//		int tmp = 0;
//		int[] m = new int[7];
//		
//		m[0]=a_6/50000;
//		tmp=a_6%50000;
//		a_6=tmp;
//		m[1]=a_6/10000;
//		tmp=a_6%10000;
//		a_6=tmp;
//		m[2]=a_6/5000;
//		tmp=a_6%5000;
//		a_6=tmp;
//		m[3]=a_6/1000;
//		tmp=a_6%1000;
//		a_6=tmp;
//		m[4]=a_6/500;
//		tmp=a_6%500;
//		a_6=tmp;
//		m[5]=a_6/100;
//		tmp=a_6%100;		
//		a_6=tmp;
//		m[6]=a_6/50;
//		tmp=a_6%50;		
//		a_6=tmp;
//
//		System.out.println("오만원권 "+m[0]+"장");
//		System.out.println("만원권 "+m[1]+"장");
//		System.out.println("오천원권 "+m[2]+"장");
//		System.out.println("천원권 "+m[3]+"장");
//		System.out.println("오백원권 "+m[4]+"장");
//		System.out.println("백원권 "+m[5]+"장");
//		System.out.println("오십원권 "+m[6]+"장");
		
//		7. [도전과제] 
//				369게임에서 박수가 필요한 숫자에서 "짝"이라고 표현해보세요
//				  (단 100까지만)
		
//		int count=0;
//		for(int i=1; i<=100; i++) {
//			if(((i%10)%3==0&&i%10!=0)  || ( (i/10)%3==0&&i>10))
//				System.out.print(" 짝 ");
//			else
//				System.out.print(" "+i+" ");
//			count++;
//			if(count==10) {System.out.println(); count=0;}
//		}
		
//		8~9 . [주말과제]
//				아래의 데이터를 정렬시키는 코드를 작성하시오. (두 가지 이상의 정렬 알고리즘을 사용 하세요 )
//				// 위키피디아 검색해서 공부해오시면 됩니다. ^^
//				 - 선택 정렬
//				 - 나머지 하나 
//
		int[] data  = { 100,20,5,2,3,34,65,23,66,200};
		
		//선택 정렬 : 인덱스의 앞에서부터 배열값중 가장 작은 값의 위치를 찾아서 현재 인덱스값과 최소값 위치의 인덱스값을 바꾼다. 2중 for문
//		for(int i=0; i<data.length-1; i++) {
//			int tmp = i;
//			int tmp2 = 0;
//			for(int j=i; j<data.length; j++) {
//				if( data[tmp]>=data[j])   {  tmp = j;  }
//			}
//			tmp2=data[i];
//			data[i]=data[tmp];
//			data[tmp]=tmp2;
//		}
//		for(int i=0; i<data.length-1; i++) {
//			System.out.print(" "+data[i]+" ");
//		}
		
		//버블 정렬 : 매번 연속된 두개 인덱스를 비교하여, 정한 기준의 값을 뒤로 넘겨서 정렬, 이중 for문
		for(int i=0; i<data.length-1; i++) {
			int tmp3 = 0;
			for(int j=1; j<data.length-i; j++) {
				if( data[j-1]>=data[j]){ 
					tmp3=data[j-1];
					data[j-1]=data[j];
					data[j]=tmp3;
				}
			}
		}
		
		for(int i=0; i<data.length-1; i++) {
			System.out.print(" "+data[i]+" ");
		}
		System.out.println();
		
//		10. 한 배열에 임의의 숫자를 대입한 후 임의의 숫자만큼 *을 출력하시오
//		결과)
//		*
//		****
//		****
//		***
//		*
//		****
//		****
//		**
//		*
//		***
//		**
//		int r= (int)(Math.random()*9+1);
//		int[] a_10 = new int [ r];
//		
//		for(int i=0; i<r; i++) {
//			a_10[i]=(int)(Math.random()*9+1);
//			for(int j=0; j<a_10[i]; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
