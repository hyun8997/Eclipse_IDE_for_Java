package d20201209;

public class TestMain2 {
	public static void main(String[] args)	{
		메딕 me = new 메딕();
		me.status();
		me.이동하기(400,  300);
		me.status();
	
	
		마린 m1 = new 마린();
		마린 m2 = new 마린();
		
		m1.status();
		m2.status();
	
	//super marine이 필요함 : 특성 - hp가 500인 마린
	//	SuperMarine sm = new SuperMarine();
	//	sm.hp=500;
		
		마린 su = new 마린(500);
		su.status();
		
		System.out.println("---------------------------------");
		마린 m3 = m1;		// 권장 X
		m3.hp = 50;			// 권장 X
		
		System.out.println("m1.hp : "+m1.hp);
		System.out.println("m2.hp : "+m2.hp);
		System.out.println("m3.hp : "+m3.hp);
		
		System.out.println("---------------------------------");
		
		//마린 공격
		m1.공격하기(m2);
		
		m2.status();
		
		System.out.println("---------------------------------");
		
		//메딕 객체가 치료하기 기능
		//m2 치료
		//m2의 status 확인
		me.치료하기(m2);
		
		m2.status();
		
		
	}
}

	