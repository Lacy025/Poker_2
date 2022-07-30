package rs.baci.Poker_2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Royalflush implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld1 = new JLabel(""+d1*MyFrame.ul);

    Royalflush() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        label1.setBounds(0,36,1292,36);Jlabeld1.setBounds(MyFrame.dx1,0,120,32);
        label1.add(Jlabeld1);frame.add(label1);label1.setOpaque(true);
        label1.setBackground(Color.BLUE);MyFrame.label1.setForeground(Color.RED);
        Jlabeld1.setBackground(Color.BLUE);Jlabeld1.setForeground(Color.RED);
        label1.setFont(new Font("Verdana", Font.PLAIN, 36));
        Jlabeld1.setFont(new Font("Verdana", Font.PLAIN, 36));
        ((JComponent) Jlabeld1).setOpaque(true);
        new Hold();

    }

}
