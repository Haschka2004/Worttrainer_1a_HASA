package org.worttrainer.Model;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class Rechtschreibtrainer {

	private Set<WortPaar> wortPaare;

	private int falscheWortPaare;

	private int richtigeWortPaare;


	public Rechtschreibtrainer() throws MalformedURLException {
		wortPaare = new HashSet<>();
		wortPaare.add(new WortPaar("Hund","https://thumbor.forbes.com/thumbor/fit-in/200x200/https://www.forbes.com/advisor/wp-content/uploads/2023/07/top-20-small-dog-breeds.jpeg.jpg"));

	}

	public boolean training(int index) {
		return false;
	}

	public boolean zufallsTraining() {
		return false;
	}

	public String statistik() {
		return null;
	}

	public WortPaar getWortPaar(String text) {

		for(WortPaar wortPaar:wortPaare) {
			if(wortPaar.getWort().equals("text")) return wortPaar;
		}

		return null;
	}

	}


}
