package com.sd.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CalcAreaGUIMain2 extends JFrame implements ActionListener{
	JTextField radiusTf1;
	JTextField AreaTf2;
	JButton b1;
	JButton b2;
	public CalcAreaGUIMain2(){
	JPanel panel=new JPanel(new GridLayout(3,2));
	getContentPane().add(panel);
	JLabel label1=new JLabel("반지름");
	JLabel label2=new JLabel("넓이");
	JTextField radiusTf1=new JTextField(10);
	JTextField AreaTf2=new JTextField(10);
	JButton b1=new JButton("계산");
	JButton b2=new JButton("취소");
	b1.addActionListener(this);
	b2.addActionListener(this);
	panel.add(label1);
	panel.add(label2);
	panel.add(radiusTf1);
	panel.add(AreaTf2);
	panel.add(b1);
	panel.add(b2);
	pack();
	setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(b1)){
			Double r=Double.parseDouble(radiusTf1.getText());
			AreaTf2.setText(Double.toString(Math.PI*Math.pow(r,2)));
		}
		else{
			radiusTf1.setText("");	
		}
	}
	public static void main(String args[]){
		CalcAreaGUIMain2 c=new CalcAreaGUIMain2();
		c.setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.pack();
		c.setVisible(true);
	}
}
