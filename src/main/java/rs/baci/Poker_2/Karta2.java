package rs.baci.Poker_2;

import java.awt.Component;

import javax.swing.JLabel;

public class Karta2 extends JLabel {
	public static Component card2 = new JLabel();
	Karta2() {
		if (MyFrame.n2==0) {Karta2.card2=MyFrame.joker;MyFrame.karta2=0;MyFrame.boja2=0;}
		if (MyFrame.n2==1) {Karta2.card2=MyFrame.heart_1;MyFrame.karta2=14;MyFrame.boja2=1;}
		if (MyFrame.n2==2) {Karta2.card2=MyFrame.heart_2;MyFrame.karta2=2;MyFrame.boja2=1;}
		if (MyFrame.n2==3) {Karta2.card2=MyFrame.heart_3;MyFrame.karta2=3;MyFrame.boja2=1;}
		if (MyFrame.n2==4) {Karta2.card2=MyFrame.heart_4;MyFrame.karta2=4;MyFrame.boja2=1;}
		if (MyFrame.n2==5) {Karta2.card2=MyFrame.heart_5;MyFrame.karta2=5;MyFrame.boja2=1;}
		if (MyFrame.n2==6) {Karta2.card2=MyFrame.heart_6;MyFrame.karta2=6;MyFrame.boja2=1;}
		if (MyFrame.n2==7) {Karta2.card2=MyFrame.heart_7;MyFrame.karta2=7;MyFrame.boja2=1;}
		if (MyFrame.n2==8) {Karta2.card2=MyFrame.heart_8;MyFrame.karta2=8;MyFrame.boja2=1;}
		if (MyFrame.n2==9) {Karta2.card2=MyFrame.heart_9;MyFrame.karta2=9;MyFrame.boja2=1;}
		if (MyFrame.n2==10) {Karta2.card2=MyFrame.heart_10;MyFrame.karta2=10;MyFrame.boja2=1;}
		if (MyFrame.n2==11) {Karta2.card2=MyFrame.heart_jack;MyFrame.karta2=11;MyFrame.boja2=1;}
		if (MyFrame.n2==12) {Karta2.card2=MyFrame.heart_queen;MyFrame.karta2=12;MyFrame.boja2=1;}
		if (MyFrame.n2==13) {Karta2.card2=MyFrame.heart_king;MyFrame.karta2=13;MyFrame.boja2=1;}
		if (MyFrame.n2==14) {Karta2.card2=MyFrame.club_1;MyFrame.karta2=14;MyFrame.boja2=2;}
		if (MyFrame.n2==15) {Karta2.card2=MyFrame.club_2;MyFrame.karta2=2;MyFrame.boja2=2;}
		if (MyFrame.n2==16) {Karta2.card2=MyFrame.club_3;MyFrame.karta2=3;MyFrame.boja2=2;}
		if (MyFrame.n2==17) {Karta2.card2=MyFrame.club_4;MyFrame.karta2=4;MyFrame.boja2=2;}
		if (MyFrame.n2==18) {Karta2.card2=MyFrame.club_5;MyFrame.karta2=5;MyFrame.boja2=2;}
		if (MyFrame.n2==19) {Karta2.card2=MyFrame.club_6;MyFrame.karta2=6;MyFrame.boja2=2;}
		if (MyFrame.n2==20) {Karta2.card2=MyFrame.club_7;MyFrame.karta2=7;MyFrame.boja2=2;}
		if (MyFrame.n2==21) {Karta2.card2=MyFrame.club_8;MyFrame.karta2=8;MyFrame.boja2=2;}
		if (MyFrame.n2==22) {Karta2.card2=MyFrame.club_9;MyFrame.karta2=9;MyFrame.boja2=2;}
		if (MyFrame.n2==23) {Karta2.card2=MyFrame.club_10;MyFrame.karta2=10;MyFrame.boja2=2;}
		if (MyFrame.n2==24) {Karta2.card2=MyFrame.club_jack;MyFrame.karta2=11;MyFrame.boja2=2;}
		if (MyFrame.n2==25) {Karta2.card2=MyFrame.club_queen;MyFrame.karta2=12;MyFrame.boja2=2;}
		if (MyFrame.n2==26) {Karta2.card2=MyFrame.club_king;MyFrame.karta2=13;MyFrame.boja2=2;}
		if (MyFrame.n2==27) {Karta2.card2=MyFrame.diamond_1;MyFrame.karta2=14;MyFrame.boja2=3;}
		if (MyFrame.n2==28) {Karta2.card2=MyFrame.diamond_2;MyFrame.karta2=2;MyFrame.boja2=3;}
		if (MyFrame.n2==29) {Karta2.card2=MyFrame.diamond_3;MyFrame.karta2=3;MyFrame.boja2=3;}
		if (MyFrame.n2==30) {Karta2.card2=MyFrame.diamond_4;MyFrame.karta2=4;MyFrame.boja2=3;}
		if (MyFrame.n2==31) {Karta2.card2=MyFrame.diamond_5;MyFrame.karta2=5;MyFrame.boja2=3;}
		if (MyFrame.n2==32) {Karta2.card2=MyFrame.diamond_6;MyFrame.karta2=6;MyFrame.boja2=3;}
		if (MyFrame.n2==33) {Karta2.card2=MyFrame.diamond_7;MyFrame.karta2=7;MyFrame.boja2=3;}
		if (MyFrame.n2==34) {Karta2.card2=MyFrame.diamond_8;MyFrame.karta2=8;MyFrame.boja2=3;}
		if (MyFrame.n2==35) {Karta2.card2=MyFrame.diamond_9;MyFrame.karta2=9;MyFrame.boja2=3;}
		if (MyFrame.n2==36) {Karta2.card2=MyFrame.diamond_10;MyFrame.karta2=10;MyFrame.boja2=3;}
		if (MyFrame.n2==37) {Karta2.card2=MyFrame.diamond_jack;MyFrame.karta2=11;MyFrame.boja2=3;}
		if (MyFrame.n2==38) {Karta2.card2=MyFrame.diamond_queen;MyFrame.karta2=12;MyFrame.boja2=3;}
		if (MyFrame.n2==39) {Karta2.card2=MyFrame.diamond_king;MyFrame.karta2=13;MyFrame.boja2=3;}
		if (MyFrame.n2==40) {Karta2.card2=MyFrame.spade_1;MyFrame.karta2=14;MyFrame.boja2=4;}
		if (MyFrame.n2==41) {Karta2.card2=MyFrame.spade_2;MyFrame.karta2=2;MyFrame.boja2=4;}
		if (MyFrame.n2==42) {Karta2.card2=MyFrame.spade_3;MyFrame.karta2=3;MyFrame.boja2=4;}
		if (MyFrame.n2==43) {Karta2.card2=MyFrame.spade_4;MyFrame.karta2=4;MyFrame.boja2=4;}
		if (MyFrame.n2==44) {Karta2.card2=MyFrame.spade_5;MyFrame.karta2=5;MyFrame.boja2=4;}
		if (MyFrame.n2==45) {Karta2.card2=MyFrame.spade_6;MyFrame.karta2=6;MyFrame.boja2=4;}
		if (MyFrame.n2==46) {Karta2.card2=MyFrame.spade_7;MyFrame.karta2=7;MyFrame.boja2=4;}
		if (MyFrame.n2==47) {Karta2.card2=MyFrame.spade_8;MyFrame.karta2=8;MyFrame.boja2=4;}
		if (MyFrame.n2==48) {Karta2.card2=MyFrame.spade_9;MyFrame.karta2=9;MyFrame.boja2=4;}
		if (MyFrame.n2==49) {Karta2.card2=MyFrame.spade_10;MyFrame.karta2=10;MyFrame.boja2=4;}
		if (MyFrame.n2==50) {Karta2.card2=MyFrame.spade_jack;MyFrame.karta2=11;MyFrame.boja2=4;}
		if (MyFrame.n2==51) {Karta2.card2=MyFrame.spade_queen;MyFrame.karta2=12;MyFrame.boja2=4;}
		if (MyFrame.n2==52) {Karta2.card2=MyFrame.spade_king;MyFrame.karta2=13;MyFrame.boja2=4;}
	}
}
