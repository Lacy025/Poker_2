package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Street implements MainFrame, Brojevi, Dobici {

    public static Component labelD06 = new JLabel();
    public static Component labelD6 = new JLabel(" STREET");

    Street() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label6.setBounds(0,208,1292,36);
            MyFrame.Jlabeld6.setBounds(MyFrame.dx6,0,120,32);
            label6.setVisible(false);
            frame.remove(label6);
            MyFrame.Jlabeld6.setVisible(true);
            frame.add(label6);
            label6.add(MyFrame.Jlabeld6);
            label6.setVisible(true);
            label6.setOpaque(true);
            label6.setBackground(color2);
            label6.setForeground(color3);
            MyFrame.Jlabeld6.setBackground(color2);
            MyFrame.Jlabeld6.setForeground(color3);
            label6.setFont(font1);
            MyFrame.Jlabeld6.setFont(font1);
            ((JComponent) MyFrame.Jlabeld6).setOpaque(true);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            ((JLabel) labelD6).setVerticalAlignment(JLabel.TOP);
            labelD6.setBounds(0,0,1200,120);
            tabela.add(labelD6);
            labelD6.setVisible(true);
            labelD6.setFont(font2);
            labelD6.setForeground(color1);
            ((JComponent) labelD6).setOpaque(false);

            ((JLabel) labelD06).setText("" + d6 * MyFrame.ul + " ");
            ((JLabel) labelD06).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD06).setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD06);
            labelD06.setVisible(true);
            labelD06.setFont(font2);
            labelD06.setForeground(color1);
            ((JComponent) labelD06).setOpaque(false);
            MyFrame.dobitak=d6*MyFrame.ul;
            MyFrame.ukupno=d6*MyFrame.ul;

        }
    }
}
