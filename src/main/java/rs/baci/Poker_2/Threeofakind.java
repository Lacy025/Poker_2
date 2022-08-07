package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Threeofakind implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld07 = new JLabel(""+d7*MyFrame.ul);

    Threeofakind() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label7.setBounds(0,240,1292,36);
            Jlabeld07.setBounds(MyFrame.dx7,0,120,32);
            label7.add(Jlabeld07);
            frame.add(label7);
            label7.setOpaque(true);
            label7.setBackground(color2);
            MyFrame.label7.setForeground(color3);
            Jlabeld07.setBackground(color2);
            Jlabeld07.setForeground(color3);
            label7.setFont(font1);
            Jlabeld07.setFont(font1);
            ((JComponent) Jlabeld07).setOpaque(true);
            new Hold();

        }
        else {

            new Prostor();
            new Tabela();

            JLabel labelD7 = new JLabel(" THREE OF A KIND");
            labelD7.setVerticalAlignment(JLabel.TOP);
            labelD7.setBounds(0,0,2200,200);
            tabela.add(labelD7);
            labelD7.setFont(font2);
            labelD7.setForeground(color1);
            labelD7.setOpaque(false);
        }


    }

}
