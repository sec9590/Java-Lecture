package exercise02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

	//조회
	public List<BbsDTO> selectAll() {
		String query = "select bbs.id, bbs.title, member.name, date_format(bbs.date, '%Y-%m-%d %h:%i') from bbs inner join member on member.id = bbs.memberid order by bbs.id desc;";
		PreparedStatement pStmt = null;
		List<BbsDTO> list = new ArrayList<BbsDTO>();
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				BbsDTO bbsDTO = new BbsDTO();
				bbsDTO.setId(rs.getInt(1));
				bbsDTO.setTitle(rs.getString(2));
				bbsDTO.setName(rs.getString(3));
				bbsDTO.setDate(rs.getString(4));

				list.add(bbsDTO);
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

	public BbsDTO selectMemberId(int id) {
		String query = "select bbs.title, member.name, date_format(bbs.date, '%Y-%m-%d %h:%i'), bbs.content from bbs inner join member on member.id = bbs.memberid where bbs.id = ?;";
		PreparedStatement pStmt = null;
		BbsDTO bDto = new BbsDTO();

		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				bDto.setTitle(rs.getString(1));
				bDto.setName(rs.getString(2));
				bDto.setDate(rs.getString(3));
				bDto.setContent(rs.getString(4));
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
		return bDto;
	}

	public BbsDTO selectOne(int id) {
		String query = "select * from bbs where id=?;";
		PreparedStatement pStmt = null;
		BbsDTO bDto = new BbsDTO();

		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				bDto.setId(rs.getInt("id"));
				bDto.setMemberId(rs.getInt("memberid"));
				bDto.setTitle(rs.getString("title"));
				bDto.setDate(rs.getString("date"));
				bDto.setContent(rs.getString("content"));
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
		return bDto;
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
		String query = "update bbs set title=?, content=?, date=now() where id=?;";
		PreparedStatement pStmt = null;

		try {
			pStmt = conn.prepareStatement(query);

			pStmt.setString(1, Bbs.getTitle());
			pStmt.setString(2, Bbs.getContent());
			pStmt.setInt(3, Bbs.getId());

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
		String query = "delete from bbs where id = ?";
		PreparedStatement pStmt = null;

		try {
			pStmt = conn.prepareStatement(query);
			
			pStmt.setInt(1, Bbs.getId());
			
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
