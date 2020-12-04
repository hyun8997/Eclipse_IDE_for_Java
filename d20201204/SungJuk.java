package d20201204;

public class SungJuk {
	
	void hap() {
		int kor = 90;
		int eng =100;
		
		int sum = kor + eng;
		
		System.out.println("hap : "+ sum);
	}//hap() end

	public static void main(String[] args) {
		SungJuk sj = new SungJuk();
		sj.hap();		// call by name , 몇번을 실행하든 결과는 무조건 190임
	}
	
}
