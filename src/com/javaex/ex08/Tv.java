package com.javaex.ex08;

public class Tv {
	//필드
	private  int channal;
	private int volume;
	private boolean power;
	
	
	//메소드
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
	
	//일반
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
		System.out.print("채널 : "+channal+",");
		System.out.print(" 볼륨 : "+volume+", ");
		if(power==true) {
			System.out.println("전원이 켜졌습니다.");
		}
		else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
		
		
	
	
}
