package rs.baci.Poker_2;

import java.awt.Component;
import java.awt.Font;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Fiveofakind implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld00 = new JLabel(""+d0*MyFrame.ul);
    public static Component labelD00 = new JLabel(""+d0*MyFrame.ul+" ");

    Fiveofakind() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label0.setBounds(0,0,1292,40);
            Jlabeld00.setBounds(MyFrame.dx0,0,120,40);
            label0.add(Jlabeld00);
            frame.add(label0);
            label0.setOpaque(true);
            label0.setBackground(color2);
            MyFrame.label0.setForeground(color1);
            Jlabeld00.setBackground(color2);
            Jlabeld00.setForeground(color1);
            label0.setFont(new Font("Verdana", Font.PLAIN, 36));
            Jlabeld00.setFont(new Font("Verdana", Font.PLAIN, 36));
            ((JComponent) Jlabeld00).setOpaque(true);
            new Hold();

        }
        else {

            new Prostor();
            new Tabela();

            JLabel labelD0 = new JLabel(" FIVE OF A KIND");
            labelD0.setVerticalAlignment(JLabel.TOP);
            labelD0.setBounds(0,0,1200,120);
            tabela.add(labelD0);
            labelD0.setFont(font2);
            labelD0.setForeground(color1);
            labelD0.setOpaque(false);

            ((JLabel) labelD00).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD00).setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD00);
            labelD00.setFont(font2);
            labelD00.setForeground(color1);
            ((JComponent) labelD00).setOpaque(false);
            MyFrame.dobitak=d0*MyFrame.ul;

        }


    }

}
