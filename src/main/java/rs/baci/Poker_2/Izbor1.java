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

public class Izbor1 implements MainFrame, Brojevi, Dobici, KeyListener {
    Clip removestop;
    Clip deljenje2Sound;
    int st;

    static JLabel hold1 = new JLabel(" STOP");
    static JLabel hold2 = new JLabel(" STOP");
    static JLabel hold3 = new JLabel(" STOP");
    static JLabel hold4 = new JLabel(" STOP");
    static JLabel hold5 = new JLabel(" STOP");

    public Component JlabelN1 = new JLabel("                   PRITISNITE STOP");
    public Component JlabelN2 = new JLabel("               PRITISNITE PONIŠTAVANJE");
    public Component JlabelN3 = new JLabel("                 PRITISNITE DELJENJE");

    Izbor1() throws InterruptedException {

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
                JlabelN1.setVisible(false);
                JlabelN2.setVisible(false);
                JlabelN3.setVisible(false);
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
                frame.remove(JlabelN1);
                frame.remove(JlabelN2);
                frame.remove(JlabelN3);

                MyFrame.Jlabeld9.setVisible(false);
                frame.remove(MyFrame.Jlabeld9);
                label9.setVisible(false);
                frame.remove(label9);
                ((JLabel) MyFrame.Jlabeld9).setText(""+String.valueOf(MyFrame.d9*MyFrame.ul));
                label9.setOpaque(false);
                frame.add(label9);
                label9.setVisible(true);
                ((JComponent) MyFrame.Jlabeld9).setOpaque(false);
                frame.add(MyFrame.Jlabeld9);
                MyFrame.Jlabeld9.setBounds(MyFrame.dx9,L9,120,40);
                MyFrame.Jlabeld9.setForeground(color3);
                MyFrame.Jlabeld9.setFont(font1);
                MyFrame.Jlabeld9.setVisible(true);

                MyFrame.Jlabeld8.setVisible(false);
                frame.remove(MyFrame.Jlabeld8);
                label8.setVisible(false);
                frame.remove(label8);
                ((JLabel) MyFrame.Jlabeld8).setText(""+String.valueOf(MyFrame.d8*MyFrame.ul));
                label8.setOpaque(false);
                frame.add(label8);
                label8.setVisible(true);
                ((JComponent) MyFrame.Jlabeld8).setOpaque(false);
                frame.add(MyFrame.Jlabeld8);
                MyFrame.Jlabeld8.setBounds(MyFrame.dx8,L8,120,40);
                MyFrame.Jlabeld8.setForeground(color3);
                MyFrame.Jlabeld8.setFont(font1);
                MyFrame.Jlabeld8.setVisible(true);

                MyFrame.Jlabeld7.setVisible(false);
                frame.remove(MyFrame.Jlabeld7);
                label7.setVisible(false);
                frame.remove(label7);
                ((JLabel) MyFrame.Jlabeld7).setText(""+String.valueOf(MyFrame.d7*MyFrame.ul));
                frame.add(label7);
                label7.setVisible(true);
                frame.add(MyFrame.Jlabeld7);
                ((JComponent) MyFrame.Jlabeld7).setOpaque(false);
                label7.setOpaque(false);
                MyFrame.Jlabeld7.setBounds(MyFrame.dx7,L7,120,40);
                MyFrame.Jlabeld7.setForeground(color3);
                MyFrame.Jlabeld7.setFont(font1);
                MyFrame.Jlabeld7.setVisible(true);

                MyFrame.Jlabeld6.setVisible(false);
                frame.remove(MyFrame.Jlabeld6);
                label6.setVisible(false);
                frame.remove(label6);
                ((JLabel) MyFrame.Jlabeld6).setText(""+String.valueOf(MyFrame.d6*MyFrame.ul));
                frame.add(label6);
                label6.setVisible(true);
                frame.add(MyFrame.Jlabeld6);
                ((JComponent) MyFrame.Jlabeld6).setOpaque(false);
                label6.setOpaque(false);
                MyFrame.Jlabeld6.setBounds(MyFrame.dx6,L6,120,40);
                MyFrame.Jlabeld6.setForeground(color3);
                MyFrame.Jlabeld6.setFont(font1);
                MyFrame.Jlabeld6.setVisible(true);

                MyFrame.Jlabeld5.setVisible(false);
                frame.remove(MyFrame.Jlabeld5);
                label5.setVisible(false);
                frame.remove(label5);
                ((JLabel) MyFrame.Jlabeld5).setText(""+String.valueOf(MyFrame.d5*MyFrame.ul));
                frame.add(label5);
                label5.setVisible(true);
                frame.add(MyFrame.Jlabeld5);
                ((JComponent) MyFrame.Jlabeld5).setOpaque(false);
                label5.setOpaque(false);
                MyFrame.Jlabeld5.setBounds(MyFrame.dx5,L5,120,40);
                MyFrame.Jlabeld5.setForeground(color3);
                MyFrame.Jlabeld5.setFont(font1);
                MyFrame.Jlabeld5.setVisible(true);

                MyFrame.Jlabeld4.setVisible(false);
                frame.remove(MyFrame.Jlabeld4);
                label4.setVisible(false);
                frame.remove(label4);
                ((JLabel) MyFrame.Jlabeld4).setText(""+String.valueOf(MyFrame.d4*MyFrame.ul));
                frame.add(label4);
                label4.setVisible(true);
                frame.add(MyFrame.Jlabeld4);
                ((JComponent) MyFrame.Jlabeld4).setOpaque(false);
                label4.setOpaque(false);
                MyFrame.Jlabeld4.setBounds(MyFrame.dx4,L4,120,40);
                MyFrame.Jlabeld4.setForeground(color3);
                MyFrame.Jlabeld4.setFont(font1);
                MyFrame.Jlabeld4.setVisible(true);

                MyFrame.Jlabeld3.setVisible(false);
                frame.remove(MyFrame.Jlabeld3);
                label3.setVisible(false);
                frame.remove(label3);
                ((JLabel) MyFrame.Jlabeld3).setText(""+String.valueOf(MyFrame.d3*MyFrame.ul));
                frame.add(label3);
                label3.setVisible(true);
                frame.add(MyFrame.Jlabeld3);
                ((JComponent) MyFrame.Jlabeld3).setOpaque(false);
                label3.setOpaque(false);
                MyFrame.Jlabeld3.setBounds(MyFrame.dx3,L3,120,40);
                MyFrame.Jlabeld3.setForeground(color3);
                MyFrame.Jlabeld3.setFont(font1);
                MyFrame.Jlabeld3.setVisible(true);

                MyFrame.Jlabeld2.setVisible(false);
                frame.remove(MyFrame.Jlabeld2);
                label2.setVisible(false);
                frame.remove(label2);
                ((JLabel) MyFrame.Jlabeld2).setText(""+String.valueOf(MyFrame.d2*MyFrame.ul));
                frame.add(label2);
                label2.setVisible(true);
                frame.add(MyFrame.Jlabeld2);
                ((JComponent) MyFrame.Jlabeld2).setOpaque(false);
                label2.setOpaque(false);
                MyFrame.Jlabeld2.setBounds(MyFrame.dx2,L2,120,40);
                MyFrame.Jlabeld2.setForeground(color3);
                MyFrame.Jlabeld2.setFont(font1);
                MyFrame.Jlabeld2.setVisible(true);

                MyFrame.Jlabeld1.setVisible(false);
                frame.remove(MyFrame.Jlabeld1);
                label1.setVisible(false);
                frame.remove(label1);
                ((JLabel) MyFrame.Jlabeld1).setText(""+String.valueOf(MyFrame.d1*MyFrame.ul));
                frame.add(label1);
                label1.setVisible(true);
                frame.add(MyFrame.Jlabeld1);
                ((JComponent) MyFrame.Jlabeld1).setOpaque(false);
                label1.setOpaque(false);
                MyFrame.Jlabeld1.setBounds(MyFrame.dx1,L1,120,40);
                MyFrame.Jlabeld1.setForeground(color2);
                MyFrame.Jlabeld1.setFont(font1);
                MyFrame.Jlabeld1.setVisible(true);

                MyFrame.Jlabeld0.setVisible(false);
                frame.remove(MyFrame.Jlabeld0);
                label0.setVisible(false);
                frame.remove(label0);
                ((JLabel) MyFrame.Jlabeld0).setText(""+String.valueOf(MyFrame.d0*MyFrame.ul));
                frame.add(label0);
                label0.setVisible(true);
                frame.add(MyFrame.Jlabeld0);
                ((JComponent) MyFrame.Jlabeld0).setOpaque(false);
                label0.setOpaque(false);
                MyFrame.Jlabeld0.setBounds(MyFrame.dx0,L0,120,40);
                MyFrame.Jlabeld0.setForeground(color1);
                MyFrame.Jlabeld0.setFont(font1);
                MyFrame.Jlabeld0.setVisible(true);

                if (Dobitak.stop1==0) {

                    Karta1.card1.setVisible(false);
                    frame.remove(Karta1.card1);
                    frame.add(MyFrame.JlabelK1);
                    MyFrame.JlabelK1.setVisible(true);

                }

                if (Dobitak.stop2==0) {

                    Karta2.card2.setVisible(false);
                    frame.remove(Karta2.card2);
                    frame.add(MyFrame.JlabelK2);
                    MyFrame.JlabelK2.setVisible(true);

                }

                if (Dobitak.stop3==0) {

                    Karta3.card3.setVisible(false);
                    frame.remove(Karta3.card3);
                    frame.add(MyFrame.JlabelK3);
                    MyFrame.JlabelK3.setVisible(true);

                }

                if (Dobitak.stop4==0) {

                    Karta4.card4.setVisible(false);
                    frame.remove(Karta4.card4);
                    frame.add(MyFrame.JlabelK4);
                    MyFrame.JlabelK4.setVisible(true);

                }

                if (Dobitak.stop5==0) {

                    Karta5.card5.setVisible(false);
                    frame.remove(Karta5.card5);
                    frame.add(MyFrame.JlabelK5);
                    MyFrame.JlabelK5.setVisible(true);

                }

                MyFrame.delj=2;

                frame.removeKeyListener(this);

                URL deljenje2 = this.getClass().getClassLoader().getResource("resources/Deljenje2.wav");
                AudioInputStream audioDeljenje2;
                try {
                    assert deljenje2 != null;
                    audioDeljenje2 = AudioSystem.getAudioInputStream(deljenje2);
                } catch (UnsupportedAudioFileException | IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    this.deljenje2Sound = AudioSystem.getClip();
                } catch (LineUnavailableException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    deljenje2Sound.open(audioDeljenje2);
                } catch (LineUnavailableException | IOException ex) {
                    throw new RuntimeException(ex);
                }
                this.deljenje2Sound.start();

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
