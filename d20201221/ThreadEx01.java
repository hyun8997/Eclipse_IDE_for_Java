package d20201221;

/*
 * Thread
 * : CPU가 하는 각각의 동작 하나하나
 * : 자바 프로그램 내에서 실행되는 흐름의 단위
 * : 일반적으로 최소한 하나의 thread는 갖는다.
 * 
 * 
 * 

  > Multi Thread 처리
  1. Thread class 상속
    1) Thread class 상속
    2) run() override ==> 동시에 처리하고 싶은 logic 작성
    3) 구현 클래스에서 start() 호출
  
  
 * 
 * 
 */


public class ThreadEx01 extends Thread {
	String name;
	
	public ThreadEx01(String name) {
		// TODO Auto-generated constructor stub
		this.name =  name;
	}
	
//	void sprint() {
//		for(int i=0; i<=100; i++) {
//			System.out.println(name + " : "+ i);
//		}
//	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0; i<=100; i++) {
			//System.out.println(name + " : "+ i);
			System.out.println(Thread.currentThread().getName() + " : "+ i);	//쓰레드 확인 가능
		}
		
		
	}
	
	public static void main(String[] args) {
//		new ThreadEx01("1번마 천둥이").sprint();
//		new ThreadEx01("2번마 번개").sprint();
		
		ThreadEx01 te1 = new ThreadEx01("1번마 천둥이");
		ThreadEx01 te2 = new ThreadEx01("2번마 번개");
		
		te1.start();	//메모리 상황에 따라 막 섞어서 수행됨
		te2.start();
		
		
		
		
		
	}
	
	
}
