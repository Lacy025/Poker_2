package rs.baci.Poker_2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Flush implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld5 = new JLabel(""+d5*MyFrame.ul);

    Flush() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        label5.setBounds(0,172,1292,36);Jlabeld5.setBounds(MyFrame.dx5,0,120,32);
        label5.add(Jlabeld5);frame.add(label5);label5.setOpaque(true);
        label5.setBackground(Color.BLUE);MyFrame.label5.setForeground(Color.RED);
        Jlabeld5.setBackground(Color.BLUE);Jlabeld5.setForeground(Color.RED);
        label5.setFont(new Font("Verdana", Font.PLAIN, 36));
        Jlabeld5.setFont(new Font("Verdana", Font.PLAIN, 36));
        ((JComponent) Jlabeld5).setOpaque(true);
        new Hold();

    }

}
