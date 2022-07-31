package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Flush implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld5 = new JLabel(""+d5*MyFrame.ul);

    Flush() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        label5.setBounds(0,172,1292,36);
        Jlabeld5.setBounds(MyFrame.dx5,0,120,32);
        label5.add(Jlabeld5);
        frame.add(label5);
        label5.setOpaque(true);
        label5.setBackground(color2);
        MyFrame.label5.setForeground(color3);
        Jlabeld5.setBackground(color2);
        Jlabeld5.setForeground(color3);
        label5.setFont(font1);
        Jlabeld5.setFont(font1);
        ((JComponent) Jlabeld5).setOpaque(true);
        new Hold();

    }

}
