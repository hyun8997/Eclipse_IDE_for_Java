package d20201223;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//데이터 입력
public class JDBCEx04 {
	public static void main(String[] args) {
//		MakeConnection mc1 = MakeConnection.getInstance();	//인스턴스를 생성
//		MakeConnection mc2 = MakeConnection.getInstance();	//new를 안했으므로 있는거 그대로
//		
//		System.out.println("mc1 : "+ mc1);
//		System.out.println("mc2 : "+ mc2);
		
		//dbms 연결
		Connection conn = MakeConnection.getConnection();
		//System.out.println("conn : "+ conn);
		
		
		//사용자로부터 입력을 받았다고 치고 상수처리
		String id = "java";
		String pw = "1234";
		String name = "hong";
		
		//sql statement
		StringBuffer sb = new StringBuffer();
		sb.append("insert into login ");
		sb.append("values (?, ?, ?) ");
		
		//문장 객체
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setNString(1, id);
			pstmt.setNString(2, pw);
			pstmt.setNString(3, name);
			
			//실행
			pstmt.executeUpdate();
			System.out.println("데이터 입력 완료");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//자원반납
		finally {
			if(pstmt!=null){
				try {
					pstmt.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		
		
		
		
	}
}
