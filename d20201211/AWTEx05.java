package d20201211;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Frame;

//GridLayout : 표 처럼 만들기, 선 그어서 레이아웃

public class AWTEx05 extends Frame{
	Button btn1, btn2,btn3, btn4,btn5,btn6;
	
	public AWTEx05() {
		super("GridLayout");
		
		setSize(600,400);
		setLocation(600,300);
		setVisible(true);
		
		GridLayout gl = new GridLayout(3, 2);	// 행 렬 배치
		setLayout(gl);		//어떤 레이아웃이 실행될것을 알려주는 줄
		
		btn1 = new Button("EAST");
		btn2 = new Button("WEST");
		btn3 = new Button("SOUTH");
		btn4 = new Button("NORTH");
		btn5 = new Button("CENTER1");
		btn6 = new Button("CENTER2");
		
		add(btn1);		//컨테이너 담기
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
	}
	
	public static void main(String[] args) {
		new AWTEx05();
	}
	
}
