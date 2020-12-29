package d20201229;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//IOEx05에서 키보드 입력 한글 깨지는것 개선
public class IOEx06 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\yuiop\\Downloads\\iotest\\ketboard.txt");
		
		//output
		//알파벳, 숫자	----> 1 byte
		//한글	    ----> 2 byte ----> char
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		//input : 사용자 입력을 받아들이기 - 콘솔창을 통해서
		//Scanner sc = new Scanner(System.in);	//기본 inputstream으로 받는다
		InputStreamReader isr = new InputStreamReader(System.in);	//콘솔을 통해 아스키, 바이트로 들어옴
																	//브릿지를 통해서 브릿지를 통해 나가는 것
		
		System.out.println("입력하세요 : (종료키 - ctrl + z) ");
		
		int v = 0;
		while((v=isr.read()) != -1) {
			bw.write(v);
			System.out.println((char)v);
		}
		
		bw.flush();
		bw.close();
		
		
		System.out.println("종료되었습니다");
		
		
	}	
}
