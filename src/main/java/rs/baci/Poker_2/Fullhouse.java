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

public class Fullhouse implements MainFrame, Brojevi, Dobici {

    public static Component labelD4 = new JLabel();

    Fullhouse() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

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

            ((JLabel) labelD4).setText("" + d4 * MyFrame.ul + " ");
            ((JLabel) labelD4).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD4).setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD4);
            labelD4.setVisible(true);
            labelD4.setFont(font2);
            labelD4.setForeground(color1);
            ((JComponent) labelD4).setOpaque(false);

            MyFrame.dobitak=d4*MyFrame.ul;
            MyFrame.ukupno=d4*MyFrame.ul;

        }
    }
}
