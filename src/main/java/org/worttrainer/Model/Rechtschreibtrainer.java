package org.worttrainer.Model;

import org.worttrainer.Controller.WortPaarController;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Rechtschreibtrainer {

	private ArrayList<WortPaar> wortPaare;

	private int falscheWortPaare;

	private int richtigeWortPaare;

	private WortPaarController controller;


	public Rechtschreibtrainer() throws MalformedURLException {
		this.controller = new WortPaarController();
		wortPaare.add(new WortPaar("Katze","https://img.freepik.com/vektoren-kostenlos/nette-katze-die-auf-sandkasten-karikatur-vektor-ikonen-illustration-sitzt-tierisches-naturikonenkonzept-lokalisiert_138676-6450.jpg?q=10&h=200"));
		wortPaare.add(new WortPaar("Kamel","https://us.123rf.com/450wm/stockee/stockee2307/stockee230728666/209052334-a-pixel-art-illustration-of-a-camel-in-the-desert-showcasing-bold-saturation-and-realistic-detailing.jpg?ver=6"));
	}

	public WortPaar getIndexPaar(int index) {
		if(index <= wortPaare.size()) return wortPaare.get(index);
		return null;
	}

	public WortPaar getRandomPaar() {
		Random zufallsIndex = new Random();
		return wortPaare.get(zufallsIndex.nextInt(3));
	}

	public void rundeBerechnen(WortPaar wortPaar) {
		if(wortPaar.getWort().equals(controller.getEingabe())) richtigeWortPaare += 1;
		falscheWortPaare += 1;
	}

	public int getFalscheWortPaare() {
		return falscheWortPaare;
	}

	public int getRichtigeWortPaare() {
		return richtigeWortPaare;
	}
}
