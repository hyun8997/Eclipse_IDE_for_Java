package HW201214;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HW201214_moveRobot extends Frame implements KeyListener{
	Button head, body, leArm, riArm, leLeg, riLeg;
	
	public HW201214_moveRobot() {
		super("Robot Control");
		setSize(2000, 1000);
		setLayout(null);
		setVisible(true);
		
		head = new Button("-3-");
		body = new Button("B");
		leArm = new Button("LA");
		riArm = new Button("RA");
		leLeg = new Button("LL");
		riLeg = new Button("RL");
		
		
		head.setBounds(400, 100, 50, 30);	//머리를 기준으로 잡음
		body.setBounds(400, 150,50,100);	//(+0, +50)
		leArm.setBounds(360,150,20,50);		//(-40, +50)
		riArm.setBounds(470,150,20,50);		//(+70, +50)
		leLeg.setBounds(400,270,20,50);		//(+0, +170)
		riLeg.setBounds(430,270,20,50);		//(+30, +170)
		
		
		add(head); add(body); add(leArm); add(riArm); add(leLeg); add(riLeg); 
		
		head.addKeyListener(this);
		
		this.addWindowListener(new WindowAdapter() {		//여기서만 잠깐 호출하고 마는것, 클로징 말고 딴거 안쓰고 클로징만 씀
			@Override
			public void windowClosing(WindowEvent e) {		//끄기 버튼 동작활성화
				// TODO Auto-generated method stub
				System.out.println("EXIT");
				System.exit(0);
			}
		});
	
	}
	
	public void moveRobot(int x, int y) {		//로봇 움직이는 메소드
		head.setLocation(x, y);
		body.setLocation(x, y+50);
		leArm.setLocation(x-40, y+50);
		riArm.setLocation(x+70, y+50);
		leLeg.setLocation(x, y+170);
		riLeg.setLocation(x+30, y+170);
	}
	

	public static void main(String[] args) {
		new HW201214_moveRobot();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key =e.getKeyCode();
		int x = head.getX();
		int y = head.getY();
		
		if(key == 37) {	//left
			x -= 10;
		}else if(key == 39){	//right
			x += 10;
		}
		else if(key == 38){	//up
			y -= 10;
		}
		else if(key == 40){	//down
			y += 10;
		}
		moveRobot(x, y);
		
		//점프
		if(key==32) {
			for(int i=0; i<7; i++) {
				try {
					Thread.sleep(100);						//Thread.sleep(milli)이 컴에 부담이 되서 try-catch씀
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				moveRobot(head.getX()+10, head.getY()-10);
			}
			for(int i=0; i<7; i++) {
				try {
					Thread.sleep(100);						//Thread.sleep(milli)이 컴에 부담이 되서 try-catch씀
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				moveRobot(head.getX()+10, head.getY()+10);
			}
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
