package rs.baci.Poker_2;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;

public class Deal_Cards_2 implements MainFrame {
    Clip card_1_Sound;
    Clip card_2_Sound;
    Clip card_3_Sound;
    Clip card_4_Sound;
    Clip card_5_Sound;
    int card;
    int retry;
    Deal_Cards_2() throws InterruptedException {
        card = 0;
        retry = 0;

        if (Win.stop1 == 0) {
            Random Card_1 = new Random();
            MyFrame.n1 = Card_1.nextInt(53);
            while (MyFrame.n1 == MyFrame.n2 ||
                    MyFrame.n1 == MyFrame.n3 ||
                    MyFrame.n1 == MyFrame.n4 ||
                    MyFrame.n1 == MyFrame.n5) {

                MyFrame.n1 = Card_1.nextInt(53);
                retry++;
            }
            new Card_1();
        }
        if (Win.stop2 == 0) {
            Random Card_2 = new Random();
            MyFrame.n2 = Card_2.nextInt(53);
            while (MyFrame.n2 == MyFrame.n1 ||
                    MyFrame.n2 == MyFrame.n3 ||
                    MyFrame.n2 == MyFrame.n4 ||
                    MyFrame.n2 == MyFrame.n5) {

                MyFrame.n2 = Card_2.nextInt(53);
                retry++;
            }
            new Card_2();
        }
        if (Win.stop3 == 0) {
            Random Card_3 = new Random();
            MyFrame.n3 = Card_3.nextInt(53);
            while (MyFrame.n3 == MyFrame.n1 ||
                    MyFrame.n3 == MyFrame.n2 ||
                    MyFrame.n3 == MyFrame.n4 ||
                    MyFrame.n3 == MyFrame.n5) {

                MyFrame.n3 = Card_3.nextInt(53);
                retry++;
            }
            new Card_3();
        }
        if (Win.stop4 == 0) {
            Random Card_4 = new Random();
            MyFrame.n4 = Card_4.nextInt(53);
            while (MyFrame.n4 == MyFrame.n1 ||
                    MyFrame.n4 == MyFrame.n3 ||
                    MyFrame.n4 == MyFrame.n2 ||
                    MyFrame.n4 == MyFrame.n5) {

                MyFrame.n4 = Card_4.nextInt(53);
                retry++;
            }
            new Card_4();
        }
        if (Win.stop5 == 0) {
            Random Card_5 = new Random();
            MyFrame.n5 = Card_5.nextInt(53);
            while (MyFrame.n5 == MyFrame.n1 ||
                    MyFrame.n5 == MyFrame.n2 ||
                    MyFrame.n5 == MyFrame.n3 ||
                    MyFrame.n5 == MyFrame.n4) {

                MyFrame.n5 = Card_5.nextInt(53);
                retry++;
            }
            new Card_5();
        }
        Thread.sleep(50 - (card * 5));
        if (Win.stop1 == 0) {
            if (card == 0) {
                Thread.sleep(100 - (retry * 10));
                card++;
            }
            else {
                Thread.sleep(300);
            }
            MyFrame.Card_1.setVisible(false);
            frame.remove(MyFrame.Card_1);
            frame.add(Card_1.card1);
            Card_1.card1.setBounds(-8, 380, 400, 540);
            Card_1.card1.setVisible(true);
            ((JComponent) Card_1.card1).setOpaque(false);

            URL card_1 = this.getClass().getClassLoader().getResource("resources/Card_1.wav");
            AudioInputStream audio_Card_1;
            try {
                assert card_1 != null;
                audio_Card_1 = AudioSystem.getAudioInputStream(card_1);
            } catch (UnsupportedAudioFileException | IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                this.card_1_Sound = AudioSystem.getClip();
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            }
            try {
                card_1_Sound.open(audio_Card_1);
            } catch (LineUnavailableException | IOException ex) {
                throw new RuntimeException(ex);
            }
            this.card_1_Sound.start();
        }
        if (Win.stop2 == 0) {
            if (card == 0) {
                Thread.sleep(100 - (retry * 10));
                card++;
            }
            else {
                Thread.sleep(300);
            }
            MyFrame.Card_2.setVisible(false);
            frame.remove(MyFrame.Card_2);
            frame.add(Card_2.card2);
            Card_2.card2.setBounds(373, 380, 400, 540);
            Card_2.card2.setVisible(true);
            ((JComponent) Card_2.card2).setOpaque(false);

            URL card_2 = this.getClass().getClassLoader().getResource("resources/Card_2.wav");
            AudioInputStream audio_Card_2;
            try {
                assert card_2 != null;
                audio_Card_2 = AudioSystem.getAudioInputStream(card_2);
            } catch (UnsupportedAudioFileException | IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                this.card_2_Sound = AudioSystem.getClip();
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            }
            try {
                card_2_Sound.open(audio_Card_2);
            } catch (LineUnavailableException | IOException ex) {
                throw new RuntimeException(ex);
            }
            this.card_2_Sound.start();
        }
        if (Win.stop3 == 0) {
            if (card == 0) {
                Thread.sleep(100 - (retry * 10));
                card++;
            }
            else {
                Thread.sleep(300);
            }
            MyFrame.Card_3.setVisible(false);
            frame.remove(MyFrame.Card_3);
            frame.add(Card_3.card3);
            Card_3.card3.setBounds(753, 380, 400, 540);
            Card_3.card3.setVisible(true);
            ((JComponent) Card_3.card3).setOpaque(false);

            URL card_3 = this.getClass().getClassLoader().getResource("resources/Card_3.wav");
            AudioInputStream audio_Card_3;
            try {
                assert card_3 != null;
                audio_Card_3 = AudioSystem.getAudioInputStream(card_3);
            } catch (UnsupportedAudioFileException | IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                this.card_3_Sound = AudioSystem.getClip();
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            }
            try {
                card_3_Sound.open(audio_Card_3);
            } catch (LineUnavailableException | IOException ex) {
                throw new RuntimeException(ex);
            }
            this.card_3_Sound.start();
        }
        if (Win.stop4 == 0) {
            if (card == 0) {
                Thread.sleep(100 - (retry * 10));
                card++;
            }
            else {
                Thread.sleep(300);
            }
            MyFrame.Card_4.setVisible(false);
            frame.remove(MyFrame.Card_4);
            frame.add(Card_4.card4);
            Card_4.card4.setBounds(1133, 380, 400, 540);
            Card_4.card4.setVisible(true);
            ((JComponent) Card_4.card4).setOpaque(false);

            URL card_4 = this.getClass().getClassLoader().getResource("resources/Card_4.wav");
            AudioInputStream audio_Card_4;
            try {
                assert card_4 != null;
                audio_Card_4 = AudioSystem.getAudioInputStream(card_4);
            } catch (UnsupportedAudioFileException | IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                this.card_4_Sound = AudioSystem.getClip();
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            }
            try {
                card_4_Sound.open(audio_Card_4);
            } catch (LineUnavailableException | IOException ex) {
                throw new RuntimeException(ex);
            }
            this.card_4_Sound.start();
        }
        if (Win.stop5 == 0) {
            if (card == 0) {
                Thread.sleep(100 - (retry * 10));
                card++;
            }
            else {
                Thread.sleep(300);
            }
            MyFrame.Card_5.setVisible(false);
            frame.remove(MyFrame.Card_5);
            frame.add(Card_5.card5);
            Card_5.card5.setBounds(1512, 380, 400, 540);
            Card_5.card5.setVisible(true);
            ((JComponent) Card_5.card5).setOpaque(false);

            URL card_5 = this.getClass().getClassLoader().getResource("resources/Card_5.wav");
            AudioInputStream audio_Card_5;
            try {
                assert card_5 != null;
                audio_Card_5 = AudioSystem.getAudioInputStream(card_5);
            } catch (UnsupportedAudioFileException | IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                this.card_5_Sound = AudioSystem.getClip();
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            }
            try {
                card_5_Sound.open(audio_Card_5);
            } catch (LineUnavailableException | IOException ex) {
                throw new RuntimeException(ex);
            }
            this.card_5_Sound.start();
        }
        Thread.sleep(100);
    }
}
