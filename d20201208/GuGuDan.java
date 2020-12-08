package d20201208;
// 구구단 3단만 출력해보세요 - OOP 형태로 정의
// g.print();
public class GuGuDan {
	// 1. 맴버 변수 (필드)
	public int dan;
	
	// 2. 생성자
	public GuGuDan() {
		// TODO Auto-generated constructor stub
		dan = 3;
	}// GuGuDan() end
	
	// 3. 맴버 메소드
	void print(){
		// 구구단 로직
		for(int i=1; i<10; i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}
	}// print() end
	
	// 메인문
	public static void main(String args[]) {
		GuGuDan g = new GuGuDan();
		g.print();
	}// main() end
}
