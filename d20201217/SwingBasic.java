package d20201217;

import javax.swing.JFrame;

/*
 * Swing 
 * - AWT 상속
 * - AWT는 운영체제를 사용하므로 상대적으로 느림
 * - 빠르고 경량화된 순수 자바 기술로 만듦	(javax가 순수 자바로 만든것들임)
 * - 클래스 앞에 'J'
 * 
 */

public class SwingBasic {
	public static void main(String[] args) {
		new SwingBasic();
		
		JFrame jf =new JFrame();
		jf.setTitle("처음 만들어본 swing frame");
		jf.setSize(500, 500);
		jf.setVisible(true);
		
		
		
		
		
	}
}
