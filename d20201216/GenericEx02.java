package d20201216;

/*
 * int a;	// a는 항상 int	==> 유동성 있게 사용할 방법?
 * 
 * Object a;
 * 
 * int b = (int)a;
 * 
 * String s = (String)a;
 * 
 * => 모든 변수 선언을 Object 하는 것은 굉장한 부담이다.
 * => generic을 통해 일반화
 * 
 * 
 * 
 * 
 */

class Animal<T>{
	
	T name;
	
//	String str_name;
//	Object obj_name;
	
	public Animal(T name) {
		this.name = name;
	}
	
	
//	public Animal(String str_name) {
//		this.str_name = str_name;
//	}
//	
//	public Animal(Object obj_name) {
//		this.obj_name = obj_name;
//	}
//	
	
}


public class GenericEx02 {
	public static void main(String[] args) {
		Animal<String> ani1 = new Animal("참새");
		Animal<Object> ani2 = new Animal("시조새");
		Animal<Integer> ani3 = new Animal(1000);
		
//		System.out.println(ani1.str_name);
//		System.out.println(ani2.obj_name);
		
		System.out.println(ani1.name);
		System.out.println(ani2.name);
		System.out.println(ani3.name);
		
		
		
		
	}
}
