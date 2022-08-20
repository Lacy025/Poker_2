package rs.baci.Poker_2;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Upis2 implements Brojevi, MainFrame {

    public Component Broj2 = new JLabel(""+MyFrame.dobitak+" ");
    public Component Credit = new JLabel(""+MyFrame.cr);

    Timer timer2;

    Upis2 () throws InterruptedException {

        frame.remove(Upis1.Credit1);

        try {

            new Isplata2();

        } catch (
                UnsupportedAudioFileException | IOException | LineUnavailableException e3) {

            e3.printStackTrace();
        }

        timer2 = new Timer(1000, e -> {

            if(MyFrame.dobitak==-1) {

                try {

                    new Isplata2();

                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e2) {

                    e2.printStackTrace();
                }
            }

            MyFrame.dobitak = MyFrame.dobitak-100;
            MyFrame.cr = MyFrame.cr+100;

            if(MyFrame.dobitak>-1) {

                ((JLabel) Broj2).setText("" + MyFrame.dobitak + " ");
                ((JLabel) Credit).setText(""+ MyFrame.cr);

                try {

                    new Isplata2();

                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {

                    e1.printStackTrace();
                }
            }

            else  {

                ((Timer) (e.getSource())).stop();
                tabela.remove(Broj2);
                frame.remove(Credit);

            }});

        tabela.add(Broj2);
        frame.add(Credit);

        ((JLabel) Broj2).setHorizontalAlignment(JLabel.RIGHT);
        ((JLabel) Broj2).setVerticalAlignment(JLabel.BOTTOM);
        tabela.add(Broj2);
        Broj2.setFont(font2);
        Broj2.setForeground(color1);
        ((JComponent) Broj2).setOpaque(false);

        Credit.setBounds(1670,64,500,50);
        Credit.setFont(font1);
        Credit.setForeground(color3);
        ((JComponent) Credit).setOpaque(false);
        Credit.setVisible(true);
        frame.add(Credit);

        timer2.setInitialDelay(0);
        timer2.start();

    }

}
