package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMain {
	public static void main(String[] args) {
		// connection과 statement 객체 생성
		Connection conn = null;
		Statement st = null;

		try {
			// 데이터베이스 연결단계
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false", "javauser",
					"javapass"); // 유저와 패스워드 넣기

			st = conn.createStatement(); // sql문을 넣는 객체
			String sql = "select * FROM song where title like 'Gee';"; // sql string변수를 생성하여 sql문 작성

			// sql의 result 결과 저장
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				// song 테이블에는 id(int), title, lyrics(varchar) 존재
				int songId = rs.getInt(1);
				String title = rs.getString(2);
				String lyrics = rs.getString(3); // varchar은 string으로
				System.out.printf("%8d %-20s\t%s\n", songId, title, lyrics);
			}
			rs.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				st.close();
			} catch (SQLException se2) {
			}
			try {
				conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}