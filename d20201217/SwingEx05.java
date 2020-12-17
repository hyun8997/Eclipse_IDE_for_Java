package d20201217;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//radio button

public class SwingEx05 extends JFrame implements ItemListener {	//클릭 보다 선택 개념이다.
	
	Container cp;
	JLabel jlb;
	JPanel jp;
	
	String[] str = {"C", "JAVA", "C++"};
	
	ImageIcon[] img = {
			new ImageIcon("src/image/c_img.jpg"),
			new ImageIcon("src/image/java.jpg"),
			new ImageIcon("src/image/cpp_img.jpg")
	};
	
	JRadioButton[] jrbs = new JRadioButton[3];
	
	public SwingEx05() {
		// TODO Auto-generated constructor stub
		super("radio button test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cp = getContentPane();
		
		jp = new JPanel();
		jp.setBackground(Color.CYAN);
		
		
		ButtonGroup group = new ButtonGroup();		//버튼 그룹으로 묶기
		
		for(int i=0; i<jrbs.length; i++) {
			jrbs[i] = new JRadioButton(str[i]);
			jrbs[i].setOpaque(false);
			//jrbs[i].setBorderPainted(true);
			group.add(jrbs[i]);
			
			jp.add(jrbs[i]);
			
			//이벤트
			jrbs[i].addItemListener(this);
			
		}
		
		
		jlb = new JLabel("", JLabel.CENTER);
		jlb.setOpaque(true);
		jlb.setBackground(Color.PINK);
		
		jrbs[1].setSelected(true); //default 선택으로 해놓은것임
		
		cp.add(jp,"North");
		cp.add(jlb,"Center");
		
		setBounds(1000,300,500,500);
		setVisible(true);
		
	}//생성자 end
	
	public static void main(String[] args) {
		new SwingEx05();
	}

	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(jrbs[0].isSelected()) {
			jlb.setIcon(img[0]);
		}else if(jrbs[1].isSelected()) {
			jlb.setIcon(img[1]);
		}else if(jrbs[2].isSelected()) {
			jlb.setIcon(img[2]);
		}
		
		

	}
}
