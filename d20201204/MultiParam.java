package d20201204;

import java.util.Scanner;

public class MultiParam {
	// login기능
	void loginDemo(String id, int pw) {
		// id가 java이고 pw가 1234이면 로그인 성공 메시지 출력
		
		if (id.equals("java") && pw == 1234) {				//String 때문에 실패하는것, == 연산자를 쓰지 않는다. id.equals("java") 함수 사용
			System.out.println("로그인 성공");
		} else if (id.equals("java")) {
			System.out.println("비밀번호가 다릅니다.");
		} else {
			System.out.println("로그인 실패");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// 아주 간단한 로그인
		
		String id = "";
		int pw = 0;
		
		System.out.println("로그인 하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		id = sc.nextLine();
		System.out.println("패스워드를 입력하세요 : ");
		pw = sc.nextInt();
		sc.close();
		
		MultiParam mp = new MultiParam();
		
		mp.loginDemo(id, pw);
		
	}
}
