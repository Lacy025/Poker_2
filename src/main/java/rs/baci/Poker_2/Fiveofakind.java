package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Fiveofakind implements MainFrame, Brojevi, Dobici {

    public static Component labelD00 = new JLabel();
    public static Component labelD0 = new JLabel(" FIVE OF A KIND");

    Fiveofakind() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label0.setBounds(0,0,1292,40);
            MyFrame.Jlabeld0.setBounds(MyFrame.dx0,0,120,40);
            label0.setVisible(false);
            frame.remove(label0);
            MyFrame.Jlabeld0.setVisible(true);
            frame.add(label0);
            label0.add(MyFrame.Jlabeld0);
            label0.setVisible(true);
            label0.setOpaque(true);
            label0.setBackground(color2);
            label0.setForeground(color1);
            MyFrame.Jlabeld0.setBackground(color2);
            MyFrame.Jlabeld0.setForeground(color1);
            label0.setFont(font1);
            MyFrame.Jlabeld0.setFont(font1);
            ((JComponent) MyFrame.Jlabeld0).setOpaque(true);

            new Hold();

        }

        else {

            new Prostor();
            new Tabela();

            ((JLabel) labelD0).setVerticalAlignment(JLabel.TOP);
            labelD0.setBounds(0,0,1200,120);
            tabela.add(labelD0);
            labelD0.setVisible(true);
            labelD0.setFont(font2);
            labelD0.setForeground(color1);
            ((JComponent) labelD0).setOpaque(false);

            ((JLabel) labelD00).setText("" + d0 * MyFrame.ul + " ");
            ((JLabel) labelD00).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD00).setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD00);
            labelD00.setVisible(true);
            labelD00.setFont(font2);
            labelD00.setForeground(color1);
            ((JComponent) labelD00).setOpaque(false);
            MyFrame.dobitak=d0*MyFrame.ul;
            MyFrame.ukupno=d0*MyFrame.ul;

        }
    }
}
