package rs.baci.Poker_2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Poker implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld3 = new JLabel(""+d3*MyFrame.ul);

    Poker() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        label3.setBounds(0,104,1292,36);Jlabeld3.setBounds(MyFrame.dx3,0,120,32);
        label3.add(Jlabeld3);frame.add(label3);label3.setOpaque(true);
        label3.setBackground(Color.BLUE);MyFrame.label3.setForeground(Color.RED);
        Jlabeld3.setBackground(Color.BLUE);Jlabeld3.setForeground(Color.RED);
        label3.setFont(new Font("Verdana", Font.PLAIN, 36));
        Jlabeld3.setFont(new Font("Verdana", Font.PLAIN, 36));
        ((JComponent) Jlabeld3).setOpaque(true);
        new Hold();

    }

}
