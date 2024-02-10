package rs.baci.Poker_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Royalflush implements MainFrame, Numbers, Winnings {
    Royalflush() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (MyFrame.dealing == 1) {
            rucno.setLayout(new BorderLayout(50,50));
            rucno.setBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, Color.BLUE));
            frame.add(rucno);
            rucno.setBounds(0, L1+2, 1292, 32);
            rucno.setVisible(true);
            rucno.setOpaque(false);
            new Hold();
        }
        else {
            new Clear_3();
            new Table();
            labelT1.setVerticalAlignment(JLabel.TOP);
            labelT1.setHorizontalAlignment(JLabel.LEFT);
            labelT1.setBounds(30,10,1200,120);
            labelT1.setVisible(true);
            labelT1.setFont(font2);
            labelT1.setForeground(color1);
            labelT1.setOpaque(false);
            tabela.add(labelT1);
            labelT10.setText(d1 * MyFrame.ul + " ");
            labelT10.setHorizontalAlignment(JLabel.RIGHT);
            labelT10.setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelT10);
            labelT10.setVisible(true);
            labelT10.setFont(font2);
            labelT10.setForeground(color1);
            labelT10.setOpaque(false);
            MyFrame.win_value = d1 * MyFrame.ul;
            MyFrame.final_value = d1 * MyFrame.ul;
        }
    }
}
