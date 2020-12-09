package d20201209;

public class Teran {
	//맴버 변수
	int x, y, hp, 방어력, 시야, 이동속도, 공격속도, 사거리;
	
	//생성자
	public Teran() {
		this.x = 0;	this.y = 0;
		this.hp = 100;	this.방어력 = 2; this.사거리 =1;
		this.시야 = 2; this.이동속도=3; this.공격속도=2; 
	}
	
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
	
	void health(int h) {
		this.hp = h;
	}
	
	int hstatus() {
		return this.hp;
	}
	
}
