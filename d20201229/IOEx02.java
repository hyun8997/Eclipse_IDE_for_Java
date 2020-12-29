package d20201229;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//byte stream - buffer
public class IOEx02 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\yuiop\\Downloads\\iotest\\Hello.java");
		File f2 = new File("C:\\Users\\yuiop\\Downloads\\iotest\\CopyHello.java");
		
		
		//파일에 접근해서 읽어오는 클래스
		FileInputStream fis = new FileInputStream(f);	//외부로 접근하게 되서 예외처리해야 함	(db, io, net)
		
		//파일에 접근해서 출력하는 클래스
		FileOutputStream fos = new FileOutputStream(f2);
		

		//접근 속도를 향상 시킬 수 있는 입력 클래스 - buffer 이용
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		//접근 속도를 향상 시킬 수 있는 출력 클래스 - buffer 이용
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		
		int v = 0;
		
		while((v=bis.read()) != -1) {
			//System.out.println((char)v);
			bos.write(v);
		}
		
		bos.flush(); 	//buffer에 내용이 가득차지 않아도 내려쓰게 하는 메소드	이게 있어야 write 수행이 끝남
		
		
		
		
	}
}
