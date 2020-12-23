package d20201223;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//사용자로부터 입력받은 사원의 사번, 이름, 연봉 조회

public class JDBCEx03 {
	public static void main(String[] args) {
		System.out.println("검색할 사원의 사번 입력 : ");
		Scanner sc =  new Scanner(System.in);
		
		int empno = sc.nextInt();
		
		//System.out.println("empno : "+ empno);
		
		
		//사용할 SQL 문장 작성 : 선언부에 두는 것이 나중에 관리가 편해짐
//		"SELECT EMPNO, ENAME, SAL" +
//		"FROM EMP" +
//		"WHERE EMPNO = " + empno;
		
		
		//db는 안정성이 중요하므로 빌더보다는 버퍼를 씀
		StringBuffer sql = new StringBuffer();
		sql.append("select empno, ename, sal*12 as annual ");	//append는 뒤에 붙여가는 함수 
		sql.append("from emp ");					//때문에 뒷부분이나 다음 절 앞에 공백을 꼭 해야 함!
		sql.append("where empno = ? ");			// ? 로 이 값이 매번 바뀌는 변수임을 알려줌
		
		
		//변수 설정
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "scott";
		String password = "tiger";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		
		
		//드라이버 로딩
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버 로직 실패");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("DBMS 연결 실패");
		}
		
		
		//문장 객체 생성
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, empno); 	//parameterIndex : 몇번째 ? 인지
			
			
			//실행 - return
			rs = pstmt.executeQuery();
			
			//로직 처리
			rs.next();
			
			String name = rs.getNString("ename");
			// dbms의 리턴 결과에 따른 테이블에서 컬럼을 찾게 되므로 주의가 필요함
			int sal = rs.getInt("annual");				//이거 불러올때 별칭으로도 불러올 수 있다
			
			System.out.println(empno+ "\t"+ name+ "\t"+ sal);
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}//자원반납
		finally {
			if(rs!=null) {
				try {
					rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}
	
}
