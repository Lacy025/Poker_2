package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Fullhouse implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld04 = new JLabel(""+d4*MyFrame.ul);

    Fullhouse() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label4.setBounds(0,138,1292,36);
            Jlabeld04.setBounds(MyFrame.dx4,0,120,32);
            label4.add(Jlabeld04);
            frame.add(label4);
            label4.setOpaque(true);
            label4.setBackground(color2);
            MyFrame.label4.setForeground(color3);
            Jlabeld04.setBackground(color2);
            Jlabeld04.setForeground(color3);
            label4.setFont(font1);
            Jlabeld04.setFont(font1);
            ((JComponent) Jlabeld04).setOpaque(true);
            new Hold();

        }
        else {

            new Prostor();
            new Tabela();

            JLabel labelD4 = new JLabel(" FULL HOUSE");
            labelD4.setVerticalAlignment(JLabel.TOP);
            labelD4.setBounds(0,0,2200,200);
            tabela.add(labelD4);
            labelD4.setFont(font2);
            labelD4.setForeground(color1);
            labelD4.setOpaque(false);

        }


    }

}
