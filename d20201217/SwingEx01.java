package d20201217;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 이벤트 처리
 * 1. 이벤트 소스 결정
 * 2. 이벤트 감지기 매칭
 * 3. 핸들러 작성
 */


//action event
public class SwingEx01 extends JFrame implements ActionListener{
	JButton jbtn;
	
	public SwingEx01() {
		super("Action Event");
		setSize(500,500);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jbtn = new JButton("click");
		add(jbtn);
		
		jbtn.addActionListener(this);
		
		setVisible(true);
	}//생성자 end
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Swing Action");
	}
	
	public static void main(String[] args) {
		new SwingEx01();
	}
	
	
	
	
}
