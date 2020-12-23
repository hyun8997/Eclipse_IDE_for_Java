package d20201223;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

	JButton jbtn1, jbtn2;
	JLabel jlb1, jlb2;
	JTextField jtf1;
	JPasswordField jpf1;
	
	public Login() {
		// TODO Auto-generated constructor stub
		super("java login bagic");
		setBounds(1100, 300, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		jbtn1 = new JButton("Login");
		jbtn2 = new JButton("Cancel");
		
		jbtn1.setBounds(80,200,80,40);
		jbtn2.setBounds(200,200,80,40);
		
		add(jbtn1); add(jbtn2); 
		
		
		jlb1 = new JLabel("I D");
		jlb2 = new JLabel("P W");
		
		jlb1.setBounds(30,60,70,40);
		jlb2.setBounds(30,120,70,40);
		
		add(jlb1); add(jlb2);
		
		
		jtf1 = new JTextField(30);
		jpf1 = new JPasswordField(30);
		
		jtf1.setBounds(100, 60, 150, 40);
		jpf1.setBounds(100, 130, 150, 40);

		add(jtf1); add(jpf1); 
		
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);

		setVisible(true);
	}//생성자 end
	
	public static void main(String[] args) {
		new Login();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		if(obj==jbtn1) {
			//System.out.println("jbtn1 click");
			//로그인 기능 수행
			String id = jtf1.getText();
			String pw = jpf1.getText();

			//System.out.println("id :"+id+" pw :"+pw);
			
			//dbms에 접근해서 사용자가 입력한 id와 pw값이 존재하는지 확인(비교)
			Connection conn = MakeConnection.getConnection();
			
			StringBuffer sb = new StringBuffer();
			sb.append("select * from login ");
			sb.append("where id = ? and pw = ?");
			
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				pstmt = conn.prepareStatement(sb.toString());
				pstmt.setNString(1, id);
				pstmt.setNString(2, pw);
				
				rs = pstmt.executeQuery();
				
				//간단한 회원 여부 check => 로그인 되었다고 알려주기
				if(rs.next()) {
					System.out.println("존재하는 회원");
					System.out.println(rs.getNString("name")+" 님 어서오세요");
				}else {
					System.out.println("회원가입하세요");
					
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}//try~catch end
			
		}else if(obj==jbtn2) {
			//회원가입창으로 이동(호출)
			System.out.println("cancel");
			System.exit(0);
		}
		
	}

}
