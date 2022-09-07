package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Poker implements MainFrame, Brojevi, Dobici {

    public static Component labelD3 = new JLabel();

    Poker() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label3.setBounds(0,104,1292,36);
            MyFrame.Jlabeld3.setBounds(MyFrame.dx3,0,120,32);
            label3.setVisible(false);
            frame.remove(label3);
            MyFrame.Jlabeld3.setVisible(true);
            frame.add(label3);
            label3.add(MyFrame.Jlabeld3);
            label3.setVisible(true);
            label3.setOpaque(true);
            label3.setBackground(color2);
            label3.setForeground(color3);
            MyFrame.Jlabeld3.setBackground(color2);
            MyFrame.Jlabeld3.setForeground(color3);
            label3.setFont(font1);
            MyFrame.Jlabeld3.setFont(font1);
            ((JComponent) MyFrame.Jlabeld3).setOpaque(true);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            label3.setVerticalAlignment(JLabel.TOP);
            label3.setHorizontalAlignment(JLabel.LEFT);
            label3.setBounds(30,10,1200,120);
            label3.setVisible(true);
            label3.setFont(font2);
            label3.setForeground(color1);
            label3.setOpaque(false);
            tabela.add(label3);

            ((JLabel) labelD3).setText("" + d3 * MyFrame.ul + " ");
            ((JLabel) labelD3).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD3).setVerticalAlignment(JLabel.BOTTOM);
            labelD3.setVisible(true);
            labelD3.setFont(font2);
            labelD3.setForeground(color1);
            ((JComponent) labelD3).setOpaque(false);
            tabela.add(labelD3);

            MyFrame.dobitak=d3*MyFrame.ul;
            MyFrame.ukupno=d3*MyFrame.ul;

        }
    }
}
