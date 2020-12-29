package d20201229;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//char stream - buffer
public class IOEx04 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\yuiop\\Downloads\\iotest\\goot3.txt");
		File f2 = new File("C:\\Users\\yuiop\\Downloads\\iotest\\copy_goot3_buffer.txt");
		
		//파일 객체 접근해서 char 단위로 입력
		FileReader fr = new FileReader(f);
		
		//파일 객체 접그느해서 char 단위로 출력
		FileWriter fw = new FileWriter(f2);
		
		//버퍼 추가
		BufferedReader br = new BufferedReader(fr);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		//스트링 단위로 처리할 수 있게 해둠	bw.write(String[] cbuf);
		String s = null;
		
		while((s=br.readLine()) != null) {	//문장 단위로 처리
			System.out.println(s);
			bw.write(s);
		}
		
		bw.flush();
		bw.close();
		
		
		
		
	}
}
