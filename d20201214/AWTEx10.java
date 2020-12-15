package d20201214;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class AWTEx10 extends Frame implements KeyListener{

	Button btn1;
	
	public AWTEx10() {
		super("Button Control");
		setSize(800, 600);
		setLayout(null);
		setVisible(true);
		
		btn1 = new Button("^>^");
		
//		btn1.setSize(50, 50);
//		btn1.setLocation(400, 300);
		
		btn1.setBounds(400,300,50,50);
		
		
		add(btn1);
		
		btn1.addKeyListener(this);
		
		this.addWindowListener(new WindowAdapter() {		//여기서만 잠깐 호출하고 마는것, 클로징 말고 딴거 안쓰고 클로징만 씀
			@Override
			public void windowClosing(WindowEvent e) {		//끄기 버튼 동작활성화
				// TODO Auto-generated method stub
				System.out.println("EXIT");
				System.exit(0);
			}
		});
		
		
	}//생성자 end
	
	public static void main(String[] args) {
		new AWTEx10();
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {	//누를 때
		// TODO Auto-generated method stub
		int key =e.getKeyCode();
		
		System.out.println(key);
		
		int x = btn1.getX();
		int y = btn1.getY();
		
		//System.out.println(x+" "+y);
		
		//방향키로 이동 구현
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
		btn1.setLocation(x, y);
		
		//점프
		if(key==32) {
			for(int i=0; i<7; i++) {
				try {
					Thread.sleep(100);						//Thread.sleep(milli)이 컴에 부담이 되서 try-catch씀
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				btn1.setLocation(btn1.getX()+10, btn1.getY()-10);
			}
			for(int i=0; i<7; i++) {
				try {
					Thread.sleep(100);						//Thread.sleep(milli)이 컴에 부담이 되서 try-catch씀
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				btn1.setLocation(btn1.getX()+10, btn1.getY()+10);
			}
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {	//땔 때
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {		//칠 때
		// TODO Auto-generated method stub
		
	}	//키보드의 키를 입력받아서 쓰겠다.


	
	
	
	
	
	
	
	
}
