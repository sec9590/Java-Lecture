package test03;

import java.util.List;

public class CityMain {

	public static void main(String[] args) {
		CityDAO cDao = new CityDAO();
		
		List<CityDTO> citylist = cDao.selectCondition();
		for(CityDTO city : citylist) {
			System.out.println(city.toString());
		}

	}

}
