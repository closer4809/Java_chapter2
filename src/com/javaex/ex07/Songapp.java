package com.javaex.ex07;

public class Songapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Song iu = new Song();
//	iu.setTitle("좋은날");
//	iu.setArtist("아이유");
//	iu.setAlbum("Real");
//	iu.setComposer("이민수");
//	iu.setYear(2010);
//	iu.setTrack(3);
	
	
	
	Song iu = new Song("좋은날", "아이유");
	iu.showinfo();
	
	
	Song vip = new Song();
	vip.setTitle("거짓말");
	vip.setArtist("BIGBANG");
	vip.setAlbum("Always");
	vip.setComposer("G-DRAGON");
	vip.setYear(2007);
	vip.setTrack(2);
	
	vip.showinfo();
	
	Song bsk = new Song();
	bsk.setTitle("벚꽃엔딩");
	bsk.setArtist("버스커버스커");
	bsk.setAlbum("버스커버스커1집");
	bsk.setComposer("장범준");
	bsk.setYear(2012);
	bsk.setTrack(4);
	
	bsk.showinfo();
	
	}

}
