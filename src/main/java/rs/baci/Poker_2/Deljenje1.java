package rs.baci.Poker_2;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Deljenje1 implements MainFrame {

	Clip karteSound;
	
	Deljenje1() throws InterruptedException {
		
		Random karta01 = new Random();
		Random karta02 = new Random();
		Random karta03 = new Random();
		Random karta04 = new Random();
		Random karta05 = new Random();

		while (MyFrame.n1==MyFrame.n2 || MyFrame.n1==MyFrame.n3 ||
				MyFrame.n1==MyFrame.n4 ||MyFrame.n1==MyFrame.n5 ||
				MyFrame.n2==MyFrame.n3 || MyFrame.n2==MyFrame.n4 ||
				MyFrame.n2==MyFrame.n5 || MyFrame.n3==MyFrame.n4 ||
				MyFrame.n3==MyFrame.n5 || MyFrame.n4==MyFrame.n5) {

			MyFrame.n1 = karta01.nextInt(53);
			MyFrame.n2 = karta02.nextInt(53);
			MyFrame.n3 = karta03.nextInt(53);
			MyFrame.n4 = karta04.nextInt(53);
			MyFrame.n5 = karta05.nextInt(53);

		}

		Thread.sleep(200);

		URL karte = this.getClass().getClassLoader().getResource("resources/Karta-1-5.wav");
		AudioInputStream audioKarte;
		try {
			assert karte != null;
			audioKarte = AudioSystem.getAudioInputStream(karte);
		} catch (UnsupportedAudioFileException | IOException ex) {
			throw new RuntimeException(ex);
		}
		try {
			this.karteSound = AudioSystem.getClip();
		} catch (LineUnavailableException ex) {
			throw new RuntimeException(ex);
		}
		try {
			karteSound.open(audioKarte);
		} catch (LineUnavailableException | IOException ex) {
			throw new RuntimeException(ex);
		}
		this.karteSound.start();

		Thread.sleep(80);
		MyFrame.JlabelK1.setVisible(false);
		frame.remove(MyFrame.JlabelK1);
		new Karta1();
		frame.add(Karta1.card1);
		Karta1.card1.setVisible(true);
		Karta1.card1.setBounds(-8, 380, 400, 540);
		((JComponent) Karta1.card1).setOpaque(false);

		Thread.sleep(80);
		MyFrame.JlabelK2.setVisible(false);
		frame.remove(MyFrame.JlabelK2);
		new Karta2();
		frame.add(Karta2.card2);
		Karta2.card2.setVisible(true);
		Karta2.card2.setBounds(373, 380, 400, 540);
		((JComponent) Karta2.card2).setOpaque(false);

		Thread.sleep(80);
		MyFrame.JlabelK3.setVisible(false);
		frame.remove(MyFrame.JlabelK3);
		new Karta3();
		frame.add(Karta3.card3);
		Karta3.card3.setVisible(true);
		Karta3.card3.setBounds(753, 380, 400, 540);
		((JComponent) Karta3.card3).setOpaque(false);

		Thread.sleep(80);
		MyFrame.JlabelK4.setVisible(false);
		frame.remove(MyFrame.JlabelK4);
		new Karta4();
		frame.add(Karta4.card4);
		Karta4.card4.setVisible(true);
		Karta4.card4.setBounds(1133, 380, 400, 540);
		((JComponent) Karta4.card4).setOpaque(false);

		Thread.sleep(80);
		MyFrame.JlabelK5.setVisible(false);
		frame.remove(MyFrame.JlabelK5);
		new Karta5();
		frame.add(Karta5.card5);
		Karta5.card5.setVisible(true);
		Karta5.card5.setBounds(1512, 380, 400, 540);
		((JComponent) Karta5.card5).setOpaque(false);
		Thread.sleep(100);

	}

}
