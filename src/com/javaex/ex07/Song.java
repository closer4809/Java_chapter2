package com.javaex.ex07;

public class Song {
	//�ʵ�
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//������
	public Song() {
		//����Ʈ, �ʱ�ȭ???? �̰� �־�� �ѹ��� ��� ǥ������
	}
	
	public Song(String title, String artist) { 
		this.title = title;
		this.artist = artist;
	}
	
	
	
	
	
	
	//�޼ҵ�-���ͼ���
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
	
	//�޼ҵ�-�Ϲ�

	public void showinfo() {
		System.out.println(title+artist+album+composer+year+track);
	}

}
