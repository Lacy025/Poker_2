package rs.baci.Poker_2;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Win {
	int win;
	int two;
	int four;
	public static int winner;
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
	Win() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

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

		two = 0;
		four = 0;

		// FIVE OF A KIND

		if (((K1==K2)&&(K2==K3)&&(K3==K4)&&(K5==0)) ||
				((K1==K2)&&(K2==K3)&&(K4==0)&&(K3==K5)) ||
				((K1==K2)&&(K3==0)&&(K2==K4)&&(K4==K5)) ||
				((K1==K3)&&(K2==0)&&(K3==K4)&&(K4==K5)) ||
				((K1==0)&&(K2==K3)&&(K3==K4)&&(K4==K5))) {

			StopAllCards();
			win++;
			new Five_of_a_kind();
		}

		// ROYAL FLUSH OR STREET


		if (win == 0) {
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

		if (win == 0) {
			int street_1 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {street_1++;}
			if (K1==14||K2==14||K3==14||K4==14||K5==14) {street_1++;}
			if (K1==2||K2==2||K3==2||K4==2||K5==2) {street_1++;}
			if (K1==3||K2==3||K3==3||K4==3||K5==3) {street_1++;}
			if (K1==4||K2==4||K3==4||K4==4||K5==4) {street_1++;}
			if (K1==5||K2==5||K3==5||K4==5||K5==5) {street_1++;}
			if (street_1 == 5) {
				Color_check_2();
			}
		}

		// STREET FLUSH OR STREET
		// 2-6

		if (win == 0) {
			int street_2 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {street_2++;}
			if (K1==2||K2==2||K3==2||K4==2||K5==2) {street_2++;}
			if (K1==3||K2==3||K3==3||K4==3||K5==3) {street_2++;}
			if (K1==4||K2==4||K3==4||K4==4||K5==4) {street_2++;}
			if (K1==5||K2==5||K3==5||K4==5||K5==5) {street_2++;}
			if (K1==6||K2==6||K3==6||K4==6||K5==6) {street_2++;}
			if (street_2 == 5) {
				Color_check_2();
			}
		}

		// STREET FLUSH OR STREET
		// 3-7

		if (win == 0) {
			int street_3 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {street_3++;}
			if (K1==3||K2==3||K3==3||K4==3||K5==3) {street_3++;}
			if (K1==4||K2==4||K3==4||K4==4||K5==4) {street_3++;}
			if (K1==5||K2==5||K3==5||K4==5||K5==5) {street_3++;}
			if (K1==6||K2==6||K3==6||K4==6||K5==6) {street_3++;}
			if (K1==7||K2==7||K3==7||K4==7||K5==7) {street_3++;}
			if (street_3 == 5) {
				Color_check_2();
			}
		}

		// STREET FLUSH OR STREET
		// 4-8

		if (win == 0) {
			int street_4 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {street_4++;}
			if (K1==4||K2==4||K3==4||K4==4||K5==4) {street_4++;}
			if (K1==5||K2==5||K3==5||K4==5||K5==5) {street_4++;}
			if (K1==6||K2==6||K3==6||K4==6||K5==6) {street_4++;}
			if (K1==7||K2==7||K3==7||K4==7||K5==7) {street_4++;}
			if (K1==8||K2==8||K3==8||K4==8||K5==8) {street_4++;}
			if (street_4 == 5) {
				Color_check_2();
			}
		}

		// STREET FLUSH OR STREET
		// 5-9

		if (win == 0) {
			int street_5 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {street_5++;}
			if (K1==5||K2==5||K3==5||K4==5||K5==5) {street_5++;}
			if (K1==6||K2==6||K3==6||K4==6||K5==6) {street_5++;}
			if (K1==7||K2==7||K3==7||K4==7||K5==7) {street_5++;}
			if (K1==8||K2==8||K3==8||K4==8||K5==8) {street_5++;}
			if (K1==9||K2==9||K3==9||K4==9||K5==9) {street_5++;}
			if (street_5==5) {

				Color_check_2();
			}
		}

		// STREET FLUSH OR STREET
		// 6-10

		if (win == 0) {
			int street_6 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {street_6++;}
			if (K1==6||K2==6||K3==6||K4==6||K5==6) {street_6++;}
			if (K1==7||K2==7||K3==7||K4==7||K5==7) {street_6++;}
			if (K1==8||K2==8||K3==8||K4==8||K5==8) {street_6++;}
			if (K1==9||K2==9||K3==9||K4==9||K5==9) {street_6++;}
			if (K1==10||K2==10||K3==10||K4==10||K5==10) {street_6++;}
			if (street_6 == 5) {
				Color_check_2();
			}
		}

		// STREET FLUSH OR STREET
		// 7-11

		if (win == 0) {
			int street_7 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {street_7++;}
			if (K1==7||K2==7||K3==7||K4==7||K5==7) {street_7++;}
			if (K1==8||K2==8||K3==8||K4==8||K5==8) {street_7++;}
			if (K1==9||K2==9||K3==9||K4==9||K5==9) {street_7++;}
			if (K1==10||K2==10||K3==10||K4==10||K5==10) {street_7++;}
			if (K1==11||K2==11||K3==11||K4==11||K5==11) {street_7++;}
			if (street_7 == 5) {
				Color_check_2();
			}
		}

		// STREET FLUSH OR STREET
		// 8-12

		if (win == 0) {
			int street_8 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {street_8++;}
			if (K1==8||K2==8||K3==8||K4==8||K5==8) {street_8++;}
			if (K1==9||K2==9||K3==9||K4==9||K5==9) {street_8++;}
			if (K1==10||K2==10||K3==10||K4==10||K5==10) {street_8++;}
			if (K1==11||K2==11||K3==11||K4==11||K5==11) {street_8++;}
			if (K1==12||K2==12||K3==12||K4==12||K5==12) {street_8++;}
			if (street_8 == 5) {
				Color_check_2();
			}
		}

		// STREET FLUSH OR STREET
		// 9-13

		if (win == 0) {
			int street_9 = 0;
			if (K1==0||K2==0||K3==0||K4==0||K5==0) {street_9++;}
			if (K1==9||K2==9||K3==9||K4==9||K5==9) {street_9++;}
			if (K1==10||K2==10||K3==10||K4==10||K5==10) {street_9++;}
			if (K1==11||K2==11||K3==11||K4==11||K5==11) {street_9++;}
			if (K1==12||K2==12||K3==12||K4==12||K5==12) {street_9++;}
			if (K1==13||K2==13||K3==13||K4==13||K5==13) {street_9++;}
			if (street_9 == 5) {
				Color_check_2();
			}
		}

		// POKER

		if (win == 0) {
			if (((K1==K2)&&(K2==K3)&&(K3==K4)) ||
					((K1==K2)&&(K2==K3)&&(K4==0)) ||
					((K1==K2)&&(K3==0)&&(K2==K4)) ||
					((K1==K3)&&(K2==0)&&(K3==K4)) ||
					((K1==0)&&(K2==K3)&&(K3==K4))) {
				stop1 = 1;stop2 = 1;stop3 = 1;stop4 = 1;stop5 = 0;
				win++;
				new Poker();
			}
			if (((K1==K2)&&(K2==K3)&&(K3==K5)) ||
					((K1==K2)&&(K2==K3)&&(K5==0)) ||
					((K1==K2)&&(K3==0)&&(K2==K5)) ||
					((K1==K3)&&(K2==0)&&(K3==K5)) ||
					((K1==0)&&(K2==K3)&&(K3==K5))) {
				stop1 = 1;stop2 = 1;stop3 = 1;stop4 = 0;stop5 = 1;
				win++;
				new Poker();
			}
			if (((K1==K2)&&(K2==K4)&&(K4==K5)) ||
					((K1==K2)&&(K2==K4)&&(K5==0)) ||
					((K1==K2)&&(K4==0)&&(K2==K5)) ||
					((K1==K4)&&(K2==0)&&(K4==K5)) ||
					((K1==0)&&(K2==K4)&&(K4==K5))) {
				stop1 = 1;stop2 = 1;stop3 = 0;stop4 = 1;stop5 = 1;
				win++;
				new Poker();
			}
			if (((K1==K3)&&(K3==K4)&&(K4==K5)) ||
					((K1==K3)&&(K3==K4)&&(K5==0)) ||
					((K1==K3)&&(K4==0)&&(K3==K5)) ||
					((K1==K4)&&(K3==0)&&(K4==K5)) ||
					((K1==0)&&(K3==K4)&&(K4==K5))) {
				stop1 = 1;stop2 = 0;stop3 = 1;stop4 = 1;stop5 = 1;
				win++;
				new Poker();
			}
			if (((K2==K3)&&(K3==K4)&&(K4==K5)) ||
					((K2==K3)&&(K3==K4)&&(K5==0)) ||
					((K2==K3)&&(K4==0)&&(K3==K5)) ||
					((K2==K4)&&(K3==0)&&(K4==K5)) ||
					((K2==0)&&(K3==K4)&&(K4==K5))) {
				stop1 = 0;stop2 = 1;stop3 = 1;stop4 = 1;stop5 = 1;
				win++;
				new Poker();
			}
		}

		//FULL HOUSE

		if (win==0) {

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
				win++;
				new Full_house();
			}
		}

		//FLUSH

		if (win == 0) {
			if (((B1==B2)&&(B2==B3)&&(B3==B4)&&(B4==B5)) ||
					((B1==B2)&&(B2==B3)&&(B3==B4)&&(K5==0)) ||
					((B1==B2)&&(B2==B3)&&(K4==0)&&(B3==B5)) ||
					((B1==B2)&&(K3==0)&&(B2==B4)&&(B4==B5)) ||
					((B1==B3)&&(K2==0)&&(B3==B4)&&(B4==B5)) ||
					((K1==0)&&(B2==B3)&&(B3==B4)&&(B4==B5))) {

				StopAllCards();
				win++;
				new Flush();
			}
		}

		//THREE OF A KIND

		if (win == 0) {

			if (((K1==K2)&&(K2==K3))||((K1==K2)&&(K3==0))||((K1==K3)&&(K2==0))||((K2==K3)&&(K1==0))) {
				stop1 = 1;stop2 = 1;stop3 = 1;stop4 = 0;stop5 = 0;
				win++;
				new Threeofakind();
			}

			if (((K1==K2)&&(K2==K4))||((K1==K2)&&(K4==0))||((K1==K4)&&(K2==0))||((K2==K4)&&(K1==0))) {
				stop1 = 1;stop2 = 1;stop3 = 0;stop4 = 1;stop5 = 0;
				win++;
				new Threeofakind();
			}

			if (((K1==K2)&&(K2==K5))||((K1==K2)&&(K5==0))||((K1==K5)&&(K2==0))||((K2==K5)&&(K1==0))) {
				stop1 = 1;stop2 = 1;stop3 = 0;stop4 = 0;stop5 = 1;
				win++;
				new Threeofakind();
			}

			if (((K1==K3)&&(K3==K4))||((K1==K3)&&(K4==0))||((K1==K4)&&(K3==0))||((K3==K4)&&(K1==0))) {
				stop1 = 1;stop2 = 0;stop3 = 1;stop4 = 1;stop5 = 0;
				win++;
				new Threeofakind();
			}

			if (((K1==K3)&&(K3==K5))||((K1==K3)&&(K5==0))||((K1==K5)&&(K3==0))||((K3==K5)&&(K1==0))) {
				stop1 = 1;stop2 = 0;stop3 = 1;stop4 = 0;stop5 = 1;
				win++;
				new Threeofakind();
			}

			if (((K1==K4)&&(K4==K5))||((K1==K4)&&(K5==0))||((K1==K5)&&(K4==0))||((K4==K5)&&(K1==0))) {
				stop1 = 1;stop2 = 0;stop3 = 0;stop4 = 1;stop5 = 1;
				win++;
				new Threeofakind();
			}

			if (((K2==K3)&&(K3==K4))||((K2==K3)&&(K4==0))||((K2==K4)&&(K3==0))||((K3==K4)&&(K2==0))) {
				stop1 = 0;stop2 = 1;stop3 = 1;stop4 = 1;stop5 = 0;
				win++;
				new Threeofakind();
			}

			if (((K2==K3)&&(K3==K5))||((K2==K3)&&(K5==0))||((K2==K5)&&(K3==0))||((K3==K5)&&(K2==0))) {
				stop1 = 0;stop2 = 1;stop3 = 1;stop4 = 0;stop5 = 1;
				win++;
				new Threeofakind();
			}

			if (((K2==K4)&&(K4==K5))||((K2==K4)&&(K5==0))||((K2==K5)&&(K4==0))||((K4==K5)&&(K2==0))) {
				stop1 = 0;stop2 = 1;stop3 = 0;stop4 = 1;stop5 = 1;
				win++;
				new Threeofakind();
			}

			if (((K3==K4)&&(K4==K5))||((K3==K4)&&(K5==0))||((K3==K5)&&(K4==0))||((K4==K5)&&(K3==0))) {
				stop1 = 0;stop2 = 0;stop3 = 1;stop4 = 1;stop5 = 1;
				win++;
				new Threeofakind();
			}
		}

		//2 PAIRS

		if (win == 0) {

			if (((K1==K2)&&(K3==K4))||((K1==K3)&&(K2==K4))||((K1==K4)&&(K2==K3))) {
				stop1 = 1;stop2 = 1;stop3 = 1;stop4 = 1;stop5 = 0;
				win++;
				new Twopairs();
			}

			if (((K1==K2)&&(K3==K5))||((K1==K3)&&(K2==K5))||((K1==K5)&&(K2==K3))) {
				stop1 = 1;stop2 = 1;stop3 = 1;stop4 = 0;stop5 = 1;
				win++;
				new Twopairs();
			}

			if (((K1==K2)&&(K4==K5))||((K1==K5)&&(K2==K4))||((K1==K4)&&(K2==K5))) {
				stop1 = 1;stop2 = 1;stop3 = 0;stop4 = 1;stop5 = 1;
				win++;
				new Twopairs();
			}

			if (((K1==K3)&&(K4==K5))||((K1==K5)&&(K3==K4))||((K1==K4)&&(K3==K5))) {
				stop1 = 1;stop2 = 0;stop3 = 1;stop4 = 1;stop5 = 1;
				win++;
				new Twopairs();
			}

			if (((K2==K3)&&(K4==K5))||((K3==K5)&&(K2==K4))||((K3==K4)&&(K2==K5))) {
				stop1 = 0;stop2 = 1;stop3 = 1;stop4 = 1;stop5 = 1;
				win++;
				new Twopairs();
			}
		}

		//HIGH PAIR

		if (win == 0) {
			if (K1 == K2) {
				stop1 = 1;stop2 = 1;stop3 = 0;stop4 = 0;stop5 = 0;
				if (K1 > 10) {
					win++;
					new High_pair();
				}
				else {
					two = 1;
					new Hold();
				}
			}
			if (K1 == K3) {
				stop1 = 1;stop2 = 0;stop3 = 1;stop4 = 0;stop5 = 0;
				if (K1 > 10) {
					win++;
					new High_pair();
				}
				else {
					two = 1;
					new Hold();
				}
			}
			if (K1==K4) {
				stop1 = 1;stop2 = 0;stop3 = 0;stop4 = 1;stop5 = 0;
				if (K1 > 10) {
					win++;
					new High_pair();
				}
				else {
					two = 1;
					new Hold();
				}
			}
			if (K1 == K5) {
				stop1 = 1;stop2 = 0;stop3 = 0;stop4 = 0;stop5 = 1;
				if (K1 > 10) {
					win++;
					new High_pair();
				}
				else {
					two = 1;
					new Hold();
				}
			}
			if (K2 == K3) {
				stop1 = 0;stop2 = 1;stop3 = 1;stop4 = 0;stop5 = 0;
				if (K2 > 10) {
					win++;
					new High_pair();
				}
				else {
					two = 1;
					new Hold();
				}
			}
			if (K2 == K4) {
				stop1 = 0;stop2 = 1;stop3 = 0;stop4 = 1;stop5 = 0;
				if (K2 > 10) {
					win++;
					new High_pair();
				}
				else {
					two = 1;
					new Hold();
				}
			}
			if (K2 == K5) {
				stop1 = 0;stop2 = 1;stop3 = 0;stop4 = 0;stop5 = 1;
				if (K2 > 10) {
					win++;
					new High_pair();
				}
				else {
					two = 1;
					new Hold();
				}
			}
			if (K3 == K4) {
				stop1 = 0;stop2 = 0;stop3 = 1;stop4 = 1;stop5 = 0;
				if (K3 > 10) {
					win++;
					new High_pair();
				}
				else {
					two = 1;
					new Hold();
				}
			}
			if (K3 == K5) {
				stop1 = 0;stop2 = 0;stop3 = 1;stop4 = 0;stop5 = 1;
				if (K3 > 10) {
					win++;
					new High_pair();
				}
				else {
					two = 1;
					new Hold();
				}
			}
			if (K4 == K5) {
				stop1 = 0;stop2 = 0;stop3 = 0;stop4 = 1;stop5 = 1;
				if (K4 > 10) {
					win++;
					new High_pair();
				}
				else {
					two = 1;
					new Hold();
				}
			}
		}

		//HIGH PAIR WITH JOKER

		if (win == 0) {
			if (K1 == 0) {
				stop1 = 1;
				if (K2 > 10) {
					stop2 = 1;stop3 = 0;stop4 = 0;stop5 = 0;
					win++;
					new High_pair();
				}
				if (win == 0) {
					if (K3 > 10) {
						stop2 = 0;stop3 = 1;stop4 = 0;stop5 = 0;
						win++;
						new High_pair();
					}
				}
				if (win == 0) {
					if (K4 > 10) {
						stop2 = 0;stop3 = 0;stop4 = 1;stop5 = 0;
						win++;
						new High_pair();
					}
				}
				if (win == 0) {
					if (K5 > 10) {
						stop2 = 0;stop3 = 0;stop4 = 0;stop5 = 1;
						win++;
						new High_pair();
					}
				}
			}
		}
		if (win == 0) {
			if (K2 == 0) {
				stop2 = 1;
				if (K1 > 10) {
					stop1 = 1;stop3 = 0;stop4 = 0;stop5 = 0;
					win++;
					new High_pair();
				}
				if (win == 0) {
					if (K3 > 10) {
						stop1 = 0;stop3 = 1;stop4 = 0;stop5 = 0;
						win++;
						new High_pair();
					}
				}
				if (win == 0) {
					if (K4 > 10) {
						stop1 = 0;stop3 = 0;stop4 = 1;stop5 = 0;
						win++;
						new High_pair();
					}
				}
				if (win == 0) {
					if (K5 > 10) {
						stop1 = 0;stop3 = 0;stop4 = 0;stop5 = 1;
						win++;
						new High_pair();
					}
				}
			}
		}
		if (win == 0) {
			if (K3 == 0) {
				stop3 = 1;
				if (K1 > 10) {
					stop1 = 1;stop2 = 0;stop4 = 0;stop5 = 0;
					win++;
					new High_pair();
				}
				if (win == 0) {
					if (K2 > 10) {
						stop1 = 0;stop2 = 1;stop4 = 0;stop5 = 0;
						win++;
						new High_pair();
					}
				}
				if (win == 0) {
					if (K4 > 10) {
						stop1 = 0;stop2 = 0;stop4 = 1;stop5 = 0;
						win++;
						new High_pair();
					}
				}
				if (win == 0) {
					if (K5 > 10) {
						stop2 = 1;stop2 = 0;stop4 = 0;stop5 = 1;
						win++;
						new High_pair();
					}
				}
			}
		}
		if (win == 0) {
			if (K4 == 0) {
				stop4 = 1;
				if (K1 > 10) {
					stop1 = 1;stop2 = 0;stop3 = 0;stop5 = 0;
					win++;
					new High_pair();
				}
				if (win == 0) {
					if (K2 > 10) {
						stop1 = 0;stop2 = 1;stop3 = 0;stop5 = 0;
						win++;
						new High_pair();
					}
				}
				if (win == 0) {
					if (K3 > 10) {
						stop1 = 0;stop2 = 0;stop3 = 1;stop5 = 0;
						win++;
						new High_pair();
					}
				}
				if (win == 0) {
					if (K5 > 10) {
						stop1 = 0;stop2 = 0;stop3 = 0;stop5 = 1;
						win++;
						new High_pair();
					}
				}
			}
		}
		if (win == 0) {
			if (K5 == 0) {
				stop5 = 1;
				if (K1 > 10) {
					stop1 = 1;stop2 = 0;stop3 = 0;stop4 = 0;
					win++;
					new High_pair();
				}
				if (win == 0) {
					if (K2 > 10) {
						stop1 = 0;stop2 = 1;stop3 = 0;stop4 = 0;
						win++;
						new High_pair();
					}
				}
				if (win == 0) {
					if (K3 > 10) {
						stop1 = 0;stop2 = 0;stop3 = 1;stop4 = 0;
						win++;
						new High_pair();
					}
				}
				if (win == 0) {
					if (K4 > 10) {
						stop1 = 0;stop2 = 0;stop3 = 0;stop4 = 1;
						win++;
						new High_pair();
					}
				}
			}
		}

		// 4 BOJE

		if (win == 0 && two == 0) {
			if (((B1==B2)&&(B2==B3)&&(B3==B4)) ||
					((B1==B2)&&(B2==B3)&&(B4==0)) ||
					((B1==B2)&&(B3==0)&&(B2==B4)) ||
					((B1==B3)&&(B2==0)&&(B3==B4)) ||
					((B1==0)&&(B2==B3)&&(B3==B4))) {
				stop1 = 1;stop2 = 1;stop3 = 1;stop4 = 1;stop5 = 0;
				four++;
				new Hold();
			}
			if (((B1==B2)&&(B2==B3)&&(B3==B5)) ||
					((B1==B2)&&(B2==B3)&&(B5==0)) ||
					((B1==B2)&&(B3==0)&&(B2==B5)) ||
					((B1==B3)&&(B2==0)&&(B3==B5)) ||
					((B1==0)&&(B2==B3)&&(B3==B5))) {
				stop1 = 1;stop2 = 1;stop3 = 1;stop4 = 0;stop5 = 1;
				four++;
				new Hold();

			}
			if (((B1==B2)&&(B2==B4)&&(B4==B5)) ||
					((B1==B2)&&(B2==B4)&&(B5==0)) ||
					((B1==B2)&&(B4==0)&&(B2==B5)) ||
					((B1==B4)&&(B2==0)&&(B4==B5)) ||
					((B1==0)&&(B2==B4)&&(B4==B5))) {
				stop1 = 1;stop2 = 1;stop3 = 0;stop4 = 1;stop5 = 1;
				four++;
				new Hold();

			}
			if (((B1==B3)&&(B3==B4)&&(B4==B5)) ||
					((B1==B3)&&(B3==B4)&&(B5==0)) ||
					((B1==B3)&&(B4==0)&&(B3==B5)) ||
					((B1==B4)&&(B3==0)&&(B4==B5)) ||
					((B1==0)&&(B3==B4)&&(B4==B5))) {
				stop1 = 1;stop2 = 0;stop3 = 1;stop4 = 1;stop5 = 1;
				four++;
				new Hold();

			}
			if (((B2==B3)&&(B3==B4)&&(B4==B5)) ||
					((B2==B3)&&(B3==B4)&&(B5==0)) ||
					((B2==B3)&&(B4==0)&&(B3==B5)) ||
					((B2==B4)&&(B3==0)&&(B4==B5)) ||
					((B2==0)&&(B3==B4)&&(B4==B5))) {
				stop1 = 0;stop2 = 1;stop3 = 1;stop4 = 1;stop5 = 1;
				four++;
				new Hold();
			}

			//JOKER

			if (four == 0 && K1 == 0) {
				stop1 = 1;stop2 = 0;stop3 = 0;stop4 = 0;stop5 = 0;
				new Hold();
			}
			if (four == 0 && K2 == 0) {
				stop1 = 0;stop2 = 1;stop3 = 0;stop4 = 0;stop5 = 0;
				new Hold();
			}
			if (four == 0 && K3 == 0) {
				stop1 = 0;stop2 = 0;stop3 = 1;stop4 = 0;stop5 = 0;
				new Hold();
			}
			if (four == 0 && K4 == 0) {
				stop1 = 0;stop2 = 0;stop3 = 0;stop4 = 1;stop5 = 0;
				new Hold();
			}
			if (four == 0 && K5 == 0) {
				stop1 = 0;stop2 = 0;stop3 = 0;stop4 = 0;stop5 = 1;
				new Hold();
			}
		}
		winner = win;
	}
	void Color_check_1() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {

		if (((B1==B2)&&(B2==B3)&&(B3==B4)&&(K5==0)) ||
				((B1==B2)&&(B2==B3)&&(K4==0)&&(B3==B5)) ||
				((B1==B2)&&(K3==0)&&(B2==B4)&&(B4==B5)) ||
				((B1==B3)&&(K2==0)&&(B3==B4)&&(B4==B5)) ||
				((K1==0)&&(B2==B3)&&(B3==B4)&&(B4==B5)) ||
				(B1==B2)&&(B2==B3)&&(B3==B4)&&(B4==B5)) {

			StopAllCards();
			win++;
			new Royal_flush();
		}
		else {
			StopAllCards();
			win++;
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
			win++;
			new Street_flush();
		}
		else {
			StopAllCards();
			win++;
			new Street();
		}
	}
	void StopAllCards() {
		stop1 = 1;stop2 = 1;stop3 = 1;stop4 = 1;stop5 = 1;
	}
}
