package rs.baci.Poker_2;

import java.io.IOException;
import java.net.URL;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

public class Deljenje1 implements MainFrame, Brojevi {
	Clip deljenje1Sound;
	Clip karteSound;
	Deljenje1() throws InterruptedException {
		MyFrame.Joker.setVisible(false);
		MyFrame.Card.setVisible(false);
		MyFrame.Left_zero.setVisible(false);
		MyFrame.Right_zero.setVisible(false);
		MyFrame.Middle_1.setVisible(false);
		MyFrame.Middle_2.setVisible(false);
		frame.remove(MyFrame.Joker);
		frame.remove(MyFrame.Card);
		frame.remove(MyFrame.Left_zero);
		frame.remove(MyFrame.Right_zero);
		frame.remove(MyFrame.Middle_1);
		frame.remove(MyFrame.Middle_2);
		MyFrame.Joker_1.setVisible(false);
		MyFrame.Joker_2.setVisible(false);
		MyFrame.Joker_3.setVisible(false);
		MyFrame.Joker_4.setVisible(false);
		MyFrame.Joker_5.setVisible(false);
		frame.remove(MyFrame.Joker_1);
		frame.remove(MyFrame.Joker_2);
		frame.remove(MyFrame.Joker_3);
		frame.remove(MyFrame.Joker_4);
		frame.remove(MyFrame.Joker_5);

		MyFrame.Credit.setVisible(false);
		frame.remove(MyFrame.Credit);
		MyFrame.cr=MyFrame.cr-MyFrame.ul;
		((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
		MyFrame.Credit.setBounds(1670,64,500,50);
		MyFrame.Credit.setForeground(color3);
		MyFrame.Credit.setFont(font1);
		((JComponent) MyFrame.Credit).setOpaque(false);
		frame.add(MyFrame.Credit);
		MyFrame.Credit.setVisible(true);

		URL deljenje1 = this.getClass().getClassLoader().getResource("resources/Deljenje1.wav");
		AudioInputStream audioDeljenje1;
		try {
			assert deljenje1 != null;
			audioDeljenje1 = AudioSystem.getAudioInputStream(deljenje1);
		} catch (UnsupportedAudioFileException | IOException ex) {
			throw new RuntimeException(ex);
		}
		try {
			this.deljenje1Sound = AudioSystem.getClip();
		} catch (LineUnavailableException ex) {
			throw new RuntimeException(ex);
		}
		try {
			deljenje1Sound.open(audioDeljenje1);
		} catch (LineUnavailableException | IOException ex) {
			throw new RuntimeException(ex);
		}
		this.deljenje1Sound.start();

		frame.add(MyFrame.Card_1);
		frame.add(MyFrame.Card_2);
		frame.add(MyFrame.Card_3);
		frame.add(MyFrame.Card_4);
		frame.add(MyFrame.Card_5);
		MyFrame.Card_1.setVisible(true);
		MyFrame.Card_2.setVisible(true);
		MyFrame.Card_3.setVisible(true);
		MyFrame.Card_4.setVisible(true);
		MyFrame.Card_5.setVisible(true);
		
		Random karta01 = new Random();
		Random karta02 = new Random();
		Random karta03 = new Random();
		Random karta04 = new Random();
		Random karta05 = new Random();

		while (MyFrame.n1 == MyFrame.n2 || MyFrame.n1 == MyFrame.n3 ||
				MyFrame.n1 == MyFrame.n4 ||MyFrame.n1 == MyFrame.n5 ||
				MyFrame.n2 == MyFrame.n3 || MyFrame.n2 == MyFrame.n4 ||
				MyFrame.n2 == MyFrame.n5 || MyFrame.n3 == MyFrame.n4 ||
				MyFrame.n3 == MyFrame.n5 || MyFrame.n4 == MyFrame.n5) {

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
		MyFrame.Card_1.setVisible(false);
		frame.remove(MyFrame.Card_1);
		new Karta1();
		frame.add(Karta1.card1);
		Karta1.card1.setBounds(-8, 380, 400, 540);
		Karta1.card1.setVisible(true);
		((JComponent) Karta1.card1).setOpaque(false);

		Thread.sleep(80);
		MyFrame.Card_2.setVisible(false);
		frame.remove(MyFrame.Card_2);
		new Karta2();
		frame.add(Karta2.card2);
		Karta2.card2.setBounds(373, 380, 400, 540);
		Karta2.card2.setVisible(true);
		((JComponent) Karta2.card2).setOpaque(false);

		Thread.sleep(80);
		MyFrame.Card_3.setVisible(false);
		frame.remove(MyFrame.Card_3);
		new Karta3();
		frame.add(Karta3.card3);
		Karta3.card3.setBounds(753, 380, 400, 540);
		Karta3.card3.setVisible(true);
		((JComponent) Karta3.card3).setOpaque(false);

		Thread.sleep(80);
		MyFrame.Card_4.setVisible(false);
		frame.remove(MyFrame.Card_4);
		new Karta4();
		frame.add(Karta4.card4);
		Karta4.card4.setBounds(1133, 380, 400, 540);
		Karta4.card4.setVisible(true);
		((JComponent) Karta4.card4).setOpaque(false);

		Thread.sleep(80);
		MyFrame.Card_5.setVisible(false);
		frame.remove(MyFrame.Card_5);
		new Karta5();
		frame.add(Karta5.card5);
		Karta5.card5.setBounds(1512, 380, 400, 540);
		Karta5.card5.setVisible(true);
		((JComponent) Karta5.card5).setOpaque(false);
		Thread.sleep(100);
	}
}
