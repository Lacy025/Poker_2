package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Highpair implements MainFrame, Brojevi, Dobici {

    public static Component labelD09 = new JLabel();
    public static Component labelD9 = new JLabel(" HIGH PAIR");

    Highpair() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label9.setBounds(0,308,1292,36);
            MyFrame.Jlabeld9.setBounds(MyFrame.dx9,0,120,32);
            label9.setVisible(false);
            frame.remove(label9);
            MyFrame.Jlabeld9.setVisible(true);
            frame.add(label9);
            label9.add(MyFrame.Jlabeld9);
            label9.setVisible(true);
            label9.setOpaque(true);
            label9.setBackground(color2);
            label9.setForeground(color3);
            MyFrame.Jlabeld9.setBackground(color2);
            MyFrame.Jlabeld9.setForeground(color3);
            label9.setFont(font1);
            MyFrame.Jlabeld9.setFont(font1);
            ((JComponent) MyFrame.Jlabeld9).setOpaque(true);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            ((JLabel) labelD9).setVerticalAlignment(JLabel.TOP);
            labelD9.setBounds(0,0,1200,120);
            tabela.add(labelD9);
            labelD9.setVisible(true);
            labelD9.setFont(font2);
            labelD9.setForeground(color1);
            ((JComponent) labelD9).setOpaque(false);

            ((JLabel) labelD09).setText("" + d9 * MyFrame.ul + " ");
            ((JLabel) labelD09).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD09).setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD09);
            labelD09.setVisible(true);
            labelD09.setFont(font2);
            labelD09.setForeground(color1);
            ((JComponent) labelD09).setOpaque(false);
            MyFrame.dobitak=d9*MyFrame.ul;
            MyFrame.ukupno=d9*MyFrame.ul;

        }
    }
}
