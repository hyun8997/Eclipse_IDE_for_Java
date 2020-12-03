package d20201203;

public class WhileEx02 {
	public static void main(String[] args) {
		// 1부터 100까지의 합(while)
		int i=1;
		int sum=0;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		System.out.println("--------------------------------------------------------------");
		
		// 1부터 100까지 출력 (while)
		// 100부터 1까지 출력 (do~while)
		
		int num2=1;
		
		while(num2<=100) {
			System.out.println(num2);
			num2++;
		}
		do {
			num2--;
			System.out.println(num2);
		}while(num2>1);
		
		
	}
}
