package com.sd.yut

public class YutPlayer{
private String name;
private int num;
private String yut;
YutPlayer(String name){
this.name=name;
}
void play(){
Dice d=new Dice();
d.roll();
this.num=d.getNum();
if(d.getNum()==0)
	this.yut="도";
else if(d.getNum()==1)
	this.yut="개";
else if(d.getNum()==2)
	this.yut="걸";
else if(d.getNum()==3)
	this.yut="윷";
else if(d.getNum()==4)
	this.yut="모";
}

String getName(){
return this.name;
}
String getYut(){
	return this.yut;
}
int getNum(){
	return this.num;
}
}
