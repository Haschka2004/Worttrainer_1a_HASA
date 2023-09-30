package org.worttrainer.Control;

import org.worttrainer.Model.Rechtschreibtrainer;

import javax.swing.*;
import java.net.MalformedURLException;

public class WorttrainerController {
    public static void main(String[]args) throws MalformedURLException {
        Rechtschreibtrainer trainer = new Rechtschreibtrainer();
        ImageIcon bild = new ImageIcon(trainer.getWortPaar("Hund").getURL());

    }
}
