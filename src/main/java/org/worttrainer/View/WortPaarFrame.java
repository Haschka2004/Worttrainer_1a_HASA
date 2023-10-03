package org.worttrainer.View;

import javax.swing.*;
import java.awt.*;

public class WortPaarFrame extends JFrame {

	public WortPaarFrame(JPanel panel) {
		super("Worttrainer");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 300);
		this.setResizable(true);
		this.add(panel);
		this.setVisible(true);
	}
}
