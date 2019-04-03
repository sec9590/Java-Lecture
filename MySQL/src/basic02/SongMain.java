package basic02;

import java.util.List;

public class SongMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SongDAO sDao = new SongDAO(); //DB랑 연결
		
		//insert 문
		/*SongDTO sDto = new SongDTO("빨간맛", "빠빠빨간맛 궁금해 허니"); //생성자 호출하여 입력
		sDao.insertSong(sDto); */
		
		//update 문
		/*SongDTO sDto = new SongDTO(121,"빨간 맛", "빠빠빨~간맛 궁금해 허니");
		sDao.updateSong(sDto);*/
		
		/*SongDTO sDto = sDao.selectOne(121);
		sDto.setTitle("넌 is 뭔들");
		sDto.setLyrics("나 지금 너 떔에 혼란스러 제발 누가 나좀 말려줘");
		sDao.updateSong(sDto);*/
		
		//delete 문
		/*SongDTO sDto = sDao.selectOne(122);
		sDao.deleteSong(sDto);*/
		
		/*SongDTO sDto = new SongDTO();
		sDto.setId(121);
		sDao.deleteSong(sDto);*/
		
		//select 문
		/*SongDTO sDto = sDao.selectOne(117);
		System.out.println(sDto.toString());*/
		
		//selectAll 문
		List<SongDTO> songList = sDao.selectAll();
		for(SongDTO song : songList) {
			System.out.println(song.toString());
		}		
		
		sDao.close(); //DB 닫기

	}

}
