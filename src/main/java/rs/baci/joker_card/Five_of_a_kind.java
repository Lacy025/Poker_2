package rs.baci.joker_card;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Five_of_a_kind implements MainFrame, Numbers, Winnings {
    Five_of_a_kind() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (MyFrame.dealing == 1) {
            hand.setLayout(new BorderLayout(50,50));
            hand.setBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, Color.MAGENTA));
            frame.add(hand);
            hand.setBounds(0, L0+2, 1292, 32);
            hand.setVisible(true);
            hand.setOpaque(false);
            new Hold();
        }
        else {
            new Clear_3();
            new Table();
            labelT0.setVerticalAlignment(JLabel.TOP);
            labelT0.setHorizontalAlignment(JLabel.LEFT);
            labelT0.setBounds(30,10,1200,120);
            labelT0.setVisible(true);
            labelT0.setFont(font2);
            labelT0.setForeground(color1);
            labelT0.setOpaque(false);
            table.add(labelT0);
            labelT10.setText(d0 * MyFrame.ul + " ");
            labelT10.setHorizontalAlignment(JLabel.RIGHT);
            labelT10.setVerticalAlignment(JLabel.BOTTOM);
            table.add(labelT10);
            labelT10.setVisible(true);
            labelT10.setFont(font2);
            labelT10.setForeground(color1);
            labelT10.setOpaque(false);
            MyFrame.win_value = d0 * MyFrame.ul;
            MyFrame.final_value = d0 * MyFrame.ul;
        }
    }
}
