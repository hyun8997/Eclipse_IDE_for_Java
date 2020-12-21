package d20201221;

/*
 * 스레드에는 우선순위가 있다.
 * 우선순위에 따라 스레드 실행시간이 달라질 수 있음
 * 
 * 개발자는 작업의 중요도, 순서 배치 작업을 스레드가 가지고 있는 우선순위를 이용하여
 *  특정 스레드가 더 많은 작업 시간을 갖도록 할 수 있음.
 * 
 * 스레드 우선 순위 범위: 1 ~ 10
 *  : 숫자가 높을 수록 우선순위가 높음
 * 
 * 
 * 
 */


public class MultiThread4 {
	public static void main(String[] args) {
		ThreadDemo4 td4 = new ThreadDemo4();
		ThreadDemo5 td5 = new ThreadDemo5();
		
		td5.setPriority(10);
		
		System.out.println("td4 우선순위 : "+ td4.getPriority());
		System.out.println("td5 우선순위 : "+ td5.getPriority());
		
		td4.start();
		td5.start();
		
	}
}// class end

class ThreadDemo4 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0; i<500; i++) {
			System.out.println("*");
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//for end
		
		
		
	}
}//ThreadDemo4 end

class ThreadDemo5 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0; i<500; i++) {
			System.out.println("#");
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//for end
		
		
		
	}
}//ThreadDemo5 end
