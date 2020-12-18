package d20201218;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



//JSlider

public class SwingEx09 extends JFrame implements ChangeListener{

	JLabel jlb;
	JSlider[] slider = new JSlider[3];
	
	private SwingEx09() {
		// TODO Auto-generated method stub
		super("JSlider");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1100,300,300 ,500);
		setLayout(new FlowLayout());
		
		for(int i=0; i<slider.length; i++) {
			slider[i] = new JSlider(JSlider.HORIZONTAL, 0 ,255, 0);
			slider[i].setPaintTicks(true);
			slider[i].setMinorTickSpacing(10); //밑에 작은 틱 생성
			slider[i].setPaintLabels(true);
			slider[i].setMajorTickSpacing(50); //밑에 메이저 숫자 라벨 넣기
			
			slider[i].addChangeListener(this);
			
			add(slider[i]);
		}
		
		slider[0].setBackground(Color.RED);
		slider[1].setBackground(Color.GREEN);
		slider[2].setBackground(Color.BLUE);
		
		jlb = new JLabel("                                     ");
		jlb.setOpaque(true);
		jlb.setBackground(Color.BLACK);
		
		add(jlb);
		
		setVisible(true);
	}//생성자 end
	
	public static void main(String[] args) {
		new SwingEx09();
		
	}
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		int red = slider[0].getValue();
		int green = slider[1].getValue();
		int blue = slider[2].getValue();
		
		Color c = new Color(red,green,blue);
		
		jlb.setBackground(c);
		
		System.out.println(c.toString());
		
		
	}

}
