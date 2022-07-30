package rs.baci.Poker_2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Highpair implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld9 = new JLabel(""+d9*MyFrame.ul);

    Highpair() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        label9.setBounds(0,308,1292,36);Jlabeld9.setBounds(MyFrame.dx9,0,120,32);
        label9.add(Jlabeld9);frame.add(label9);label9.setOpaque(true);
        label9.setBackground(Color.BLUE);MyFrame.label9.setForeground(Color.RED);
        Jlabeld9.setBackground(Color.BLUE);Jlabeld9.setForeground(Color.RED);
        label9.setFont(new Font("Verdana", Font.PLAIN, 36));
        Jlabeld9.setFont(new Font("Verdana", Font.PLAIN, 36));
        ((JComponent) Jlabeld9).setOpaque(true);
        new Hold();

    }

}
