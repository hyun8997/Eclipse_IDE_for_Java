package d20201209;

public class Medic extends Teran{
	int 치료력, mp;
	
	public Medic() {
		super();
		this.치료력 = 2;
		this.mp = 50;
	}
	
	void 치료하기(Teran x) {
		int a = x.hstatus();
		a+=치료력;
		x.health(a);
		this.mp -= 5;
		System.out.println("메딕이 치료함");
	}
}
