package d20201204;

// void 형 (공허한, 비어있는) : 리턴되는 값이 없는 메소드형
public class MethodBasic {
	// 맴버 메소드
	void helloMethod() {
		System.out.println("메소드 코드블럭 첫번째 줄");
		System.out.println("메소드 코드블럭 두번째 줄");
	}
	
	public static void main(String[] args) {
		System.out.println("-------------- 메소드 진행 이해하기 ---------------");
		MethodBasic mb = new MethodBasic();	// 인스턴스화
		
		mb.helloMethod(); // 호출
		
		System.out.println("메인 메소드 종료");
		
		
		
	}
	
}
