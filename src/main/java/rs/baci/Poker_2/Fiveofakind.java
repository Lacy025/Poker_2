package rs.baci.Poker_2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Fiveofakind implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld0 = new JLabel(""+d0*MyFrame.ul);

    Fiveofakind() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        label0.setBounds(0,0,1292,40);Jlabeld0.setBounds(MyFrame.dx0,0,120,40);
        label0.add(Jlabeld0);frame.add(label0);label0.setOpaque(true);
        label0.setBackground(Color.BLUE);MyFrame.label0.setForeground(Color.YELLOW);
        Jlabeld0.setBackground(Color.BLUE);Jlabeld0.setForeground(Color.YELLOW);
        label0.setFont(new Font("Verdana", Font.PLAIN, 36));
        Jlabeld0.setFont(new Font("Verdana", Font.PLAIN, 36));
        ((JComponent) Jlabeld0).setOpaque(true);
        new Hold();

    }

}
