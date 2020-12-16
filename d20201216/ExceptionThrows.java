package d20201216;

public class ExceptionThrows {
	
	public static void prt() throws NumberFormatException {
		
		String[] str = {"9", "300", "150", "200", "a"};
		
		int sum = 0;
		
		for(int i=0; i<str.length; i++) {
			sum+= Integer.parseInt(str[i]);
		}
		
		System.out.println("sum : "+sum);
		
	}//prt() end
	
	public static void main(String[] args) {	//throw를 많이 하는것은 권장사항이 아님.
		try{
			prt();
		}catch(NumberFormatException e) {	//최대한 정확한 예외를 표기하는 것을 권장	//Exception이라고 걍 해버리면 오류
			System.out.println("에러발생");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace()); //StackTraceElement[] 객체로 받음
			for(StackTraceElement ste : e.getStackTrace()) {
				System.out.println("error : "+ ste.toString());	//error 출력
			}
		}
		
		//prt();
		
	}
}
