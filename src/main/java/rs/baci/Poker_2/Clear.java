package rs.baci.Poker_2;


public class Clear implements Brojevi, Dobici, MainFrame {

    Clear() {

        Karta1.card1.setVisible(false);
        frame.remove(Karta1.card1);
        Karta2.card2.setVisible(false);
        frame.remove(Karta2.card2);
        Karta3.card3.setVisible(false);
        frame.remove(Karta3.card3);
        Karta4.card4.setVisible(false);
        frame.remove(Karta4.card4);
        Karta5.card5.setVisible(false);
        frame.remove(Karta5.card5);
        Izbor2.pobeda.setVisible(false);
        frame.remove(Izbor2.pobeda);

        labelT9.setVisible(false);
        frame.remove(labelT9);
        labelT8.setVisible(false);
        frame.remove(labelT8);
        labelT7.setVisible(false);
        frame.remove(labelT7);
        labelT6.setVisible(false);
        frame.remove(labelT6);
        labelT5.setVisible(false);
        frame.remove(labelT5);
        labelT4.setVisible(false);
        frame.remove(labelT4);
        labelT3.setVisible(false);
        frame.remove(labelT3);
        labelT2.setVisible(false);
        frame.remove(labelT2);
        labelT1.setVisible(false);
        frame.remove(labelT1);
        labelT0.setVisible(false);
        frame.remove(labelT0);

        labelT10.setVisible(false);
        tabela.remove(labelT10);

        label12.setVisible(false);
        tabela.remove(label12);
        tabela.setVisible(false);
        frame.remove(tabela);

        MyFrame.n1=0;
        MyFrame.n2=0;
        MyFrame.n3=0;
        MyFrame.n4=0;
        MyFrame.n5=0;

        if (MyFrame.ukupno>0) {

            MyFrame.cr=MyFrame.cr-100;
            MyFrame.cr=MyFrame.cr+MyFrame.ukupno;

        }

        Dobitak.stop1=0;
        Dobitak.stop2=0;
        Dobitak.stop3=0;
        Dobitak.stop4=0;
        Dobitak.stop5=0;

        MyFrame.delj=0;

    }

}
