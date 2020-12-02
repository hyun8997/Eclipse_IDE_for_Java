package d20201202;

import java.util.Scanner;

// 띠 찾기
public class IfEx05 {
	public static void main(String[] args) {
		//사용자로부터 4자리 태어난 년도를 입력받기
		System.out.println("태어난 년도 4자리 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		//System.out.println(year);
		
		// 자축인묘 진사오미 신유술해
		// 쥐소호토 용뱀말양 원닭개돼
		
		// 4 5 6 7 8 9 10 11 12 1 2 3	=> 원래 이렇게 정해져 있음
		
		year %= 12;	// 나머지 연산
		
		//System.out.println(year);
		
		if(year==3) {
			System.out.println("당신의 띠는 돼지띠입니다.");
		}else if(year==4) {
			System.out.println("당신의 띠는 쥐띠입니다.");
		}else if(year==5) {
			System.out.println("당신의 띠는 소띠입니다.");
		}else if(year==6) {
			System.out.println("당신의 띠는 호랑이띠입니다.");
		}else if(year==7) {
			System.out.println("당신의 띠는 토끼띠입니다.");
		}else if(year==8) {
			System.out.println("당신의 띠는 용띠입니다.");
		}else if(year==9) {
			System.out.println("당신의 띠는 뱀띠입니다.");
		}else if(year==10) {
			System.out.println("당신의 띠는 말띠입니다.");
		}else if(year==11) {
			System.out.println("당신의 띠는 양띠입니다.");
		}else if(year==1) {
			System.out.println("당신의 띠는 닭띠입니다.");
		}else if(year==2) {
			System.out.println("당신의 띠는 개띠입니다.");
		}else {
			System.out.println("당신의 띠는 원숭이띠입니다.");
		}
	}
}
