package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Street implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld6 = new JLabel(""+d6*MyFrame.ul);

    Street() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        label6.setBounds(0,208,1292,36);
        Jlabeld6.setBounds(MyFrame.dx6,0,120,32);
        label6.add(Jlabeld6);
        frame.add(label6);
        label6.setOpaque(true);
        label6.setBackground(color2);
        MyFrame.label6.setForeground(color3);
        Jlabeld6.setBackground(color2);
        Jlabeld6.setForeground(color3);
        label6.setFont(font1);
        Jlabeld6.setFont(font1);
        ((JComponent) Jlabeld6).setOpaque(true);
        new Hold();

    }

}
