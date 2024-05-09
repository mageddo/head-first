package com.mageddo.designpatterns.cap_02_2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	JFrame frame;
	
	public static void main(String[] args) {
		new SwingObserverExample().go();
	}
	
	public void go() {
		frame = new JFrame();
		JButton botao = new JButton("Devo fazer isso?");
		botao.addActionListener(new AngelListener());
		botao.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, botao);
		
		frame.setSize(300,300);
		frame.setTitle("Teste");
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
	class AngelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("N�O Fa�a isso");
		}
		
	}
	
	class DevilListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Fa�a isso");
		}
		
	}
}
