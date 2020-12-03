package d20201203;

/*
 * 	break : 가장 가까운 반복문을 탈출
 * 	continue : 특정 조건일 경우 이번만 생략
 * 
 * 	라벨을 달면 내부의 루프에서 특정 외부 루프를 제어(탈출, 생략)하게 할 수 있다.
 * 	break 라벨명 : 라벨이 붙어있는 반복문을 탈출
 *		continue 라벨명 : 라벨이 붙어있는 반복문 조건이 true이면 이번만 생략
 *		
 */

public class BreakEx {
	public static void main(String[] args) {
		
		outer :					//외부 for문 라벨링
			for(int  i=1; i<=4; i++) {
				for(int j=1;j<=4;j++) {
					
					if(i==j) {			// i == j 면
						//break;			//여기서 탈출
						//continue;		//특정 조건에서 생략
						//break outer;	// 첫 조건인 i=j=1에서부터 바로 외부 루프 break됨
						continue outer;	// 조건 i=j 마다 외부 루프한단계를 생략 하도록 함
					}
					System.out.println("i : " + i+ ", j : "+j);
				}//내부 for문
			}//외부 for문
	}
}
