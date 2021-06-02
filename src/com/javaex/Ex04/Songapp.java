package com.javaex.Ex04;

public class Songapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Song iu = new Song();
	Song vip = new Song();
	Song busc = new Song();
	
	iu.setTitle("좋은날");
	iu.setArtist("아이유");
	iu.setAlbum("Real");
	iu.setComposer("이민수");
	iu.setYear(2010);
	iu.setTrack(3);

	vip.setTitle("거짓말");
	vip.setArtist("BIGBANG");
	vip.setAlbum("Always");
	vip.setComposer("G-DRAGON");
	vip.setYear(2007);
	vip.setTrack(2);
	
	busc.setTitle("벚꽃엔딩");
	busc.setArtist("버스커버스커");
	busc.setAlbum("버스커버스커1집");
	busc.setComposer("장범준");
	busc.setYear(2012);
	busc.setTrack(4);
	
	iu.showInfo();
	vip.showInfo();
	busc.showInfo();
	
	}

}
