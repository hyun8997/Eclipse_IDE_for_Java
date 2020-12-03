package d20201203;

public class ArrayEx02 {
	public static void main(String[] args) {
		// 1. int 크기 배열 생성
		// 2. 참조 대상 변수는 3개
		// 3. 3개의 변수에 임의의 값을 대입한 후 출력
		
		int [] R = new int[3];		// 각 자료형에 맞는 기본값으로 초기화
		for(int i = 0; i < R.length; i++) {
			R[i]=i;
		}
		
		// int 기본값: 0
		// float 기본값: 0.0F
		
		int [] S = {15, 25, 35};		// new 말고 직접 초기화
		
		for(int i = 0; i < R.length; i++) {
			System.out.println(R[i]);
			System.out.println(S[i]);
		}
		
	}

}
