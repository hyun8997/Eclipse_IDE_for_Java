package d20201228;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx01 {
	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Users\\yuiop\\Downloads\\iotest\\goot.txt");
		File f2 = new File("C:\\Users\\yuiop\\Downloads\\iotest\\goot2.txt");
		
		
		//System.out.println("f : "+ f);
		
		//파일 객체 접근해서 내용을 읽어오기
		if(f.isFile()) {
		//	System.out.println("file ok");
			FileInputStream fis = new FileInputStream(f);
			
			
			//파일 객체 접근해서 내용을 쓰기
			FileOutputStream fos = new FileOutputStream(f2);
			
			
			
		//	System.out.println("fis : "+ fis);
			
//			for(int i=0; i<10; i++) {			//10자 읽어오기
//				int value = fis.read();
//				System.out.print((char)value);
//			}
//			System.out.println();
			
			
			int v = 0;
			
			//EOF(End Of File) : -1
			while((v=fis.read()) != -1) {
				System.out.print((char)v);
				fos.write(v);						//파일이 없어도 같단한건 만들어준다.
			}
			System.out.println();
			System.out.println("읽어온 데이터를 잘 사용할 수 있게 됐음");
			
			
		}
		
		
		
	}
}
