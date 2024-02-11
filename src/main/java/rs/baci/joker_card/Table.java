package rs.baci.joker_card;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class Table implements MainFrame, Winnings, Numbers {
    Table() {
        table.setBackground(Color.red);
        table.setLayout(new BorderLayout(50,50));
        table.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.YELLOW));
        frame.add(table);
        table.setVisible(true);
        table.setBounds(20, 20, 1300, 340);
        label12.setHorizontalAlignment(JLabel.LEFT);
        label12.setVerticalAlignment(JLabel.BOTTOM);
        label12.setBounds(30,140,2200,200);
        label12.setVisible(true);
        label12.setFont(font2);
        label12.setForeground(color1);
        label12.setOpaque(false);
        table.add(label12);
    }
}

