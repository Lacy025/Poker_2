package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Upis1 implements MainFrame, Brojevi {
    public Component Broj1 = new JLabel(MyFrame.win_value * MyFrame.ul + " ");
    public static Component Credit1 = new JLabel("" + MyFrame.cr);
    Timer timer2;
    Upis1() {
        ((JLabel) Broj1).setText(MyFrame.win_value-- + " ");
        ((JLabel) Credit1).setText(""+ MyFrame.cr++);
        timer2 = new Timer(50, e -> { double x2 = MyFrame.win_value;
            if (x2 == -1) {
                ((JLabel) Broj1).setText(0 + " ");
                ((JLabel) Credit1).setText("" + 0);
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
            else if(((int)x2 / 100 != (x2 / 100)) && x2 > 0) {

                ((JLabel) Broj1).setText(MyFrame.win_value-- + " ");
                ((JLabel) Credit1).setText(""+ MyFrame.cr++);
                try {
                    new Isplata1();
                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
            else  {
                ((Timer) (e.getSource())).stop();
                Broj1.setVisible(false);
                tabela.remove(Broj1);
                try {
                    Isplata1.isplata1Sound.stop();
                    new Upis2();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        });
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
        timer2.setInitialDelay(0);
        timer2.start();
    }
}
