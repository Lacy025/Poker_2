package rs.baci.Poker_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Fullhouse implements MainFrame, Brojevi, Dobici {
    Fullhouse() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (MyFrame.dealing == 1) {
            rucno.setLayout(new BorderLayout(50,50));
            rucno.setBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, Color.RED));
            frame.add(rucno);
            rucno.setBounds(0, L4+2, 1292, 32);
            rucno.setVisible(true);
            rucno.setOpaque(false);
            new Hold();
        }
        else {
            new Prostor();
            new Tabela();
            labelT4.setVerticalAlignment(JLabel.TOP);
            labelT4.setHorizontalAlignment(JLabel.LEFT);
            labelT4.setBounds(30,10,1200,120);
            labelT4.setVisible(true);
            labelT4.setFont(font2);
            labelT4.setForeground(color1);
            labelT4.setOpaque(false);
            tabela.add(labelT4);
            labelT10.setText(d4 * MyFrame.ul + " ");
            labelT10.setHorizontalAlignment(JLabel.RIGHT);
            labelT10.setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelT10);
            labelT10.setVisible(true);
            labelT10.setFont(font2);
            labelT10.setForeground(color1);
            labelT10.setOpaque(false);
            MyFrame.win_value = d4 * MyFrame.ul;
            MyFrame.final_value = d4 * MyFrame.ul;
        }
    }
}
