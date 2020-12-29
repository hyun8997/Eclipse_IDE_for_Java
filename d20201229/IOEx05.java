package d20201229;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//키보드 입력을 저장
public class IOEx05 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\yuiop\\Downloads\\iotest\\ketboard.txt");
		
		//output
		FileOutputStream fos = new FileOutputStream(f);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//input : 사용자 입력을 받아들이기 - 콘솔창을 통해서
		//Scanner sc = new Scanner(System.in);	//기본 inputstream으로 받는다
		InputStreamReader isr = new InputStreamReader(System.in);
		
		System.out.println("입력하세요 : (종료키 - ctrl + z) ");
		
		int v = 0;
		while((v=isr.read()) != -1) {
			bos.write(v);
			System.out.println((char)v);
		}
		
		bos.flush();
		bos.close();
		
		
		System.out.println("종료되었습니다");
		
		
	}
}
