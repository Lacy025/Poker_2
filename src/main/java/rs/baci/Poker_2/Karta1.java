package rs.baci.Poker_2;

import javax.swing.*;
import java.awt.Component;

public class Karta1 extends JLabel {
	public static Component card1 = new JLabel();
	Karta1() {
	if (MyFrame.n1==0) {Karta1.card1=MyFrame.joker;MyFrame.card_1=0;MyFrame.color_1=0;}
	if (MyFrame.n1==1) {Karta1.card1=MyFrame.heart_1;MyFrame.card_1=14;MyFrame.color_1=1;}
	if (MyFrame.n1==2) {Karta1.card1=MyFrame.heart_2;MyFrame.card_1=2;MyFrame.color_1=1;}
	if (MyFrame.n1==3) {Karta1.card1=MyFrame.heart_3;MyFrame.card_1=3;MyFrame.color_1=1;}
	if (MyFrame.n1==4) {Karta1.card1=MyFrame.heart_4;MyFrame.card_1=4;MyFrame.color_1=1;}
	if (MyFrame.n1==5) {Karta1.card1=MyFrame.heart_5;MyFrame.card_1=5;MyFrame.color_1=1;}
	if (MyFrame.n1==6) {Karta1.card1=MyFrame.heart_6;MyFrame.card_1=6;MyFrame.color_1=1;}
	if (MyFrame.n1==7) {Karta1.card1=MyFrame.heart_7;MyFrame.card_1=7;MyFrame.color_1=1;}
	if (MyFrame.n1==8) {Karta1.card1=MyFrame.heart_8;MyFrame.card_1=8;MyFrame.color_1=1;}
	if (MyFrame.n1==9) {Karta1.card1=MyFrame.heart_9;MyFrame.card_1=9;MyFrame.color_1=1;}
	if (MyFrame.n1==10) {Karta1.card1=MyFrame.heart_10;MyFrame.card_1=10;MyFrame.color_1=1;}
	if (MyFrame.n1==11) {Karta1.card1=MyFrame.heart_jack;MyFrame.card_1=11;MyFrame.color_1=1;}
	if (MyFrame.n1==12) {Karta1.card1=MyFrame.heart_queen;MyFrame.card_1=12;MyFrame.color_1=1;}
	if (MyFrame.n1==13) {Karta1.card1=MyFrame.heart_king;MyFrame.card_1=13;MyFrame.color_1=1;}
	if (MyFrame.n1==14) {Karta1.card1=MyFrame.club_1;MyFrame.card_1=14;MyFrame.color_1=2;}
	if (MyFrame.n1==15) {Karta1.card1=MyFrame.club_2;MyFrame.card_1=2;MyFrame.color_1=2;}
	if (MyFrame.n1==16) {Karta1.card1=MyFrame.club_3;MyFrame.card_1=3;MyFrame.color_1=2;}
	if (MyFrame.n1==17) {Karta1.card1=MyFrame.club_4;MyFrame.card_1=4;MyFrame.color_1=2;}
	if (MyFrame.n1==18) {Karta1.card1=MyFrame.club_5;MyFrame.card_1=5;MyFrame.color_1=2;}
	if (MyFrame.n1==19) {Karta1.card1=MyFrame.club_6;MyFrame.card_1=6;MyFrame.color_1=2;}
	if (MyFrame.n1==20) {Karta1.card1=MyFrame.club_7;MyFrame.card_1=7;MyFrame.color_1=2;}
	if (MyFrame.n1==21) {Karta1.card1=MyFrame.club_8;MyFrame.card_1=8;MyFrame.color_1=2;}
	if (MyFrame.n1==22) {Karta1.card1=MyFrame.club_9;MyFrame.card_1=9;MyFrame.color_1=2;}
	if (MyFrame.n1==23) {Karta1.card1=MyFrame.club_10;MyFrame.card_1=10;MyFrame.color_1=2;}
	if (MyFrame.n1==24) {Karta1.card1=MyFrame.club_jack;MyFrame.card_1=11;MyFrame.color_1=2;}
	if (MyFrame.n1==25) {Karta1.card1=MyFrame.club_queen;MyFrame.card_1=12;MyFrame.color_1=2;}
	if (MyFrame.n1==26) {Karta1.card1=MyFrame.club_king;MyFrame.card_1=13;MyFrame.color_1=2;}
	if (MyFrame.n1==27) {Karta1.card1=MyFrame.diamond_1;MyFrame.card_1=14;MyFrame.color_1=3;}
	if (MyFrame.n1==28) {Karta1.card1=MyFrame.diamond_2;MyFrame.card_1=2;MyFrame.color_1=3;}
	if (MyFrame.n1==29) {Karta1.card1=MyFrame.diamond_3;MyFrame.card_1=3;MyFrame.color_1=3;}
	if (MyFrame.n1==30) {Karta1.card1=MyFrame.diamond_4;MyFrame.card_1=4;MyFrame.color_1=3;}
	if (MyFrame.n1==31) {Karta1.card1=MyFrame.diamond_5;MyFrame.card_1=5;MyFrame.color_1=3;}
	if (MyFrame.n1==32) {Karta1.card1=MyFrame.diamond_6;MyFrame.card_1=6;MyFrame.color_1=3;}
	if (MyFrame.n1==33) {Karta1.card1=MyFrame.diamond_7;MyFrame.card_1=7;MyFrame.color_1=3;}
	if (MyFrame.n1==34) {Karta1.card1=MyFrame.diamond_8;MyFrame.card_1=8;MyFrame.color_1=3;}
	if (MyFrame.n1==35) {Karta1.card1=MyFrame.diamond_9;MyFrame.card_1=9;MyFrame.color_1=3;}
	if (MyFrame.n1==36) {Karta1.card1=MyFrame.diamond_10;MyFrame.card_1=10;MyFrame.color_1=3;}
	if (MyFrame.n1==37) {Karta1.card1=MyFrame.diamond_jack;MyFrame.card_1=11;MyFrame.color_1=3;}
	if (MyFrame.n1==38) {Karta1.card1=MyFrame.diamond_queen;MyFrame.card_1=12;MyFrame.color_1=3;}
	if (MyFrame.n1==39) {Karta1.card1=MyFrame.diamond_king;MyFrame.card_1=13;MyFrame.color_1=3;}
	if (MyFrame.n1==40) {Karta1.card1=MyFrame.spade_1;MyFrame.card_1=14;MyFrame.color_1=4;}
	if (MyFrame.n1==41) {Karta1.card1=MyFrame.spade_2;MyFrame.card_1=2;MyFrame.color_1=4;}
	if (MyFrame.n1==42) {Karta1.card1=MyFrame.spade_3;MyFrame.card_1=3;MyFrame.color_1=4;}
	if (MyFrame.n1==43) {Karta1.card1=MyFrame.spade_4;MyFrame.card_1=4;MyFrame.color_1=4;}
	if (MyFrame.n1==44) {Karta1.card1=MyFrame.spade_5;MyFrame.card_1=5;MyFrame.color_1=4;}
	if (MyFrame.n1==45) {Karta1.card1=MyFrame.spade_6;MyFrame.card_1=6;MyFrame.color_1=4;}
	if (MyFrame.n1==46) {Karta1.card1=MyFrame.spade_7;MyFrame.card_1=7;MyFrame.color_1=4;}
	if (MyFrame.n1==47) {Karta1.card1=MyFrame.spade_8;MyFrame.card_1=8;MyFrame.color_1=4;}
	if (MyFrame.n1==48) {Karta1.card1=MyFrame.spade_9;MyFrame.card_1=9;MyFrame.color_1=4;}
	if (MyFrame.n1==49) {Karta1.card1=MyFrame.spade_10;MyFrame.card_1=10;MyFrame.color_1=4;}
	if (MyFrame.n1==50) {Karta1.card1=MyFrame.spade_jack;MyFrame.card_1=11;MyFrame.color_1=4;}
	if (MyFrame.n1==51) {Karta1.card1=MyFrame.spade_queen;MyFrame.card_1=12;MyFrame.color_1=4;}
	if (MyFrame.n1==52) {Karta1.card1=MyFrame.spade_king;MyFrame.card_1=13;MyFrame.color_1=4;}
	}
}
