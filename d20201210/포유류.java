package d20201210;

// 추상 클래스
// 형태 : abstract 클래스명
// : new 키워드를 통해 객체 생성을 할 수 없는 클래스
// : 객체화, 인스턴스화 할 수 없는 클래스

public abstract class 포유류 {
	int 눈;
	int 코;
	int 입;
	String 성별;
	
	//추상클래스는 메소드가 행위를 가져서는 안됨
	// => 메소드 바디가 없는 메소드(미구현 메소드)로 만들어야 함	=> 추상메소드
	
	//추상메소드 1개 이상 갖는 클래스는 반드시 추상클래스이여야 함
	//추상메소드는 구현클래스에서 반드시 오버라이드해서 사용
	
	
	public abstract void 먹기();
	
	public abstract void 자기();
	
	public abstract void 태생();
	
	
}
