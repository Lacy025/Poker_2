package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Highpair implements MainFrame, Brojevi, Dobici {

    public static Component labelD9 = new JLabel();

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

            label9.setVerticalAlignment(JLabel.TOP);
            label9.setHorizontalAlignment(JLabel.LEFT);
            label9.setBounds(30,10,1200,120);
            label9.setVisible(true);
            label9.setFont(font2);
            label9.setForeground(color1);
            label9.setOpaque(false);
            tabela.add(label9);

            ((JLabel) labelD9).setText("" + d9 * MyFrame.ul + " ");
            ((JLabel) labelD9).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD9).setVerticalAlignment(JLabel.BOTTOM);
            labelD9.setVisible(true);
            labelD9.setFont(font2);
            labelD9.setForeground(color1);
            ((JComponent) labelD9).setOpaque(false);
            tabela.add(labelD9);

            MyFrame.dobitak=d9*MyFrame.ul;
            MyFrame.ukupno=d9*MyFrame.ul;

        }
    }
}
