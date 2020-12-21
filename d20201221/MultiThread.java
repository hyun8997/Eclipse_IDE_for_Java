package d20201221;

public class MultiThread {

	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		
		startTime = System.currentTimeMillis();
		
		td.start();
		
		for(int i=0; i<100; i++) {
			System.out.println("*");
		}
		
		System.out.println("수행시간(*) : " +
				(System.currentTimeMillis() - startTime)
				);
		
		
	}
	
}//class end

class ThreadDemo extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i=0; i<100; i++) {
			System.out.println("#");
		}
		
		System.out.println("수행시간(#) : " +
					(System.currentTimeMillis() - MultiThread.startTime)
					);
		
		
	}
	
	
}

