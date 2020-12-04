package d20201204;
/*
 * 출력
 * 
 * 자바
 * 자바 A
 * 자바 A 1000
 * 자바 A 1000 10.5
 * 자바 A 1000 10.5 true
 */

//method overloading (다중 정의)
// : 메소드 이름은 하나이지만 다양한 상황에서 동작하게 하는 기능
// : 메소드 이름은 같게 하고 매개변수 타입, 이름, 순서, 개수를 다르게 하면 됨
// : 만드는 사람(개발자)는 불편하나 사용자는 편해짐

public class MethodEx04 {
	void print(String st) {
		System.out.print(st+" ");
	}
	void print(char ch) {
		System.out.print(ch+" ");
	}
	void print(int i) {
		System.out.print(i+" ");
	}
	void print(double f) {
		System.out.print(f+ " ");
	}
	void print(boolean bol) {
		System.out.print(bol+ " ");
	}
	void print() {
		System.out.println();
	}
	void print(String st, char ch, int i, double f, boolean bol) {
		System.out.println(st+" "+ch+" "+i+" "+f+" "+bol);
	}
	
	public static void main(String[] args) {
		MethodEx04 M4 =  new MethodEx04();
		
		M4.print("자바");
		M4.print();
		
		M4.print("자바");
		M4.print('A');
		M4.print();
		
		M4.print("자바");
		M4.print('A');
		M4.print(1000);
		M4.print();
		
		M4.print("자바");
		M4.print('A');
		M4.print(1000);
		M4.print(10.5);
		M4.print();

		M4.print("자바");
		M4.print('A');
		M4.print(1000);
		M4.print(10.5);
		M4.print(true);
		M4.print();
		
		M4.print("자바", 'A', 1000, 10.5, true);
	
		
		
	}
}
