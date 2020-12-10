package d20201210;

public class InterfaceClass implements InterfaceEx01, InterfaceEx02 {		//실제로는 InterfaceImple로 자주 쓴다
	//다중상속처럼 인터페이스 사용 가능
	
	@Override	//from InterfaceEx01
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("실제로 연산 구현될 부분");
		
	}
	
	
	@Override	// from InterfaceEx02
	public String getStr() {
		// TODO Auto-generated method stub
		
		String result = "실제로 구현될 부분, 문자열을 얻어오는 로직";
		
		return result;
	}	
	
}
