package d20201202;

//2. while (조건) {	
//	
//}

//3. do {				
//
//} while (조건);

public class WhileBasic {
	public static void main(String[] argw) {
		// while 9단 출력
		int i=1;		// 조건에 필요한 인수를 미리 선언해놔야 한다.
		while(i<10) {		// 조건을 만족하면 실행됨, 빠질 수 없게 잘못짜면 무한 루프에 빠진다.
			System.out.println("9*"+i+"="+(9*i));
			i++;
		}
		System.out.println("--------------------------------------------------------------------");
		
		//do~while문 9단 출력
		int j=1;
		do {
			System.out.println("9*"+j+"="+(9*j));
			j++;
		}while(j<10);		// 일반 while이면 이 조건이 False면 실행조차 안하지만 do~while은 한번은 해줌
	}
}
