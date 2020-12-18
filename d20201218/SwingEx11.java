package d20201218;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

//file dialog

public class SwingEx11 extends JFrame implements ActionListener {

	JLabel jlb = new JLabel();
	
	
	public SwingEx11() {
		// TODO Auto-generated constructor stub
		super("filedialog test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1100,300,400,400);
		
		
		jlb.setOpaque(true);
		jlb.setBackground(Color.PINK);
		
		
		makeMenu();
		
		add(jlb);
		
		setVisible(true);
	}// 생성자 end
	
	private void makeMenu() {			//메뉴바 만드는 메소드
		JMenuBar jmb = new JMenuBar();
		JMenu jm = new JMenu("파일(F)");
		JMenuItem jmi = new JMenuItem("열기");
		
		jmi.addActionListener(this);
		
		jm.add(jmi);	//누가 뭘 가져오는지 항상 신경써야 한다.
		jmb.add(jm);
		
		setJMenuBar(jmb);
		
	}
	
	
	
	public static void main(String[] args) {
		new SwingEx11();
	}//main end
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("click");
		
		JFileChooser choice = new JFileChooser();	//파일선택하는 창 뜨게 함
		
		//이미지 파일만 찾도록 제한
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG", "jpg");
		choice.setFileFilter(filter);
		
		
		
		int val = choice.showOpenDialog(null);
		
		if(val == JFileChooser.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "파일을 선택하세요", "warning", JOptionPane.ERROR_MESSAGE);
		}else {
			String filePath = choice.getSelectedFile().getPath();
			//추가기능 : 이미지 객체 정보를 얻어서 width, height를 내 frame에 맞춘 후 라벨에 출력
			jlb.setIcon(new ImageIcon(filePath));
			
			pack(); //컴포넌트 크기로 자동 맞춤
			
			
			
			
		}
		
		
	}
	
	
	
}
