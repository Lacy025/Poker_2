package rs.baci.joker_card;

public class Clear_2 implements Numbers, Winnings, MainFrame {
	Clear_2() {
		Doubling.Blank.setVisible(false);
		frame.remove(Doubling.Blank);
		Card_01.card01.setVisible(false);
		frame.remove(Card_01.card01);
		Card_02.card02.setVisible(false);
		frame.remove(Card_02.card02);
		Card_03.card03.setVisible(false);
		frame.remove(Card_03.card03);
		Card_04.card04.setVisible(false);
		frame.remove(Card_04.card04);
		Card_05.card05.setVisible(false);
		frame.remove(Card_05.card05);
		Card_06.card06.setVisible(false);
		frame.remove(Card_06.card06);
		Card_07.card07.setVisible(false);
		frame.remove(Card_07.card07);
		Card_08.card08.setVisible(false);
		frame.remove(Card_08.card08);
		Card_09.card09.setVisible(false);
		frame.remove(Card_09.card09);
		Card_10.card10.setVisible(false);
		frame.remove(Card_10.card10);
		Card_11.card11.setVisible(false);
		frame.remove(Card_11.card11);
		
		Doubling.High.setVisible(false);
    	frame.remove(Doubling.High);
    	Doubling.Low.setVisible(false);
    	frame.remove(Doubling.Low);
    	
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
