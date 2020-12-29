package d20201229;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


//char stream
public class IOEx03 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\yuiop\\Downloads\\iotest\\goot3.txt");
		File f2 = new File("C:\\Users\\yuiop\\Downloads\\iotest\\copygoot3.txt");
		
		//파일 객체에 접근해서 char 단위로 입력
		FileReader fr = new FileReader(f);
		
		//파일 객체 접근해서 char 단위로 출력
		FileWriter fw = new FileWriter(f2);
		
		
		int v = 0;
		
		while( (v=fr.read())!= -1 ) {
			System.out.println((char)v);
			fw.write(v);
		}
		
		//char stream은 내부적으로 buffer를 사용하고 있으므로 기존 버퍼에서 종료작용하는 flush써야 함
		fw.flush();
		fw.close();		//권장 사항
	}
}
