package d20201208;

public class Computer {
	
		// 1. 맴버 변수 (필드)
		int keyboard;
		
		float monitor;
		double mouse;
		double 본체;
		
		// 2. 생성자 : 맴버 변수 초기화를 목적으로 하는 아주 특별한 메소드
		Computer(){
			keyboard = 11;
			monitor = 17.3f;
			mouse = 3.2;
			본체 = 10.2;
		}
		
		// 3. 맴버 메소드
		void 연산하기() {
			System.out.println("연산을 열심히 합니다.");
		}
		
		void 전원켜기() {
			System.out.println("안녕하세요.");
		}
		
		void 인터넷하기() {
			System.out.println("클릭클릭~");
		}
		
		void 코딩하기() {
			System.out.println("ctrl+c ctrl+v");
		}
		
		public static void main(String[] args) {
			Computer c1 = new Computer();
			// 생성자는 반드시 필요함!
			// JVM 이 하나는 있는것으로 인식해 줌
			c1.전원켜기();
			System.out.println(c1.monitor);
			
		}
}
