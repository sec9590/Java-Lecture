package exercise02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exercise01.MemberDTO;


public class BbsDAO {
	private Connection conn;

	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";

	// database에 대한 커넥션을 생성
	public BbsDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public List<BbsDTO> selectCondition(String query) {
		// String query = "select * from Bbs;";
		PreparedStatement pStmt = null;
		List<BbsDTO> list = new ArrayList<BbsDTO>();
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				BbsDTO Bbs = new BbsDTO();
				Bbs.setId(rs.getInt("id"));
				Bbs.setMemberId(rs.getInt("memberid"));
				Bbs.setTitle(rs.getString("title"));
				Bbs.setDate(rs.getString("date"));
				Bbs.setContent(rs.getString("content"));
				
				list.add(Bbs);
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
	
	public List<BbsDTO> selectAll() {
		String sql = "select id, memberid, title, date, content from bbs order by id desc;";
		List<BbsDTO> Bbs = selectCondition(sql);
		return Bbs;
	}
	
	public  List<BbsDTO> selectMemberId(int memberid) {
		String sql = "select bbs.title, member.name, bbs.date, bbs.content from bbs inner join member on member.id = bbs.memberid where memberid = \"" + memberid + "\";";
		List<BbsDTO> Bbs = selectCondition(sql);
		return Bbs;
	} 
	
	public BbsDTO selectOne(int memberid) {
		String query ="select * FROM Bbs where memberid=?;";
		PreparedStatement pStmt = null;
		BbsDTO Bbs = new BbsDTO();

		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, memberid); 
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				Bbs.setId(rs.getInt("id"));
				Bbs.setMemberId(rs.getInt("memberid"));
				Bbs.setTitle(rs.getString("title"));
				Bbs.setDate(rs.getString("date"));
				Bbs.setContent(rs.getString("content"));
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
		return Bbs;
	}
	
	
	public void insertBbs(BbsDTO Bbs) {
		String query = "insert into bbs(memberid, title, content) values (?, ?, ?);";
		PreparedStatement pStmt = null;

		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, Bbs.getMemberId());
			pStmt.setString(2, Bbs.getTitle());
			pStmt.setString(3, Bbs.getContent());

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
	
	public void updateBbs(BbsDTO Bbs) {
		String query = "update bbs set title=?, content=? where memberid=?;";
		PreparedStatement pStmt = null;

		try {
			pStmt = conn.prepareStatement(query);

			pStmt.setString(1, Bbs.getTitle());
			pStmt.setString(2, Bbs.getContent());

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
	
	public void deleteBbs(BbsDTO Bbs) {
		String query = "delete from bbs where memberid = ?";
		PreparedStatement pStmt = null;

		try {
			pStmt = conn.prepareStatement(query);

			pStmt.setInt(1, Bbs.getMemberId());

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

}
