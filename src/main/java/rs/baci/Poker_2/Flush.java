package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Flush implements MainFrame, Brojevi, Dobici {

    public static Component labelD5 = new JLabel();

    Flush() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label5.setBounds(0,172,1292,36);
            MyFrame.Jlabeld5.setBounds(MyFrame.dx5,0,120,32);
            label5.setVisible(false);
            frame.remove(label5);
            MyFrame.Jlabeld5.setVisible(true);
            frame.add(label5);
            label5.add(MyFrame.Jlabeld5);
            label5.setVisible(true);
            label5.setOpaque(true);
            label5.setBackground(color2);
            label5.setForeground(color3);
            MyFrame.Jlabeld5.setBackground(color2);
            MyFrame.Jlabeld5.setForeground(color3);
            label5.setFont(font1);
            MyFrame.Jlabeld5.setFont(font1);
            ((JComponent) MyFrame.Jlabeld5).setOpaque(true);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            label5.setVerticalAlignment(JLabel.TOP);
            label5.setHorizontalAlignment(JLabel.LEFT);
            label5.setBounds(30,10,1200,120);
            label5.setVisible(true);
            label5.setFont(font2);
            label5.setForeground(color1);
            label5.setOpaque(false);
            tabela.add(label5);

            ((JLabel) labelD5).setText("" + d5 * MyFrame.ul + " ");
            ((JLabel) labelD5).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD5).setVerticalAlignment(JLabel.BOTTOM);
            labelD5.setVisible(true);
            labelD5.setFont(font2);
            labelD5.setForeground(color1);
            ((JComponent) labelD5).setOpaque(false);
            tabela.add(labelD5);

            MyFrame.dobitak=d5*MyFrame.ul;
            MyFrame.ukupno=d5*MyFrame.ul;

        }
    }
}
