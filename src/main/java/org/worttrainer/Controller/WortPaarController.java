package org.worttrainer.Controller;

import org.worttrainer.Model.Rechtschreibtrainer;
import org.worttrainer.View.WortPaarFrame;
import org.worttrainer.View.WortPaarPanel;

import java.awt.event.ActionEvent;
import java.net.MalformedURLException;

public class WortPaarController {

	private Rechtschreibtrainer trainer;

	private WortPaarPanel panel;

	private Rechtschreibtrainer rechtschreibtrainer;

	private WortPaarFrame wortPaarFrame;


	public void WortPaarPanel() throws MalformedURLException {
		rechtschreibtrainer = new Rechtschreibtrainer();
		panel = new WortPaarPanel();
		wortPaarFrame = new WortPaarFrame(panel);
	}

	public void actionPerformed(ActionEvent e) {



	}

}
