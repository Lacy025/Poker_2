package rs.baci.Poker_2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Fullhouse implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld4 = new JLabel(""+d4*MyFrame.ul);

    Fullhouse() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        label4.setBounds(0,138,1292,36);Jlabeld4.setBounds(MyFrame.dx4,0,120,32);
        label4.add(Jlabeld4);frame.add(label4);label4.setOpaque(true);
        label4.setBackground(Color.BLUE);MyFrame.label4.setForeground(Color.RED);
        Jlabeld4.setBackground(Color.BLUE);Jlabeld4.setForeground(Color.RED);
        label4.setFont(new Font("Verdana", Font.PLAIN, 36));
        Jlabeld4.setFont(new Font("Verdana", Font.PLAIN, 36));
        ((JComponent) Jlabeld4).setOpaque(true);
        new Hold();

    }

}
