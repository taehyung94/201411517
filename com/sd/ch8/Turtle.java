package com.sd.ch8;

public class Turtle{
        protected int nLimbs=4;
	protected String food;
	public void setFood(String food){
	this.food=food;
	}
	public void eat(){
	System.out.println("Turtle eats"+food);
	}
}
