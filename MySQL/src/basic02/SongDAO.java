package basic02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SongDAO { // 연결
	private Connection conn;

	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";

	// database에 대한 커넥션을 생성
	public SongDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// 다른 method에서 DB 연결과정 생략 가능
	
	// insert 메소드
	public void insertSong(SongDTO song) {
		String query = "insert into song(title, lyrics) values (?, ?);";
		PreparedStatement pStmt = null;

		try {
			pStmt = conn.prepareStatement(query);

			pStmt.setString(1, song.getTitle()); // 첫번째 빈칸에 getTitle
			pStmt.setString(2, song.getLyrics()); // 두번째 빈칸에 getLyrics

			pStmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed())
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

	// update 문
	public void updateSong(SongDTO song) {
		String query = "update song set title = ?, lyrics = ? where _id = ?;";
		PreparedStatement pStmt = null;

		try {
			pStmt = conn.prepareStatement(query);

			pStmt.setString(1, song.getTitle()); // 첫번째 빈칸에 getTitle
			pStmt.setString(2, song.getLyrics()); // 두번째 빈칸에 getLyrics
			pStmt.setInt(3, song.getId());
			
			pStmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed())
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

	// delete 문
	public void deleteSong(SongDTO song) {
		String query = "delete from song where _id = ?";
		PreparedStatement pStmt = null;

		try {
			pStmt = conn.prepareStatement(query);

			pStmt.setInt(1, song.getId());
			
			pStmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed())
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

	// select 메소드
	public SongDTO selectOne(int id) {
		String query = "SELECT * FROM song where _id=?;";
		PreparedStatement pStmt = null;
		SongDTO song = new SongDTO(); // 빈 생성자 객체 생성

		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, id); //첫번째 빈칸에 _id = id;
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				song.setId(rs.getInt("_id")); // rs.getInt(1)
				song.setTitle(rs.getString("title")); // rs.getString(2)
				song.setLyrics(rs.getString("lyrics")); // rs.getString(3)
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed())
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return song;
	}

	public void close() {
		try {
			if (conn != null && !conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
