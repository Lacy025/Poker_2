package rs.baci.joker_card;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Royal_flush implements MainFrame, Numbers, Winnings {
    Royal_flush() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (MyFrame.dealing == 1) {
            hand.setLayout(new BorderLayout(50,50));
            hand.setBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, Color.BLUE));
            frame.add(hand);
            hand.setBounds(0, L1+2, 1292, 32);
            hand.setVisible(true);
            hand.setOpaque(false);
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
            table.add(labelT1);
            labelT10.setText(d1 * MyFrame.ul + " ");
            labelT10.setHorizontalAlignment(JLabel.RIGHT);
            labelT10.setVerticalAlignment(JLabel.BOTTOM);
            table.add(labelT10);
            labelT10.setVisible(true);
            labelT10.setFont(font2);
            labelT10.setForeground(color1);
            labelT10.setOpaque(false);
            MyFrame.win_value = d1 * MyFrame.ul;
            MyFrame.final_value = d1 * MyFrame.ul;
        }
    }
}
