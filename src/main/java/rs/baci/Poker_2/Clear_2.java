package rs.baci.Poker_2;

public class Clear_2 implements Numbers, Winnings, MainFrame {
	Clear_2() {
		Doubling.PRAZNA.setVisible(false);
		frame.remove(Doubling.PRAZNA);
		Karta01.card01.setVisible(false);
		frame.remove(Karta01.card01);
		Karta02.card02.setVisible(false);
		frame.remove(Karta02.card02);
		Karta03.card03.setVisible(false);
		frame.remove(Karta03.card03);
		Karta04.card04.setVisible(false);
		frame.remove(Karta04.card04);
		Karta05.card05.setVisible(false);
		frame.remove(Karta05.card05);
		Karta06.card06.setVisible(false);
		frame.remove(Karta06.card06);
		Karta07.card07.setVisible(false);
		frame.remove(Karta07.card07);
		Karta08.card08.setVisible(false);
		frame.remove(Karta08.card08);
		Karta09.card09.setVisible(false);
		frame.remove(Karta09.card09);
		Karta10.card10.setVisible(false);
		frame.remove(Karta10.card10);
		Karta11.card11.setVisible(false);
		frame.remove(Karta11.card11);
		
		Doubling.VECA.setVisible(false);
    	frame.remove(Doubling.VECA);
    	Doubling.MANJA.setVisible(false);
    	frame.remove(Doubling.MANJA);
    	
    	MyFrame.n1 = 0;
		MyFrame.n2 = 0;
		MyFrame.n3 = 0;
		MyFrame.n4 = 0;
		MyFrame.n5 = 0;
		
		if(MyFrame.final_value > 0) {
			MyFrame.cr = MyFrame.cr - 100;
			MyFrame.cr = MyFrame.cr + MyFrame.final_value;
		}
		 Win.stop1 = 0;
		 Win.stop2 = 0;
		 Win.stop3 = 0;
		 Win.stop4 = 0;
		 Win.stop5 = 0;
		
		MyFrame.dealing = 0;
	}
}
