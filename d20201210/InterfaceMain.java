package d20201210;

public class InterfaceMain {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.달리기();
		h.비행();
		
		System.out.println("-----------------------------");
		// 1) Marine 객체 생성 2) 100, 200 이동 후 3) 비행시켜보세요
		
		Marine m1 = new Marine();
		m1.이동하기(100,200);
		
		m1.비행();
		
		System.out.println("-----------------------------");
		
		// Interface를 통해서 배열 사용 가능
		Flyable[] fList = new Flyable[2];	
		
		System.out.println("fList : "+fList);
		
		//인터페이스는 간접적인 상속 (has - a 관계)	cf) 상속 : is - a 관계
		//부모 - 자식 관계가 간접적으로 성립
		
//		Teran t = new Marine();		//부모가 자식을 가질 순 있다.
//		t.공격하기(m1);	// t가 마린이 아닌 테란이므로 마린의 메소드 사용 불가
		
		Flyable f = h;	// 인터페이스로 new는 못하지만 주소값을 넣어줄 수 있다.
		fList[0] = f; // fList[0] = h; 와 같은 2줄
		
		f = m1;
		fList[1] = f; // fList[1] = m1; 와 같은 2줄
		
		for(int i = 0; i<fList.length; i++) {
			fList[i].비행();
		}
		
	}
}
