package com.sd.yut;


public class Player{
private String name;
private int num;
Player(String name){
this.name=name;
}
void play(){
Dice d=new Dice();
d.roll();
num=d.getNum();
}
String getName(){
return this.name;
}
Integer getNum(){
return num;
}
}