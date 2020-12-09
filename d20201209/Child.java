package d20201209;

public class Child extends Parent {
	
	
//	(부모 변수와 메소드 자동으로 전달받은 상태)
	
//	String a = "부모";
//	
//	public void method() {
//		System.out.println(a+" 호출");
//		System.out.println("부모가 자식에게 잔소리하기");	==> 잔소리하기를 내 상황에 맞게 사용하고 싶음
//	}
	
	
	String b = "자식";
	
	public void c_method() {
		System.out.println(b+ " 호출");
	}
	
	@Override		// 부모것을 받아서 내 방식대로 바꿔쓰도록 ==> 체크하는 용도임, 자동으로 허용되있긴 함
	public void method() {
		System.out.println(this.b+" 클래스에서");
		// super : 부모를 가리키는 참조변수(키워드)
		System.out.println("super.a : "+super.a + " 변수 호출");
		System.out.println("자식은 친구에게 잔소리하기");
		
	}
	
	
}
