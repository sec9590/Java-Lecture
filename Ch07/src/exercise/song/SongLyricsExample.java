package exercise.song;

public class SongLyricsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SongLyrics songLyrics = new SongLyrics("Love of My Life", "Queen", "A Night at the Opera",
				new String[] { "프레디머큐리" }, 1975, 9,
				"Love of my life, you\'ve hurt me\n" + "You\'ve broken my heart and now you leave me\n"
						+ "Love of my life, can\'t you see?\n" + "Bring it back, bring it back\n"
						+ "Don\'t take it away from me, because you don\'t know\n" + "What it means to me\n");
		
		songLyrics.show();
	}

}
