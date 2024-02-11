package rs.baci.Poker_2;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.URL;

public class Choice_2 implements Numbers, Winnings, MainFrame, KeyListener {
    Clip win_Sound;
    JLabel doubling = new JLabel("             DOUBLING");
    JLabel cashing = new JLabel("               CASHING");
    public static JLabel you_win = new JLabel("             YOU WIN !");
    public static int choice;
    int win;
    Choice_2() throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        doubling.setVisible(false);
        cashing.setVisible(false);
        you_win.setVisible(false);
        doubling.setBounds(20, 930, 720, 60);
        cashing.setBounds(1160, 930, 720, 60);
        you_win.setBounds(600, 930, 720, 60);
        frame.add(doubling);
        frame.add(cashing);
        doubling.setForeground(color1);
        cashing.setForeground(color1);
        you_win.setForeground(color1);
        doubling.setBackground(color2);
        cashing.setBackground(color2);
        you_win.setBackground(color2);
        doubling.setFont(font3);
        cashing.setFont(font3);
        you_win.setFont(font3);
        doubling.setOpaque(true);
        cashing.setOpaque(true);
        you_win.setOpaque(true);
        if (Win.winner > 0 && MyFrame.final_value < 10000) {
            Winner();
            frame.addKeyListener(this);
            choice = 1;
            while (choice == 1) {
                if (win == 5000) {
                    doubling.setVisible(true);
                    cashing.setVisible(false);
                    Thread.sleep(500);
                    win++;
                }
                if (win == 10000) {
                    doubling.setVisible(false);
                    cashing.setVisible(true);
                    Thread.sleep(500);
                    win++;
                }
                if (win == 15000) {
                    doubling.setVisible(true);
                    cashing.setVisible(false);
                    Thread.sleep(500);
                    win++;
                }
                if (win == 20000) {
                    doubling.setVisible(false);
                    cashing.setVisible(true);
                    Thread.sleep(500);
                    win = 0;
                }
                win++;
            }
            if (choice == 2) {
                doubling.setVisible(false);
                cashing.setVisible(false);
                frame.remove(doubling);
                frame.remove(cashing);
                new Cashing();
            }
        }
        if (Win.winner > 0 && MyFrame.final_value > 9999) {
            Winner();
            doubling.setVisible(false);
            cashing.setVisible(false);
            frame.remove(doubling);
            frame.remove(cashing);
            frame.add(you_win);
            you_win.setVisible(true);
            Thread.sleep(2500);
            new Cashing();
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {

        switch(e.getKeyCode()) {

            case 32 : // KEYPAD 'SPACE' - TAKE ALL

                frame.removeKeyListener(this);
                win_Sound.stop();
                choice = 2;
                break;

            case 10 : // KEYPAD 'ENTER' - DOUBLING

                Card_1.card1.setVisible(false);
                frame.remove(Card_1.card1);
                Card_2.card2.setVisible(false);
                frame.remove(Card_2.card2);
                Card_3.card3.setVisible(false);
                frame.remove(Card_3.card3);
                Card_4.card4.setVisible(false);
                frame.remove(Card_4.card4);
                Card_5.card5.setVisible(false);
                frame.remove(Card_5.card5);
                doubling.setVisible(false);
                cashing.setVisible(false);
                frame.remove(doubling);
                frame.remove(cashing);
                frame.removeKeyListener(this);
                win_Sound.stop();
                choice = 3;
                break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
    void Winner() {
        URL winning = this.getClass().getClassLoader().getResource("resources/Win.wav");
        AudioInputStream audio_Win;
        try {
            assert winning != null;
            audio_Win = AudioSystem.getAudioInputStream(winning);
        } catch (UnsupportedAudioFileException | IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            this.win_Sound = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            throw new RuntimeException(ex);
        }
        try {
            win_Sound.open(audio_Win);
        } catch (LineUnavailableException | IOException ex) {
            throw new RuntimeException(ex);
        }
        this.win_Sound.start();
    }
}
