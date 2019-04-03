package basic03;

import java.util.List;

public class EaglesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EaglesDAO eDao = new EaglesDAO();
		
		//selectone
		/*EaglesDTO player = eDao.selectOne(1);
		System.out.println(player.toString());*/
		
		//selectAll
		/*List<EaglesDTO> playerlist = eDao.selectAll();
		for(EaglesDTO player : playerlist) {
			System.out.println(player.toString());
		}*/
		
		//insert
		/*eDao.insertPlayer(new EaglesDTO(57, "정우람", "투수", "경남상고", "우투", "좌타", "850601", 800000000));*/
		
		//update
		/*EaglesDTO player = eDao.selectOne(57);
		player.setHit_hand("좌타");
		eDao.updatePlayer(player);*/
		
		//delete
		/*EaglesDTO player = eDao.selectOne(57);
		eDao.deletePlayer(player);*/
		
		String positions[] = {"투수", "포수", "내야수", "외야수"};
		for(String position : positions) {
			System.out.println("<" + position + " 포지션인 선수>");
			List<EaglesDTO> playerpositionlist = eDao.selectPlayerByposition(position);
			for(EaglesDTO player : playerpositionlist) {
				System.out.println(player.toString());
			}
			System.out.println();
			
		}
		
		//외야수 포지션인사람
		/*System.out.println("<외야수 포지션인 선수>");
		List<EaglesDTO> playerpositionlist = eDao.selectPlayerByposition("외야수");
		for(EaglesDTO player : playerpositionlist) {
			System.out.println(player.toString());
		}*/
		
		System.out.println("\n<연봉 3억 이상인 선수>");
		List<EaglesDTO> playersalarylist = eDao.selectPlayerBySalary(300000000);
		for(EaglesDTO player : playersalarylist) {
			System.out.println(player.toString());
		}
		
		eDao.close();

	}

}
