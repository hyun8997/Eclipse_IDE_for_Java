package d20201218;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingEx08 extends JFrame implements ActionListener,KeyListener{
	
	String[] str = {"안녕하세요","오늘은 금요일이야","오늘 뭐 먹지?",
					"헐~ 대박","날씨가 조금 풀렸네","미친거 아냐?",
					"힘내 할 수 있어","심심해~","괜찮아 잘 될거야"};
	
	JTextArea jta;
	JTextField jtf;
	JButton jbtn;
	
	JPanel jp;
	JScrollPane jsp;
	
	public SwingEx08() {
		// TODO Auto-generated constructor stub
		super("심심이");
		setBounds(1000,200,600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jta = new JTextArea();		//frame 부착
		
		jtf = new JTextField(40);	//jpanel 부착
		jbtn = new JButton("Insert");	//jpanel 부착
		
		//스크롤 패널
		jsp = new JScrollPane(jta, 						//스크롤 패널이 텍스트 에어리어를 가지고 있다. 가지고 최종 가진 친구가 컨테이너로
				jsp.VERTICAL_SCROLLBAR_AS_NEEDED, 
				jsp.HORIZONTAL_SCROLLBAR_AS_NEEDED);	//어떻게 보이게 할지, 수평, 수직 처리
		
		
		jp = new JPanel();
		
		//Color : R(Red), G(Green), B(Blue)
		//		: 0 ~ 255
		
		Color c = new Color(144, 228, 255);
		
		jp.setBackground(c);
		jta.setBackground(Color.WHITE);
		
		//컨테이너에 컴포넌트들을 부착
		//this.add(jta, "Center");
		this.add(jsp, "Center");
		
		
		//textfile와 button을 패널에 부착
		jp.add(jtf);
		jp.add(jbtn);
		
		//패널을 컨테이너에 부착
		this.add(jp, "South");
		
		jtf.addKeyListener(this);
		jbtn.addActionListener(this);
		
		
		
		setVisible(true);
		
		jtf.requestFocus();
		
	}//생성자 end

	public static void main(String[] args) {
		new SwingEx08();
	}
	
	//심심이가 말하기
	private void makeWords() {
		Random rnd = new Random();
		
		int value = rnd.nextInt(str.length);	//내가 가지고 있는 문장의 수만큼 랜덤
		
		jta.append("심심이 : " + str[value] + "\n");	//append는 \n이 없이 뒤로 쭉 붙임

	}
	
	//사용자 대화 처리
	private void userWords() {
		String txt = jtf.getText();
		
		jta.append("사용자 : "+ txt + "\n");
		
		makeWords();
		
		jtf.setText("");	//썼던 내용 알아서 지워지도록
		
	}
	
	
	
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		
		if(key == e.VK_ENTER) {
			userWords();
			
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		userWords();
		
	}
	
	
	
	
}
