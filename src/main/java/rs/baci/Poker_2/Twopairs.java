package rs.baci.Poker_2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Twopairs implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld8 = new JLabel(""+d8*MyFrame.ul);

    Twopairs() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        label8.setBounds(0,274,1292,36);Jlabeld8.setBounds(MyFrame.dx8,0,120,32);
        label8.add(Jlabeld8);frame.add(label8);label8.setOpaque(true);
        label8.setBackground(Color.BLUE);MyFrame.label8.setForeground(Color.RED);
        Jlabeld8.setBackground(Color.BLUE);Jlabeld8.setForeground(Color.RED);
        label8.setFont(new Font("Verdana", Font.PLAIN, 36));
        Jlabeld8.setFont(new Font("Verdana", Font.PLAIN, 36));
        ((JComponent) Jlabeld8).setOpaque(true);
        new Hold();

    }

}
