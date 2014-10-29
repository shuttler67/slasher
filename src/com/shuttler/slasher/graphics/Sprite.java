package com.shuttler.slasher.graphics;

import texture.Texture;

public class Sprite {
	private Texture image;
	private double width;
	private double height;
	public Sprite(Texture image){
		this.image = image;
		width = image.getWidth();
		height = image.getHeight();
	}
	public void draw(double x, double y){
		image.draw(x, y, width, height);
	}
	public void setDimensions(double width, double height){
		this.width=width;
		this.height=height;
	}
	public void nextFrame(){
		image.nextAnimationFrame();
	}
	public void resetAnimation(){
		image.resetAnimation();
	}
}
