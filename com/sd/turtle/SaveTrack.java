package com.sd.turtle;

import ch.aplu.turtle.*;
import java.util.*;

class SaveTrack{
	static Turtle t1=new Turtle();
	static ArrayList<Double[]> drawSquareAtAndSave(int size,double x,double y){
		t1.penUp();
		t1.setPos(x,y);
		t1.penDown();
		ArrayList<Double[]> a=new ArrayList<Double[]>();
		Double[] pos=new Double[2];
		for(int i=0;i<4;i++){
			pos[0]=t1.getX();
			pos[1]=t1.getY();
			a.add(pos);
			t1.forward(size);
			t1.right(90);
		}
		return a;
	}
	public static void main(String[] args){
		ArrayList<Double[]> a=drawSquareAtAndSave(100,20.0,20.0);
		for(Double[] d:a)
			System.out.printf("(%.1f,%.1f)\n",d[0],d[1]);
	}
}