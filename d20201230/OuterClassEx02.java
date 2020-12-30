package d20201230;

public class OuterClassEx02 {
//	private int a = 10;
	static int b = 20;
	static final int c = 30;

	static class StaticInnerClass{
		int d = 40;
		static final int E = 50;
		static int f = 60;

		public void print() {
//			System.out.println("a : "+ a);
			System.out.println("b : "+ b);
			System.out.println("c : "+ c);
			System.out.println("d : "+ d);
			System.out.println("e : "+ E);
			System.out.println("f : "+ f);

		}
	}
	
	
	public static void main(String[] args) {
		
		StaticInnerClass sic = new StaticInnerClass();
		sic.print();
	}
}
