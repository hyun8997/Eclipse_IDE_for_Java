package d20201207;

public class MethodEx06 {
	/*
	 * 소수 출력하기
	 * 
	 * - 소수: 자기 자신과 1을 제외하고는 인수가 없는 (어떤 수로도 나눠지지 않는) 수이다.
	 * 
	 * 1) main에서 1이상 100 이하의 값 중 소수를 전부 출력
	 * 2) isPrimeNumber()를 통해 전달된 값이 소수인지 아닌지를 판단하여 true, false로 반환되는 형태로 체크
	 * 
	 */
	
	boolean isPrimeNumber(int a) {
		int count=0;
		for(int i=1;i<=100;i++) {
			if (a%i==0)	count ++;
		}
		if (count==2) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		MethodEx06 me6 = new MethodEx06();
		
		
		for(int i=2; i<101; i++) {
			if(me6.isPrimeNumber(i)==true)
			System.out.println(i);
		}
	}

}
