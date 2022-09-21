package rs.baci.Poker_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Flush implements MainFrame, Brojevi, Dobici {

    Flush() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            rucno.setLayout(new BorderLayout(50,50));
            rucno.setBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, Color.RED));
            frame.add(rucno);
            rucno.setBounds(0, L5+2, 1292, 32);
            rucno.setVisible(true);
            rucno.setOpaque(false);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            labelT5.setVerticalAlignment(JLabel.TOP);
            labelT5.setHorizontalAlignment(JLabel.LEFT);
            labelT5.setBounds(30,10,1200,120);
            labelT5.setVisible(true);
            labelT5.setFont(font2);
            labelT5.setForeground(color1);
            labelT5.setOpaque(false);
            tabela.add(labelT5);

            labelT10.setText("" + d5 * MyFrame.ul + " ");
            labelT10.setHorizontalAlignment(JLabel.RIGHT);
            labelT10.setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelT10);
            labelT10.setVisible(true);
            labelT10.setFont(font2);
            labelT10.setForeground(color1);
            labelT10.setOpaque(false);

            MyFrame.dobitak=d5*MyFrame.ul;
            MyFrame.ukupno=d5*MyFrame.ul;

        }
    }
}
