package com.jockey.ProxyPattern.virtualProxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {
	
	ImageIcon imageIcon;
	URL imgeURL;
	Thread retrievalThread;
	boolean retrieving = false;
	
	public ImageProxy(URL imgeURL) {
		super();
		this.imgeURL = imgeURL;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		if (imageIcon != null) {
			imageIcon.paintIcon(c, g, x, y);
		}else {
			g.drawString("Lodaing CD cover, please wait...", x + 300, y + 190);
			if (!retrieving) {
				retrieving = true;
				retrievalThread = new Thread(new Runnable() {
					@Override
					public void run() {
						imageIcon = new ImageIcon(imgeURL,"funny picture");
						c.repaint();
					}
				});
				retrievalThread.start();
			}
		}
	}

	@Override
	public int getIconWidth() {
		if (imageIcon != null) {
			return imageIcon.getIconWidth();
		}else {
			return 800;
		}
	}

	@Override
	public int getIconHeight() {
		if (imageIcon != null) {
			return imageIcon.getIconHeight();
		}else {
			return 600;
		}
	}

}
