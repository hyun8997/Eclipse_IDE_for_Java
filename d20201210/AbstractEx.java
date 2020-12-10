package d20201210;

abstract class AA{
	void aaa() {
		System.out.println("추상 클래스 aaa method");
	}
	
	abstract void aaaa();
}// abstract AA class end

class BB extends AA{

	@Override
	void aaaa() {
		// TODO Auto-generated method stub
		System.out.println("BB 클래스 - 추상 메소드 오버라이드 한 aaaa method");
		
	}
	
	void bbb() {
		System.out.println("BB 클래스 - bbb method");
	}
	
}//BB class end

class CC extends AA {

	@Override
	void aaaa() {
		// TODO Auto-generated method stub
		System.out.println("CC 클래스 - 추상 메소드 오버라이드 한 aaaa method");
	}
	
	void ccc() {
		System.out.println("CC 클래스 - ccc method");
	}
	
}// CC 클래스 end


public class AbstractEx {
	public static void main(String[] args) {
		//AA a = new AA();		//추상 클래스는 인스턴스화 할 수 없다.
		System.out.println("---------------------------");
		
		BB b = new BB();
		b.bbb();
		b.aaa();
		b.aaaa();
		
		System.out.println("---------------------------");
		CC c = new CC();
		c.ccc();
		c.aaa();
		c.aaaa();
		
		
		
		
	}
}
