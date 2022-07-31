package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Royalflush implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld1 = new JLabel(""+d1*MyFrame.ul);

    Royalflush() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        label1.setBounds(0,36,1292,36);
        Jlabeld1.setBounds(MyFrame.dx1,0,120,32);
        label1.add(Jlabeld1);
        frame.add(label1);
        label1.setOpaque(true);
        label1.setBackground(color2);
        MyFrame.label1.setForeground(color4);
        Jlabeld1.setBackground(color2);
        Jlabeld1.setForeground(color4);
        label1.setFont(font1);
        Jlabeld1.setFont(font1);
        ((JComponent) Jlabeld1).setOpaque(true);
        new Hold();

    }

}
