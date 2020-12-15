package d20201214;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Q3 extends Frame implements ActionListener, WindowListener{	//action리스너는 눌리는거만 인식, 매개변수로 구분할 수 있게 해야함
	
	Button btn1, btn2;
	
	//클릭 횟수 변수
	int cnt = 0;
	
	public Q3() {
		super("color change");
		setSize(400,300);
		setLocation(600,300);
		setVisible(true);
		
		setLayout(null);
		
		this.addWindowListener(this);
		
		btn1 = new Button("Next");
		btn2 = new Button("Exit");
		
		add(btn1);	add(btn2);
		
		btn1.setSize(200,100);
		btn2.setSize(200,100);
		
		btn1.setLocation(0,200);
		btn2.setLocation(200,200);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		
	}
	
	
	public static void main(String[] args) {
		new Q3();
	}//main end
	
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
		System.out.println("exit");
		System.exit(0);
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

	@Override
	public void actionPerformed(ActionEvent e) {	//매개변수로 구분할 수 있게
		// TODO Auto-generated method stub
		//System.out.println("click");
		
		Object obj = e.getSource();		// 배열로 담아져서 나옴
		
		//System.out.println("obj : "+obj);
		
		if(obj == btn1) {				// 버튼 구분
			System.out.println("Next click");
			// click event => color change
			if(cnt%3 == 0) {
				this.setBackground(Color.RED);
			}else if(cnt%3 == 1) {
				this.setBackground(Color.BLUE);
			}else {
				this.setBackground(Color.GREEN);
			}
			cnt++;
			
			
		}else {
			System.out.println("Exit click");
			System.exit(0);
		}
		
	}
	
}
