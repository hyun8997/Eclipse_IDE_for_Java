package d20201207;

public class MethodEx05 {
	/*
	 * 임의의 원의 반지름 정보를 전달하면
	 * 
	 * 1) 원의 넓이를 계산해서 반환하는 메소드 생성 - 구현부에서 결과 출력
	 * 		반지름:12.2
	 * 
	 * 2) 원의 둘레를 계산해서 반환하는 메소드 생성 - 구현부에서 결과 출력
	 * 		반지름: 7.6
	 * 
	 * 원의 넓이: 반지름*반지름*3.14
	 * 원의 둘레: 반지름*2*3.14
	 */
	
	double circleArea(double r) {	//원 넓이
		return r*r*3.14;
	}
	
	double circleCircum(double r) {	//원 둘레
		return r*2*3.14;
	}
	
	public static void main(String[] args) {
		MethodEx05 me5=new MethodEx05();
		
		System.out.println("원의 넓이(r=12.2): "+me5.circleArea(12.2));
		System.out.println("원의 둘레(r=7.6): "+me5.circleCircum(7.6));
	}
	
}
