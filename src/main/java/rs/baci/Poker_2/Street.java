package rs.baci.Poker_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Street implements MainFrame, Numbers, Winnings {
    Street() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (MyFrame.dealing == 1) {
            hand.setLayout(new BorderLayout(50,50));
            hand.setBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, Color.RED));
            frame.add(hand);
            hand.setBounds(0, L6+2, 1292, 32);
            hand.setVisible(true);
            hand.setOpaque(false);
            new Hold();
        }
        else {
            new Clear_3();
            new Table();
            labelT6.setVerticalAlignment(JLabel.TOP);
            labelT6.setHorizontalAlignment(JLabel.LEFT);
            labelT6.setBounds(30,10,1200,120);
            labelT6.setVisible(true);
            labelT6.setFont(font2);
            labelT6.setForeground(color1);
            labelT6.setOpaque(false);
            table.add(labelT6);
            labelT10.setText(d6 * MyFrame.ul + " ");
            labelT10.setHorizontalAlignment(JLabel.RIGHT);
            labelT10.setVerticalAlignment(JLabel.BOTTOM);
            table.add(labelT10);
            labelT10.setVisible(true);
            labelT10.setFont(font2);
            labelT10.setForeground(color1);
            labelT10.setOpaque(false);
            MyFrame.win_value = d6 * MyFrame.ul;
            MyFrame.final_value = d6 * MyFrame.ul;
        }
    }
}
