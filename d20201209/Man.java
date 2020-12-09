package d20201209;

// 이름 정보를 출력하는 객체
public class Man {
	private String name;		// private 한 맴버 변수는 상속되지 않는다.
	
	public Man(String name){
		this.name = name;
	}
	
	public void tellName() {
		System.out.println("Name is "+this.name);
	}
}
