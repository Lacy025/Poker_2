package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Twopairs implements MainFrame, Brojevi, Dobici {

    public static Component labelD08 = new JLabel();
    public static Component labelD8 = new JLabel(" 2 PAIRS");

    Twopairs() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label8.setBounds(0,274,1292,36);
            MyFrame.Jlabeld8.setBounds(MyFrame.dx8,0,120,32);
            label8.setVisible(false);
            frame.remove(label8);
            MyFrame.Jlabeld8.setVisible(true);
            frame.add(label8);
            label8.add(MyFrame.Jlabeld8);
            label8.setVisible(true);
            label8.setOpaque(true);
            label8.setBackground(color2);
            label8.setForeground(color3);
            MyFrame.Jlabeld8.setBackground(color2);
            MyFrame.Jlabeld8.setForeground(color3);
            label8.setFont(font1);
            MyFrame.Jlabeld8.setFont(font1);
            ((JComponent) MyFrame.Jlabeld8).setOpaque(true);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            ((JLabel) labelD8).setVerticalAlignment(JLabel.TOP);
            labelD8.setBounds(0,0,1200,120);
            tabela.add(labelD8);
            labelD8.setVisible(true);
            labelD8.setFont(font2);
            labelD8.setForeground(color1);
            ((JComponent) labelD8).setOpaque(false);

            ((JLabel) labelD08).setText("" + d8 * MyFrame.ul + " ");
            ((JLabel) labelD08).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD08).setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD08);
            labelD08.setVisible(true);
            labelD08.setFont(font2);
            labelD08.setForeground(color1);
            ((JComponent) labelD08).setOpaque(false);
            MyFrame.dobitak=d8*MyFrame.ul;
            MyFrame.ukupno=d8*MyFrame.ul;

        }
    }
}
