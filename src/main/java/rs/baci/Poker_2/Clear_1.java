package rs.baci.Poker_2;

public class Clear_1 implements Numbers, Winnings, MainFrame {
	
	Clear_1() {
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
		Choice_2.you_win.setVisible(false);
		frame.remove(Choice_2.you_win);
		
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
	}
}
