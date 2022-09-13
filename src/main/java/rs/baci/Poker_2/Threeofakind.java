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

public class Threeofakind implements MainFrame, Brojevi, Dobici {

    public static Component labelD7 = new JLabel();

    Threeofakind() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            rucno.setLayout(new BorderLayout(50,50));
            rucno.setBorder(BorderFactory.createMatteBorder(20, 20, 20, 20, Color.RED));
            frame.add(rucno);
            rucno.setBounds(0, L7+2, 1292, 32);
            rucno.setVisible(true);
            rucno.setOpaque(false);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            labelT7.setVerticalAlignment(JLabel.TOP);
            labelT7.setHorizontalAlignment(JLabel.LEFT);
            labelT7.setBounds(30,10,1200,120);
            labelT7.setVisible(true);
            labelT7.setFont(font2);
            labelT7.setForeground(color1);
            labelT7.setOpaque(false);
            tabela.add(labelT7);

            ((JLabel) labelD7).setText("" + d7 * MyFrame.ul + " ");
            ((JLabel) labelD7).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD7).setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD7);
            labelD7.setVisible(true);
            labelD7.setFont(font2);
            labelD7.setForeground(color1);
            ((JComponent) labelD7).setOpaque(false);

            MyFrame.dobitak=d7*MyFrame.ul;
            MyFrame.ukupno=d7*MyFrame.ul;

        }
    }
}
