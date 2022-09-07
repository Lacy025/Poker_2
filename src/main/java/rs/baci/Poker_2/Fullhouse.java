package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Fullhouse implements MainFrame, Brojevi, Dobici {

    public static Component labelD4 = new JLabel();

    Fullhouse() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label4.setBounds(0,138,1292,36);
            MyFrame.Jlabeld4.setBounds(MyFrame.dx4,0,120,32);
            label4.setVisible(false);
            frame.remove(label4);
            MyFrame.Jlabeld4.setVisible(true);
            frame.add(label4);
            label4.add(MyFrame.Jlabeld4);
            label4.setVisible(true);
            label4.setOpaque(true);
            label4.setBackground(color2);
            label4.setForeground(color3);
            MyFrame.Jlabeld4.setBackground(color2);
            MyFrame.Jlabeld4.setForeground(color3);
            label4.setFont(font1);
            MyFrame.Jlabeld4.setFont(font1);
            ((JComponent) MyFrame.Jlabeld4).setOpaque(true);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            label4.setVerticalAlignment(JLabel.TOP);
            label4.setHorizontalAlignment(JLabel.LEFT);
            label4.setBounds(30,10,1200,120);
            label4.setVisible(true);
            label4.setFont(font2);
            label4.setForeground(color1);
            label4.setOpaque(false);
            tabela.add(label4);

            ((JLabel) labelD4).setText("" + d4 * MyFrame.ul + " ");
            ((JLabel) labelD4).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD4).setVerticalAlignment(JLabel.BOTTOM);
            labelD4.setVisible(true);
            labelD4.setFont(font2);
            labelD4.setForeground(color1);
            ((JComponent) labelD4).setOpaque(false);
            tabela.add(labelD4);

            MyFrame.dobitak=d4*MyFrame.ul;
            MyFrame.ukupno=d4*MyFrame.ul;

        }
    }
}
