package d20201221;

/*
 * (최대한) +, - 기호가 반복되서 출력되도록 해보세요
 * : 100번
 * 
 * 
 */


public class MultiThread5 {
	public static void main(String[] args) {
		ThreadDemo6 td6 = new ThreadDemo6();
		ThreadDemo7 td7 = new ThreadDemo7();
		
		td6.setPriority(10);
		
		System.out.println("td6 우선순위 : "+ td6.getPriority());
		System.out.println("td7 우선순위 : "+ td7.getPriority());
		
		td6.start();
		td7.start();
	}
}

class ThreadDemo6 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0; i<500; i++) {
			System.out.println("+");
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//for end
	}
	
}//ThreadDemo6 end


class ThreadDemo7 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0; i<500; i++) {
			System.out.println("-");
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//for end
	}
	
}//ThreadDemo7 end