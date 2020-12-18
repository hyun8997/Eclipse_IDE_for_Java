package d20201218;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//option

public class SwingEx10 extends JFrame {
	public SwingEx10(){
		super("optionPanel");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1100,300,500,300);
		
		//JPanel 호출
		MyJpanel jp = new MyJpanel();
		add(jp);
		
		
		setVisible(true);
	}//생성자 end
	
	public static void main(String[] args) {
		new SwingEx10();
	}
	
	
}//SwingEx10() end

class MyJpanel extends JPanel{
	
	JButton inputBtn, confirmBtn, msgBtn;
	JTextField jtf;
	
	public MyJpanel() {
		setBackground(Color.PINK);
		
		inputBtn = new JButton("Input");
		confirmBtn = new JButton("Confirm");
		msgBtn = new JButton("msg Dialog");
		
		jtf =  new JTextField(20);
		
		add(inputBtn); add(confirmBtn); add(msgBtn); add(jtf);
		
		
		inputBtn.addActionListener(new ActionListener() {	//입력을 받겠다. 옵션 창을 띄워서
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String msg = JOptionPane.showInputDialog("전화번호를 입력하세요");
				jtf.setText(msg);
			}
		});	//inputBtn end
		
		
		confirmBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result = JOptionPane.showConfirmDialog(null, "계속하시겠습니까?", "확인", JOptionPane.YES_NO_CANCEL_OPTION);	//
				
				//System.out.println(result);
				
				if(result == 0) {
					jtf.setText("YES");
				}else if(result == 1) {
					jtf.setText("NO");
				}else if(result == 2) {
					jtf.setText("CANCEL");
				}
			}
		}); //confirmBtn end
		
		
		msgBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "경고", "메시지창", JOptionPane.ERROR_MESSAGE);
				
				
			}
		}); //msgBtn end
		
		
		
	}//생성자 end
	
	
	
}//MyJpanel end
