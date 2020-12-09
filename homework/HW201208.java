package homework;

import java.util.Scanner;

// id(java), pw(1234) 입력받아서 로그인 하기
public class HW201208 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//main에서 사용자 입력을 받은 후 LoginTest 객체를 호출하여 로그인 기능 수행하기
		
		System.out.println("로그인 하시겠습니까? ");
		System.out.println("id 입력하세요 : ");
		String id = sc.nextLine();
		System.out.println("pw 입력하세요 : ");
		int pw = sc.nextInt();
		sc.close();
		
		//System.out.println(id+" "+pw);
		
		// LoginTest 객체를 통해 로그인 기능 수행
		
		LoginTest lt = new LoginTest();
		boolean check = lt.loginCheck(id, pw);
		lt.loginMessage(check);
		
		
	}// main end
}// class end


class LoginTest {				//한 파일 내 여러 객체
	// loginCheck() : id:java, pw:1234 면 true 아니면 false return
	// loginMessage() : 체크한 결과를 바탕으로 로그인 성공 / 로그인 실패 메시지 출력
	private String id;
	private int pw;
	
	LoginTest() {
		this.id = "java";
		this.pw = 1234;
	}
	
	public boolean loginCheck(String id, int pw) {
		boolean login = false;
		
		if( id.equals(this.id) && this.pw == pw) 	login = true;

		return login;
	}// loginCheck end
	
	public void loginMessage(boolean check) {
		if (check == true) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}// loginMessage end	
}// LoginTest end

