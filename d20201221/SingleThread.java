package d20201221;

public class SingleThread {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<100; i++) {
			System.out.println("*");
		}
		
		System.out.println("수행시간 : "+ (System.currentTimeMillis() - startTime));
		
		for(int i=0; i<100; i++) {
			System.out.println("#");
		}
		
		System.out.println("수행시간 : "+ (System.currentTimeMillis() - startTime));
		
	}
}
