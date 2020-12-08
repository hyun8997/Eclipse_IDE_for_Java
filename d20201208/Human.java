package d20201208;

public class Human {
	// 맴버 변수
	int 눈;
	int 코;
	int 입;
	int iq;
	
	String 성별;
	int 나이;
	
	double 키;
	double 몸무게;
	
	String 이름;
	
	// 생성자
	Human(){
		눈 = 2;
		코 = 1;
		입 = 1;
		iq = 100;
		성별 = "남자";
		나이 = 20;
		키 = 173.5;
		몸무게 = 68.5;
		이름 = "홍길동";
		System.out.println("생성자 호출");
	}
	
	
	// 내 클래스를 사용할 사람들(개발자)을 위해서 다양한 생성자를 갖는 클래스로 작성하는 것을 권장
	
	// 생성자 오버로딩
	// 이름과 성별을 수정할 수 있는 생성자
	// 출력 : 유관순, 여성
	Human(String 이름, String 성별){
		눈 = 2;
		코 = 1;
		입 = 1;
		iq = 100;
		나이 = 20;
		키 = 173.5;
		몸무게 = 68.5;
		
		this.이름 = 이름;		// this : 자기 자신을 가리키는 참조변수
		this.성별 = 성별;
	}
	
	// 이름, 성별, 키를 다른 사용자가 초기화할 수 있는 생성자
	// h3 : 심사임당, 여성, 161.5 출력해보세요
	Human(String str1, String str2, double 키){	//매개변수도 이렇게 말고 유의미하게 짓는게 좋다
		/*
		눈 = 2;
		코 = 1;
		입 = 1;
		iq = 100;
		나이 = 20;
		키 = 173.5;
		몸무게 = 68.5;
		*/
		
		// 기본 생성자를 실행하고 원하는 부분만 수정하고 싶을 때
		// 즉, 생성자 인자가 너무 많아서 수정이 불편할 때
		this();				// 기본 생성자를 실행
		
		
		
		this.키 = 키;
		this.이름 = str1;		// this : 자기 자신을 가리키는 참조변수
		this.성별 = str2;
	}
	
	//이름, 성별, 키, 몸무게, 나이 
	Human(String 이름, String 성별, double 키, double 몸무게, int 나이){
		// 생성자 : 맴버 변수를 초기화
		// 초기화 : 맴버 변수명 = 매개변수명;
		// 	   this.맴버변수명 = 매개변수명; (권장)
		
		// 기본 생성자를 실행 : this();
		
		
		
	}
	
	
	
	
	// 맴버 메소드
	void 먹기() {
		System.out.println("삼시세끼를 먹어요");
	}
	
	void 자기() {
		System.out.println("하루 8시간은 자야 해요");
	}
	
	void 걷기() {
		System.out.println("하나 둘 하나 둘");
	}
	
	void 생각하기() {
		System.out.println("멍~");
	}
	
	void 코딩하기() {
		System.out.println("와.구.글.신 : ctrl + c, ctrl + v");
	}
	
	
	
	
	
	
	
}
