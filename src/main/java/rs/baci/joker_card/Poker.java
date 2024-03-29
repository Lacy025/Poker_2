package rs.baci.joker_card;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Poker implements MainFrame, Numbers, Winnings {
    Poker() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (MyFrame.dealing == 1) {
            hand.setLayout(new BorderLayout(50,50));
            hand.setBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, Color.RED));
            frame.add(hand);
            hand.setBounds(0, L3+2, 1292, 32);
            hand.setVisible(true);
            hand.setOpaque(false);
            new Hold();
        }
        else {
            new Clear_3();
            new Table();
            labelT3.setVerticalAlignment(JLabel.TOP);
            labelT3.setHorizontalAlignment(JLabel.LEFT);
            labelT3.setBounds(30,10,1200,120);
            labelT3.setVisible(true);
            labelT3.setFont(font2);
            labelT3.setForeground(color1);
            labelT3.setOpaque(false);
            table.add(labelT3);
            labelT10.setText(d3 * MyFrame.ul + " ");
            labelT10.setHorizontalAlignment(JLabel.RIGHT);
            labelT10.setVerticalAlignment(JLabel.BOTTOM);
            table.add(labelT10);
            labelT10.setVisible(true);
            labelT10.setFont(font2);
            labelT10.setForeground(color1);
            labelT10.setOpaque(false);
            MyFrame.win_value = d3 * MyFrame.ul;
            MyFrame.final_value = d3 * MyFrame.ul;
        }
    }
}
