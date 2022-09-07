package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Royalflush implements MainFrame, Brojevi, Dobici {

    public static Component labelD1 = new JLabel();

    Royalflush() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label1.setBounds(0,36,1292,36);
            MyFrame.Jlabeld1.setBounds(MyFrame.dx1,0,120,32);
            label1.setVisible(false);
            frame.remove(label1);
            MyFrame.Jlabeld1.setVisible(true);
            frame.add(label1);
            label1.add(MyFrame.Jlabeld1);
            label1.setVisible(true);
            label1.setOpaque(true);
            label1.setBackground(color2);
            label1.setForeground(color4);
            MyFrame.Jlabeld1.setBackground(color2);
            MyFrame.Jlabeld1.setForeground(color4);
            label1.setFont(font1);
            MyFrame.Jlabeld1.setFont(font1);
            ((JComponent) MyFrame.Jlabeld1).setOpaque(true);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            label1.setVerticalAlignment(JLabel.TOP);
            label1.setHorizontalAlignment(JLabel.LEFT);
            label1.setBounds(30,10,1200,120);
            label1.setVisible(true);
            label1.setFont(font2);
            label1.setForeground(color1);
            label1.setOpaque(false);
            tabela.add(label1);

            ((JLabel) labelD1).setText("" + d1 * MyFrame.ul + " ");
            ((JLabel) labelD1).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD1).setVerticalAlignment(JLabel.BOTTOM);
            labelD1.setVisible(true);
            labelD1.setFont(font2);
            labelD1.setForeground(color1);
            ((JComponent) labelD1).setOpaque(false);
            tabela.add(labelD1);

            MyFrame.dobitak=d1*MyFrame.ul;
            MyFrame.ukupno=d7*MyFrame.ul;

        }
    }
}
