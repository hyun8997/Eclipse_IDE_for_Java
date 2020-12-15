package d20201214;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Q1 extends Frame implements WindowListener, ActionListener{

	Button btn;
	
	public Q1() {
		super("Random GuGuDan");
		setSize(400, 300);
		setLocation(600,300);
		setVisible(true);
		
		btn = new Button("Rnd GuGuDan");
		add(btn, "South");
		
		btn.addActionListener(this);	//자기자신 액션
		this.addWindowListener(this);	//자기자신
		
		
	}//생성자 end
	
	public static void main(String[] args) {
		new Q1();
	}//main end
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {	//버튼 눌렸을때 작동하는 부분
		// TODO Auto-generated method stub
		System.out.println("click");
		
		//구구단을 랜덤하게 출력하는 로직
		GuGuDan gu = new GuGuDan();
		gu.print();
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("종료합니다");
		System.exit(0);					//종료 코드
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
