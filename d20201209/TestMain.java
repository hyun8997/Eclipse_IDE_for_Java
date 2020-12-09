package d20201209;

public class TestMain {
	public static void main(String[] args)	{
		마린 m1 = new 마린();
		m1.status();
		m1.이동하기(500,  200);
		m1.status();
		
		System.out.println("-------------------------------------");
		// 마린 객체 하나 더 만들어서 400, 250 좌표로 이동시켜 보세요
		마린 m2 = new 마린();
		m2.status();
		m2.이동하기(400, 250);
		m2.status();
		
		
	}
}
