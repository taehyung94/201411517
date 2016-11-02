package com.sd.turtle;
import ch.aplu.turtle.*;

class Draw{
Turtle t1=new Turtle();
enum Shape{TRIANGLE,SQUARE}
static int size=100;
static int sides;
static double angle;
void drawShape(){
for(int n=0;n<sides;n++){
t1.forward(size);
t1.right(angle);
}
}
public static void main(String[] args){
Shape sel;
sel=Shape.TRIANGLE;
switch(sel){
case TRIANGLE:
sides=3;
angle=120;
break;
case SQUARE:
sides=4;
angle=90;
break;
}
Draw abc=new Draw();
abc.drawShape();
sel=Shape.SQUARE;
switch(sel){
case TRIANGLE:
sides=3;
angle=120;
break;
case SQUARE:
sides=4;
angle=90;
break;
}
abc.drawShape();
}
}