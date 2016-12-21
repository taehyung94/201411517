package com.sd.gui;

import java.awt.*;
import javax.swing.*;

public class CalcAreaGUIMain1{
	public static void main(String[] args){
	JFrame f=new JFrame();
	JPanel panel=new JPanel(new GridLayout(3,2));
	f.getContentPane().add(panel);
	JLabel label1=new JLabel("반지름");
	JLabel label2=new JLabel("넓이");
	JTextField radiusTf1=new JTextField(10);
	JTextField AreaTf2=new JTextField(10);
	JButton b1=new JButton("계산");
	JButton b2=new JButton("취소");
	panel.add(label1);
	panel.add(label2);
	panel.add(radiusTf1);
	panel.add(AreaTf2);
	panel.add(b1);
	panel.add(b2);
	f.pack();
	f.setVisible(true);
	}
}
