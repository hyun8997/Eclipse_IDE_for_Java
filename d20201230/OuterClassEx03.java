package d20201230;

public class OuterClassEx03 {
	private int a = 10;
	static int b = 20;
	static final int c = 30;

	public void printAll() {

		// 지역변수처럼 InnerClass를 사용 -Local Inner Class

		class LocalInnerClass{
			int d = 40 ;
			static final int E = 50;
			//static int f = 60;

			public void print() {
				System.out.println("a : "+ a);
				System.out.println("b : "+ b);
				System.out.println("c : "+ c);
				System.out.println("d : "+ d);
				System.out.println("e : "+ E);
			}//inner print() End
		}//local inner class end


		LocalInnerClass lic = new LocalInnerClass();
		lic.print();

		System.out.println("----- printAll() -----");
	}// printAll() end


	public static void main(String[] args) {
		OuterClassEx03 oc3 = new OuterClassEx03();
		oc3.printAll();
	}
}
