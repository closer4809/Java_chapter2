package com.javaex.ex07;

public class Song {
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//생성자
	public Song() {
		//디폴트, 초기화???? 이게 있어야 한번에 길게 표현가능
	}
	
	public Song(String title, String artist) { 
		this.title = title;
		this.artist = artist;
	}
	
	
	
	
	
	
	//메소드-게터세터
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public String getComposer() {
		return composer;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getTrack() {
		return track;
	}
	
	//메소드-일반

	public void showinfo() {
		System.out.println(title+artist+album+composer+year+track);
	}

}
