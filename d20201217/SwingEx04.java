package d20201217;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

//image 삽입

public class SwingEx04 extends JFrame {
	JLabel jlb1, jlb2, jlb3;
	ImageIcon img1, img2;
	
	public SwingEx04() {
		// TODO Auto-generated constructor stub
		super("Image Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setBounds(400,300,500,700);
		setLayout(new FlowLayout());
		
		//label
		jlb1 = new JLabel("라벨에 문자열 출력");
		add(jlb1);
		
		//이미지 아이콘 생성
		img1 = new ImageIcon("src/image/img2.jpg");	//절대주소, 상대주소
		jlb2 = new JLabel(img1);
		add(jlb2);
		
		img2 = new ImageIcon("src/image/btnNormal.jpg");
		jlb3 = new JLabel("image2", img2, SwingConstants.CENTER);	//이미지 이름, 이미지 선택, 정렬 방식
		add(jlb3);
		
		
		setVisible(true);
	}//생성자 end
	
	
	public static void main(String[] args) {
		new SwingEx04();
	}
	
	
}
