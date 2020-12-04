package d20201204;
/*
 * 출력
 * 
 * 1.  A
 * 2. 1000
 * 3. 10.5
 * 4. false
 * 
 */
public class MethodEx03 {
	void printChar(char ch) {
		System.out.println("1. "+ch);
	}
	void printInt(int i) {
		System.out.println("2. "+i);
	}
	void printDouble(double f) {
		System.out.println("3. "+f);
	}
	void printBoolean(boolean bol) {
		System.out.println("4. "+bol);
	}
	
	public static void main(String[] args) {
		MethodEx03 M3 =  new MethodEx03();
		
		M3.printChar('A');
		M3.printInt(1000);
		M3.printDouble(10.5);
		M3.printBoolean(false);
		
	}
	
	
}
