package d20201229;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//객체도 저장하고 읽어들일 수 있음
public class IOEx08 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Member m = new Member("java","1234","hong","yuldokuk","hwal@bin.dang");
		
		File f = new File("C:\\Users\\yuiop\\Downloads\\iotest\\member.dat");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		//객체로 output
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//특정 객체를 저장(쓰기)
		oos.writeObject(m);		//열어보면 감춰져 있는거 볼 수 있음
		
		
		
		
		
		//데이터를 읽어오기
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//객체를 읽어오는 메소드
		Object obj = ois.readObject();
		
		Member m2 = (Member)obj;	//Member 보다 Object 가 더 크므로 꼭 캐스팅 해야 함
		
		System.out.println("id : "+ m2.getId());
		System.out.println("pw : "+ m2.getPw());		//pw 보호 방법 필요, transient String pw;에 의해 null로 읽어지는것을 확인 가능
		System.out.println("email : "+ m2.getEmail());
		System.out.println("name : "+ m2.getName());
		System.out.println("addrs : "+ m2.getAddrs());
		
		
		
		
	}
}
