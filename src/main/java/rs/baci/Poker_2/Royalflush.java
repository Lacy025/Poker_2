package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Royalflush implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld01 = new JLabel(""+d1*MyFrame.ul);

    Royalflush() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label1.setBounds(0,36,1292,36);
            Jlabeld01.setBounds(MyFrame.dx1,0,120,32);
            label1.add(Jlabeld01);
            frame.add(label1);
            label1.setOpaque(true);
            label1.setBackground(color2);
            MyFrame.label1.setForeground(color4);
            Jlabeld01.setBackground(color2);
            Jlabeld01.setForeground(color4);
            label1.setFont(font1);
            Jlabeld01.setFont(font1);
            ((JComponent) Jlabeld01).setOpaque(true);
            new Hold();

        }
        else {

            new Prostor();
            new Tabela();

            JLabel labelD1 = new JLabel(" ROYAL FLUSH");
            labelD1.setVerticalAlignment(JLabel.TOP);
            labelD1.setBounds(0,0,2200,200);
            tabela.add(labelD1);
            labelD1.setFont(font2);
            labelD1.setForeground(color1);
            labelD1.setOpaque(false);

        }


    }

}
