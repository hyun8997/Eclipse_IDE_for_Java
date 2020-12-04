package homework;

import java.util.Scanner;

public class HW201204 {
	
	//3번에 사용하는 메소드
	void paramDamo(int a, int b, int c) {
		int sum = a+b+c;
		int avg = sum/3;
		char gra;
		int gra_key = avg/10;
		
		switch(gra_key) {
		case 10	: 
		case 9		: gra= 'A'; break;
		case 8		: gra = 'B'; break;
		case 7		: gra = 'C'; break;
		case 6		: gra = 'D'; break;
		default	: gra = 'F'; break;
		}
		
		System.out.println("평균점수 : "+avg+" 학점 : "+gra);

	}
	
	
	public static void main(String[] args) {
//		1. 야구게임 구현 [도전과제]
//				1) 컴퓨터가 3자리 정수 - 랜덤하게 생성
//				2) 각각 자리수가 서로 일치하지 않는지 검사
//				3) 사용자로부터 입력값 받기 - 3자리 정수
//				4) 사용자가 입력한 값과 컴퓨터가 생성한 값을 비교
//				5) 판정결과를 출력 : ~~ strike, ~~ ball
//				6) 3S가 되면 경기를 종료, 그렇지 않으면 반복
		
//		int rnum = (int) ( Math.random()*899)+100;
//		int [] r = new int [3];
//		r[2] = rnum/100;
//		r[1] = (rnum%100)/10;
//		r[0] = rnum%10;
//		
//		Scanner sc =new Scanner(System.in);
//		
//		int[] p = new int [3];
//		int pnum=0;
//		String[] sb = new String[3];
//		
//		do {
//			System.out.println("3자리수 100~999 입력 : ");
//			
//			pnum = sc.nextInt();
//			
//			
//			if(pnum>=100&&pnum<=999) {
//				p[2] = pnum/100;
//				p[1] = (pnum%100)/10;
//				p[0] = pnum%10;
//				
//				for(int j=0; j<3; j++) {
//					if(r[j]==p[j]) {
//						sb[j]="strike";
//					} else {sb[j]="ball";}
//				}
//			} else {
//				System.out.println("오류");
//				
//			}
//			System.out.println(sb[2]+" "+sb[1]+" "+sb[0]);
//			if(sb[0]=="strike"&&sb[1]=="strike"&&sb[2]=="strike") {
//				break;
//			}
//		} while(true);
		
//		2.score 배열에 국어 , 영어 , 수학 점수가 들어있다.
//		총점과 평균을 계산해서 배열에 담은 후 모든
//		학생의 국어, 영어, 수학, 총점, 평균을 출력하시오
//		참고) 배열에는 국어, 영어 수학 점수만 들어있다.

//		int[][] score = {				//6x5
//		     {80,80,80,0,0},
//		     {60,50,80,0,0},
//		     {50,90,90,0,0},
//		     {40,50,60,0,0},
//		     {90,90,95,0,0},
//		     {85,95,100,0,0},
//		};
//		
//		for(int i=0; i<score.length; i++) {
//			score[i][3]= score[i][0]+score[i][1]+score[i][2];
//			score[i][4]= score[i][3]/3;
//		}
//		
//		for(int i=0; i< score.length; i++) {
//				System.out.println((i+1)+"번 학생 국어 : "+score[i][0]+" 영어 : "+score[i][1]+" 수학 : "+score[i][2]+" 총점 : "+score[i][3]+" 평균 : "+score[i][4]);
//
//		}
		
		
//		3. SwithEx04와 같은 결과과 나오도록 처리해보세요
//		- main : 사용자로부터 국어, 영어, 수학 점수 입력받기
//		         : call by value 형태로 메소드를 호출하여 결과 (평균점수와 학점) 출력
//		         : 메소드명 : paramDemo()
//		- paramDemo() : 평균점수와 학점 구하는 로직 필요
		
//		Scanner sc =new Scanner(System.in);
//		System.out.println("국어 영어 수학 차례대로 입력 : ");
//		int a = sc.nextInt();
//		int b= sc.nextInt();
//		int c = sc.nextInt();
//		
//		HW201204 hw = new HW201204();
//		hw.paramDamo(a, b, c);
		
		
//		4. 아래의 출력결과를 얻을수 있게 FormatData
//		클래스를 작성하시오.
//

		        int a = 20;
		        int[] b = {10,20,50,30};
		        float f = 240.3f;

		        FormatData fd =
		             new FormatData();

		        fd.print(a);
		        fd.print(b);
		        fd.print(f);

//
//
//		출력결과
//		----------------------------------
//		    20
//		    [ 10 20 50 30 ]
//		    240.3
//		----------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
