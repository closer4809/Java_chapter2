package com.javaex.Ex04;

public class Songapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Song iu = new Song();
	Song vip = new Song();
	Song busc = new Song();
	
	iu.setTitle("������");
	iu.setArtist("������");
	iu.setAlbum("Real");
	iu.setComposer("�̹μ�");
	iu.setYear(2010);
	iu.setTrack(3);

	vip.setTitle("������");
	vip.setArtist("BIGBANG");
	vip.setAlbum("Always");
	vip.setComposer("G-DRAGON");
	vip.setYear(2007);
	vip.setTrack(2);
	
	busc.setTitle("���ɿ���");
	busc.setArtist("����Ŀ����Ŀ");
	busc.setAlbum("����Ŀ����Ŀ1��");
	busc.setComposer("�����");
	busc.setYear(2012);
	busc.setTrack(4);
	
	iu.showInfo();
	vip.showInfo();
	busc.showInfo();
	
	}

}
