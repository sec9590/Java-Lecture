package basic03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EaglesDAO {
	private Connection conn;

	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";

	// database에 대한 커넥션을 생성
	public EaglesDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// select 메소드
	public EaglesDTO selectOne(int backNo) {
		String query = "SELECT * FROM eagles where back_no=?;";
		PreparedStatement pStmt = null;
		EaglesDTO player = new EaglesDTO();

		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, backNo); // 첫번째 빈칸에 _id = id;
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				player.setBackNo(rs.getInt("back_no")); // rs.getInt(1)
				player.setName(rs.getString("name")); // rs.getString(2)
				player.setPosition(rs.getString("position")); // rs.getString(3)
				player.setHighschool(rs.getString("highschool"));
				player.setThrow_hand(rs.getString("throw_hand"));
				player.setHit_hand(rs.getString("hit_hand"));
				player.setBirth(rs.getString("birth"));
				player.setSalary(rs.getInt("salary"));
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
		return player;
	}

	public List<EaglesDTO> selectPlayerByposition(String position) {
		String sql = "select * from eagles where position = \"" + position + "\";";
		List<EaglesDTO> playerlist = selectCondition(sql);
		return playerlist;
	}

	public List<EaglesDTO> selectPlayerBySalary(int salary) {
		String sql = "select * from eagles where salary >= " + salary + ";";
		List<EaglesDTO> playerlist = selectCondition(sql);
		return playerlist;
	}

	public List<EaglesDTO> selectAll() {
		String sql = "select * from eagles;";
		List<EaglesDTO> playerlist = selectCondition(sql);
		return playerlist;
	}

	// selectCondition
	public List<EaglesDTO> selectCondition(String query) {
		// String query = "select * from eagles;";
		PreparedStatement pStmt = null;
		List<EaglesDTO> list = new ArrayList<EaglesDTO>();
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				EaglesDTO player = new EaglesDTO();
				player.setBackNo(rs.getInt("back_no")); // rs.getInt(1)
				player.setName(rs.getString("name")); // rs.getString(2)
				player.setPosition(rs.getString("position")); // rs.getString(3)
				player.setHighschool(rs.getString("highschool"));
				player.setThrow_hand(rs.getString("throw_hand"));
				player.setHit_hand(rs.getString("hit_hand"));
				player.setBirth(rs.getString("birth"));
				player.setSalary(rs.getInt("salary"));
				list.add(player);
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
		return list;

	}

	// insert 메소드
	public void insertPlayer(EaglesDTO player) {
		String query = "insert into eagles values (?, ?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement pStmt = null;

		try {
			pStmt = conn.prepareStatement(query);

			pStmt.setInt(1, player.getBackNo());
			pStmt.setString(2, player.getName());
			pStmt.setString(3, player.getPosition());
			pStmt.setString(4, player.getHighschool());
			pStmt.setString(5, player.getThrow_hand());
			pStmt.setString(6, player.getHit_hand());
			pStmt.setString(7, player.getBirth());
			pStmt.setInt(8, player.getSalary());

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
	public void updatePlayer(EaglesDTO player) {
		String query = "update eagles set name=?, position=?, highschool=?, throw_hand=?, hit_hand=?, birth=?, salary=? where back_no=?;";
		PreparedStatement pStmt = null;

		try {
			pStmt = conn.prepareStatement(query);

			pStmt.setString(1, player.getName());
			pStmt.setString(2, player.getPosition());
			pStmt.setString(3, player.getHighschool());
			pStmt.setString(4, player.getThrow_hand());
			pStmt.setString(5, player.getHit_hand());
			pStmt.setString(6, player.getBirth());
			pStmt.setInt(7, player.getSalary());
			pStmt.setInt(8, player.getBackNo());

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
	public void deletePlayer(EaglesDTO player) {
		String query = "delete from eagles where back_no = ?";
		PreparedStatement pStmt = null;

		try {
			pStmt = conn.prepareStatement(query);

			pStmt.setInt(1, player.getBackNo());

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

	public void close() {
		try {
			if (conn != null && !conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
