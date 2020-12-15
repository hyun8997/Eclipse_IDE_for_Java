package d20201214;

// Q1을 위한 구구단 클래스
public class GuGuDan {
	//맴버 변수
	private int dan;
	
	//생성자
	public GuGuDan() {
		this.dan = (int)(Math.random()*8+2);
	}
	
	//맴버 메소드
	void print() {
		for(int i = 1; i<=9 ; i++) {
			System.out.println(dan+" * "+i+" = "+(i*dan));
		}
	}
}
