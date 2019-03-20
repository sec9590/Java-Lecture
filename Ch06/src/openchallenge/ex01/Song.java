package openchallenge.ex01;

import java.util.Arrays;

public class Song {
	String title;
	String artist;
	String album;
	String[] composer;
	int year;
	int track;

	Song() {
	}

	public Song(String title, String artist, String album, String[] composer, int year, int track) {

		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		
		
	}

	public void show() {
		System.out.println("Song [title = " + title + ", artist = " + artist + ", album = " + album + ", composer = "
				+ Arrays.toString(composer) + ", year = " + year + ", track = " + track + "]");
	}

}
