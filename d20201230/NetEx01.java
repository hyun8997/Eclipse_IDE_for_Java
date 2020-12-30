package d20201230;

import java.net.InetAddress;
import java.net.UnknownHostException;

//java.net package
public class NetEx01 {
	public static void main(String[] args) {
		
		InetAddress inet;
		try {
			//내 ip 정보 얻어오기
			inet = InetAddress.getLocalHost();
			
			System.out.println(inet);
			System.out.println(inet.getHostName());
			System.out.println(inet.getHostAddress());
			
			System.out.println("-----------------------");
			
			//외부 ip 정보 얻어오기
			InetAddress inet2 = InetAddress.getByName("www.daum.net");
			
			System.out.println(inet2.getHostName());
			System.out.println(inet2.getHostAddress());
			
			System.out.println("-----------------------");
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	//네트워크에 해당하므로 인터럽트 처리
		
		
		
		
		
	}
}
