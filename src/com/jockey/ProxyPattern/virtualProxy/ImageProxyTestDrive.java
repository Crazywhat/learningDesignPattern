package com.jockey.ProxyPattern.virtualProxy;

import java.awt.BorderLayout;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ImageProxyTestDrive extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel imageComponent;
	
	public static void main(String[] args) {
		ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
		testDrive.setVisible(true);
		testDrive.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Create the frame.
	 */
	public ImageProxyTestDrive() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 450, 300);
		contentPane = new JPanel();
		try {
			imageComponent = new JLabel(new ImageProxy(new URL("http://img03.sogoucdn.com/app/a/07/f915a30b33ede55dd91888127f27e7a8")));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(imageComponent);
		setContentPane(contentPane);
	}
}
