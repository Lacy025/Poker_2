package rs.baci.joker_card;

import java.awt.Component;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Take_2 implements Numbers, MainFrame {
    public final Component Number_2 = new JLabel(MyFrame.win_value + " ");
    public final Component Credit_2 = new JLabel(""+MyFrame.cr);
    final Timer timer2;
    Take_2() {
        Take_1.Credit1.setVisible(false);
        frame.remove(Take_1.Credit1);
        new Cash_2();
        timer2 = new Timer(1000, e -> {
            if(MyFrame.win_value == -1) {
                new Cash_2();
            }
            MyFrame.win_value = MyFrame.win_value - 100;
            MyFrame.cr = MyFrame.cr + 100;
            if(MyFrame.win_value > -1) {
                ((JLabel) Number_2).setText(MyFrame.win_value + " ");
                ((JLabel) Credit_2).setText(String.valueOf(MyFrame.cr));
                new Cash_2();
            }
            else  {
                ((Timer) (e.getSource())).stop();
                table.remove(Number_2);
                frame.remove(Credit_2);
            }});
        table.add(Number_2);
        frame.add(Credit_2);
        ((JLabel) Number_2).setHorizontalAlignment(JLabel.RIGHT);
        ((JLabel) Number_2).setVerticalAlignment(JLabel.BOTTOM);
        table.add(Number_2);
        Number_2.setFont(font2);
        Number_2.setForeground(color1);
        ((JComponent) Number_2).setOpaque(false);
        Credit_2.setBounds(1670,64,500,50);
        Credit_2.setFont(font1);
        Credit_2.setForeground(color3);
        ((JComponent) Credit_2).setOpaque(false);
        Credit_2.setVisible(true);
        frame.add(Credit_2);
        timer2.setInitialDelay(0);
        timer2.start();
    }
}
