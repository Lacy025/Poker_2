package rs.baci.Poker_2;

public class Cashing implements Numbers, Winnings, MainFrame {
	public static int money;
	Cashing() throws InterruptedException {
		labelT10.setVisible(false);
		table.remove(labelT10);
		MyFrame.Credit.setVisible(false);
		frame.remove(MyFrame.Credit);
		money = 0;
		frame.add(Choice_2.you_win);
		Choice_2.you_win.setVisible(true);
		money++;
		new Take_1();
		while (money > 0 && MyFrame.win_value > -1) {
			if (money == 5000) {
				Choice_2.you_win.setVisible(true);
				Thread.sleep(500);
				money++;
			}
			if (money == 10000 && MyFrame.win_value >- 1) {
				Choice_2.you_win.setVisible(false);
				Thread.sleep(500);
				money = 1;
			}
			money++;
		}
		Thread.sleep(400);
		Choice_2.you_win.setVisible(true);
		money = 1;
	}
}
