package d20201230;

public class OuterClassEx01 {


	private int a = 10;
	static int b = 20;
	static final int c = 30;

	class InnerClass{
		int d = 40 ;
		static final int E = 50;
		//		 static int f = 60;


		public void print() {
			System.out.println("a : "+ a);
			System.out.println("b : "+ b);
			System.out.println("c : "+ c);
			System.out.println("d : "+ d);
			System.out.println("e : "+ E);

		}
	}

	public static void main(String[] args) {
		OuterClassEx01 oc1 = new OuterClassEx01();
		
		OuterClassEx01.InnerClass ic1 = oc1.new InnerClass();
		
		
	}
}
