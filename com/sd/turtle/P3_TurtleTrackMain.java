package com.sd.turtle;

import ch.aplu.turtle.*;

public class p3_TurtleTrackMain {
    static Turtle t1=new Turtle();
    static void drawSquareFrom(double[][] tracks) {
        for(double[] t:tracks) {
            t1.moveTo(t[0],t[1]);
            System.out.printf(" %.1f %.1f",t[0],t[1]);
        }
    }
    public static void main(String[] args) {
        double[][] tracks={{100,100},{200,100},{200,200},{100,200},{100,100}};
        drawSquareFrom(tracks);
    }
}