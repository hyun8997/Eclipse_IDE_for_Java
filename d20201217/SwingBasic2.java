package d20201217;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingBasic2 extends JFrame {
	
	public SwingBasic2() {
		super("container");
		
		Container con = getContentPane(); //new 로 잘 쓰지 않음

		con.setLayout(new FlowLayout());
		con.setBackground(Color.YELLOW);
		
		setSize(300,300);
		setVisible(true);
		
		//swing : windowclosing
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton jbtn1 = new JButton("jbtn1");
		JButton jbtn2 = new JButton("jbtn2");
		JButton jbtn3 = new JButton("jbtn3");
		
		con.add(jbtn1);
		con.add(jbtn2);
		con.add(jbtn3);
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		new SwingBasic2();
	}
	
}
