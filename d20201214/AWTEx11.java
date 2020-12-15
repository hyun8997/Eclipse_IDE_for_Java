package d20201214;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWTEx11 extends Frame implements MouseMotionListener{

	Button btn1;
	Label lb;				//awt 꺼 쓰는것
	
	public AWTEx11() {
		super("MovingButton");
		setBounds(30, 30, 1200, 800);
		setLayout(null);
		setVisible(true);
		
		btn1 = new Button("^>^"); 
		lb = new Label("Catch me if you can.");
		
		btn1.setBounds(80,60,80,60);
		lb.setBounds(100,200,200,40);
		
		add(btn1); add(lb);
		
		this.addWindowListener(new WindowAdapter() {		//윈도우 리스너
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("EXIT");
				System.exit(0);
			}
		});
		
		addMouseMotionListener(this);						//마우스 모션 리스너
		
	}
	
	public static void main(String[] args) {
		new AWTEx11();
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		//마우스 현재 좌표
		int x = e.getX();
		int y = e.getY();
		
		//System.out.println(x + " : " + y);
		
		//버튼의 현재 좌표
		int bx = btn1.getX();
		int by = btn1.getY();
		
		bx += 40;		//기준점을 버튼 중앙으로 해주는 식
		by += 30;
		
		//마우스와 버튼 사이의 거리 : 피타고라스?
		double dis = Math.sqrt((bx-x)*(bx-x) + (by-y)*(by-y));
		
//		if(dis<90) {
//			System.out.println("close");		//기준점이 버튼 왼쪽 상단임
//		}else {
//			System.out.println("far");
//		}
		
		if(dis<90) {
			btn1.setLocation(
					(int)(Math.random()*1000),
					(int)(Math.random()*700));
			
		}
		
	}

}
