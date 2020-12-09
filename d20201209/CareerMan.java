package d20201209;

// 직책과 직위를 알 수 있는 클래스
// 더해서 이름도 알고 싶다면?
public class CareerMan extends Man {
	private String job;
	private String position;
	
//	public CareerMan(String job, String position) {		// 오버로드 생성자를 이미 만들어서 JVM이 기본 생성자를 만들어주지 않는다.
//		this.job = job;
//		this.position = position;
//	}
	
	public CareerMan(String name, String job, String position) {		// 부모 클래스의 생성자가 오버로드 생성자라서 자식 생성자에서 생성 해줘야 한다.
		//super.name = name;		// 부모 필드 접근 지정자 private임 때문에 생성자 호출 방식으로 해야된다.
		super(name);					// super() : 부모 생성자 호출
		this.job = job;
		this.position = position;
	}
	
	
	void tellInfo() {
		System.out.println("Job is "+job);
		System.out.println("Position is "+position);
		tellName();						// 부모의 이름 호출 메소드
	}
	
}
