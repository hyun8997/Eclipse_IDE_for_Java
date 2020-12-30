package d20201230;

public class AnonymousInnerClassEx {

	
	
	 /* 
	  * 
	  * 
	  * Flyable f0 = new Flyable();  (x)
	  * : Flyable은 인터페이스이므로 추상메소드, 상수만 존재
	  * : 구현부가 없으므로 new를 통한 인스턴스화를 못함
	  * 
	  * 
	  * 마린 m = new 마린 ();
	  * 
	  * Flyable f1 = (Flyable) m;
	  * 
	  * f1: Flyable 인터페이스를 구현한 객체의참조값
	  * 
	  * Flyable f2 = (Flyable) new 마린 ();
	  * 
	  * 
	  */
	
	Flyable f = new Flyable() {
		
		@Override
		public void 비행() {
			System.out.println("익명클래스를 통해서 method overring");
		}
		
		// 인터페이스지만 잠깐 클래스 처럼 쓰려고 만듦.
		
	};
	
	public static void main(String[] args) {
		AnonymousInnerClassEx aic = new AnonymousInnerClassEx();
		
		
		aic.f.비행();
	}
}
