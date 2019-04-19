package test03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CityDAO {
	private Connection conn;

	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";
	
	public CityDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<CityDTO> selectCondition() {
		String query = "select * from city where population>1000000 order by population desc;";
		PreparedStatement pStmt = null;
		List<CityDTO> list = new ArrayList<CityDTO>();
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				CityDTO city = new CityDTO();
				city.setId(rs.getInt("id")); // rs.getInt(1)
				city.setName(rs.getString("name")); // rs.getString(2)
				city.setCountrycode(rs.getString("countrycode")); // rs.getString(3)
				city.setDistrict(rs.getString("district"));
				city.setPopulation(rs.getInt("population"));				
				list.add(city);
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
}
