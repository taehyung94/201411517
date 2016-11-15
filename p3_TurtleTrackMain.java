package com.sd.turtle
import ch.aplut.turtle.*;
public class p3_TurtleTrackMain{
static void drawSquareFrom(double[][] tracks){
Turtle t1=new Turtle();
for(double[] t:tracks}{
t1.move(t[0],t[1]);
}
}
public static void main(String[] args){
double[][]  track={{100,100},{200,100},{200,200},{100,200},{100,100}}
drawSquareFrom(tracks);
}
}