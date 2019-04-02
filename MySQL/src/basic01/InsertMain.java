package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertMain {

	public static void main(String[] args) {
		// connection과 statement 객체 생성
		Connection conn = null;

		try {
			// 데이터베이스 연결단계
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false", "javauser",
					"javapass"); // 유저와 패스워드 넣기

			String query = "insert into song(title, lyrics) values (?, ?);";
			PreparedStatement pStmt = conn.prepareStatement(query);

			pStmt.setString(1, "가시나");
			pStmt.setString(2, "왜 예쁜 날 두고 가시나 (날 두고 가시나)\r\n");
			pStmt.executeUpdate();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}