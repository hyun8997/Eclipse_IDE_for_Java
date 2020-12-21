package d20201221;

/*
 * Daemon Thread
 * 
 * : 일반 스레드(non-daemon thread)의 작업을 돕는 보조적인 역할의 스레드 
 * : 일반 스레드가 종료되면 자동적으로 종료된다.
 * 
 * ex) 가비지 컬렉터, 자동 저장(log 기록), 화면 자동 갱신 등에 사용된다.
 * 
 * 
 * 
 */

public class MultiThread7 extends Thread {
	
	static boolean isSaveTime = false;
	
	public void save() {
		System.out.println("log 저장 되었음.");
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true) {
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//try~catch end
			
			if(isSaveTime) {
				save();
			}
			
		}//while() end
		
	}//run() end
	
	
	public static void main(String[] args) {
		
		MultiThread7 mt7 = new MultiThread7();
		//데몬 스레드로 동작하게, 이게 20번 다 하고 프로그램 종료가 떠도 log를 3초마다 계속 저장하기 때문에 멈추도록
		mt7.setDaemon(true);
		mt7.start();
		
		for(int i=1; i<20; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(i);
			isSaveTime = true;
		}
		
		System.out.println("프로그램 종료");
	}
	
	
}
