package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Flush implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld05 = new JLabel(""+d5*MyFrame.ul);

    Flush() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label5.setBounds(0,172,1292,36);
            Jlabeld05.setBounds(MyFrame.dx5,0,120,32);
            label5.add(Jlabeld05);
            frame.add(label5);
            label5.setOpaque(true);
            label5.setBackground(color2);
            MyFrame.label5.setForeground(color3);
            Jlabeld05.setBackground(color2);
            Jlabeld05.setForeground(color3);
            label5.setFont(font1);
            Jlabeld05.setFont(font1);
            ((JComponent) Jlabeld05).setOpaque(true);
            new Hold();

        }
        else {

            new Prostor();
            new Tabela();

            JLabel labelD5 = new JLabel(" FLUSH");
            labelD5.setVerticalAlignment(JLabel.TOP);
            labelD5.setBounds(0,0,1200,120);
            tabela.add(labelD5);
            labelD5.setFont(font2);
            labelD5.setForeground(color1);
            labelD5.setOpaque(false);

            JLabel labelD05 = new JLabel(""+d5*MyFrame.ul+" ");
            labelD05.setHorizontalAlignment(JLabel.RIGHT);
            labelD05.setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD05);
            labelD05.setFont(font2);
            labelD05.setForeground(color1);
            labelD05.setOpaque(false);

        }


    }

}
