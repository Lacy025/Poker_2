package rs.baci.Poker_2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Street implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld6 = new JLabel(""+d6*MyFrame.ul);

    Street() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        label6.setBounds(0,208,1292,36);Jlabeld6.setBounds(MyFrame.dx6,0,120,32);
        label6.add(Jlabeld6);frame.add(label6);label6.setOpaque(true);
        label6.setBackground(Color.BLUE);MyFrame.label6.setForeground(Color.RED);
        Jlabeld6.setBackground(Color.BLUE);Jlabeld6.setForeground(Color.RED);
        label6.setFont(new Font("Verdana", Font.PLAIN, 36));
        Jlabeld6.setFont(new Font("Verdana", Font.PLAIN, 36));
        ((JComponent) Jlabeld6).setOpaque(true);
        new Hold();

    }

}
