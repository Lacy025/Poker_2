package rs.baci.Poker_2;

public class Joker {
	
	int K1 = MyFrame.karta1;
	int K2 = MyFrame.karta2;
	int K3 = MyFrame.karta3;
	int K4 = MyFrame.karta4;
	int K5 = MyFrame.karta5;
	
	public static int stop1;
	public static int stop2;
	public static int stop3;
	public static int stop4;
	public static int stop5;
	
	Joker() {
		
		if (K1==0) {
			stop1=1;
		}
		if (K2==0) {
			stop2=1;
		}
		if (K3==0) {
			stop3=1;
		}
		if (K4==0) {
			stop4=1;
		}
		if (K5==0) {
			stop5=1;
		}
		
		new Hold();
		
	}
}
