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
    public static JLabel pobeda = new JLabel("              POBEDIO !");

    public static int izbor = 1;
    int pobedio;

    Izbor2() throws InterruptedException {

        if (Dobitak.DOBITAK > 0) {

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
            dupliranje.setBounds(20, 930, 720, 60);
            kasiranje.setBounds(1160, 930, 720, 60);
            pobeda.setBounds(600, 930, 720, 60);
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

            izbor=1;

            while (izbor == 1) {

                if (pobedio == 5000) {

                    dupliranje.setVisible(true);
                    kasiranje.setVisible(false);
                    Thread.sleep(500);
                    pobedio++;

                }

                if (pobedio == 10000) {

                    dupliranje.setVisible(false);
                    kasiranje.setVisible(true);
                    Thread.sleep(500);
                    pobedio++;

                }

                if (pobedio == 15000) {

                    dupliranje.setVisible(true);
                    kasiranje.setVisible(false);
                    Thread.sleep(500);
                    pobedio++;

                }

                if (pobedio == 20000) {

                    dupliranje.setVisible(false);
                    kasiranje.setVisible(true);
                    Thread.sleep(500);
                    pobedio = 0;

                }

                pobedio++;

            }

            if (izbor==2) {

                pobedio = 1;
                dupliranje.setVisible(false);
                kasiranje.setVisible(false);
                frame.remove(dupliranje);
                frame.remove(kasiranje);
                frame.add(pobeda);
                pobeda.setVisible(true);

                pobedio++;

                while (pobedio > 0 && MyFrame.dobitak > -1) {

                    if (pobedio == 5000) {

                        pobeda.setVisible(true);
                        Thread.sleep(500);
                        pobedio++;

                    }

                    if (pobedio == 10000 && MyFrame.dobitak > -1) {

                        pobeda.setVisible(false);
                        Thread.sleep(500);
                        pobedio = 0;

                    }

                    pobedio++;

                }

                Thread.sleep(400);
                pobeda.setVisible(true);

            }

        }

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch(e.getKeyCode()) {

            case 32 :

                labelT10.setVisible(false);
                tabela.remove(labelT10);

                MyFrame.Jlabelcr.setVisible(false);
                frame.remove(MyFrame.Jlabelcr);

                frame.removeKeyListener(this);

                dobitakSound.stop();

                izbor=2;

                try {

                    new Upis1();

                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {

                    e1.printStackTrace();
                }

                break;

            case 10 :

                Karta1.card1.setVisible(false);
                frame.remove(Karta1.card1);
                Karta2.card2.setVisible(false);
                frame.remove(Karta2.card2);
                Karta3.card3.setVisible(false);
                frame.remove(Karta3.card3);
                Karta4.card4.setVisible(false);
                frame.remove(Karta4.card4);
                Karta5.card5.setVisible(false);
                frame.remove(Karta5.card5);

                dupliranje.setVisible(false);
                kasiranje.setVisible(false);
                frame.remove(dupliranje);
                frame.remove(kasiranje);

                frame.removeKeyListener(this);
                dobitakSound.stop();
                izbor = 3;

                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
