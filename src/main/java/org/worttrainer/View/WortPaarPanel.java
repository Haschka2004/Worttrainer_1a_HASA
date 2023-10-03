package org.worttrainer.View;

import org.worttrainer.Controller.WortPaarController;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class WortPaarPanel extends JPanel{

	private WortPaarController controller;

	private String eingabe;

	private WortPaarController wortPaarController;

	private TextField eingabeFeld = new TextField();
	private Button weiter = new Button("Weiter");

	private JLabel[] labels = new JLabel[3];

	public WortPaarPanel() throws MalformedURLException {

		this.setLayout(new BorderLayout());

		//Statistik FrontEnd
		JPanel statistik = new JPanel(new GridLayout(1,0));
			String[] inhalt = {"Runde ...:","Richtige Antworten:","Falsche Antworten:"};
			for(int i = 0; i < inhalt.length;i++){
				labels[i] = new JLabel(inhalt[i]);
				labels[i].setOpaque(true);
				statistik.add(labels[i]);
			}
			this.add(statistik,BorderLayout.NORTH);

			JPanel bild = new JPanel(new GridLayout(1,0));
				URL url = new URL("https://image.spreadshirtmedia.net/image-server/v1/products/T1459A839PA4459PT28D314391358W10000H9884/views/1,width=200,height=200,appearanceId=839,backgroundColor=F2F2F2/golden-retriever-verpixelt-pixel-hund.jpg");
				ImageIcon hund = new ImageIcon(url);
				JLabel hundLabel = new JLabel(hund);
				bild.add(hundLabel);
				this.add(bild,BorderLayout.CENTER);

			JPanel eingabe = new JPanel(new GridLayout(1,0));
				eingabe.add(eingabeFeld);
				eingabe.add(weiter);
				this.add(eingabe,BorderLayout.SOUTH);


	}

	public String getEingabe() {
		return null;
	}

	public void setEingabe() {

	}

}
