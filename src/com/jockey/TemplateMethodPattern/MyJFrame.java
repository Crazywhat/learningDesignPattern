package com.jockey.TemplateMethodPattern;

import java.awt.Graphics;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class MyJFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MyJFrame(String title) throws HeadlessException {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("You cann't see me...", 100, 100);
	}
	
	public static void main(String[] args) {
		MyJFrame frame = new MyJFrame("Head First Design Patterns");
	}

}
