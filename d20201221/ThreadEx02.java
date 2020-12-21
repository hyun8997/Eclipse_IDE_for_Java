package d20201221;

import java.util.Random;

/*
 * > Multi Thread 처리 2
 * 2. Runnable Interface 구현
 *   1) Runnable Interface 상속
 *   2) run() override ==> 멀티 쓰레드로 동작 할 로직 넣어두기
 *   3) Thread 클래스의 매개변수로 사용
 *   4) 그 Thread 클래스를 통해 start() 구현
 * 
 * 
 * 
 */


public class ThreadEx02 implements Runnable{
	String name;
	
	public ThreadEx02(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		
		
		for(int i=0; i<100; i++) {
			
			//thread 재우기 : sleep(millis)
			try {									//강제되는 interrupt 처리
				Thread.sleep(rnd.nextInt(500));		//IO(이거에 해당), NET, DB 등 오류가 터질 확률이 높은 애들 대상으로 강제됨
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(name + " : " + i);
			
		}
		
		
	}//run() end
	
	
	public static void main(String[] args) {
		ThreadEx02 te1 = new ThreadEx02("1번마 천둥이");
		ThreadEx02 te2 = new ThreadEx02("2번마 번개");
		
		Thread th1 = new Thread(te1);
		Thread th2 = new Thread(te2);
		
		//start() : 시작
		th1.start();
		
		//th1.yield();	//현재 쓰레드 실행을 중단하고 다른 쓰레드가 동작할 수 있도록 양보
		
		try {
			th1.join();	//다른 쓰레드가 die할 때 까지 기다리기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		th2.start();
		
		
	}
	
	
	
}
