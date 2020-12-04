package d20201204;

public class SungJuk2 {
	void hap(int kor, int eng) {		//인수(가인수, parameter) => 지역변수, 매개변수
		
		int sum = kor + eng;
		
		System.out.println("hap : "+ sum);
	}//hap() end
	
	public static void main(String[] args) {
		SungJuk2 sj2 = new SungJuk2();
		sj2.hap(100, 100);		// call by value, 인수(실인수, parameter, 전달값)
		
	}

}
