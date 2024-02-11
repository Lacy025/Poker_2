package rs.baci.Poker_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class High_pair implements MainFrame, Numbers, Winnings {
    High_pair() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (MyFrame.dealing == 1) {
            hand.setLayout(new BorderLayout(50,50));
            hand.setBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, Color.RED));
            frame.add(hand);
            hand.setBounds(0, L9+2, 1292, 32);
            hand.setVisible(true);
            hand.setOpaque(false);
            new Hold();
        }
        else {
            new Clear_3();
            new Table();
            labelT9.setVerticalAlignment(JLabel.TOP);
            labelT9.setHorizontalAlignment(JLabel.LEFT);
            labelT9.setBounds(30,10,1200,120);
            labelT9.setVisible(true);
            labelT9.setFont(font2);
            labelT9.setForeground(color1);
            labelT9.setOpaque(false);
            table.add(labelT9);
            labelT10.setText(d9 * MyFrame.ul + " ");
            labelT10.setHorizontalAlignment(JLabel.RIGHT);
            labelT10.setVerticalAlignment(JLabel.BOTTOM);
            table.add(labelT10);
            labelT10.setVisible(true);
            labelT10.setFont(font2);
            labelT10.setForeground(color1);
            labelT10.setOpaque(false);
            MyFrame.win_value = d9 * MyFrame.ul;
            MyFrame.final_value = d9 * MyFrame.ul;
        }
    }
}
