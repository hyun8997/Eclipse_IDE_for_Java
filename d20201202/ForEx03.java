package d20201202;

public class ForEx03 {
	public static void main( String[] args) {
		// 1부터 16까지 짝수만 출력해보세요, 일정한 증가치
//		int num=16;
//		for ( int i=1; i <= num; i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		for( int i=2; i<=16; i+=2) {	// 일정한 층가치씩 더하기
			System.out.println(i);
		}
		System.out.println("------------------------------------------------");
		// 1 부터 9까지 옆으로 출력
		for(int i = 1; i<10; i++) {							// 지역변수 : for문 안에서만 i 생겼다가 끝나면 사라짐
				System.out.print(i + " ");
				// ln : 엔터기능(개행)이 들어있음
		}
		System.out.println(); 		// 콘솔창에서 줄넘기기(엔터) 기능
		System.out.println("------------------------------------------------");
		// 1부터 10까지의 합을 출력해보세요
		int sum=0;
		for(int i=1;i<=10; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
 