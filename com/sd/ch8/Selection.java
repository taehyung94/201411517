package com.sd.ch8;
import com.sd.ch8.*;


class Selection{
	public void select(Rectangle r){
		r.setSelected(true);
		System.out.println("select= "+r.isSelected);
	}
	public static void main(String[] args){
		Rectangle r=new Rectangle(100,200);
		Selection s=new Selection();
		s.select(r);
	}
}