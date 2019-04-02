package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateMain {

	public static void main(String[] args) {
		// connection과 statement 객체 생성
		Connection conn = null;

		try {
			// 데이터베이스 연결단계
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false", "javauser",
					"javapass"); // 유저와 패스워드 넣기

			String query = "update song set _id = ? where _id = ?;";
			PreparedStatement pStmt = conn.prepareStatement(query);

			pStmt.setInt(1, 117); // 첫번째 빈칸
			pStmt.setInt(2, 118); // 두번째 빈칸
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