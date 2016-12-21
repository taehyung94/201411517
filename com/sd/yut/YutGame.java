package com.sd.yut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.sd.yut.*;

public class YutGame extends JFrame implements ActionListener{
	String name1,name2;
	YutPlayer p1;
	YutPlayer p2;
	JTextField player1;
	JTextField player2;
	JLabel l1;
	JLabel l2;
	JButton b1;
	JButton b2;
	YutGame(){
		setTitle("Yut");
		this.setLayout(new GridLayout(3,2));
		JLabel l1=new JLabel();
		JLabel l2=new JLabel();
		JTextField player1=new JTextField(10);
		JTextField player2=new JTextField(10);
		JButton b1=new JButton("실행");
		JButton b2=new JButton("초기화");
		b1.addActionListener(this);
		b2.addActionListener(this);
		this.add(player1);
		this.add(player2);
		this.add(l1);
		this.add(l2);
		this.add(b1);
		this.add(b2);
		this.pack();
		this.setSize(300,200);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(b1)){
			YutPlayer p1=new YutPlayer(player1.getText());
			YutPlayer p2=new YutPlayer(player2.getText());
			p1.play();
			p2.play();
			l1.setText(p1.getYut());
			l2.setText(p2.getYut());
			if(p1.getNum()>p2.getNum())
				JOptionPane.showMessageDialog(this,p1.getName()+" 승리!");
			else if(p1.getNum()<p2.getNum())
				JOptionPane.showMessageDialog(this,p2.getName()+" 승리!");
			else
				JOptionPane.showMessageDialog(this,"무승부!");
		}
		else if(e.getSource().equals(b2)){
			player1.setText("");
			player1.setText("");
			l1.setText("");
			l2.setText("");
		}
	}
	public static void main(String[] args){
		new YutGame();
	}
}