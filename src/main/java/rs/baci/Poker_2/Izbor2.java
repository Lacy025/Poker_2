package rs.baci.Poker_2;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.URL;

public class Izbor2 implements Brojevi, Dobici, MainFrame, KeyListener {

    Clip dobitakSound;

    JLabel dupliranje = new JLabel("            DUPLIRANJE");
    JLabel kasiranje = new JLabel("             KASIRANJE");
    static JLabel pobeda = new JLabel("              POBEDIO !");

    int izbor=1;
    int pobedio;

    Izbor2() throws InterruptedException {

        if (Dobitak.DOBITAK>0) {

            URL dobitak = this.getClass().getClassLoader().getResource("resources/Dobitak.wav");
            AudioInputStream audioDobitak;
            try {
                assert dobitak != null;
                audioDobitak = AudioSystem.getAudioInputStream(dobitak);
            } catch (UnsupportedAudioFileException | IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                this.dobitakSound = AudioSystem.getClip();
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            }
            try {
                dobitakSound.open(audioDobitak);
            } catch (LineUnavailableException | IOException ex) {
                throw new RuntimeException(ex);
            }
            this.dobitakSound.start();

            dupliranje.setVisible(true);
            kasiranje.setVisible(false);
            pobeda.setVisible(false);
            dupliranje.setBounds(20,930,720,60);
            kasiranje.setBounds(1160,930,720,60);
            pobeda.setBounds(600,930,720,60);
            frame.add(dupliranje);
            frame.add(kasiranje);
            dupliranje.setForeground(color1);
            kasiranje.setForeground(color1);
            pobeda.setForeground(color1);
            dupliranje.setBackground(color2);
            kasiranje.setBackground(color2);
            pobeda.setBackground(color2);
            dupliranje.setFont(font3);
            kasiranje.setFont(font3);
            pobeda.setFont(font3);
            dupliranje.setOpaque(true);
            kasiranje.setOpaque(true);
            pobeda.setOpaque(true);

            frame.addKeyListener(this);

            while (izbor==1) {

                if (pobedio==5000) {

                    dupliranje.setVisible(true);
                    kasiranje.setVisible(false);
                    Thread.sleep(500);
                    pobedio++;

                }

                if (pobedio==10000) {

                    dupliranje.setVisible(false);
                    kasiranje.setVisible(true);
                    Thread.sleep(500);
                    pobedio++;

                }

                if (pobedio==15000) {

                    dupliranje.setVisible(true);
                    kasiranje.setVisible(false);
                    Thread.sleep(500);
                    pobedio++;

                }

                if (pobedio==20000) {

                    dupliranje.setVisible(false);
                    kasiranje.setVisible(true);
                    Thread.sleep(500);
                    pobedio=0;

                }

                pobedio++;

            }

            pobedio=1;
            dupliranje.setVisible(false);
            kasiranje.setVisible(false);
            frame.remove(dupliranje);
            frame.remove(kasiranje);
            frame.add(pobeda);
            pobeda.setVisible(true);

            pobedio++;

            while (pobedio>0&&MyFrame.dobitak>-1) {

                if (pobedio==5000) {

                    pobeda.setVisible(true);
                    Thread.sleep(500);
                    pobedio++;

                }

                if (pobedio==10000&&MyFrame.dobitak>-1) {

                    pobeda.setVisible(false);
                    Thread.sleep(500);
                    pobedio=0;

                }

                pobedio++;

            }

            Thread.sleep(400);
            pobeda.setVisible(true);

        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == 32){

            Highpair.labelD9.setVisible(false);
            tabela.remove(Highpair.labelD9);
            Twopairs.labelD8.setVisible(false);
            tabela.remove(Twopairs.labelD8);
            Threeofakind.labelD7.setVisible(false);
            tabela.remove(Threeofakind.labelD7);
            Street.labelD6.setVisible(false);
            tabela.remove(Street.labelD6);
            Flush.labelD5.setVisible(false);
            tabela.remove(Flush.labelD5);
            Fullhouse.labelD4.setVisible(false);
            tabela.remove(Fullhouse.labelD4);
            Poker.labelD3.setVisible(false);
            tabela.remove(Poker.labelD3);
            Streetflush.labelD2.setVisible(false);
            tabela.remove(Streetflush.labelD2);
            Royalflush.labelD1.setVisible(false);
            tabela.remove(Royalflush.labelD1);
            Fiveofakind.labelD0.setVisible(false);
            tabela.remove(Fiveofakind.labelD0);

            MyFrame.Jlabelcr.setVisible(false);
            frame.remove(MyFrame.Jlabelcr);

            frame.removeKeyListener(this);

            dobitakSound.stop();

            izbor=0;

        try{
        new Upis1();
        }
        catch(UnsupportedAudioFileException|IOException|LineUnavailableException ex) {
        throw new RuntimeException(ex);
        }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {


    }

}
