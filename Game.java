package com.sd.yut;

import com.sd.yut.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Game extends JFrame implements ActionListener{
	JButton b1;
	JButton b2;
	Game(){
		setTitle("Game");
		this.setLayout(new GridLayout(1,2));
		JButton b1=new JButton("주사위");
		JButton b2=new JButton("윷놀이");
		b1.addActionListener(this);
		b2.addActionListener(this);
		this.add(b1);
		this.add(b2);
		this.pack();
		this.setSize(300,200);
		this.setVisible(true);
	}
	public static void main(String[] args){
		new Game();
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(b1))
			new DiceGame();
		else if(e.getSource().equals(b2))
			new YutGame();
	}
}
