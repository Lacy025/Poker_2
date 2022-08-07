package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Streetflush implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld02 = new JLabel(""+d2*MyFrame.ul);

    Streetflush() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label2.setBounds(0,70,1292,36);
            Jlabeld02.setBounds(MyFrame.dx2,0,120,32);
            label2.add(Jlabeld02);
            frame.add(label2);
            label2.setOpaque(true);
            label2.setBackground(color2);
            MyFrame.label2.setForeground(color3);
            Jlabeld02.setBackground(color2);
            Jlabeld02.setForeground(color3);
            label2.setFont(font1);
            Jlabeld02.setFont(font1);
            ((JComponent) Jlabeld02).setOpaque(true);
            new Hold();

        }
        else {

            new Prostor();
            new Tabela();

            JLabel labelD2 = new JLabel(" STREET FLUSH");
            labelD2.setVerticalAlignment(JLabel.TOP);
            labelD2.setBounds(0,0,2200,200);
            tabela.add(labelD2);
            labelD2.setFont(font2);
            labelD2.setForeground(color1);
            labelD2.setOpaque(false);

        }


    }

}
