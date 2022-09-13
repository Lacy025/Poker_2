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

public class Streetflush implements MainFrame, Brojevi, Dobici {

    public static Component labelD2 = new JLabel();

    Streetflush() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            rucno.setLayout(new BorderLayout(50,50));
            rucno.setBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, Color.RED));
            frame.add(rucno);
            rucno.setBounds(0, L2+2, 1292, 32);
            rucno.setVisible(true);
            rucno.setOpaque(false);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            labelT2.setVerticalAlignment(JLabel.TOP);
            labelT2.setHorizontalAlignment(JLabel.LEFT);
            labelT2.setBounds(30,10,1200,120);
            labelT2.setVisible(true);
            labelT2.setFont(font2);
            labelT2.setForeground(color1);
            labelT2.setOpaque(false);
            tabela.add(labelT2);

            ((JLabel) labelD2).setText("" + d2 * MyFrame.ul + " ");
            ((JLabel) labelD2).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD2).setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD2);
            labelD2.setVisible(true);
            labelD2.setFont(font2);
            labelD2.setForeground(color1);
            ((JComponent) labelD2).setOpaque(false);

            MyFrame.dobitak=d2*MyFrame.ul;
            MyFrame.ukupno=d2*MyFrame.ul;

        }
    }
}
