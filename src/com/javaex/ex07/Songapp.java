package com.javaex.ex07;

public class Songapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Song iu = new Song();
//	iu.setTitle("������");
//	iu.setArtist("������");
//	iu.setAlbum("Real");
//	iu.setComposer("�̹μ�");
//	iu.setYear(2010);
//	iu.setTrack(3);
	
	
	
	Song iu = new Song("������", "������");
	iu.showinfo();
	
	
	Song vip = new Song();
	vip.setTitle("������");
	vip.setArtist("BIGBANG");
	vip.setAlbum("Always");
	vip.setComposer("G-DRAGON");
	vip.setYear(2007);
	vip.setTrack(2);
	
	vip.showinfo();
	
	Song bsk = new Song();
	bsk.setTitle("���ɿ���");
	bsk.setArtist("����Ŀ����Ŀ");
	bsk.setAlbum("����Ŀ����Ŀ1��");
	bsk.setComposer("�����");
	bsk.setYear(2012);
	bsk.setTrack(4);
	
	bsk.showinfo();
	
	}

}
