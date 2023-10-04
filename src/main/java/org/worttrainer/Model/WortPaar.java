package org.worttrainer.Model;

import org.worttrainer.Model.Rechtschreibtrainer;

import java.net.MalformedURLException;
import java.net.URL;

public class WortPaar {

	private String wort;

	private URL url;

	private Rechtschreibtrainer[] rechtschreibtrainer;

	public WortPaar(String wort,String linkUrl) throws MalformedURLException {
		this.wort = wort;
		this.url = new URL(linkUrl);
	}

	public String getWort(){
		return null;
	}

	public URL getURL(){
		return null;
	}

}
