package d20201230;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectEx {
	public static void main(String[] args) {


		try {
			// 인터넷 주소 객체
			URL daum = new URL("http://www.daum.net/");

			// 주소 연결 객체
			URLConnection uc = daum.openConnection();


			//System.out.println("uc : "+ uc);

			InputStream is = uc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is,"UTF-8"); // 브릿지가 필요함.
			BufferedReader br = new BufferedReader(isr);

			String line = "";

			while(true) {
				line = br.readLine();

				if(line==null) {
					break;
				}
				System.out.println(line);

			}

			is.close();
			isr.close();
			br.close();




		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("URL 주소 오류 ");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("연결 오류");
		}
	}

}

