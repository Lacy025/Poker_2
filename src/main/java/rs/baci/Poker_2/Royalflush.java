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

public class Royalflush implements MainFrame, Brojevi, Dobici {

    public static Component labelD1 = new JLabel();

    Royalflush() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            rucno.setLayout(new BorderLayout(50,50));
            rucno.setBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, Color.RED));
            frame.add(rucno);
            rucno.setBounds(0, L1+2, 1292, 32);
            rucno.setVisible(true);
            rucno.setOpaque(false);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            labelT1.setVerticalAlignment(JLabel.TOP);
            labelT1.setHorizontalAlignment(JLabel.LEFT);
            labelT1.setBounds(30,10,1200,120);
            labelT1.setVisible(true);
            labelT1.setFont(font2);
            labelT1.setForeground(color1);
            labelT1.setOpaque(false);
            tabela.add(labelT1);

            ((JLabel) labelD1).setText("" + d1 * MyFrame.ul + " ");
            ((JLabel) labelD1).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD1).setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD1);
            labelD1.setVisible(true);
            labelD1.setFont(font2);
            labelD1.setForeground(color1);
            ((JComponent) labelD1).setOpaque(false);

            MyFrame.dobitak=d1*MyFrame.ul;
            MyFrame.ukupno=d7*MyFrame.ul;

        }
    }
}
