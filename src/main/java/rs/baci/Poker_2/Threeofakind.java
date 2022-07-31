package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Threeofakind implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld7 = new JLabel(""+d7*MyFrame.ul);

    Threeofakind() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        label7.setBounds(0,240,1292,36);
        Jlabeld7.setBounds(MyFrame.dx7,0,120,32);
        label7.add(Jlabeld7);
        frame.add(label7);
        label7.setOpaque(true);
        label7.setBackground(color2);
        MyFrame.label7.setForeground(color3);
        Jlabeld7.setBackground(color2);
        Jlabeld7.setForeground(color3);
        label7.setFont(font1);
        Jlabeld7.setFont(font1);
        ((JComponent) Jlabeld7).setOpaque(true);
        new Hold();

    }

}
