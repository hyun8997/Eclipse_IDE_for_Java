package d20201209;

public class 마린 {
	//맴버 변수
	int x, y;
	int hp;
	int 공격력, 방어력, 사거리;
	int 이동속도, 공격속도, 시야;
	
	//생성자
	public 마린() {
		this.x = 0;	this.y = 0;
		this.hp = 100;
		this.공격력 = 5;	this.방어력 = 0; this.사거리 = 1;
		this.이동속도 = 3;	this.공격속도 = 2; this.시야 = 2;
	}
	
	//생성자 오버로딩 ===> super marine
	public 마린(int hp) {
		this();
		this.hp = hp;
	}
	
	
	
	//맴버 메소드
	void 이동하기(int a, int b) {
		// 언덕을 만나면 느려졌다가, etc
		this.x = a; 
		this.y = b;
		
		System.out.println("고고 ( "+x+" : "+y+" )");
	}
	
	void 패트롤() {
		System.out.println("순찰");
	}
	
	void 홀드() {
		System.out.println("근무 중 이상 무");
	}
	
	void status() {
		System.out.println("-----상태보기-----");
		System.out.println("hp  : "+this.hp);
		System.out.println("현재좌표  : "+this.x+" , "+this.y);
		System.out.println("공속 :" + 공격속도);
		System.out.println("이속 :" + 이동속도);
	}
	
	//공격하기 추가
	void 공격하기(마린 x) {
		System.out.println("x ; "+x);
		x.hp -= this.공격력;
		System.out.println("탕");
	}
	
	void health(int h) {
		this.hp = h;
	}
	
	int hstatus() {
		return this.hp;
	}
	
}
