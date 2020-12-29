package d20201229;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//자료형 단위로 데이터를 IO 할 수 있음
public class IOEx07 {
	public static void main(String[] args) throws IOException {
		//ex) primitive.dat
		
		File f =new File("C:\\Users\\yuiop\\Downloads\\iotest\\primitive.txt");
		//db에서 xml이나 dat형태의 파일로 많이 보내줌. 보안을 위해
		FileOutputStream fos = new FileOutputStream(f);
		
		//각 자료형 단위로 data를 저장
		DataOutputStream dos = new DataOutputStream(fos);	//output stream 통로를 만든다음 데이터를 버퍼에 담아서 내보냄 -> 순서 기억할 것!
		
		//(DBMS에서 가져왔다고 가정) 각 자료형 단위로 데이터를 배치		ex)게임 케릭터
		dos.writeUTF("홍길동");	//보통의 String은 한글이 깨질거라서 UTF로 내보낼 수 있음
		dos.writeInt(20);
		dos.writeDouble(178.5);
		dos.writeBoolean(false);		// ==> 정보들이 다 감춰지는것을 볼 수 있다.
		
		//input - 파일의 데이터 읽어오기
		FileInputStream fis = new FileInputStream(f);
		
		//각 자료형으로 데이터를 읽어들이기
		DataInputStream dis = new DataInputStream(fis);
		
		//읽어오기 수헹 : 주의 - 배치한 자료 순서대로 읽어와야 한다.
		String name = dis.readUTF();
		int age = dis.readInt();
		double height = dis.readDouble();
		boolean isChange = dis.readBoolean();
		
		System.out.println("캐릭터명 : "+ name);
		System.out.println("캐릭터 나이 : "+ age);
		System.out.println("캐릭터 키 : "+ height);
		System.out.println("캐릭터 전직 여부 : "+ isChange);
		
		
		
		
		
		
	}
}
