package rs.baci.Poker_2;

import java.awt.Component;

import javax.swing.JLabel;

public class Karta5 extends JLabel {
	public static Component card5 = new JLabel();
	Karta5() {
		if (MyFrame.n5==0) {Karta5.card5=MyFrame.joker;MyFrame.karta5=0;MyFrame.boja5=0;}
		if (MyFrame.n5==1) {Karta5.card5=MyFrame.heart_1;MyFrame.karta5=14;MyFrame.boja5=1;}
		if (MyFrame.n5==2) {Karta5.card5=MyFrame.heart_2;MyFrame.karta5=2;MyFrame.boja5=1;}
		if (MyFrame.n5==3) {Karta5.card5=MyFrame.heart_3;MyFrame.karta5=3;MyFrame.boja5=1;}
		if (MyFrame.n5==4) {Karta5.card5=MyFrame.heart_4;MyFrame.karta5=4;MyFrame.boja5=1;}
		if (MyFrame.n5==5) {Karta5.card5=MyFrame.heart_5;MyFrame.karta5=5;MyFrame.boja5=1;}
		if (MyFrame.n5==6) {Karta5.card5=MyFrame.heart_6;MyFrame.karta5=6;MyFrame.boja5=1;}
		if (MyFrame.n5==7) {Karta5.card5=MyFrame.heart_7;MyFrame.karta5=7;MyFrame.boja5=1;}
		if (MyFrame.n5==8) {Karta5.card5=MyFrame.heart_8;MyFrame.karta5=8;MyFrame.boja5=1;}
		if (MyFrame.n5==9) {Karta5.card5=MyFrame.heart_9;MyFrame.karta5=9;MyFrame.boja5=1;}
		if (MyFrame.n5==10) {Karta5.card5=MyFrame.heart_10;MyFrame.karta5=10;MyFrame.boja5=1;}
		if (MyFrame.n5==11) {Karta5.card5=MyFrame.heart_jack;MyFrame.karta5=11;MyFrame.boja5=1;}
		if (MyFrame.n5==12) {Karta5.card5=MyFrame.heart_queen;MyFrame.karta5=12;MyFrame.boja5=1;}
		if (MyFrame.n5==13) {Karta5.card5=MyFrame.heart_king;MyFrame.karta5=13;MyFrame.boja5=1;}
		if (MyFrame.n5==14) {Karta5.card5=MyFrame.club_1;MyFrame.karta5=14;MyFrame.boja5=2;}
		if (MyFrame.n5==15) {Karta5.card5=MyFrame.club_2;MyFrame.karta5=2;MyFrame.boja5=2;}
		if (MyFrame.n5==16) {Karta5.card5=MyFrame.club_3;MyFrame.karta5=3;MyFrame.boja5=2;}
		if (MyFrame.n5==17) {Karta5.card5=MyFrame.club_4;MyFrame.karta5=4;MyFrame.boja5=2;}
		if (MyFrame.n5==18) {Karta5.card5=MyFrame.club_5;MyFrame.karta5=5;MyFrame.boja5=2;}
		if (MyFrame.n5==19) {Karta5.card5=MyFrame.club_6;MyFrame.karta5=6;MyFrame.boja5=2;}
		if (MyFrame.n5==20) {Karta5.card5=MyFrame.club_7;MyFrame.karta5=7;MyFrame.boja5=2;}
		if (MyFrame.n5==21) {Karta5.card5=MyFrame.club_8;MyFrame.karta5=8;MyFrame.boja5=2;}
		if (MyFrame.n5==22) {Karta5.card5=MyFrame.club_9;MyFrame.karta5=9;MyFrame.boja5=2;}
		if (MyFrame.n5==23) {Karta5.card5=MyFrame.club_10;MyFrame.karta5=10;MyFrame.boja5=2;}
		if (MyFrame.n5==24) {Karta5.card5=MyFrame.club_jack;MyFrame.karta5=11;MyFrame.boja5=2;}
		if (MyFrame.n5==25) {Karta5.card5=MyFrame.club_queen;MyFrame.karta5=12;MyFrame.boja5=2;}
		if (MyFrame.n5==26) {Karta5.card5=MyFrame.club_king;MyFrame.karta5=13;MyFrame.boja5=2;}
		if (MyFrame.n5==27) {Karta5.card5=MyFrame.diamond_1;MyFrame.karta5=14;MyFrame.boja5=3;}
		if (MyFrame.n5==28) {Karta5.card5=MyFrame.diamond_2;MyFrame.karta5=2;MyFrame.boja5=3;}
		if (MyFrame.n5==29) {Karta5.card5=MyFrame.diamond_3;MyFrame.karta5=3;MyFrame.boja5=3;}
		if (MyFrame.n5==30) {Karta5.card5=MyFrame.diamond_4;MyFrame.karta5=4;MyFrame.boja5=3;}
		if (MyFrame.n5==31) {Karta5.card5=MyFrame.diamond_5;MyFrame.karta5=5;MyFrame.boja5=3;}
		if (MyFrame.n5==32) {Karta5.card5=MyFrame.diamond_6;MyFrame.karta5=6;MyFrame.boja5=3;}
		if (MyFrame.n5==33) {Karta5.card5=MyFrame.diamond_7;MyFrame.karta5=7;MyFrame.boja5=3;}
		if (MyFrame.n5==34) {Karta5.card5=MyFrame.diamond_8;MyFrame.karta5=8;MyFrame.boja5=3;}
		if (MyFrame.n5==35) {Karta5.card5=MyFrame.diamond_9;MyFrame.karta5=9;MyFrame.boja5=3;}
		if (MyFrame.n5==36) {Karta5.card5=MyFrame.diamond_10;MyFrame.karta5=10;MyFrame.boja5=3;}
		if (MyFrame.n5==37) {Karta5.card5=MyFrame.diamond_jack;MyFrame.karta5=11;MyFrame.boja5=3;}
		if (MyFrame.n5==38) {Karta5.card5=MyFrame.diamond_queen;MyFrame.karta5=12;MyFrame.boja5=3;}
		if (MyFrame.n5==39) {Karta5.card5=MyFrame.diamond_king;MyFrame.karta5=13;MyFrame.boja5=3;}
		if (MyFrame.n5==40) {Karta5.card5=MyFrame.spade_1;MyFrame.karta5=14;MyFrame.boja5=4;}
		if (MyFrame.n5==41) {Karta5.card5=MyFrame.spade_2;MyFrame.karta5=2;MyFrame.boja5=4;}
		if (MyFrame.n5==42) {Karta5.card5=MyFrame.spade_3;MyFrame.karta5=3;MyFrame.boja5=4;}
		if (MyFrame.n5==43) {Karta5.card5=MyFrame.spade_4;MyFrame.karta5=4;MyFrame.boja5=4;}
		if (MyFrame.n5==44) {Karta5.card5=MyFrame.spade_5;MyFrame.karta5=5;MyFrame.boja5=4;}
		if (MyFrame.n5==45) {Karta5.card5=MyFrame.spade_6;MyFrame.karta5=6;MyFrame.boja5=4;}
		if (MyFrame.n5==46) {Karta5.card5=MyFrame.spade_7;MyFrame.karta5=7;MyFrame.boja5=4;}
		if (MyFrame.n5==47) {Karta5.card5=MyFrame.spade_8;MyFrame.karta5=8;MyFrame.boja5=4;}
		if (MyFrame.n5==48) {Karta5.card5=MyFrame.spade_9;MyFrame.karta5=9;MyFrame.boja5=4;}
		if (MyFrame.n5==49) {Karta5.card5=MyFrame.spade_10;MyFrame.karta5=10;MyFrame.boja5=4;}
		if (MyFrame.n5==50) {Karta5.card5=MyFrame.spade_jack;MyFrame.karta5=11;MyFrame.boja5=4;}
		if (MyFrame.n5==51) {Karta5.card5=MyFrame.spade_queen;MyFrame.karta5=12;MyFrame.boja5=4;}
		if (MyFrame.n5==52) {Karta5.card5=MyFrame.spade_king;MyFrame.karta5=13;MyFrame.boja5=4;}
	}
}
