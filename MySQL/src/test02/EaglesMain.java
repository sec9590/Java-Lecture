package test02;

import java.util.ArrayList;
import java.util.List;

import basic03.EaglesDAO;
import basic03.EaglesDTO;

public class EaglesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EaglesDAO eDao = new EaglesDAO();
		List<EaglesDTO> oneplayer = new ArrayList<EaglesDTO>(); // 1군선수 리스트 생성

		System.out.println("<1군 선수>");
		eDao.insertPlayer(new EaglesDTO(99, "정민철", "투수", "대전고", "우투", "우타", "720328", 27000000));

		oneplayer.add(eDao.selectOne(99));
		for (int i = 0; i < oneplayer.size(); i++) {
			EaglesDTO player = oneplayer.get(i);
			System.out.println(player.toString());
		}

		System.out.println("\n<1군 선수 트레이드>");
		oneplayer.remove(0);
		eDao.insertPlayer(new EaglesDTO(98, "박재홍", "외야수", "인천고", "우투", "좌타", "730907", 30000000));
		oneplayer.add(eDao.selectOne(98));
		for (int i = 0; i < oneplayer.size(); i++) {
			EaglesDTO player = oneplayer.get(i);
			System.out.println(player.toString());
		}
		
		eDao.close();
	}

}
