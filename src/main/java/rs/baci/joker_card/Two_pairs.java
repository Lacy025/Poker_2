package rs.baci.joker_card;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Two_pairs implements MainFrame, Numbers, Winnings {
    Two_pairs() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (MyFrame.dealing == 1) {
            hand.setLayout(new BorderLayout(50,50));
            hand.setBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, Color.RED));
            frame.add(hand);
            hand.setBounds(0, L8+2, 1292, 32);
            hand.setVisible(true);
            hand.setOpaque(false);
            new Hold();
        }
        else {
            new Clear_3();
            new Table();
            labelT8.setVerticalAlignment(JLabel.TOP);
            labelT8.setHorizontalAlignment(JLabel.LEFT);
            labelT8.setBounds(30,10,1200,120);
            labelT8.setVisible(true);
            labelT8.setFont(font2);
            labelT8.setForeground(color1);
            labelT8.setOpaque(false);
            table.add(labelT8);
            labelT10.setText(d8 * MyFrame.ul + " ");
            labelT10.setHorizontalAlignment(JLabel.RIGHT);
            labelT10.setVerticalAlignment(JLabel.BOTTOM);
            table.add(labelT10);
            labelT10.setVisible(true);
            labelT10.setFont(font2);
            labelT10.setForeground(color1);
            labelT10.setOpaque(false);
            MyFrame.win_value = d8 * MyFrame.ul;
            MyFrame.final_value = d8 * MyFrame.ul;
        }
    }
}
