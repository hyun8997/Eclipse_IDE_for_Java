package d20201228;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import d20201223.MakeConnection;

//(로그인 성공했다고 하고)
//홍길동 회원이 자신의 ID를  hwalbindang, pw를 3456으로 수정할 수 있도록 해보세요

public class JDBCEx06 {
	public static void main(String[] args) {
		Connection conn = MakeConnection.getConnection();
		
		StringBuffer sb = new StringBuffer();
		sb.append("update member_ex ");
		sb.append("set id = ?, pw = ? ");
		sb.append("where memno = 1 ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수정하기");
		System.out.println("id : ");
		String id = sc.nextLine();
		System.out.println("pw : ");
		String pw = sc.nextLine();
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setNString(1, id);
			pstmt.setNString(2, pw);
			
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
