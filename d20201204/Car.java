package d20201204;

public class Car {		//최소단위 클래스
	
	// 특성(성질)
	String manf = "롤스로이드";	// 제조사 => 맴버 변수
	String engine = "16기통";
	String name = "팬텀";
	String wheel = "20인치";
	
	// 행동(행위)
	void go() {		// 전진 행위 => 맴버 메소드
		System.out.println("전진함");	
	}
	void back()	{
		System.out.println("후진함");
	}
	void stop()	{
		System.out.println("멈춤");
	}
	
	public static void main(String[] args) {
		Car car = new Car();	//맨뒤의 Car()가 생성자 이다.
		
		System.out.println("car : "+car);	// 참조변수, 인스턴스의 주소를 가짐
		
		String carManf = car.manf;	// 변수는 따로 담아줘야 함
		System.out.println(carManf);
		
		car.go();		// 행위는 그냥 호출
		
	}
	
}
