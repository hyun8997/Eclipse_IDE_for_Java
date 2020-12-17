package d20201217;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

//checkbox

public class SwingRx06 extends JFrame implements ItemListener {

	JLabel jlb1, jlb2;
	JCheckBox[] jcbs = new JCheckBox[3];
	String[] name =  {"C", "JAVA", "PYTHON"};
	int mon = 0;
	
	public SwingRx06() {
		// TODO Auto-generated constructor stub
		super("CheckBox Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1000,300,250,250);
		setLayout(new FlowLayout());
		
		jlb1 = new JLabel("            원하는 과목을 선택하세요 (중복가능)             ");
		
		this.add(jlb1);
		
		for(int i=0; i<jcbs.length; i++) {
			jcbs[i] = new JCheckBox(name[i]);
			jcbs[i].addItemListener(this);
			this.add(jcbs[i]);
			
		}
		
		jlb2 = new JLabel("수강료는 "+mon+"원 입니다.");
		this.add(jlb2);
		
		
		setVisible(true);
	}//생성자 end
	
	public static void main(String[] args) {
		new SwingRx06();
	}
	
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
//		System.out.println(arg0.getItem());
//		System.out.println(arg0.getStateChange());
		
		//C는 5000, JAVA는 100000, PYTHON은 50000
		
		int chk =1;
		
		if(arg0.getStateChange() == ItemEvent.SELECTED) {	//더하고 빼고 정해주는 부분
			chk = 1;
		}else {
			chk = -1;
		}
		
		if(arg0.getItem() == jcbs[0]) {
			mon = mon + (chk*5000);
		}else if(arg0.getItem() == jcbs[1]) {
			mon = mon + (chk*100000);
		}else if(arg0.getItem() == jcbs[2]) {
			mon = mon + (chk*50000);
		}
		
		jlb2.setText("수강료는 "+mon+"원 입니다.");
	}

}
