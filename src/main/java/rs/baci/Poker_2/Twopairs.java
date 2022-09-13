package rs.baci.Poker_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Twopairs implements MainFrame, Brojevi, Dobici {

    public static Component labelD8 = new JLabel();

    Twopairs() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            rucno.setLayout(new BorderLayout(50,50));
            rucno.setBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, Color.RED));
            frame.add(rucno);
            rucno.setBounds(0, L8+2, 1292, 32);
            rucno.setVisible(true);
            rucno.setOpaque(false);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            labelT8.setVerticalAlignment(JLabel.TOP);
            labelT8.setHorizontalAlignment(JLabel.LEFT);
            labelT8.setBounds(30,10,1200,120);
            labelT8.setVisible(true);
            labelT8.setFont(font2);
            labelT8.setForeground(color1);
            labelT8.setOpaque(false);
            tabela.add(labelT8);

            ((JLabel) labelD8).setText("" + d8 * MyFrame.ul + " ");
            ((JLabel) labelD8).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD8).setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD8);
            labelD8.setVisible(true);
            labelD8.setFont(font2);
            labelD8.setForeground(color1);
            ((JComponent) labelD8).setOpaque(false);

            MyFrame.dobitak=d8*MyFrame.ul;
            MyFrame.ukupno=d8*MyFrame.ul;

        }
    }
}
