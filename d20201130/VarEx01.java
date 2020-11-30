package d20201130;

// 식별자 + 변수
// 1. primitive type
// 정수형 : byte, short, int, long
public class VarEx01 {
	public static void main(String[] args) {		// 메인문 필수
		// 변수 : 데이터를 저장하거나 참조하기 위해 메모리에 공간을 할당하는 것
		
		// 변수 사용법 : 식별자(자료형) 변수명; => 변수를 선언한다
		byte b1;		// -128 ~ 127
		
		//초기화 => 권장 사항임
		b1 = 10; // = : 대입 연산자
		
		b1 = 20;
		
		short sh1;
		
		sh1 = 10000;
		
		int it;
		
		it = 999999999;
		
		long lo1;
		
		lo1 = 20324242;
		
		System.out.println("b1 : " + b1);
		System.out.println("sh1 : " + sh1);
		System.out.println("it : " +  it);
		System.out.println("lo1 : " +  lo1);
	}
}
