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

public class Deal_Cards_1 implements MainFrame, Numbers {
	Clip deal_1_Sound;
	Clip cards_Sound;
	Deal_Cards_1() throws InterruptedException {
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

		URL deal_1 = this.getClass().getClassLoader().getResource("resources/Deal_1.wav");
		AudioInputStream audio_Deal_1;
		try {
			assert deal_1 != null;
			audio_Deal_1 = AudioSystem.getAudioInputStream(deal_1);
		} catch (UnsupportedAudioFileException | IOException ex) {
			throw new RuntimeException(ex);
		}
		try {
			this.deal_1_Sound = AudioSystem.getClip();
		} catch (LineUnavailableException ex) {
			throw new RuntimeException(ex);
		}
		try {
			deal_1_Sound.open(audio_Deal_1);
		} catch (LineUnavailableException | IOException ex) {
			throw new RuntimeException(ex);
		}
		this.deal_1_Sound.start();

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
		
		Random card_01 = new Random();
		Random card_02 = new Random();
		Random card_03 = new Random();
		Random card_04 = new Random();
		Random card_05 = new Random();

		while (MyFrame.n1 == MyFrame.n2 || MyFrame.n1 == MyFrame.n3 ||
				MyFrame.n1 == MyFrame.n4 ||MyFrame.n1 == MyFrame.n5 ||
				MyFrame.n2 == MyFrame.n3 || MyFrame.n2 == MyFrame.n4 ||
				MyFrame.n2 == MyFrame.n5 || MyFrame.n3 == MyFrame.n4 ||
				MyFrame.n3 == MyFrame.n5 || MyFrame.n4 == MyFrame.n5) {

			MyFrame.n1 = card_01.nextInt(53);
			MyFrame.n2 = card_02.nextInt(53);
			MyFrame.n3 = card_03.nextInt(53);
			MyFrame.n4 = card_04.nextInt(53);
			MyFrame.n5 = card_05.nextInt(53);
		}
		Thread.sleep(200);

		URL cards = this.getClass().getClassLoader().getResource("resources/Cards.wav");
		AudioInputStream audio_Cards;
		try {
			assert cards != null;
			audio_Cards = AudioSystem.getAudioInputStream(cards);
		} catch (UnsupportedAudioFileException | IOException ex) {
			throw new RuntimeException(ex);
		}
		try {
			this.cards_Sound = AudioSystem.getClip();
		} catch (LineUnavailableException ex) {
			throw new RuntimeException(ex);
		}
		try {
			cards_Sound.open(audio_Cards);
		} catch (LineUnavailableException | IOException ex) {
			throw new RuntimeException(ex);
		}
		this.cards_Sound.start();

		Thread.sleep(80);
		MyFrame.Card_1.setVisible(false);
		frame.remove(MyFrame.Card_1);
		new Card_1();
		frame.add(Card_1.card1);
		Card_1.card1.setBounds(-8, 380, 400, 540);
		Card_1.card1.setVisible(true);
		((JComponent) Card_1.card1).setOpaque(false);

		Thread.sleep(80);
		MyFrame.Card_2.setVisible(false);
		frame.remove(MyFrame.Card_2);
		new Card_2();
		frame.add(Card_2.card2);
		Card_2.card2.setBounds(373, 380, 400, 540);
		Card_2.card2.setVisible(true);
		((JComponent) Card_2.card2).setOpaque(false);

		Thread.sleep(80);
		MyFrame.Card_3.setVisible(false);
		frame.remove(MyFrame.Card_3);
		new Card_3();
		frame.add(Card_3.card3);
		Card_3.card3.setBounds(753, 380, 400, 540);
		Card_3.card3.setVisible(true);
		((JComponent) Card_3.card3).setOpaque(false);

		Thread.sleep(80);
		MyFrame.Card_4.setVisible(false);
		frame.remove(MyFrame.Card_4);
		new Card_4();
		frame.add(Card_4.card4);
		Card_4.card4.setBounds(1133, 380, 400, 540);
		Card_4.card4.setVisible(true);
		((JComponent) Card_4.card4).setOpaque(false);

		Thread.sleep(80);
		MyFrame.Card_5.setVisible(false);
		frame.remove(MyFrame.Card_5);
		new Card_5();
		frame.add(Card_5.card5);
		Card_5.card5.setBounds(1512, 380, 400, 540);
		Card_5.card5.setVisible(true);
		((JComponent) Card_5.card5).setOpaque(false);
		Thread.sleep(100);
	}
}
