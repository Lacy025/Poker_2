package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Street implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld06 = new JLabel(""+d6*MyFrame.ul);

    Street() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label6.setBounds(0,208,1292,36);
            Jlabeld06.setBounds(MyFrame.dx6,0,120,32);
            label6.add(Jlabeld06);
            frame.add(label6);
            label6.setOpaque(true);
            label6.setBackground(color2);
            MyFrame.label6.setForeground(color3);
            Jlabeld06.setBackground(color2);
            Jlabeld06.setForeground(color3);
            label6.setFont(font1);
            Jlabeld06.setFont(font1);
            ((JComponent) Jlabeld06).setOpaque(true);
            new Hold();

        }
        else {

            new Prostor();
            new Tabela();

            JLabel labelD6 = new JLabel(" STREET");
            labelD6.setVerticalAlignment(JLabel.TOP);
            labelD6.setBounds(0,0,1200,120);
            tabela.add(labelD6);
            labelD6.setFont(font2);
            labelD6.setForeground(color1);
            labelD6.setOpaque(false);

            JLabel labelD06 = new JLabel(""+d6*MyFrame.ul+" ");
            labelD06.setHorizontalAlignment(JLabel.RIGHT);
            labelD06.setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD06);
            labelD06.setFont(font2);
            labelD06.setForeground(color1);
            labelD06.setOpaque(false);

        }


    }

}
