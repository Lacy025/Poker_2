package rs.baci.Poker_2;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class Tabela implements MainFrame, Dobici, Brojevi{

    Tabela() {

        tabela.setBackground(Color.red);
        tabela.setLayout(new BorderLayout(50,50));
        tabela.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.YELLOW));
        frame.add(tabela);
        tabela.setVisible(true);
        tabela.setBounds(20, 20, 1300, 340);

        label12.setHorizontalAlignment(JLabel.LEFT);
        label12.setBounds(0,160,2200,200);
        tabela.add(label12);
        label12.setVisible(true);
        label12.setFont(font2);
        label12.setForeground(color1);
        label12.setOpaque(false);

    }

}

