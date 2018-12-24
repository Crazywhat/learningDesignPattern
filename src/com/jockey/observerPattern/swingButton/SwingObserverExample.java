package com.jockey.observerPattern.swingButton;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	JFrame frame;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingObserverExample example = new SwingObserverExample();
		example.run();
	}
	
	public void run() {
		frame = new JFrame();
		JButton button = new JButton("Should I do it ?");
		button.addActionListener(new AngleActionListener());
		button.addActionListener(new DevilActionListener());
		
		frame.setSize(new Dimension(50, 50));
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class AngleActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Don¡¯t do it, you might regret it!");
		}
		
	}
	
	class DevilActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Come on, do it!");
		}
		
	}

}
