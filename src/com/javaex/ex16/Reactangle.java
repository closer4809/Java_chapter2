package com.javaex.ex16;

public class Reactangle {
	//�ʵ�
	protected String filecolor;
	protected String linecolor;
	private int width;		
	private int heinght;

	//������
	public Reactangle() {
		
	}
	
	
	public Reactangle(String filecolor, String linecolor, int width, int heinght) {
		super();
		this.filecolor = filecolor;
		this.linecolor = linecolor;
		this.width = width;
		this.heinght = heinght;
	}
	
	///�޼ҵ� �ټ�
	public String getFillcolor() {
		return filecolor;
	}
	public void setFillcolor(String fillcolor) {
		this.filecolor = fillcolor;
	}
	public String getLinecolor() {
		return linecolor;
	}
	public void setLinecolor(String linecolor) {
		this.linecolor = linecolor;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeinght() {
		return heinght;
	}
	public void setHeinght(int heinght) {
		this.heinght = heinght;
	}

	
	
	//�޼ҵ� �Ϲ�
	@Override
	public String toString() {
		return "Reactangle [filecolor=" + filecolor + ", linecolor=" + linecolor + ", width=" + width + ", heinght="
				+ heinght + "]";
	}

	public void draw() {
		System.out.println("[���: "+filecolor+", ����: "+linecolor+", ����: "+width+", ����: "+heinght+"] �� �簢���� �׷Ƚ��ϴ�.");
	}
	






}
	