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

public class Street implements MainFrame, Brojevi, Dobici {

    public static Component labelD6 = new JLabel();

    Street() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            rucno.setLayout(new BorderLayout(50,50));
            rucno.setBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, Color.RED));
            frame.add(rucno);
            rucno.setBounds(0, L6+2, 1292, 32);
            rucno.setVisible(true);
            rucno.setOpaque(false);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            labelT6.setVerticalAlignment(JLabel.TOP);
            labelT6.setHorizontalAlignment(JLabel.LEFT);
            labelT6.setBounds(30,10,1200,120);
            labelT6.setVisible(true);
            labelT6.setFont(font2);
            labelT6.setForeground(color1);
            labelT6.setOpaque(false);
            tabela.add(labelT6);

            ((JLabel) labelD6).setText("" + d6 * MyFrame.ul + " ");
            ((JLabel) labelD6).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD6).setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD6);
            labelD6.setVisible(true);
            labelD6.setFont(font2);
            labelD6.setForeground(color1);
            ((JComponent) labelD6).setOpaque(false);

            MyFrame.dobitak=d6*MyFrame.ul;
            MyFrame.ukupno=d6*MyFrame.ul;

        }
    }
}
