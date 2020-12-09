package d20201209;

public class ExtendsMain {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c =  new Child();
		
		System.out.println("p.a : " + p.a);
		p.method();
		
		System.out.println("-----------------------------");
		System.out.println("c.a :" + c.a);			// 부모 클래스에서 물려받은 그대로 사용
		c.method();												// 자식 클래스를 가보면 @Override를 통해서 바꿔서 씀
		
		System.out.println("-----------------------------");
		System.out.println("c.b :" + c.b);			// 자식 클래스에 추가한 것 사용
		c.c_method();
		
	}
}
