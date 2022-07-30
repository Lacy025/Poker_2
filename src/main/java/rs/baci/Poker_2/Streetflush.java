package rs.baci.Poker_2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Streetflush implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld2 = new JLabel(""+d2*MyFrame.ul);

    Streetflush() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        label2.setBounds(0,70,1292,36);Jlabeld2.setBounds(MyFrame.dx2,0,120,32);
        label2.add(Jlabeld2);frame.add(label2);label2.setOpaque(true);
        label2.setBackground(Color.BLUE);MyFrame.label2.setForeground(Color.RED);
        Jlabeld2.setBackground(Color.BLUE);Jlabeld2.setForeground(Color.RED);
        label2.setFont(new Font("Verdana", Font.PLAIN, 36));
        Jlabeld2.setFont(new Font("Verdana", Font.PLAIN, 36));
        ((JComponent) Jlabeld2).setOpaque(true);
        new Hold();

    }

}
