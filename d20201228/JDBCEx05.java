package d20201228;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import d20201223.MakeConnection;

//사용자가 입력한 내용을 DBMS에 저장, 회원 가입
public class JDBCEx05 {
	public static void main(String[] args) {
		//0. 변수 선언
		//1. 드라이버 로딩
		//2. 연결 객체 생성
		//3. SQL 문장 작성
		//4. 문장 객체
		//5. 실행
		//6. 레코드 1개씩 꺼내서 로직 처리
		//7. 자원 반납
		
		
		Connection conn = MakeConnection.getConnection();
		
		//System.out.println("conn : "+ conn);
		
		
//		create table member_ex
//		(memno number(4),		자동으로 생성
//		id varchar2(20),		회원이 입력
//		pw varchar2(20),		회원이 입력
//		name varchar2(20),		회원이 입력
//		tel varchar2(12),		회원이 입력
//		regdate date);			자동으로 생성
		
		//sql
		StringBuffer sb = new StringBuffer();
		sb.append("insert into member_ex ");	//공백 잊지 말기!
		sb.append("values (mem_memno_seq.nextval, ");
		sb.append(" ?, ?, ?, ?, sysdate ) ");
		
		//사용자 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("id 입력 : ");
		String id = sc.nextLine();
		System.out.println("pw 입력 : ");
		String pw = sc.nextLine();
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("tel 입력 : ");
		String tel = sc.nextLine();
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			//? 지정
			pstmt.setNString(1, id);
			pstmt.setNString(2, pw);
			pstmt.setNString(3, name);
			pstmt.setNString(4, tel);
			
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
				try {
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		
		
	}
}
