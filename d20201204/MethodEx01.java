package d20201204;

// 임의의 두 정수를 받아서, 사칙연산을 수행하는 메소드를 작성
// (단, 나눗셈의 몫과 나머지는 따로 출력)
// 메소드명 : operMethod()

public class MethodEx01 {
	void operMethod(int a, int b) {
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int rem=a%b;
		System.out.println("sum="+sum + " sub=" + sub+" mul="+mul+" div="+div+" rem="+rem);
	}

	
	public static void main(String[] args) {
		int a;
		int b;
		a=50;
		b=30;
		MethodEx01 M1 = new MethodEx01();
		
		M1.operMethod(a, b);
		
		
	}
}
