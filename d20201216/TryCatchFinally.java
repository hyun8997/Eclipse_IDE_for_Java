package d20201216;

public class TryCatchFinally {
	public static boolean divider(int num1, int num2) {
		try {
			int result = num1/num2;
			System.out.println("몫 : "+ result);
			return true;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			return false;
		}finally {
			System.out.println("finally : try~catch 후 무조건 실행되는 부분");
		}
	}//divider() end
	
	public static void main(String[] args) {
		boolean val = divider(400, 20);
		//생략됨
	}
	
	
}
