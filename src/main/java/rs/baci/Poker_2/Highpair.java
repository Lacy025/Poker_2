package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Highpair implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld09 = new JLabel(""+d9*MyFrame.ul);

    Highpair() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label9.setBounds(0,308,1292,36);
            Jlabeld09.setBounds(MyFrame.dx9,0,120,32);
            label9.add(Jlabeld09);
            frame.add(label9);
            label9.setOpaque(true);
            label9.setBackground(color2);
            MyFrame.label9.setForeground(color3);
            Jlabeld09.setBackground(color2);
            Jlabeld09.setForeground(color3);
            label9.setFont(font1);
            Jlabeld09.setFont(font1);
            ((JComponent) Jlabeld09).setOpaque(true);
            new Hold();

        }
        else {

            new Prostor();
            new Tabela();

            JLabel labelD9 = new JLabel(" HIGH PAIR");
            labelD9.setVerticalAlignment(JLabel.TOP);
            labelD9.setBounds(0,0,1200,120);
            tabela.add(labelD9);
            labelD9.setFont(font2);
            labelD9.setForeground(color1);
            labelD9.setOpaque(false);

            JLabel labelD09 = new JLabel(""+d9*MyFrame.ul+" ");
            labelD09.setHorizontalAlignment(JLabel.RIGHT);
            labelD09.setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD09);
            labelD09.setFont(font2);
            labelD09.setForeground(color1);
            labelD09.setOpaque(false);

        }


    }

}
