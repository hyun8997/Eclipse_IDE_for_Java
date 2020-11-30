package d20201130;

public class VarEx02 {
	public static void main(String[] args) {
		
		byte b2 = 127;	// 변수 선언과 동시에 초기화
		
		System.out.println("b2 : " + b2);
		
		System.out.println("--------------------------------");
		
		byte b1 = 10;
		byte b3 = 20;
		
		//b2 = (b1 + b3);	// type mismatch	(byte) = (int) 작은 형에 큰 형 넣어서 에러
		// 자바는 int 이하의 연산에서는 모두 int로 자동변환하여 계산
		
		int c = b1 + b3;
		
		System.out.println("c : " + c);
		
		System.out.println("--------------------------------");
		
		//c = b1;	// (int) = (byte) 큰 형에 작은 형 넣어도 에러 안난다.
		
		b1 = (byte)c;		// 강제 형변환
		
		System.out.println("b1 : " + b1);
		
		int num = (int)3.15;	// 내림 해버림, 뒷 데이터 사라짐
		
		System.out.println("num : " + num);
		
		System.out.println("--------------------------------");
		
		// 2. 실수형 : float, double
		
		float f1 =3.1415f;		// float은 뒤에 f를 반드시 써야 한다.
		
		double d1 = 3.1415;	// double은 d 권장 사항일 뿐 안넣어도 에러 안뜬다.
		
		System.out.println("f1 : " + f1);
		System.out.println("d1 : " + d1);
	}
}
