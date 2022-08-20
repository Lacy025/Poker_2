package rs.baci.Poker_2;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Upis1 implements MainFrame, Brojevi {

    public Component Broj1 = new JLabel(""+MyFrame.dobitak*MyFrame.ul+" ");
    public static Component Credit1 = new JLabel(""+MyFrame.cr);

    Timer timer1;

    Upis1() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        ((JLabel) Broj1).setText("" + MyFrame.dobitak-- + " ");
        ((JLabel) Credit1).setText(""+ MyFrame.cr++);

        timer1 = new Timer(50, e -> { double x = MyFrame.dobitak;

            if (x==-1) {

                ((JLabel) Broj1).setText(""+ 0 +" ");
                ((JLabel) Credit1).setText(""+ 0);

                ((JLabel) Broj1).setHorizontalAlignment(JLabel.RIGHT);
                ((JLabel) Broj1).setVerticalAlignment(JLabel.BOTTOM);
                tabela.add(Broj1);
                Broj1.setFont(font2);
                Broj1.setForeground(color1);
                ((JComponent) Broj1).setOpaque(false);

                Credit1.setBounds(1670,64,500,50);
                Credit1.setFont(font1);
                Credit1.setForeground(color3);
                ((JComponent) Credit1).setOpaque(false);
                Credit1.setVisible(true);
                frame.add(Credit1);

            }

            else if(((int)x/100 != (x/100)) && x>0) {

                ((JLabel) Broj1).setText("" + MyFrame.dobitak-- + " ");
                ((JLabel) Credit1).setText(""+ MyFrame.cr++);


                try {

                    new Isplata1();

                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {

                    e1.printStackTrace();
                }


            }

            else  {

                ((Timer) (e.getSource())).stop();
                Broj1.setVisible(false);
                tabela.remove(Broj1);

                try {
                    new Upis2();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }

            }});


        ((JLabel) Broj1).setHorizontalAlignment(JLabel.RIGHT);
        ((JLabel) Broj1).setVerticalAlignment(JLabel.BOTTOM);
        tabela.add(Broj1);
        Broj1.setFont(font2);
        Broj1.setForeground(color1);
        ((JComponent) Broj1).setOpaque(false);

        Credit1.setBounds(1670,64,500,50);
        Credit1.setFont(font1);
        Credit1.setForeground(color3);
        ((JComponent) Credit1).setOpaque(false);
        Credit1.setVisible(true);
        frame.add(Credit1);

        timer1.setInitialDelay(0);
        timer1.start();

    }

}
