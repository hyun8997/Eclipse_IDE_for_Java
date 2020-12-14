package HW201214;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HW201214_lottoField extends Frame implements ActionListener{
	Button btn;
	TextField tf1, tf2, tf3, tf4, tf5, tf6;
	int []temp = new int[6];
	
	public HW201214_lottoField() {
		super("Lotto Machine");
		setSize(270, 120);
		setLayout(null);
		setVisible(true);
		
		btn = new Button("Lotto");
		btn.setBounds(35, 70, 200, 30);
		
		tf1 = new TextField("",4);
		tf1.setBounds(20, 30, 30, 30);
		tf2 = new TextField("",4);
		tf2.setBounds(60, 30, 30, 30);
		tf3 = new TextField("",4);
		tf3.setBounds(100, 30, 30, 30);
		tf4 = new TextField("",4);
		tf4.setBounds(140, 30, 30, 30);
		tf5 = new TextField("",4);
		tf5.setBounds(180, 30, 30, 30);
		tf6 = new TextField("",4);
		tf6.setBounds(220, 30, 30, 30);
		

		add(tf1); add(tf2); add(tf3); add(tf4); add(tf5); add(tf6);

		add(btn);
		
		this.addWindowListener(new WindowAdapter() {		//여기서만 잠깐 호출하고 마는것, 클로징 말고 딴거 안쓰고 클로징만 씀
			@Override
			public void windowClosing(WindowEvent e) {		//끄기 버튼 동작활성화
				// TODO Auto-generated method stub
				System.out.println("EXIT");
				System.exit(0);
			}
		});
		
		btn.addActionListener(this);	//자기자신 버튼

	}
	
	public static void main(String[] args) {
		new HW201214_lottoField();
	}
	
	public int[] getRandom() {		//랜덤 배열 6개를 중복없이 뽑아주는 메소드
		int[] num = new int[6];
		
		for(int i=0; i<6; i++) {
			num[i] = (int)(Math.random()*45+1);
			for(int j=0; j<i; j++) {		
				if(num[j] == num[i]) {		//이전것과 중복체크
					i--;
				}
			}
		}
		return num;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj == btn) {				// 버튼 구분
			temp = getRandom();
			tf1.setText(Integer.toString(temp[0]));
			tf2.setText(Integer.toString(temp[1]));
			tf3.setText(Integer.toString(temp[2]));
			tf4.setText(Integer.toString(temp[3]));
			tf5.setText(Integer.toString(temp[4]));
			tf6.setText(Integer.toString(temp[5]));
		}
	}
	
	
	
}
