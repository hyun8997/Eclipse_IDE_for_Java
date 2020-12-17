package d20201217;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


//key event 
public class SwingEx02 extends JFrame  {
	
	JPanel jp;
	private JLabel[] msg;
	
	public SwingEx02() {
		// TODO Auto-generated constructor stub
		super("key event test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jp = new JPanel();
		
		setContentPane(jp);
		
		setBounds(1200,300,500,500);
		setVisible(true);			//setVisible 순서가 중요해졌음!!!
		
		msg = new JLabel[3];
		
		msg[0] = new JLabel("KeyCode 값");
		msg[1] = new JLabel("UniCode 값");
		msg[2] = new JLabel("Keyboard 값");
		
		for(int i=0; i<msg.length; i++) {
			jp.add(msg[i]);					//알아서 겹쳐지지 않고 FlowLayout처럼 나옴
			
			msg[i].setOpaque(true);		//Opaque : 불투명한
			msg[i].setBackground(Color.PINK);
		}
		
		
		Handler h = new Handler();
		jp.addKeyListener(h);		//key event를 받지만 누가 받는지 몰라서 반응X, 지정해줘야 함
		
		jp.requestFocus();			//포커스때 동작하도록
		
		
		
		
		
	}//생성자 end
	
	
	//inner class
	class Handler extends KeyAdapter{
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyPressed(e);
			
			//System.out.println(e.getKeyCode());
			
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			String keyText = e.getKeyText(keyCode);
			
			msg[0].setText(Integer.toString(keyCode));
			msg[1].setText(Character.toString(keyChar));
			msg[2].setText(keyText);
			
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		new SwingEx02();
	}
}
