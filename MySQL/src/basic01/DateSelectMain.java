package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DateSelectMain {
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

			st = conn.createStatement();
			String sql = "select id, date_format(datetime, '%Y-%m-%d %r') FROM date_table;";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				int Id = rs.getInt(1);
				String datetime = rs.getString(2);
				System.out.printf("%11d %s\n", Id, datetime);
			}

			st.close();
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