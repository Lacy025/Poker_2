package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Streetflush implements MainFrame, Brojevi, Dobici {

    public static Component labelD02 = new JLabel();
    public static Component labelD2 = new JLabel(" STREET FLUSH");

    Streetflush() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label2.setBounds(0,70,1292,36);
            MyFrame.Jlabeld2.setBounds(MyFrame.dx2,0,120,32);
            label2.setVisible(false);
            frame.remove(label2);
            MyFrame.Jlabeld2.setVisible(true);
            frame.add(label2);
            label2.add(MyFrame.Jlabeld2);
            label2.setVisible(true);
            label2.setOpaque(true);
            label2.setBackground(color2);
            label2.setForeground(color3);
            MyFrame.Jlabeld2.setBackground(color2);
            MyFrame.Jlabeld2.setForeground(color3);
            label2.setFont(font1);
            MyFrame.Jlabeld2.setFont(font1);
            ((JComponent) MyFrame.Jlabeld2).setOpaque(true);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            ((JLabel) labelD2).setVerticalAlignment(JLabel.TOP);
            labelD2.setBounds(0,0,1200,120);
            tabela.add(labelD2);
            labelD2.setVisible(true);
            labelD2.setFont(font2);
            labelD2.setForeground(color1);
            ((JComponent) labelD2).setOpaque(false);

            ((JLabel) labelD02).setText("" + d2 * MyFrame.ul + " ");
            ((JLabel) labelD02).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD02).setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD02);
            labelD02.setVisible(true);
            labelD02.setFont(font2);
            labelD02.setForeground(color1);
            ((JComponent) labelD02).setOpaque(false);
            MyFrame.dobitak=d2*MyFrame.ul;
            MyFrame.ukupno=d2*MyFrame.ul;

        }
    }
}
