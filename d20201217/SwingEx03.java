package d20201217;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingEx03 extends JFrame implements ActionListener {

	JPanel jp;
	JButton jbtn1, jbtn2, jbtn3, jbtn4;
	
	public SwingEx03() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1000,300,500,500);
		setLayout(null);
		
		jp = new JPanel();
		jp.setSize(500,300);
		jp.setBackground(Color.CYAN);
		jp.setLayout(new FlowLayout());
		
		add(jp);
		
		
		//일반 버튼
		jbtn1 = new JButton("normal");
		jbtn1.addActionListener(this);
		
		jp.add(jbtn1);
		
		//변화된 버튼
		jbtn2 = new JButton("changeBtn");
		jbtn2.setOpaque(true);
		jbtn2.setBackground(Color.YELLOW);
		jbtn2.setForeground(Color.BLUE);
		jbtn2.setFont(new Font("맑은고딕", Font.BOLD, 20));
		jbtn2.addActionListener(this);
		
		jp.add(jbtn2);
		
		//버튼 클릭 비활설화
		jbtn3 = new JButton("disabled");
		jbtn3.setEnabled(false);
		
		jp.add(jbtn3);
		
		//버튼 비활성화&활성화 구현
		jbtn4 = new JButton("toggle");
		jbtn4.addActionListener(this);
		jp.add(jbtn4);
		
		
		
		
		setVisible(true);
	}//생성자 end
	
	public static void main(String[] args) {
		new SwingEx03();
	}//main end
	
	@Override
	public void actionPerformed(ActionEvent arg0) {		//버튼 액션
		// TODO Auto-generated method stub
		Object obj = arg0.getSource();
		
		if(obj == jbtn1) {
			//버튼 크기, 위치값 출력
			System.out.println("x : "+jbtn1.getX()+" y : "+jbtn1.getY()+
					"크기 : "+jbtn1.getSize().getWidth()+" , "+jbtn1.getSize().getHeight()
					);
		}//changeBtn 클릭하면 콘솔창에 폰트 정보와 글자색 정보를 출력해보세요.
		else if(obj == jbtn2) {
			System.out.println("Font : "+ jbtn2.getFont().getName() + " 글자색 : " + jbtn2.getForeground().getRGB());
			
		}
		else if(obj == jbtn4) {
			
			if(jbtn1.isVisible()) {
				jbtn3.setVisible(false);
				jbtn2.setVisible(false);
				jbtn1.setVisible(false);
			}else {
				jbtn3.setVisible(true);
				jbtn2.setVisible(true);
				jbtn1.setVisible(true);
			}
		}
		
		
	}
	
	
	
}
