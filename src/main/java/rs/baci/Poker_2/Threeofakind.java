package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Threeofakind implements MainFrame, Brojevi, Dobici {

    public static Component labelD7 = new JLabel();

    Threeofakind() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label7.setBounds(0,240,1292,36);
            MyFrame.Jlabeld7.setBounds(MyFrame.dx7,0,120,32);
            label7.setVisible(false);
            frame.remove(label7);
            MyFrame.Jlabeld7.setVisible(true);
            frame.add(label7);
            label7.add(MyFrame.Jlabeld7);
            label7.setVisible(true);
            label7.setOpaque(true);
            label7.setBackground(color2);
            label7.setForeground(color3);
            MyFrame.Jlabeld7.setBackground(color2);
            MyFrame.Jlabeld7.setForeground(color3);
            label7.setFont(font1);
            MyFrame.Jlabeld7.setFont(font1);
            ((JComponent) MyFrame.Jlabeld7).setOpaque(true);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            label7.setVerticalAlignment(JLabel.TOP);
            label7.setHorizontalAlignment(JLabel.LEFT);
            label7.setBounds(30,10,1200,120);
            label7.setVisible(true);
            label7.setFont(font2);
            label7.setForeground(color1);
            label7.setOpaque(false);
            tabela.add(label7);

            ((JLabel) labelD7).setText("" + d7 * MyFrame.ul + " ");
            ((JLabel) labelD7).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD7).setVerticalAlignment(JLabel.BOTTOM);
            labelD7.setVisible(true);
            labelD7.setFont(font2);
            labelD7.setForeground(color1);
            ((JComponent) labelD7).setOpaque(false);
            tabela.add(labelD7);

            MyFrame.dobitak=d7*MyFrame.ul;
            MyFrame.ukupno=d7*MyFrame.ul;

        }
    }
}
