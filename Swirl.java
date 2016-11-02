package com.sd.turtle;
import ch.aplu.turtle.*;

class Swirl{
Turtle t1=new Turtle();
void makeSwirlSquare(int size,int bigger,int turns,double angle){
for(int n=0;n<turns;n++){
if(n%2==0){
size+=bigger;
}
t1.forward(size);
t1.right(angle);
}
}
public static void main(String[] args){
Swirl a=new Swirl();
a.makeSwirlSquare(100,15,10,90);}
}
