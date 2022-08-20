package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Poker implements MainFrame, Brojevi, Dobici {

    public static Component Jlabeld03 = new JLabel(""+d3*MyFrame.ul);
    public static Component labelD03 = new JLabel(""+d3*MyFrame.ul+" ");

    Poker() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        if (MyFrame.delj==1) {

            label3.setBounds(0,104,1292,36);
            Jlabeld03.setBounds(MyFrame.dx3,0,120,32);
            label3.add(Jlabeld03);
            frame.add(label3);
            label3.setOpaque(true);
            label3.setBackground(color2);
            MyFrame.label3.setForeground(color3);
            Jlabeld03.setBackground(color2);
            Jlabeld03.setForeground(color3);
            label3.setFont(font1);
            Jlabeld03.setFont(font1);
            ((JComponent) Jlabeld03).setOpaque(true);
            new Hold();

        }
        else {

            new Prostor();
            new Tabela();

            JLabel labelD3 = new JLabel(" POKER");
            labelD3.setVerticalAlignment(JLabel.TOP);
            labelD3.setBounds(0,0,1200,120);
            tabela.add(labelD3);
            labelD3.setFont(font2);
            labelD3.setForeground(color1);
            labelD3.setOpaque(false);

            ((JLabel) labelD03).setHorizontalAlignment(JLabel.RIGHT);
            ((JLabel) labelD03).setVerticalAlignment(JLabel.BOTTOM);
            tabela.add(labelD03);
            labelD03.setFont(font2);
            labelD03.setForeground(color1);
            ((JComponent) labelD03).setOpaque(false);
            MyFrame.dobitak=d3*MyFrame.ul;

        }


    }

}
