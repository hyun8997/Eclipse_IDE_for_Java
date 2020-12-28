package d20201228;

import java.io.File;

public class FileEx {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\yuiop\\Downloads\\iotest\\Hello.java");
		
		//System.out.println("f : "+ f);
		
		//파일 존재 여부
		if(f.exists()) {
			System.out.println("파일이 존재합니다.");
		}else {
			System.out.println("파일이 없습니다.");
			
			//만약 다운로드 기능이라면?
			//같은 이름의 파일이 없는것이 확인된 이후 - 파일 생성
			//f.createNewFile();
		}
		
		System.out.println("------------------------------");
		
		//파일 객체인지 여부
		if(f.isFile()) {
			System.out.println("파일입니다.");
		}else {
			System.out.println("파일이 아닙니다.");
		}
		
		System.out.println("------------------------------");
		
		if(f.isDirectory()) {
			System.out.println("디렉토리입니다");
		} else {
			System.out.println("디렉토리가 아닙니다");
		}
		
		System.out.println("------------------------------");
		
		//파일 경로 얻기
		//String path = f.getPath();		//상대경로
		String path = f.getAbsolutePath();	//절대경로
		System.out.println("파일경로 : "+ path);
		
		System.out.println("------------------------------");
		
		File f2 = new File("C:\\eclipse");
		
		System.out.println("f2 : "+ f2);
		
		if(f2.isDirectory()) {
			System.out.println("디렉토리입니다");
			
			String[] list = f2.list();
			
			for(String str : list) {
				System.out.println(str);
			}
			
		}
		
		
		
		
		
		
		
	}
}
