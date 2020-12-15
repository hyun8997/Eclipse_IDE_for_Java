package HW201215;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;


public class HW201215_SearchWord extends Frame implements ActionListener{
	Button btn;
	
	public HW201215_SearchWord() {
		super("SearchWord");
		setSize(300, 150);
		setLayout(null);
		setVisible(true);
		
		btn = new Button("Search");
		btn.setBounds(100, 50, 100, 50);
		
		add(btn);
		btn.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {		//여기서만 잠깐 호출하고 마는것, 클로징 말고 딴거 안쓰고 클로징만 씀
			@Override
			public void windowClosing(WindowEvent e) {		//끄기 버튼 동작활성화
				// TODO Auto-generated method stub
				System.out.println("EXIT");
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new HW201215_SearchWord();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		
		al.add("오늘은");	//object를 넣게 되어있음
		al.add("화요일");
		al.add("딸기");
		al.add("바나나");
		al.add("오렌지");
		al.add("체리");
		al.add("키위");
		al.add("포도");
		al.add("귤");
		al.add("토마토");
		
		System.out.println("바나나는 "+al.indexOf("바나나")+"번째");
		
		
		
		
		
		
	}
	
	
	
	
	
}
