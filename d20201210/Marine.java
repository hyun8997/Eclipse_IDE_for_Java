package d20201210;

public class Marine extends Teran implements Flyable {
	int 공격력;
	
	public Marine() {
		super();
		this.공격력 = 5;
	}
	
	void 공격하기(Teran x) {							// 부모 클래스를 해두면 된다.
		//매개변수를 Teran(부모 클래스)로 지정하면
		// Teran을 부모로 갖는 모든 자식 클래스를 공격할 수 있다.
		
		System.out.println("x ; "+x);
		x.hp -= this.공격력;
		System.out.println("탕");
	}

	@Override
	public void 비행() {
		// TODO Auto-generated method stub
		System.out.println("마린이 드랍쉽을 탑니다");
	}
}
