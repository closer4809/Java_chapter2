package com.javaex.ex08;

public class Tv {
	//�ʵ�
	private  int channal;
	private int volume;
	private boolean power;
	
	
	//�޼ҵ�
	public Tv(){
		
	}
	

	public Tv(int channal, int volume, boolean power) {
		this.channal = channal;
		this.volume = volume;
		this.power = power ;
	}
		
	//GET
	public int getChannal() {
		return channal;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean isPower() {
	return power;
		
	}
	
	//�Ϲ�
	public void power(boolean on) {
		if(on == true ) {
			this.power = true;
		}else {
			this.power = false;
		}
	}
	
	public void channal(boolean channal) {
		if(channal == true) {
			this.channal++;
		}
	
		else {
			this.channal--;
		}
	}
	
	public void channal(int channal) {
		if(channal<=0) {
			this.channal = 1;
		}else if(channal>=255) {
			this.channal = 255;
		}
	
	}
	
	public void volume(boolean volume) {
		if(volume == true) {
			this.volume++;
		}
		else {
			this.volume--;
		}
	}

	public void volume(int volume) {
		if(volume<=0) {
			this.volume = 0;
		}else if(volume>=100) {
			this.volume = 100;
		}
		
	}
	
	
	
	
	
	public void status() {
		System.out.print("ä�� : "+channal+",");
		System.out.print(" ���� : "+volume+", ");
		if(power==true) {
			System.out.println("������ �������ϴ�.");
		}
		else {
			System.out.println("������ �������ϴ�.");
		}
	}
		
		
	
	
}
