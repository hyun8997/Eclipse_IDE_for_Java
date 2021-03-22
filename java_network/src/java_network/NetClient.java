package java_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetClient {
	public static void main(String[] args) {
		// Socket : 다른 소캣과 데이터 송수신을 하는 객체
		
		
		try {
			Socket s = new Socket("172.16.7.50", 5000);
			
			// IO class
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			//os.write(65);  // ASCII => A
			
			// byte stream   ----   bridge   ----   char stream
			//                      InputStreamReader
			//                    OutputStreamReader
			
			// -------------------------------------------------------------- /
			
			// 서버가 리턴한 메시지를 받기 위한 객체
			InputStreamReader isrl = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isrl);    //안정성을 위해 버퍼를 씌워서 보내기
			
			// 서버로 보낼 객체
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			PrintWriter pw = new PrintWriter(bw);		//버퍼 씌운놈 최종적으로 서버에 프린트
			
			// 클라이언트가 키보드에 작성한 데이터를 읽어들이는 객체
			System.out.println("입력하세요 : ");
			InputStreamReader isr2 = new InputStreamReader(System.in);
			BufferedReader keyboard = new BufferedReader(isr2);
			
			// -------------------------------------------------------------- /
			
			String msg = null;			//입력 메시지
			String message = null;	//서버로부터의 리턴 메시지
			
			while((msg=keyboard.readLine())!=null) {
				System.out.println("내가 입력한 내용 : "+msg);	// 입력한거 읽어오게
				
				pw.println("클라이언트가 입력한 메시지 : "+msg);
				pw.flush();   //버퍼니까 플러쉬까지 해줘야 적용
				
				message = br.readLine();
				System.out.println(message);
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
}
