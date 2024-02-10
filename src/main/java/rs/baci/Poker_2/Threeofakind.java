package rs.baci.Poker_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Threeofakind implements MainFrame, Numbers, Winnings {
    Threeofakind() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (MyFrame.dealing == 1) {
            rucno.setLayout(new BorderLayout(50,50));
            rucno.setBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, Color.RED));
            frame.add(rucno);
            rucno.setBounds(0, L7+2, 1292, 32);
            rucno.setVisible(true);
            rucno.setOpaque(false);
            new Hold();
        }
        else {
            new Clear_3();
            new Table();
            labelT7.setVerticalAlignment(JLabel.TOP);
            labelT7.setHorizontalAlignment(JLabel.LEFT);
            labelT7.setBounds(30,10,1200,120);
            labelT7.setVisible(true);
            labelT7.setFont(font2);
            labelT7.setForeground(color1);
            labelT7.setOpaque(false);
            tabela.add(labelT7);
            labelT10.setText(d7 * MyFrame.ul + " ");
            labelT10.setHorizontalAlignment(JLabel.RIGHT);
            labelT10.setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelT10);
            labelT10.setVisible(true);
            labelT10.setFont(font2);
            labelT10.setForeground(color1);
            labelT10.setOpaque(false);
            MyFrame.win_value = d7 * MyFrame.ul;
            MyFrame.final_value = d7 * MyFrame.ul;
        }
    }
}
