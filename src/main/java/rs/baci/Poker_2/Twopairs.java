package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Twopairs implements MainFrame, Brojevi, Dobici {

    public static Component labelD8 = new JLabel();

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

            label8.setVerticalAlignment(JLabel.TOP);
            label8.setHorizontalAlignment(JLabel.LEFT);
            label8.setBounds(30,10,1200,120);
            label8.setVisible(true);
            label8.setFont(font2);
            label8.setForeground(color1);
            label8.setOpaque(false);
            tabela.add(label8);

            ((JLabel) labelD8).setText("" + d8 * MyFrame.ul + " ");
            ((JLabel) labelD8).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD8).setVerticalAlignment(JLabel.BOTTOM);
            labelD8.setVisible(true);
            labelD8.setFont(font2);
            labelD8.setForeground(color1);
            ((JComponent) labelD8).setOpaque(false);
            tabela.add(labelD8);

            MyFrame.dobitak=d8*MyFrame.ul;
            MyFrame.ukupno=d8*MyFrame.ul;

        }
    }
}
