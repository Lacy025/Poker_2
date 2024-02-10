package rs.baci.Poker_2;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Dobitak {
	int dobitak;
	int dveiste;
	int cetiriboje;
	public static int DOBITAK;
	public static int stop1;
	public static int stop2;
	public static int stop3;
	public static int stop4;
	public static int stop5;
	public static int K1;
	public static int K2;
	public static int K3;
	public static int K4;
	public static int K5;
	public static int B1;
	public static int B2;
	public static int B3;
	public static int B4;
	public static int B5;
	Dobitak() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

		K1 = MyFrame.card_1;
		K2 = MyFrame.card_2;
		K3 = MyFrame.card_3;
		K4 = MyFrame.card_4;
		K5 = MyFrame.card_5;

		B1 = MyFrame.color_1;
		B2 = MyFrame.color_2;
		B3 = MyFrame.color_3;
		B4 = MyFrame.color_4;
		B5 = MyFrame.color_5;

		dveiste = 0;
		cetiriboje = 0;

		// FIVE OF A KIND

		if (((K1==K2)&&(K2==K3)&&(K3==K4)&&(K5==0)) ||
				((K1==K2)&&(K2==K3)&&(K4==0)&&(K3==K5)) ||
				((K1==K2)&&(K3==0)&&(K2==K4)&&(K4==K5)) ||
				((K1==K3)&&(K2==0)&&(K3==K4)&&(K4==K5)) ||
				((K1==0)&&(K2==K3)&&(K3==K4)&&(K4==K5))) {

			StopAllCards();
			dobitak++;
			new Fiveofakind();
		}

		// ROYAL FLUSH OR STREET


		if (dobitak == 0) {
			int ROYAL = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {ROYAL++;}
			if (K1==10||K2==10||K3==10||K4==10||K5==10) {ROYAL++;}
			if (K1==11||K2==11||K3==11||K4==11||K5==11) {ROYAL++;}
			if (K1==12||K2==12||K3==12||K4==12||K5==12) {ROYAL++;}
			if (K1==13||K2==13||K3==13||K4==13||K5==13) {ROYAL++;}
			if (K1==14||K2==14||K3==14||K4==14||K5==14) {ROYAL++;}
			if (ROYAL == 5) {
				Color_check_1();
			}
		}
		// STREET FLUSH OR STREET
		// 1-5

		if (dobitak == 0) {
			int STRFL1 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL1++;}
			if (K1==14||K2==14||K3==14||K4==14||K5==14) {STRFL1++;}
			if (K1==2||K2==2||K3==2||K4==2||K5==2) {STRFL1++;}
			if (K1==3||K2==3||K3==3||K4==3||K5==3) {STRFL1++;}
			if (K1==4||K2==4||K3==4||K4==4||K5==4) {STRFL1++;}
			if (K1==5||K2==5||K3==5||K4==5||K5==5) {STRFL1++;}
			if (STRFL1 == 5) {
				Color_check_2();
			}
		}

		// STREET FLUSH OR STREET
		// 2-6

		if (dobitak == 0) {
			int STRFL2 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL2++;}
			if (K1==2||K2==2||K3==2||K4==2||K5==2) {STRFL2++;}
			if (K1==3||K2==3||K3==3||K4==3||K5==3) {STRFL2++;}
			if (K1==4||K2==4||K3==4||K4==4||K5==4) {STRFL2++;}
			if (K1==5||K2==5||K3==5||K4==5||K5==5) {STRFL2++;}
			if (K1==6||K2==6||K3==6||K4==6||K5==6) {STRFL2++;}
			if (STRFL2 == 5) {
				Color_check_2();
			}
		}

		// STREET FLUSH OR STREET
		// 3-7

		if (dobitak == 0) {
			int STRFL3 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL3++;}
			if (K1==3||K2==3||K3==3||K4==3||K5==3) {STRFL3++;}
			if (K1==4||K2==4||K3==4||K4==4||K5==4) {STRFL3++;}
			if (K1==5||K2==5||K3==5||K4==5||K5==5) {STRFL3++;}
			if (K1==6||K2==6||K3==6||K4==6||K5==6) {STRFL3++;}
			if (K1==7||K2==7||K3==7||K4==7||K5==7) {STRFL3++;}
			if (STRFL3 == 5) {
				Color_check_2();
			}
		}

		// STREET FLUSH OR STREET
		// 4-8

		if (dobitak == 0) {
			int STRFL4 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL4++;}
			if (K1==4||K2==4||K3==4||K4==4||K5==4) {STRFL4++;}
			if (K1==5||K2==5||K3==5||K4==5||K5==5) {STRFL4++;}
			if (K1==6||K2==6||K3==6||K4==6||K5==6) {STRFL4++;}
			if (K1==7||K2==7||K3==7||K4==7||K5==7) {STRFL4++;}
			if (K1==8||K2==8||K3==8||K4==8||K5==8) {STRFL4++;}
			if (STRFL4 == 5) {
				Color_check_2();
			}
		}

		// STREET FLUSH OR STREET
		// 5-9

		if (dobitak == 0) {
			int STRFL5 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL5++;}
			if (K1==5||K2==5||K3==5||K4==5||K5==5) {STRFL5++;}
			if (K1==6||K2==6||K3==6||K4==6||K5==6) {STRFL5++;}
			if (K1==7||K2==7||K3==7||K4==7||K5==7) {STRFL5++;}
			if (K1==8||K2==8||K3==8||K4==8||K5==8) {STRFL5++;}
			if (K1==9||K2==9||K3==9||K4==9||K5==9) {STRFL5++;}
			if (STRFL5==5) {

				Color_check_2();
			}
		}

		// STREET FLUSH OR STREET
		// 6-10

		if (dobitak == 0) {
			int STRFL6 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL6++;}
			if (K1==6||K2==6||K3==6||K4==6||K5==6) {STRFL6++;}
			if (K1==7||K2==7||K3==7||K4==7||K5==7) {STRFL6++;}
			if (K1==8||K2==8||K3==8||K4==8||K5==8) {STRFL6++;}
			if (K1==9||K2==9||K3==9||K4==9||K5==9) {STRFL6++;}
			if (K1==10||K2==10||K3==10||K4==10||K5==10) {STRFL6++;}
			if (STRFL6 == 5) {
				Color_check_2();
			}
		}

		// STREET FLUSH OR STREET
		// 7-11

		if (dobitak == 0) {
			int STRFL7 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL7++;}
			if (K1==7||K2==7||K3==7||K4==7||K5==7) {STRFL7++;}
			if (K1==8||K2==8||K3==8||K4==8||K5==8) {STRFL7++;}
			if (K1==9||K2==9||K3==9||K4==9||K5==9) {STRFL7++;}
			if (K1==10||K2==10||K3==10||K4==10||K5==10) {STRFL7++;}
			if (K1==11||K2==11||K3==11||K4==11||K5==11) {STRFL7++;}
			if (STRFL7 == 5) {
				Color_check_2();
			}
		}

		// STREET FLUSH OR STREET
		// 8-12

		if (dobitak == 0) {
			int STRFL8 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL8++;}
			if (K1==8||K2==8||K3==8||K4==8||K5==8) {STRFL8++;}
			if (K1==9||K2==9||K3==9||K4==9||K5==9) {STRFL8++;}
			if (K1==10||K2==10||K3==10||K4==10||K5==10) {STRFL8++;}
			if (K1==11||K2==11||K3==11||K4==11||K5==11) {STRFL8++;}
			if (K1==12||K2==12||K3==12||K4==12||K5==12) {STRFL8++;}
			if (STRFL8 == 5) {
				Color_check_2();
			}
		}

		// STREET FLUSH OR STREET
		// 9-13

		if (dobitak == 0) {
			int STRFL9 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL9++;}
			if (K1==9||K2==9||K3==9||K4==9||K5==9) {STRFL9++;}
			if (K1==10||K2==10||K3==10||K4==10||K5==10) {STRFL9++;}
			if (K1==11||K2==11||K3==11||K4==11||K5==11) {STRFL9++;}
			if (K1==12||K2==12||K3==12||K4==12||K5==12) {STRFL9++;}
			if (K1==13||K2==13||K3==13||K4==13||K5==13) {STRFL9++;}
			if (STRFL9 == 5) {
				Color_check_2();
			}
		}

		// POKER

		if (dobitak == 0) {
			if (((K1==K2)&&(K2==K3)&&(K3==K4)) ||
					((K1==K2)&&(K2==K3)&&(K4==0)) ||
					((K1==K2)&&(K3==0)&&(K2==K4)) ||
					((K1==K3)&&(K2==0)&&(K3==K4)) ||
					((K1==0)&&(K2==K3)&&(K3==K4))) {
				stop1 = 1;stop2 = 1;stop3 = 1;stop4 = 1;stop5 = 0;
				dobitak++;
				new Poker();
			}
			if (((K1==K2)&&(K2==K3)&&(K3==K5)) ||
					((K1==K2)&&(K2==K3)&&(K5==0)) ||
					((K1==K2)&&(K3==0)&&(K2==K5)) ||
					((K1==K3)&&(K2==0)&&(K3==K5)) ||
					((K1==0)&&(K2==K3)&&(K3==K5))) {
				stop1 = 1;stop2 = 1;stop3 = 1;stop4 = 0;stop5 = 1;
				dobitak++;
				new Poker();
			}
			if (((K1==K2)&&(K2==K4)&&(K4==K5)) ||
					((K1==K2)&&(K2==K4)&&(K5==0)) ||
					((K1==K2)&&(K4==0)&&(K2==K5)) ||
					((K1==K4)&&(K2==0)&&(K4==K5)) ||
					((K1==0)&&(K2==K4)&&(K4==K5))) {
				stop1 = 1;stop2 = 1;stop3 = 0;stop4 = 1;stop5 = 1;
				dobitak++;
				new Poker();
			}
			if (((K1==K3)&&(K3==K4)&&(K4==K5)) ||
					((K1==K3)&&(K3==K4)&&(K5==0)) ||
					((K1==K3)&&(K4==0)&&(K3==K5)) ||
					((K1==K4)&&(K3==0)&&(K4==K5)) ||
					((K1==0)&&(K3==K4)&&(K4==K5))) {
				stop1 = 1;stop2 = 0;stop3 = 1;stop4 = 1;stop5 = 1;
				dobitak++;
				new Poker();
			}
			if (((K2==K3)&&(K3==K4)&&(K4==K5)) ||
					((K2==K3)&&(K3==K4)&&(K5==0)) ||
					((K2==K3)&&(K4==0)&&(K3==K5)) ||
					((K2==K4)&&(K3==0)&&(K4==K5)) ||
					((K2==0)&&(K3==K4)&&(K4==K5))) {
				stop1 = 0;stop2 = 1;stop3 = 1;stop4 = 1;stop5 = 1;
				dobitak++;
				new Poker();
			}
		}

		//FULL HOUSE

		if (dobitak==0) {

			if (((K1==K2)&&(K2==K3)&&(K4==K5)) ||
					((K1==K2)&&(K3==K4)&&(K4==K5)) ||
					((K1==K3)&&(K2==K4)&&(K4==K5)) ||
					((K1==K4)&&(K2==K3)&&(K3==K5)) ||
					((K1==K5)&&(K2==K3)&&(K3==K4)) ||
					((K1==K2)&&(K2==K4)&&(K3==K5)) ||
					((K1==K2)&&(K2==K5)&&(K3==K4)) ||
					((K1==K3)&&(K3==K4)&&(K2==K5)) ||
					((K1==K3)&&(K3==K5)&&(K2==K4)) ||
					((K1==K4)&&(K4==K5)&&(K2==K3)) ||
					((K1==K2)&&(K3==0)&&(K4==K5)) ||
					((K1==K2)&&(K4==0)&&(K3==K5)) ||
					((K1==K2)&&(K5==0)&&(K3==K4)) ||
					((K1==K3)&&(K2==0)&&(K4==K5)) ||
					((K1==K3)&&(K4==0)&&(K2==K5)) ||
					((K1==K3)&&(K5==0)&&(K2==K4)) ||
					((K1==K4)&&(K2==0)&&(K3==K5)) ||
					((K1==K4)&&(K3==0)&&(K2==K5)) ||
					((K1==K4)&&(K5==0)&&(K2==K3)) ||
					((K1==K5)&&(K2==0)&&(K3==K4)) ||
					((K1==K5)&&(K3==0)&&(K2==K4)) ||
					((K1==K5)&&(K4==0)&&(K2==K3)) ||
					((K1==0)&&(K2==K3)&&(K4==K5)) ||
					((K1==0)&&(K2==K4)&&(K3==K5)) ||
					((K1==0)&&(K2==K5)&&(K3==K4))) {

				StopAllCards();
				dobitak++;
				new Fullhouse();
			}
		}

		//FLUSH

		if (dobitak == 0) {
			if (((B1==B2)&&(B2==B3)&&(B3==B4)&&(B4==B5)) ||
					((B1==B2)&&(B2==B3)&&(B3==B4)&&(K5==0)) ||
					((B1==B2)&&(B2==B3)&&(K4==0)&&(B3==B5)) ||
					((B1==B2)&&(K3==0)&&(B2==B4)&&(B4==B5)) ||
					((B1==B3)&&(K2==0)&&(B3==B4)&&(B4==B5)) ||
					((K1==0)&&(B2==B3)&&(B3==B4)&&(B4==B5))) {

				StopAllCards();
				dobitak++;
				new Flush();
			}
		}

		//THREE OF A KIND

		if (dobitak == 0) {

			if (((K1==K2)&&(K2==K3))||((K1==K2)&&(K3==0))||((K1==K3)&&(K2==0))||((K2==K3)&&(K1==0))) {
				stop1 = 1;stop2 = 1;stop3 = 1;stop4 = 0;stop5 = 0;
				dobitak++;
				new Threeofakind();
			}

			if (((K1==K2)&&(K2==K4))||((K1==K2)&&(K4==0))||((K1==K4)&&(K2==0))||((K2==K4)&&(K1==0))) {
				stop1 = 1;stop2 = 1;stop3 = 0;stop4 = 1;stop5 = 0;
				dobitak++;
				new Threeofakind();
			}

			if (((K1==K2)&&(K2==K5))||((K1==K2)&&(K5==0))||((K1==K5)&&(K2==0))||((K2==K5)&&(K1==0))) {
				stop1 = 1;stop2 = 1;stop3 = 0;stop4 = 0;stop5 = 1;
				dobitak++;
				new Threeofakind();
			}

			if (((K1==K3)&&(K3==K4))||((K1==K3)&&(K4==0))||((K1==K4)&&(K3==0))||((K3==K4)&&(K1==0))) {
				stop1 = 1;stop2 = 0;stop3 = 1;stop4 = 1;stop5 = 0;
				dobitak++;
				new Threeofakind();
			}

			if (((K1==K3)&&(K3==K5))||((K1==K3)&&(K5==0))||((K1==K5)&&(K3==0))||((K3==K5)&&(K1==0))) {
				stop1 = 1;stop2 = 0;stop3 = 1;stop4 = 0;stop5 = 1;
				dobitak++;
				new Threeofakind();
			}

			if (((K1==K4)&&(K4==K5))||((K1==K4)&&(K5==0))||((K1==K5)&&(K4==0))||((K4==K5)&&(K1==0))) {
				stop1 = 1;stop2 = 0;stop3 = 0;stop4 = 1;stop5 = 1;
				dobitak++;
				new Threeofakind();
			}

			if (((K2==K3)&&(K3==K4))||((K2==K3)&&(K4==0))||((K2==K4)&&(K3==0))||((K3==K4)&&(K2==0))) {
				stop1 = 0;stop2 = 1;stop3 = 1;stop4 = 1;stop5 = 0;
				dobitak++;
				new Threeofakind();
			}

			if (((K2==K3)&&(K3==K5))||((K2==K3)&&(K5==0))||((K2==K5)&&(K3==0))||((K3==K5)&&(K2==0))) {
				stop1 = 0;stop2 = 1;stop3 = 1;stop4 = 0;stop5 = 1;
				dobitak++;
				new Threeofakind();
			}

			if (((K2==K4)&&(K4==K5))||((K2==K4)&&(K5==0))||((K2==K5)&&(K4==0))||((K4==K5)&&(K2==0))) {
				stop1 = 0;stop2 = 1;stop3 = 0;stop4 = 1;stop5 = 1;
				dobitak++;
				new Threeofakind();
			}

			if (((K3==K4)&&(K4==K5))||((K3==K4)&&(K5==0))||((K3==K5)&&(K4==0))||((K4==K5)&&(K3==0))) {
				stop1 = 0;stop2 = 0;stop3 = 1;stop4 = 1;stop5 = 1;
				dobitak++;
				new Threeofakind();
			}
		}

		//2 PAIRS

		if (dobitak == 0) {

			if (((K1==K2)&&(K3==K4))||((K1==K3)&&(K2==K4))||((K1==K4)&&(K2==K3))) {
				stop1 = 1;stop2 = 1;stop3 = 1;stop4 = 1;stop5 = 0;
				dobitak++;
				new Twopairs();
			}

			if (((K1==K2)&&(K3==K5))||((K1==K3)&&(K2==K5))||((K1==K5)&&(K2==K3))) {
				stop1 = 1;stop2 = 1;stop3 = 1;stop4 = 0;stop5 = 1;
				dobitak++;
				new Twopairs();
			}

			if (((K1==K2)&&(K4==K5))||((K1==K5)&&(K2==K4))||((K1==K4)&&(K2==K5))) {
				stop1 = 1;stop2 = 1;stop3 = 0;stop4 = 1;stop5 = 1;
				dobitak++;
				new Twopairs();
			}

			if (((K1==K3)&&(K4==K5))||((K1==K5)&&(K3==K4))||((K1==K4)&&(K3==K5))) {
				stop1 = 1;stop2 = 0;stop3 = 1;stop4 = 1;stop5 = 1;
				dobitak++;
				new Twopairs();
			}

			if (((K2==K3)&&(K4==K5))||((K3==K5)&&(K2==K4))||((K3==K4)&&(K2==K5))) {
				stop1 = 0;stop2 = 1;stop3 = 1;stop4 = 1;stop5 = 1;
				dobitak++;
				new Twopairs();
			}
		}

		//HIGH PAIR

		if (dobitak == 0) {
			if (K1 == K2) {
				stop1 = 1;stop2 = 1;stop3 = 0;stop4 = 0;stop5 = 0;
				if (K1 > 10) {
					dobitak++;
					new Highpair();
				}
				else {
					dveiste = 1;
					new Hold();
				}
			}
			if (K1 == K3) {
				stop1 = 1;stop2 = 0;stop3 = 1;stop4 = 0;stop5 = 0;
				if (K1 > 10) {
					dobitak++;
					new Highpair();
				}
				else {
					dveiste = 1;
					new Hold();
				}
			}
			if (K1==K4) {
				stop1 = 1;stop2 = 0;stop3 = 0;stop4 = 1;stop5 = 0;
				if (K1 > 10) {
					dobitak++;
					new Highpair();
				}
				else {
					dveiste = 1;
					new Hold();
				}
			}
			if (K1 == K5) {
				stop1 = 1;stop2 = 0;stop3 = 0;stop4 = 0;stop5 = 1;
				if (K1 > 10) {
					dobitak++;
					new Highpair();
				}
				else {
					dveiste = 1;
					new Hold();
				}
			}
			if (K2 == K3) {
				stop1 = 0;stop2 = 1;stop3 = 1;stop4 = 0;stop5 = 0;
				if (K2 > 10) {
					dobitak++;
					new Highpair();
				}
				else {
					dveiste = 1;
					new Hold();
				}
			}
			if (K2 == K4) {
				stop1 = 0;stop2 = 1;stop3 = 0;stop4 = 1;stop5 = 0;
				if (K2 > 10) {
					dobitak++;
					new Highpair();
				}
				else {
					dveiste = 1;
					new Hold();
				}
			}
			if (K2 == K5) {
				stop1 = 0;stop2 = 1;stop3 = 0;stop4 = 0;stop5 = 1;
				if (K2 > 10) {
					dobitak++;
					new Highpair();
				}
				else {
					dveiste = 1;
					new Hold();
				}
			}
			if (K3 == K4) {
				stop1 = 0;stop2 = 0;stop3 = 1;stop4 = 1;stop5 = 0;
				if (K3 > 10) {
					dobitak++;
					new Highpair();
				}
				else {
					dveiste = 1;
					new Hold();
				}
			}
			if (K3 == K5) {
				stop1 = 0;stop2 = 0;stop3 = 1;stop4 = 0;stop5 = 1;
				if (K3 > 10) {
					dobitak++;
					new Highpair();
				}
				else {
					dveiste = 1;
					new Hold();
				}
			}
			if (K4 == K5) {
				stop1 = 0;stop2 = 0;stop3 = 0;stop4 = 1;stop5 = 1;
				if (K4 > 10) {
					dobitak++;
					new Highpair();
				}
				else {
					dveiste = 1;
					new Hold();
				}
			}
		}

		//HIGH PAIR WITH JOKER

		if (dobitak == 0) {
			if (K1 == 0) {
				stop1 = 1;
				if (K2 > 10) {
					stop2 = 1;stop3 = 0;stop4 = 0;stop5 = 0;
					dobitak++;
					new Highpair();
				}
				if (dobitak == 0) {
					if (K3 > 10) {
						stop2 = 0;stop3 = 1;stop4 = 0;stop5 = 0;
						dobitak++;
						new Highpair();
					}
				}
				if (dobitak == 0) {
					if (K4 > 10) {
						stop2 = 0;stop3 = 0;stop4 = 1;stop5 = 0;
						dobitak++;
						new Highpair();
					}
				}
				if (dobitak == 0) {
					if (K5 > 10) {
						stop2 = 0;stop3 = 0;stop4 = 0;stop5 = 1;
						dobitak++;
						new Highpair();
					}
				}
			}
		}
		if (dobitak == 0) {
			if (K2 == 0) {
				stop2 = 1;
				if (K1 > 10) {
					stop1 = 1;stop3 = 0;stop4 = 0;stop5 = 0;
					dobitak++;
					new Highpair();
				}
				if (dobitak == 0) {
					if (K3 > 10) {
						stop1 = 0;stop3 = 1;stop4 = 0;stop5 = 0;
						dobitak++;
						new Highpair();
					}
				}
				if (dobitak == 0) {
					if (K4 > 10) {
						stop1 = 0;stop3 = 0;stop4 = 1;stop5 = 0;
						dobitak++;
						new Highpair();
					}
				}
				if (dobitak == 0) {
					if (K5 > 10) {
						stop1 = 0;stop3 = 0;stop4 = 0;stop5 = 1;
						dobitak++;
						new Highpair();
					}
				}
			}
		}
		if (dobitak == 0) {
			if (K3 == 0) {
				stop3 = 1;
				if (K1 > 10) {
					stop1 = 1;stop2 = 0;stop4 = 0;stop5 = 0;
					dobitak++;
					new Highpair();
				}
				if (dobitak == 0) {
					if (K2 > 10) {
						stop1 = 0;stop2 = 1;stop4 = 0;stop5 = 0;
						dobitak++;
						new Highpair();
					}
				}
				if (dobitak == 0) {
					if (K4 > 10) {
						stop1 = 0;stop2 = 0;stop4 = 1;stop5 = 0;
						dobitak++;
						new Highpair();
					}
				}
				if (dobitak == 0) {
					if (K5 > 10) {
						stop2 = 1;stop2 = 0;stop4 = 0;stop5 = 1;
						dobitak++;
						new Highpair();
					}
				}
			}
		}
		if (dobitak == 0) {
			if (K4 == 0) {
				stop4 = 1;
				if (K1 > 10) {
					stop1 = 1;stop2 = 0;stop3 = 0;stop5 = 0;
					dobitak++;
					new Highpair();
				}
				if (dobitak == 0) {
					if (K2 > 10) {
						stop1 = 0;stop2 = 1;stop3 = 0;stop5 = 0;
						dobitak++;
						new Highpair();
					}
				}
				if (dobitak == 0) {
					if (K3 > 10) {
						stop1 = 0;stop2 = 0;stop3 = 1;stop5 = 0;
						dobitak++;
						new Highpair();
					}
				}
				if (dobitak == 0) {
					if (K5 > 10) {
						stop1 = 0;stop2 = 0;stop3 = 0;stop5 = 1;
						dobitak++;
						new Highpair();
					}
				}
			}
		}
		if (dobitak == 0) {
			if (K5 == 0) {
				stop5 = 1;
				if (K1 > 10) {
					stop1 = 1;stop2 = 0;stop3 = 0;stop4 = 0;
					dobitak++;
					new Highpair();
				}
				if (dobitak == 0) {
					if (K2 > 10) {
						stop1 = 0;stop2 = 1;stop3 = 0;stop4 = 0;
						dobitak++;
						new Highpair();
					}
				}
				if (dobitak == 0) {
					if (K3 > 10) {
						stop1 = 0;stop2 = 0;stop3 = 1;stop4 = 0;
						dobitak++;
						new Highpair();
					}
				}
				if (dobitak == 0) {
					if (K4 > 10) {
						stop1 = 0;stop2 = 0;stop3 = 0;stop4 = 1;
						dobitak++;
						new Highpair();
					}
				}
			}
		}

		// 4 BOJE

		if (dobitak == 0 && dveiste == 0) {
			if (((B1==B2)&&(B2==B3)&&(B3==B4)) ||
					((B1==B2)&&(B2==B3)&&(B4==0)) ||
					((B1==B2)&&(B3==0)&&(B2==B4)) ||
					((B1==B3)&&(B2==0)&&(B3==B4)) ||
					((B1==0)&&(B2==B3)&&(B3==B4))) {
				stop1 = 1;stop2 = 1;stop3 = 1;stop4 = 1;stop5 = 0;
				cetiriboje++;
				new Hold();
			}
			if (((B1==B2)&&(B2==B3)&&(B3==B5)) ||
					((B1==B2)&&(B2==B3)&&(B5==0)) ||
					((B1==B2)&&(B3==0)&&(B2==B5)) ||
					((B1==B3)&&(B2==0)&&(B3==B5)) ||
					((B1==0)&&(B2==B3)&&(B3==B5))) {
				stop1 = 1;stop2 = 1;stop3 = 1;stop4 = 0;stop5 = 1;
				cetiriboje++;
				new Hold();

			}
			if (((B1==B2)&&(B2==B4)&&(B4==B5)) ||
					((B1==B2)&&(B2==B4)&&(B5==0)) ||
					((B1==B2)&&(B4==0)&&(B2==B5)) ||
					((B1==B4)&&(B2==0)&&(B4==B5)) ||
					((B1==0)&&(B2==B4)&&(B4==B5))) {
				stop1 = 1;stop2 = 1;stop3 = 0;stop4 = 1;stop5 = 1;
				cetiriboje++;
				new Hold();

			}
			if (((B1==B3)&&(B3==B4)&&(B4==B5)) ||
					((B1==B3)&&(B3==B4)&&(B5==0)) ||
					((B1==B3)&&(B4==0)&&(B3==B5)) ||
					((B1==B4)&&(B3==0)&&(B4==B5)) ||
					((B1==0)&&(B3==B4)&&(B4==B5))) {
				stop1 = 1;stop2 = 0;stop3 = 1;stop4 = 1;stop5 = 1;
				cetiriboje++;
				new Hold();

			}
			if (((B2==B3)&&(B3==B4)&&(B4==B5)) ||
					((B2==B3)&&(B3==B4)&&(B5==0)) ||
					((B2==B3)&&(B4==0)&&(B3==B5)) ||
					((B2==B4)&&(B3==0)&&(B4==B5)) ||
					((B2==0)&&(B3==B4)&&(B4==B5))) {
				stop1 = 0;stop2 = 1;stop3 = 1;stop4 = 1;stop5 = 1;
				cetiriboje++;
				new Hold();
			}

			//JOKER

			if (cetiriboje == 0 && K1 == 0) {
				stop1 = 1;stop2 = 0;stop3 = 0;stop4 = 0;stop5 = 0;
				new Hold();
			}
			if (cetiriboje == 0 && K2 == 0) {
				stop1 = 0;stop2 = 1;stop3 = 0;stop4 = 0;stop5 = 0;
				new Hold();
			}
			if (cetiriboje == 0 && K3 == 0) {
				stop1 = 0;stop2 = 0;stop3 = 1;stop4 = 0;stop5 = 0;
				new Hold();
			}
			if (cetiriboje == 0 && K4 == 0) {
				stop1 = 0;stop2 = 0;stop3 = 0;stop4 = 1;stop5 = 0;
				new Hold();
			}
			if (cetiriboje == 0 && K5 == 0) {
				stop1 = 0;stop2 = 0;stop3 = 0;stop4 = 0;stop5 = 1;
				new Hold();
			}
		}
		DOBITAK=dobitak;
	}
	void Color_check_1() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {

		if (((B1==B2)&&(B2==B3)&&(B3==B4)&&(K5==0)) ||
				((B1==B2)&&(B2==B3)&&(K4==0)&&(B3==B5)) ||
				((B1==B2)&&(K3==0)&&(B2==B4)&&(B4==B5)) ||
				((B1==B3)&&(K2==0)&&(B3==B4)&&(B4==B5)) ||
				((K1==0)&&(B2==B3)&&(B3==B4)&&(B4==B5)) ||
				(B1==B2)&&(B2==B3)&&(B3==B4)&&(B4==B5)) {

			StopAllCards();
			dobitak++;
			new Royalflush();
		}
		else {
			StopAllCards();
			dobitak++;
			new Street();
		}
	}
	void Color_check_2() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
		if (((B1==B2)&&(B2==B3)&&(B3==B4)&&(K5==0)) ||
				((B1==B2)&&(B2==B3)&&(K4==0)&&(B3==B5)) ||
				((B1==B2)&&(K3==0)&&(B2==B4)&&(B4==B5)) ||
				((B1==B3)&&(K2==0)&&(B3==B4)&&(B4==B5)) ||
				((K1==0)&&(B2==B3)&&(B3==B4)&&(B4==B5)) ||
				(B1==B2)&&(B2==B3)&&(B3==B4)&&(B4==B5)) {

			StopAllCards();
			dobitak++;
			new Streetflush();
		}
		else {
			StopAllCards();
			dobitak++;
			new Street();
		}
	}
	void StopAllCards() {
		stop1 = 1;stop2 = 1;stop3 = 1;stop4 = 1;stop5 = 1;
	}
}
