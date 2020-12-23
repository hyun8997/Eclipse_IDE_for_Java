package d20201223;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//EMP 테이블의 모든 정보를 조회해보세요
public class JDBCEx02 {

	public static void main(String[] args) {
		//1. 변수 설정
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		String user = "scott";
		String password = "tiger";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		//2. 드라이버 로딩
		try {
			Class.forName(driver);
			//3. Connection
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("conn : "+ conn);
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		//4. 사용할 SQL 문장 작성
		String sql = "select * from emp";
		
		
		//5. 문장 객체 선언
		try {
			pstmt = conn.prepareStatement(sql);
			
			//6. 실행 - return
			rs = pstmt.executeQuery();
			
			//7. 레코드별로 로직 처리
			while(rs.next()) {
				int empno = rs.getInt(1); //db처리에서 인덱스 번호 시작이 1부터임을 기억
				String ename = rs.getString(2);
				String job = rs.getString(3);
				int mgr = rs.getInt(4);
				String hiredate = rs.getString(5);
				int sal = rs.getInt(6);
				int comm = rs.getInt(7);
				int deptno = rs.getInt(8);
				
				System.out.println(empno+" "+ename+" "+job+" "+mgr+" "+hiredate+" "+sal+" "+comm+" "+deptno);
				
			}
			
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//8. 자원반납
		finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			}catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}

	
}
