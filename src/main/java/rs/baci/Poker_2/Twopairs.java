package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Twopairs implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld08 = new JLabel(""+d8*MyFrame.ul);

    Twopairs() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label8.setBounds(0,274,1292,36);
            Jlabeld08.setBounds(MyFrame.dx8,0,120,32);
            label8.add(Jlabeld08);
            frame.add(label8);
            label8.setOpaque(true);
            label8.setBackground(color2);
            MyFrame.label8.setForeground(color3);
            Jlabeld08.setBackground(color2);
            Jlabeld08.setForeground(color3);
            label8.setFont(font1);
            Jlabeld08.setFont(font1);
            ((JComponent) Jlabeld08).setOpaque(true);
            new Hold();

        }

        new Prostor();
        new Tabela();

        JLabel labelD8 = new JLabel(" TWO PAIRS");
        labelD8.setVerticalAlignment(JLabel.TOP);
        labelD8.setBounds(0,0,2200,200);
        tabela.add(labelD8);
        labelD8.setFont(font2);
        labelD8.setForeground(color1);
        labelD8.setOpaque(false);
    }

}
