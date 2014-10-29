package com.shuttler.slasher.util;
import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.opengl.Display;

public class Camera {
	private double x;
	private double y;
	private double scale;
	private double angle;
	public Camera(double x, double y){
		this.x=x;
		this.y=y;
		this.scale=1;
		this.angle=0;
		
	}
	public void setTranslations(){
		glPushAttrib(GL_TRANSFORM_BIT);
		glScaled(x, y, 1);
		glTranslated(Display.getWidth()/(2*scale), Display.getHeight()/(2*scale), 0);
		glRotated(angle, 0, 0, 1);
		glPopAttrib();
	}
	public void setAngle(double to){
		angle=to;
	}
	public void setScale(double to){
		scale=to;
	}
	public void moveTo(double setx, double sety){
		x=setx;
		y=sety;
	}
	public void move(double dx, double dy){
		x+=dx;
		y+=dy;
	}
	public void rotate(double angle){
		this.angle+=angle;
	}
}
