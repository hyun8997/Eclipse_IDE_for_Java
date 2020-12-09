package d20201209;

public class 메딕 {
	//맴버 변수
	int x, y;
	int hp;
	int 이동속도, 시야;
	int 치료력, mp, 방어력;
	
	//생성자
	public 메딕() {
		this.x = 0; this.y = 0;
		this.hp = 90;
		this.치료력 =2; this.방어력 = 1;
		this.시야 = 1; this.이동속도 = 2;
		this.mp = 50;
	}
	
	//맴버 메소드
	void 이동하기(int a, int b) {
		this.x = a; this.y = b;
		System.out.println("열심히 마린을 따라가기 "+x+" : "+y);
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
		System.out.println("mp  : "+this.mp);		
		System.out.println("현재좌표  : "+this.x+" , "+this.y);
		System.out.println("치료력 :" + 치료력);
		System.out.println("이속 :" + 이동속도);
	}
	
	
	void 치료하기(마린 x) {
		int a = x.hstatus();
		a+=치료력;
		x.health(a);
		this.mp -= 5;
		System.out.println("메딕이 마린을 치료함");
	}
}
