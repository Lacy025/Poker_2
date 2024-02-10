package rs.baci.Poker_2;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Choice_1 implements MainFrame, Numbers, Winnings, KeyListener {
    Clip remove_hold;
    Clip deal_2_Sound;
    int st;
    static JLabel hold1 = new JLabel(" HOLD");
    static JLabel hold2 = new JLabel(" HOLD");
    static JLabel hold3 = new JLabel(" HOLD");
    static JLabel hold4 = new JLabel(" HOLD");
    static JLabel hold5 = new JLabel(" HOLD");
    public Component Middle_1 = new JLabel("                  PRESS HOLD CARDS");
    public Component Middle_2 = new JLabel("                  PRESS CLEAR CARDS");
    public Component Middle_3 = new JLabel("                  PRESS DEAL CARDS");
    Choice_1() throws InterruptedException {
        Middle_1.setVisible(true);
        Middle_2.setVisible(false);
        Middle_3.setVisible(false);
        Middle_1.setBounds(550,960,800,40);
        Middle_2.setBounds(550,960,800,40);
        Middle_3.setBounds(550,960,800,40);
        frame.add(Middle_1);
        frame.add(Middle_2);
        frame.add(Middle_3);
        Middle_1.setForeground(color1);
        Middle_2.setForeground(color1);
        Middle_3.setForeground(color1);
        Middle_1.setBackground(color2);
        Middle_2.setBackground(color2);
        Middle_3.setBackground(color2);
        Middle_1.setFont(font1);
        Middle_2.setFont(font1);
        Middle_3.setFont(font1);
        ((JComponent) Middle_1).setOpaque(true);
        ((JComponent) Middle_2).setOpaque(true);
        ((JComponent) Middle_3).setOpaque(true);
        frame.addKeyListener(this);
        while (MyFrame.dealing == 1) {
            if (st == 40000) {
                Middle_1.setVisible(false);
                Middle_2.setVisible(true);
                Middle_3.setVisible(false);
                Thread.sleep(1000);
                st++;
            }
            if (st == 80000) {
                Middle_1.setVisible(false);
                Middle_2.setVisible(false);
                Middle_3.setVisible(true);
                Thread.sleep(1000);
                st++;
            }
            if (st == 120000) {
                Middle_1.setVisible(true);
                Middle_2.setVisible(false);
                Middle_3.setVisible(false);
                Thread.sleep(1000);
                st = 0;
            }
            st++;
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {

        switch(e.getKeyCode()) {

            case 32 : // KEYPAD 'SPACE' - CLEAR CARDS

                Hold.hold1.setVisible(false);
                frame.remove(Hold.hold1);
                hold1.setVisible(false);
                frame.remove(hold1);
                Win.stop1 = 0;
                Hold.hold2.setVisible(false);
                frame.remove(Hold.hold2);
                hold2.setVisible(false);
                frame.remove(hold2);
                Win.stop2 = 0;
                Hold.hold3.setVisible(false);
                frame.remove(Hold.hold3);
                hold3.setVisible(false);
                frame.remove(hold3);
                Win.stop3 = 0;
                Hold.hold4.setVisible(false);
                frame.remove(Hold.hold4);
                hold4.setVisible(false);
                frame.remove(hold4);
                Win.stop4 = 0;
                Hold.hold5.setVisible(false);
                frame.remove(Hold.hold5);
                hold5.setVisible(false);
                frame.remove(hold5);
                Win.stop5 = 0;

                URL space = this.getClass().getClassLoader().getResource("resources/Clear.wav");
                AudioInputStream audioSpace;
                try {
                    assert space != null;
                    audioSpace = AudioSystem.getAudioInputStream(space);
                } catch (UnsupportedAudioFileException | IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    this.remove_hold = AudioSystem.getClip();
                } catch (LineUnavailableException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    this.remove_hold.open(audioSpace);
                } catch (LineUnavailableException | IOException ex) {
                    throw new RuntimeException(ex);
                }
                this.remove_hold.start();
                break;

            case 49 : // KEYPAD '1' - CARD 1 HOLD

                hold1.setBounds(120,914,130,40);
                frame.add(hold1);
                hold1.setForeground(color1);
                hold1.setBackground(color2);
                hold1.setFont(font1);
                hold1.setOpaque(true);
                hold1.setVisible(true);
                Win.stop1 = 1;
                try {
                    new Stop();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                break;

            case 50 : // KEYPAD '2' - CARD 2 HOLD

                hold2.setBounds(500,914,130,40);
                frame.add(hold2);
                hold2.setForeground(color1);
                hold2.setBackground(color2);
                hold2.setFont(font1);
                hold2.setOpaque(true);
                hold2.setVisible(true);
                Win.stop2 = 1;
                try {
                    new Stop();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                break;

            case 51 : // KEYPAD '3' - CARD 3 HOLD

                hold3.setBounds(890,914,130,40);
                frame.add(hold3);
                hold3.setForeground(color1);
                hold3.setBackground(color2);
                hold3.setFont(font1);
                hold3.setOpaque(true);
                hold3.setVisible(true);
                Win.stop3 = 1;
                try {
                    new Stop();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                break;

            case 52 : // KEYPAD '4' - CARD 4 HOLD

                hold4.setBounds(1270,914,130,40);
                frame.add(hold4);
                hold4.setForeground(color1);
                hold4.setBackground(color2);
                hold4.setFont(font1);
                hold4.setOpaque(true);
                hold4.setVisible(true);
                Win.stop4 = 1;
                try {
                    new Stop();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                break;

            case 53 : // KEYPAD '5' - CARD 5 HOLD

                hold5.setBounds(1650,914,130,40);
                frame.add(hold5);
                hold5.setForeground(color1);
                hold5.setBackground(color2);
                hold5.setFont(font1);
                hold5.setOpaque(true);
                hold5.setVisible(true);
                Win.stop5 = 1;
                try {
                    new Stop();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                break;

            case 10 : // KEYPAD 'ENTER' - DEAL CARDS 2

                hold1.setVisible(false);
                hold2.setVisible(false);
                hold3.setVisible(false);
                hold4.setVisible(false);
                hold5.setVisible(false);
                Hold.hold1.setVisible(false);
                Hold.hold2.setVisible(false);
                Hold.hold3.setVisible(false);
                Hold.hold4.setVisible(false);
                Hold.hold5.setVisible(false);
                Middle_1.setVisible(false);
                Middle_2.setVisible(false);
                Middle_3.setVisible(false);
                frame.remove(hold1);
                frame.remove(hold2);
                frame.remove(hold3);
                frame.remove(hold4);
                frame.remove(hold5);
                frame.remove(Hold.hold1);
                frame.remove(Hold.hold2);
                frame.remove(Hold.hold3);
                frame.remove(Hold.hold4);
                frame.remove(Hold.hold5);
                frame.remove(Middle_1);
                frame.remove(Middle_2);
                frame.remove(Middle_3);
                rucno.setVisible(false);
                frame.remove(rucno);

                if (Win.stop1 == 0) {
                    Karta1.card1.setVisible(false);
                    frame.remove(Karta1.card1);
                    frame.add(MyFrame.Card_1);
                    MyFrame.Card_1.setVisible(true);
                }
                if (Win.stop2 == 0) {
                    Karta2.card2.setVisible(false);
                    frame.remove(Karta2.card2);
                    frame.add(MyFrame.Card_2);
                    MyFrame.Card_2.setVisible(true);
                }
                if (Win.stop3 == 0) {
                    Karta3.card3.setVisible(false);
                    frame.remove(Karta3.card3);
                    frame.add(MyFrame.Card_3);
                    MyFrame.Card_3.setVisible(true);
                }
                if (Win.stop4 == 0) {
                    Karta4.card4.setVisible(false);
                    frame.remove(Karta4.card4);
                    frame.add(MyFrame.Card_4);
                    MyFrame.Card_4.setVisible(true);
                }
                if (Win.stop5 == 0) {
                    Karta5.card5.setVisible(false);
                    frame.remove(Karta5.card5);
                    frame.add(MyFrame.Card_5);
                    MyFrame.Card_5.setVisible(true);
                }
                MyFrame.dealing = 2;
                frame.removeKeyListener(this);

                URL deal_2 = this.getClass().getClassLoader().getResource("resources/Deal_2.wav");
                AudioInputStream audio_Deal_2;
                try {
                    assert deal_2 != null;
                    audio_Deal_2 = AudioSystem.getAudioInputStream(deal_2);
                } catch (UnsupportedAudioFileException | IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    this.deal_2_Sound = AudioSystem.getClip();
                } catch (LineUnavailableException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    deal_2_Sound.open(audio_Deal_2);
                } catch (LineUnavailableException | IOException ex) {
                    throw new RuntimeException(ex);
                }
                this.deal_2_Sound.start();
                break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
}
