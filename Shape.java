package com.sd.turtle;
import ch.aplu.turtle.*;

class Shape{
Turtle t1=new Turtle();
void drawTriangle(){
for(int n=0;n<3;n++){
t1.forward(100);
t1.right(120);
}
}
void drawSquare(){
for(int n=0;n<4;n++){
t1.forward(100);
t1.right(90);
}
}
void drawStar(){
for(int n=0;n<5;n++){
t1.forward(100);
t1.right(144);
}
}
public static void main(String[] args){
Shape a=new Shape();
a.drawTriangle();
a.drawSquare();
a.drawStar();
}
}