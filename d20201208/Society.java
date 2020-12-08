package d20201208;

public class Society {
	public static void main(String[] args) {
		Human h1 = new Human();
		
		h1.먹기();
		
		String name = h1.이름;
		System.out.println("h1.이름 : "+name);
		System.out.println("h1 : "+h1);
		
		System.out.println("---------------------------------------------");
		
//		Human h2 =  new Human();
//		h2.생각하기();
//		
//		h2.이름 = "신사임당";			//마음대로 바꿀 수 있음 => 절대 안됨
//		h2.나이 = 21;
//		
//		System.out.println("h2.이름 : "+h2.이름);
//		System.out.println("h2.나이 : "+h2.나이);
//		System.out.println("h2 : "+h2);
		
		System.out.println("---------------------------------------------");
		
		Human h2 = new Human("유관순", "여성");			// 이런식으로 바꿀 수 있게 하는것이 권장 사항이다.	
		System.out.println("h2.이름 : "+h2.이름);
		System.out.println("h2.성별 : "+h2.성별);
		System.out.println("h2 : "+h2);
		
		System.out.println("---------------------------------------------");
		
		Human h3 = new Human("심사임당", "여성", 161.5);		// 이런식으로 바꿀 수 있게 하는것이 권장 사항이다.	
		System.out.println("h3.이름 : "+h3.이름);
		System.out.println("h3.성별 : "+h3.성별);
		System.out.println("h3.키 : "+h3.키);
		System.out.println("h3 : "+h3);
		
		System.out.println("---------------------------------------------");
		
		Human h4 = new Human("이순신", "남성", 177.2);			// 이런식으로 바꿀 수 있게 하는것이 권장 사항이다.	
		System.out.println("h4.이름 : "+h4.이름);
		System.out.println("h4.성별 : "+h4.성별);
		System.out.println("h4.키 : "+h4.키);
		System.out.println("h4.몸무게 : "+h4.몸무게);		//이름, 성별, 키는 바꾼대로 됬지만 몸무게만 기본으로 나옴
		
		
		
	}
	
	
	
	
	

}
