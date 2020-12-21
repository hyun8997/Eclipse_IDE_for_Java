package d20201221;

import javax.swing.JOptionPane;

//현재 클래스를 실행하면 팝업창을 띄우면서 동시에 반복문을 구동해 보세요

public class MultiThread2 {
	public static void main(String[] args) {
		new ThreadDemo1().start();
		
		
		String input = JOptionPane.showInputDialog("내용을 입력하세요");
		System.out.println("input : " + input);
	}
}//class end

class ThreadDemo1 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		
		for(int i=0; i<100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		
	}
	
}



