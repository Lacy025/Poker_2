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

public class Highpair implements MainFrame, Brojevi, Dobici {

    public static Component labelD9 = new JLabel();

    Highpair() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            rucno.setLayout(new BorderLayout(50,50));
            rucno.setBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, Color.RED));
            frame.add(rucno);
            rucno.setBounds(0, L9+2, 1292, 32);
            rucno.setVisible(true);
            rucno.setOpaque(false);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            labelT9.setVerticalAlignment(JLabel.TOP);
            labelT9.setHorizontalAlignment(JLabel.LEFT);
            labelT9.setBounds(30,10,1200,120);
            labelT9.setVisible(true);
            labelT9.setFont(font2);
            labelT9.setForeground(color1);
            labelT9.setOpaque(false);
            tabela.add(labelT9);

            ((JLabel) labelD9).setText("" + d9 * MyFrame.ul + " ");
            ((JLabel) labelD9).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD9).setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD9);
            labelD9.setVisible(true);
            labelD9.setFont(font2);
            labelD9.setForeground(color1);
            ((JComponent) labelD9).setOpaque(false);

            MyFrame.dobitak=d9*MyFrame.ul;
            MyFrame.ukupno=d9*MyFrame.ul;

        }
    }
}
