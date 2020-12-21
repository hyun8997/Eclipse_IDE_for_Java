package d20201221;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.border.Border;

//progressbar
public class MultiThread6 extends JFrame implements ActionListener, Runnable{
	
	JProgressBar jpb;
	JButton jbtn;
	
	public MultiThread6() {
		// TODO Auto-generated constructor stub
		super("progressbar test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1100,300,400,100);
		setLayout(new FlowLayout());
		
		jpb = new JProgressBar();	//0~100% default
		
		jpb.setStringPainted(true);
		
		jbtn = new JButton("압축풀기");
		jbtn.addActionListener(this);
		
		
		
		add(jpb); add(jbtn);
		
		
		
		
		
		setVisible(true);
	}//셍성자 end
	
	public static void main(String[] args) {
		new MultiThread6();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		if(obj == jbtn) {
			//System.out.println("click");
			
			Border border = BorderFactory.createTitledBorder("압축을 푸는 중...");
			jpb.setBorder(border);
			
			Thread te = new Thread(this);
			te.start();
			
		}//if end
		
		
	}//actionPerformed() end
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=jpb.getMinimum(); i<=jpb.getMaximum(); i++) {
			jpb.setValue(jpb.getMinimum()+i);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}
