package d20201202;

public class ForEx05 {
	public static void main(String[] args) {
		// 한 줄 주석
		/*
		 * 여러줄 주석
		 */
		
		/*
		 * 다름 식을 만족하는 모든 A와 B의 조합을 구하시오
		 * 
		 * 	A		B
		 * +	B		A
		 * -------------
		 * 	9		9
		 */
		for(int a=1; a<10; a++) {
			for(int b=1; b<10; b++) {
				if(a*10+b + b*10+a == 99)	{	
					System.out.println("A="+a+" B="+b);	
				}
			}
		}
	}
}
