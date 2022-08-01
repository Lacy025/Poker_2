package rs.baci.Poker_2;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.Serial;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Izbor extends JFrame implements MainFrame, Brojevi, KeyListener {

    /**
     *
     */
    @Serial
    private static final long serialVersionUID = 1L;

    Clip removestop;
    int st;

    static JLabel hold1 = new JLabel(" STOP");
    static JLabel hold2 = new JLabel(" STOP");
    static JLabel hold3 = new JLabel(" STOP");
    static JLabel hold4 = new JLabel(" STOP");
    static JLabel hold5 = new JLabel(" STOP");

    public Component JlabelN1 = new JLabel("                   PRITISNITE STOP");
    public Component JlabelN2 = new JLabel("               PRITISNITE PONIŠTAVANJE");
    public Component JlabelN3 = new JLabel("                 PRITISNITE DELJENJE");

    Izbor() throws InterruptedException {

        JlabelN1.setVisible(true);
        JlabelN2.setVisible(false);
        JlabelN3.setVisible(false);

        JlabelN1.setBounds(550,960,800,40);
        JlabelN2.setBounds(550,960,800,40);
        JlabelN3.setBounds(550,960,800,40);

        frame.add(JlabelN1);
        frame.add(JlabelN2);
        frame.add(JlabelN3);

        JlabelN1.setForeground(color1);
        JlabelN2.setForeground(color1);
        JlabelN3.setForeground(color1);
        JlabelN1.setBackground(color2);
        JlabelN2.setBackground(color2);
        JlabelN3.setBackground(color2);

        JlabelN1.setFont(font1);
        JlabelN2.setFont(font1);
        JlabelN3.setFont(font1);

        ((JComponent) JlabelN1).setOpaque(true);
        ((JComponent) JlabelN2).setOpaque(true);
        ((JComponent) JlabelN3).setOpaque(true);

        frame.addKeyListener(this);

        while (MyFrame.delj==1) {

            if (st==40000) {

                JlabelN1.setVisible(false);
                JlabelN2.setVisible(true);
                JlabelN3.setVisible(false);
                Thread.sleep(1000);
                st++;
            }

            if (st==80000) {

                JlabelN1.setVisible(false);
                JlabelN2.setVisible(false);
                JlabelN3.setVisible(true);
                Thread.sleep(1000);
                st++;
            }
            if (st==120000) {

                JlabelN1.setVisible(true);
                JlabelN2.setVisible(false);
                JlabelN3.setVisible(false);
                Thread.sleep(1000);
                st=0;
            }
            st++;

        }

    }


    @Override
    public void keyPressed(KeyEvent e) {

        switch(e.getKeyCode()) {

            case 32 :

                Hold.hold1.setVisible(false);
                frame.remove(Hold.hold1);
                hold1.setVisible(false);
                frame.remove(hold1);
                Dobitak.stop1=0;

                Hold.hold2.setVisible(false);
                frame.remove(Hold.hold2);
                hold2.setVisible(false);
                frame.remove(hold2);
                Dobitak.stop2=0;

                Hold.hold3.setVisible(false);
                frame.remove(Hold.hold3);
                hold3.setVisible(false);
                frame.remove(hold3);
                Dobitak.stop3=0;

                Hold.hold4.setVisible(false);
                frame.remove(Hold.hold4);
                hold4.setVisible(false);
                frame.remove(hold4);
                Dobitak.stop4=0;

                Hold.hold5.setVisible(false);
                frame.remove(Hold.hold5);
                hold5.setVisible(false);
                frame.remove(hold5);
                Dobitak.stop5=0;

                URL space = this.getClass().getClassLoader().getResource("resources/Ponistavanje.wav");
                AudioInputStream audioSpace;
                try {
                    assert space != null;
                    audioSpace = AudioSystem.getAudioInputStream(space);
                } catch (UnsupportedAudioFileException | IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    this.removestop = AudioSystem.getClip();
                } catch (LineUnavailableException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    this.removestop.open(audioSpace);
                } catch (LineUnavailableException | IOException ex) {
                    throw new RuntimeException(ex);
                }
                this.removestop.start();

                break;

            case 49 :

                hold1.setBounds(120,914,130,40);
                frame.add(hold1);
                hold1.setForeground(color1);
                hold1.setBackground(color2);
                hold1.setFont(font1);
                hold1.setOpaque(true);
                hold1.setVisible(true);
                Dobitak.stop1=1;

                try {
                    new Stop();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }

                break;

            case 50 :

                hold2.setBounds(500,914,130,40);
                frame.add(hold2);
                hold2.setForeground(color1);
                hold2.setBackground(color2);
                hold2.setFont(font1);
                hold2.setOpaque(true);
                hold2.setVisible(true);
                Dobitak.stop2=1;

                try {
                    new Stop();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }

                break;

            case 51 :

                hold3.setBounds(890,914,130,40);
                frame.add(hold3);
                hold3.setForeground(color1);
                hold3.setBackground(color2);
                hold3.setFont(font1);
                hold3.setOpaque(true);
                hold3.setVisible(true);
                Dobitak.stop3=1;

                try {
                    new Stop();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }

                break;

            case 52 :

                hold4.setBounds(1270,914,130,40);
                frame.add(hold4);
                hold4.setForeground(color1);
                hold4.setBackground(color2);
                hold4.setFont(font1);
                hold4.setOpaque(true);
                hold4.setVisible(true);
                Dobitak.stop4=1;

                try {
                    new Stop();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }

                break;

            case 53 :

                hold5.setBounds(1650,914,130,40);
                frame.add(hold5);
                hold5.setForeground(color1);
                hold5.setBackground(color2);
                hold5.setFont(font1);
                hold5.setOpaque(true);
                hold5.setVisible(true);
                Dobitak.stop5=1;

                try {
                    new Stop();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }

                break;

            case 10 :

                //new Deljenje2();

                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}
