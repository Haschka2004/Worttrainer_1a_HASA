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
	private String eingabe;


	public void WortPaarPanel() throws MalformedURLException {
		rechtschreibtrainer = new Rechtschreibtrainer();
		panel = new WortPaarPanel();
		wortPaarFrame = new WortPaarFrame(panel);
	}

	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();
		String ac = e.getActionCommand();

		eingabe = ac;
		for(int i = )
		if(ac.equals(rechtschreibtrainer.getRandomPaar().getWort())){



		}




	}

	public String getEingabe() {
		return eingabe;
	}
}
