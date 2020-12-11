package d20201211;

import java.awt.Button;
import java.awt.Frame;


//container : 다른 component를 담을 수 있는 component
public class AWTEx02 extends Frame{
	Button btn;
	
	public AWTEx02(String title) {
		
		setTitle(title);
		
		// 사이즈 (400, 200);
		setSize(400,200);
		
		//위치 (597, 289);
		setLocation(597,289);
		
		btn = new Button("Click~");
		
		//컨테이너에 컴포넌트를 담아야 쓸 수 있음
		add(btn);
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		AWTEx02 ae2 = new AWTEx02("버튼이 있는 윈도우");
		
	}
	
	
	
}
