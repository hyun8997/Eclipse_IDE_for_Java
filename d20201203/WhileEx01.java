package d20201203;
// while문 : for문과 같은 반복문
// while문 for문보다 조건이 간편하다.

public class WhileEx01 {
	public static void main(String[] args) {
		// 구구단 2단 출력
		
		int dan = 2;
		int i =1;
		while(i<=9) {
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
		System.out.println("-----------------------------------------------");
		
		//while문 역시 중첩(다중 반복문) 가능
		//구구단 2~9단까지 모두 출력
		i=2;
		while(i<=9) {
			int j=1;
			while(j<=9) {
				System.out.println(i+"*"+j+"="+(j*i));
				j++;
			}
			i++;
		}

	}
}
