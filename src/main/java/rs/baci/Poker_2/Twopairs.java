package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Twopairs implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld8 = new JLabel(""+d8*MyFrame.ul);

    Twopairs() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        label8.setBounds(0,274,1292,36);
        Jlabeld8.setBounds(MyFrame.dx8,0,120,32);
        label8.add(Jlabeld8);
        frame.add(label8);
        label8.setOpaque(true);
        label8.setBackground(color2);
        MyFrame.label8.setForeground(color3);
        Jlabeld8.setBackground(color2);
        Jlabeld8.setForeground(color3);
        label8.setFont(font1);
        Jlabeld8.setFont(font1);
        ((JComponent) Jlabeld8).setOpaque(true);
        new Hold();

    }

}
