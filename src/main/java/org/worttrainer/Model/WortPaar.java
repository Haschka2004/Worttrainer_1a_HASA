package org.worttrainer.Model;

import java.net.MalformedURLException;
import java.net.URL;

public class WortPaar {

	private String wort;

	private URL url;

	public WortPaar(String wort,String url) throws MalformedURLException {

		this.wort = wort;
		this.url = new URL(url);

	}

	public String getWort() {
		return url.toString();
	}

	public void setWort(String wort) {
		this.wort = wort;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public String getURL() {
		return null;
	}

}
