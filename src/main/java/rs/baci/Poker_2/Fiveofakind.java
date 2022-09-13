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

public class Fiveofakind implements MainFrame, Brojevi, Dobici {

    public static Component labelD0 = new JLabel();

    Fiveofakind() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            rucno.setLayout(new BorderLayout(50,50));
            rucno.setBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, Color.RED));
            frame.add(rucno);
            rucno.setBounds(0, L0+2, 1292, 32);
            rucno.setVisible(true);
            rucno.setOpaque(false);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            labelT0.setVerticalAlignment(JLabel.TOP);
            labelT0.setHorizontalAlignment(JLabel.LEFT);
            labelT0.setBounds(30,10,1200,120);
            labelT0.setVisible(true);
            labelT0.setFont(font2);
            labelT0.setForeground(color1);
            labelT0.setOpaque(false);
            tabela.add(labelT0);

            ((JLabel) labelD0).setText("" + d0 * MyFrame.ul + " ");
            ((JLabel) labelD0).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD0).setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD0);
            labelD0.setVisible(true);
            labelD0.setFont(font2);
            labelD0.setForeground(color1);
            ((JComponent) labelD0).setOpaque(false);

            MyFrame.dobitak=d0*MyFrame.ul;
            MyFrame.ukupno=d0*MyFrame.ul;

        }
    }
}
