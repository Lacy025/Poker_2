package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Take_2 implements Numbers, MainFrame {
    public Component Broj2 = new JLabel(MyFrame.win_value + " ");
    public Component Credit2 = new JLabel(""+MyFrame.cr);
    Timer timer2;
    Take_2() throws InterruptedException {
        Take_1.Credit1.setVisible(false);
        frame.remove(Take_1.Credit1);
        try {
            new Cash_2();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e3) {
            e3.printStackTrace();
        }
        timer2 = new Timer(1000, e -> {
            if(MyFrame.win_value == -1) {
                try {
                    new Cash_2();
                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e2) {
                    e2.printStackTrace();
                }
            }
            MyFrame.win_value = MyFrame.win_value - 100;
            MyFrame.cr = MyFrame.cr + 100;
            if(MyFrame.win_value > -1) {
                ((JLabel) Broj2).setText(MyFrame.win_value + " ");
                ((JLabel) Credit2).setText(String.valueOf(MyFrame.cr));
                try {
                    new Cash_2();
                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
                    e1.printStackTrace();
                }
            }
            else  {
                ((Timer) (e.getSource())).stop();
                table.remove(Broj2);
                frame.remove(Credit2);
            }});
        table.add(Broj2);
        frame.add(Credit2);
        ((JLabel) Broj2).setHorizontalAlignment(JLabel.RIGHT);
        ((JLabel) Broj2).setVerticalAlignment(JLabel.BOTTOM);
        table.add(Broj2);
        Broj2.setFont(font2);
        Broj2.setForeground(color1);
        ((JComponent) Broj2).setOpaque(false);
        Credit2.setBounds(1670,64,500,50);
        Credit2.setFont(font1);
        Credit2.setForeground(color3);
        ((JComponent) Credit2).setOpaque(false);
        Credit2.setVisible(true);
        frame.add(Credit2);
        timer2.setInitialDelay(0);
        timer2.start();
    }
}
