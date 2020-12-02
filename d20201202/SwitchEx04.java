package d20201202;

// 국어, 영어, 수학 점수를 각각 입려받아 평균 점수와 학점을 구하세요 - switch문
import java.util.Scanner;

public class SwitchEx04 {
	public static void main(String[] args) {
		// 점수를 차례대로 입력 받기
		System.out.println("학점 처리");
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요 : ");
		int k_score =  sc.nextInt()	;
		System.out.println("영어 점수를 입력하세요 : ");
		int e_score =  sc.nextInt()	;
		System.out.println("수학 점수를 입력하세요 : ");
		int m_score =  sc.nextInt();
		sc.close();
		//System.out.println("국어 : " + k_score + " 영어 : " + e_score + " 수학 : " + m_score);
		
		int score = k_score + e_score + m_score;
		
		double avg = score / (double)3; // int형 나누기 int형은 결과가 int형이다. 따라서 반드시 캐스팅(형식변환) 필요
		//double avg = score / 3.0;		//이렇게도 가능
		
		// 학점 구하기
		String grade = "";
		int key = score/30;	// 내림
		
		switch(key) {
		case 10	: 
		case 9		: grade = "A"; break;
		case 8		: grade = "B"; break;
		case 7		: grade = "C"; break;
		case 6		: grade = "D"; break;
		default	: grade = "F"; break;
		}
		
		System.out.println("AVG : " + avg);
		System.out.println("grade : " + grade);
		
	}
}
