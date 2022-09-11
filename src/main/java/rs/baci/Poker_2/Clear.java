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

        label9.setVisible(false);
        frame.remove(label9);
        label8.setVisible(false);
        frame.remove(label8);
        label7.setVisible(false);
        frame.remove(label7);
        label6.setVisible(false);
        frame.remove(label6);
        label5.setVisible(false);
        frame.remove(label5);
        label4.setVisible(false);
        frame.remove(label4);
        label3.setVisible(false);
        frame.remove(label3);
        label2.setVisible(false);
        frame.remove(label2);
        label1.setVisible(false);
        frame.remove(label1);
        label0.setVisible(false);
        frame.remove(label0);

        Highpair.labelD9.setVisible(false);
        tabela.remove(Highpair.labelD9);
        Twopairs.labelD8.setVisible(false);
        tabela.remove(Twopairs.labelD8);
        Threeofakind.labelD7.setVisible(false);
        tabela.remove(Threeofakind.labelD7);
        Street.labelD6.setVisible(false);
        tabela.remove(Street.labelD6);
        Flush.labelD5.setVisible(false);
        tabela.remove(Flush.labelD5);
        Fullhouse.labelD4.setVisible(false);
        tabela.remove(Fullhouse.labelD4);
        Poker.labelD3.setVisible(false);
        tabela.remove(Poker.labelD3);
        Streetflush.labelD2.setVisible(false);
        tabela.remove(Streetflush.labelD2);
        Royalflush.labelD1.setVisible(false);
        tabela.remove(Royalflush.labelD1);
        Fiveofakind.labelD0.setVisible(false);
        tabela.remove(Fiveofakind.labelD0);

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
