package java_network;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ChatServer extends JFrame implements ActionListener {

	// GUI 관련 요소
	JButton jbtn1;
	JTextArea jta1;
	JScrollPane jsp;
	Font f;
	
	// 채팅 관련 요소
	ServerSocket ss;
	PrintWriter pw;
	BufferedReader br;
	
	public ChatServer() {
		super("Chat Server v1.01");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(30,30,1100,600);
		
		jbtn1 = new JButton("Exit");
		
		f  = new Font("고딕", ABORT, 25);
		jta1 = new JTextArea();
		jta1.setFont(f);
		
		add(jbtn1, "South");
		add(jta1, "Center");
		
		jsp = new JScrollPane(jta1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		add(jsp, "Center");
		
		jbtn1.addActionListener(this);
		
		setVisible(true);
		
		// 서버 시작을 생성자에서 바로
		startChat();	//길어지니까 분리
		
	}
	
	// 채팅 관련 메소드
	private void startChat() {
		// 서버 소켓 생성하고 port 열기
		try {
			ss = new ServerSocket(5000);
			
			// 다중 사용자 생성, 소켓 정보 얻어오기
			while(true) {
				Socket client = ss.accept();
				
				//멀티 쓰레드 처리
				
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new ChatServer();
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}// actionPerformed end
	
	// inner class
	class MTServer extends Thread {		//서버가 다대다 가 되도록
		Socket client;
		PrintWriter pw;
		BufferedReader br;
		String ip;
		
		public MTServer(Socket client) {
			this.client = client;
			
			try {
				pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())));
				
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				
				InetAddress inet = client.getInetAddress();
				ip = inet.getHostAddress();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}// 생성자 end
		
		
		
		
		
		
		
	}
	
	
	
}
