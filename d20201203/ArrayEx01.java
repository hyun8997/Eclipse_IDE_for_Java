package d20201203;

public class ArrayEx01 {
	public static void main(String[] args) {
		//int 크기 변수 5개를 생성하고 각 변수에 임의의 값을 대입한 후 콘솔에 출력
		
		// 배열 선언 : 자료형[] 변수명;
		// 대괄호 []  이용, new : 메모리 할당
		// 순서값(index)는 0부터 시작임에 유의!!
		int[] num;
		num = new int [5];	// 참조(할당) 되어있는 상태 : 인스턴스화 되어있다, 주소값을 부여받았다.
											// 배열의 index는 0번부터 시작한다.
		System.out.println("num : " + num); 		// 메모리의 주소값이 나온다.
		
		num[0] = 0;
		num[1] = 10;
		num[2] = 20;
		num[3] = 30;
		num[4] = 40;
		
		for(int i=0;i<5;i++)
			System.out.println(num[i]);
		
		// 배열 크기
		System.out.println("num 배열 크기 : " + num.length);
		
		
	}
}
