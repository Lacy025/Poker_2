package rs.baci.Poker_2;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Dobitak {

	public static int stop1;
	public static int stop2;
	public static int stop3;
	public static int stop4;
	public static int stop5;

	Dobitak() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

		int K1 = MyFrame.karta1;
		int K2 = MyFrame.karta2;
		int K3 = MyFrame.karta3;
		int K4 = MyFrame.karta4;
		int K5 = MyFrame.karta5;

		int B1 = MyFrame.boja1;
		int B2 = MyFrame.boja2;
		int B3 = MyFrame.boja3;
		int B4 = MyFrame.boja4;
		int B5 = MyFrame.boja5;

		int DOBITAK = 0;

		// FIVE OF A KIND

		if (((K1==K2)&&(K2==K3)&&(K3==K4)&&(K5==0)) ||
				((K1==K2)&&(K2==K3)&&(K4==0)&&(K3==K5)) ||
				((K1==K2)&&(K3==0)&&(K2==K4)&&(K4==K5)) ||
				((K1==K3)&&(K2==0)&&(K3==K4)&&(K4==K5)) ||
				((K1==0)&&(K2==K3)&&(K3==K4)&&(K4==K5))) {

			stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
			DOBITAK++;
			new Fiveofakind();
		}

		// ROYAL FLUSH OR STREET


		if (DOBITAK==0) {

			int ROYAL = 0;

			if (K1==0||K2==0||K3==0||K4==0||K5==0) {ROYAL++;}
			if (K1==10||K2==10||K3==10||K4==10||K5==10) {ROYAL++;}
			if (K1==11||K2==11||K3==11||K4==11||K5==11) {ROYAL++;}
			if (K1==12||K2==12||K3==12||K4==12||K5==12) {ROYAL++;}
			if (K1==13||K2==13||K3==13||K4==13||K5==13) {ROYAL++;}
			if (K1==14||K2==14||K3==14||K4==14||K5==14) {ROYAL++;}

			if (ROYAL==5) {

				if (((B1==B2)&&(B2==B3)&&(B3==B4)&&(K5==0)) ||
						((B1==B2)&&(B2==B3)&&(K4==0)&&(B3==B5)) ||
						((B1==B2)&&(K3==0)&&(B2==B4)&&(B4==B5)) ||
						((B1==B3)&&(K2==0)&&(B3==B4)&&(B4==B5)) ||
						((K1==0)&&(B2==B3)&&(B3==B4)&&(B4==B5)) ||
						(B1==B2)&&(B2==B3)&&(B3==B4)&&(B4==B5)) {

					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Royalflush();

				}
				else {
					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Street();
				}
			}
		}
		// STREET FLUSH OR STREET
		// 1-5

		if (DOBITAK==0) {

			int STRFL1 = 0;

			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL1++;}
			if (K1==14||K2==14||K3==14||K4==14||K5==14) {STRFL1++;}
			if (K1==2||K2==2||K3==2||K4==2||K5==2) {STRFL1++;}
			if (K1==3||K2==3||K3==3||K4==3||K5==3) {STRFL1++;}
			if (K1==4||K2==4||K3==4||K4==4||K5==4) {STRFL1++;}
			if (K1==5||K2==5||K3==5||K4==5||K5==5) {STRFL1++;}

			if (STRFL1==5) {

				if (((B1==B2)&&(B2==B3)&&(B3==B4)&&(K5==0)) ||
						((B1==B2)&&(B2==B3)&&(K4==0)&&(B3==B5)) ||
						((B1==B2)&&(K3==0)&&(B2==B4)&&(B4==B5)) ||
						((B1==B3)&&(K2==0)&&(B3==B4)&&(B4==B5)) ||
						((K1==0)&&(B2==B3)&&(B3==B4)&&(B4==B5)) ||
						(B1==B2)&&(B2==B3)&&(B3==B4)&&(B4==B5)) {

					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Streetflush();

				}
				else {
					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Street();
				}
			}
		}

		// STREET FLUSH OR STREET
		// 2-6

		if (DOBITAK==0) {

			int STRFL2 = 0;

			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL2++;}
			if (K1==2||K2==2||K3==2||K4==2||K5==2) {STRFL2++;}
			if (K1==3||K2==3||K3==3||K4==3||K5==3) {STRFL2++;}
			if (K1==4||K2==4||K3==4||K4==4||K5==4) {STRFL2++;}
			if (K1==5||K2==5||K3==5||K4==5||K5==5) {STRFL2++;}
			if (K1==6||K2==6||K3==6||K4==6||K5==6) {STRFL2++;}

			if (STRFL2==5) {

				if (((B1==B2)&&(B2==B3)&&(B3==B4)&&(K5==0)) ||
						((B1==B2)&&(B2==B3)&&(K4==0)&&(B3==B5)) ||
						((B1==B2)&&(K3==0)&&(B2==B4)&&(B4==B5)) ||
						((B1==B3)&&(K2==0)&&(B3==B4)&&(B4==B5)) ||
						((K1==0)&&(B2==B3)&&(B3==B4)&&(B4==B5)) ||
						(B1==B2)&&(B2==B3)&&(B3==B4)&&(B4==B5)) {

					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Streetflush();

				}
				else {
					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Street();
				}
			}
		}

		// STREET FLUSH OR STREET
		// 3-7

		if (DOBITAK==0) {

			int STRFL3 = 0;

			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL3++;}
			if (K1==3||K2==3||K3==3||K4==3||K5==3) {STRFL3++;}
			if (K1==4||K2==4||K3==4||K4==4||K5==4) {STRFL3++;}
			if (K1==5||K2==5||K3==5||K4==5||K5==5) {STRFL3++;}
			if (K1==6||K2==6||K3==6||K4==6||K5==6) {STRFL3++;}
			if (K1==7||K2==7||K3==7||K4==7||K5==7) {STRFL3++;}

			if (STRFL3==5) {

				if (((B1==B2)&&(B2==B3)&&(B3==B4)&&(K5==0)) ||
						((B1==B2)&&(B2==B3)&&(K4==0)&&(B3==B5)) ||
						((B1==B2)&&(K3==0)&&(B2==B4)&&(B4==B5)) ||
						((B1==B3)&&(K2==0)&&(B3==B4)&&(B4==B5)) ||
						((K1==0)&&(B2==B3)&&(B3==B4)&&(B4==B5)) ||
						(B1==B2)&&(B2==B3)&&(B3==B4)&&(B4==B5)) {

					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Streetflush();

				}
				else {
					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Street();
				}
			}
		}

		// STREET FLUSH OR STREET
		// 4-8

		if (DOBITAK==0) {

			int STRFL4 = 0;

			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL4++;}
			if (K1==4||K2==4||K3==4||K4==4||K5==4) {STRFL4++;}
			if (K1==5||K2==5||K3==5||K4==5||K5==5) {STRFL4++;}
			if (K1==6||K2==6||K3==6||K4==6||K5==6) {STRFL4++;}
			if (K1==7||K2==7||K3==7||K4==7||K5==7) {STRFL4++;}
			if (K1==8||K2==8||K3==8||K4==8||K5==8) {STRFL4++;}

			if (STRFL4==5) {

				if (((B1==B2)&&(B2==B3)&&(B3==B4)&&(K5==0)) ||
						((B1==B2)&&(B2==B3)&&(K4==0)&&(B3==B5)) ||
						((B1==B2)&&(K3==0)&&(B2==B4)&&(B4==B5)) ||
						((B1==B3)&&(K2==0)&&(B3==B4)&&(B4==B5)) ||
						((K1==0)&&(B2==B3)&&(B3==B4)&&(B4==B5)) ||
						(B1==B2)&&(B2==B3)&&(B3==B4)&&(B4==B5)) {

					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Streetflush();

				}
				else {
					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Street();
				}
			}
		}

		// STREET FLUSH OR STREET
		// 5-9

		if (DOBITAK==0) {

			int STRFL5 = 0;

			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL5++;}
			if (K1==5||K2==5||K3==5||K4==5||K5==5) {STRFL5++;}
			if (K1==6||K2==6||K3==6||K4==6||K5==6) {STRFL5++;}
			if (K1==7||K2==7||K3==7||K4==7||K5==7) {STRFL5++;}
			if (K1==8||K2==8||K3==8||K4==8||K5==8) {STRFL5++;}
			if (K1==9||K2==9||K3==9||K4==9||K5==9) {STRFL5++;}

			if (STRFL5==5) {

				if (((B1==B2)&&(B2==B3)&&(B3==B4)&&(K5==0)) ||
						((B1==B2)&&(B2==B3)&&(K4==0)&&(B3==B5)) ||
						((B1==B2)&&(K3==0)&&(B2==B4)&&(B4==B5)) ||
						((B1==B3)&&(K2==0)&&(B3==B4)&&(B4==B5)) ||
						((K1==0)&&(B2==B3)&&(B3==B4)&&(B4==B5)) ||
						(B1==B2)&&(B2==B3)&&(B3==B4)&&(B4==B5)) {

					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Streetflush();

				}
				else {
					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Street();
				}
			}
		}

		// STREET FLUSH OR STREET
		// 6-10

		if (DOBITAK==0) {

			int STRFL6 = 0;

			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL6++;}
			if (K1==6||K2==6||K3==6||K4==6||K5==6) {STRFL6++;}
			if (K1==7||K2==7||K3==7||K4==7||K5==7) {STRFL6++;}
			if (K1==8||K2==8||K3==8||K4==8||K5==8) {STRFL6++;}
			if (K1==9||K2==9||K3==9||K4==9||K5==9) {STRFL6++;}
			if (K1==10||K2==10||K3==10||K4==10||K5==10) {STRFL6++;}

			if (STRFL6==5) {

				if (((B1==B2)&&(B2==B3)&&(B3==B4)&&(K5==0)) ||
						((B1==B2)&&(B2==B3)&&(K4==0)&&(B3==B5)) ||
						((B1==B2)&&(K3==0)&&(B2==B4)&&(B4==B5)) ||
						((B1==B3)&&(K2==0)&&(B3==B4)&&(B4==B5)) ||
						((K1==0)&&(B2==B3)&&(B3==B4)&&(B4==B5)) ||
						(B1==B2)&&(B2==B3)&&(B3==B4)&&(B4==B5)) {

					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Streetflush();

				}
				else {
					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Street();
				}
			}
		}

		// STREET FLUSH OR STREET
		// 7-11

		if (DOBITAK==0) {

			int STRFL7 = 0;

			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL7++;}
			if (K1==7||K2==7||K3==7||K4==7||K5==7) {STRFL7++;}
			if (K1==8||K2==8||K3==8||K4==8||K5==8) {STRFL7++;}
			if (K1==9||K2==9||K3==9||K4==9||K5==9) {STRFL7++;}
			if (K1==10||K2==10||K3==10||K4==10||K5==10) {STRFL7++;}
			if (K1==11||K2==11||K3==11||K4==11||K5==11) {STRFL7++;}

			if (STRFL7==5) {

				if (((B1==B2)&&(B2==B3)&&(B3==B4)&&(K5==0)) ||
						((B1==B2)&&(B2==B3)&&(K4==0)&&(B3==B5)) ||
						((B1==B2)&&(K3==0)&&(B2==B4)&&(B4==B5)) ||
						((B1==B3)&&(K2==0)&&(B3==B4)&&(B4==B5)) ||
						((K1==0)&&(B2==B3)&&(B3==B4)&&(B4==B5)) ||
						(B1==B2)&&(B2==B3)&&(B3==B4)&&(B4==B5)) {

					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Streetflush();

				}
				else {
					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Street();
				}
			}
		}

		// STREET FLUSH OR STREET
		// 8-12

		if (DOBITAK==0) {

			int STRFL8 = 0;

			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL8++;}
			if (K1==8||K2==8||K3==8||K4==8||K5==8) {STRFL8++;}
			if (K1==9||K2==9||K3==9||K4==9||K5==9) {STRFL8++;}
			if (K1==10||K2==10||K3==10||K4==10||K5==10) {STRFL8++;}
			if (K1==11||K2==11||K3==11||K4==11||K5==11) {STRFL8++;}
			if (K1==12||K2==12||K3==12||K4==12||K5==12) {STRFL8++;}

			if (STRFL8==5) {

				if (((B1==B2)&&(B2==B3)&&(B3==B4)&&(K5==0)) ||
						((B1==B2)&&(B2==B3)&&(K4==0)&&(B3==B5)) ||
						((B1==B2)&&(K3==0)&&(B2==B4)&&(B4==B5)) ||
						((B1==B3)&&(K2==0)&&(B3==B4)&&(B4==B5)) ||
						((K1==0)&&(B2==B3)&&(B3==B4)&&(B4==B5)) ||
						(B1==B2)&&(B2==B3)&&(B3==B4)&&(B4==B5)) {

					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Streetflush();

				}
				else {
					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Street();
				}
			}
		}

		// STREET FLUSH OR STREET
		// 9-13

		if (DOBITAK==0) {

			int STRFL9 = 0;

			if (K1==0||K2==0||K3==0||K4==0||K5==0) {STRFL9++;}
			if (K1==9||K2==9||K3==9||K4==9||K5==9) {STRFL9++;}
			if (K1==10||K2==10||K3==10||K4==10||K5==10) {STRFL9++;}
			if (K1==11||K2==11||K3==11||K4==11||K5==11) {STRFL9++;}
			if (K1==12||K2==12||K3==12||K4==12||K5==12) {STRFL9++;}
			if (K1==13||K2==13||K3==13||K4==13||K5==13) {STRFL9++;}

			if (STRFL9==5) {

				if (((B1==B2)&&(B2==B3)&&(B3==B4)&&(K5==0)) ||
						((B1==B2)&&(B2==B3)&&(K4==0)&&(B3==B5)) ||
						((B1==B2)&&(K3==0)&&(B2==B4)&&(B4==B5)) ||
						((B1==B3)&&(K2==0)&&(B3==B4)&&(B4==B5)) ||
						((K1==0)&&(B2==B3)&&(B3==B4)&&(B4==B5)) ||
						(B1==B2)&&(B2==B3)&&(B3==B4)&&(B4==B5)) {

					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Streetflush();

				}
				else {
					stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
					DOBITAK++;
					new Street();
				}
			}
		}

		// POKER

		if (DOBITAK==0) {

			if (((K1==K2)&&(K2==K3)&&(K3==K4)) ||
					((K1==K2)&&(K2==K3)&&(K4==0)) ||
					((K1==K2)&&(K3==0)&&(K2==K4)) ||
					((K1==K3)&&(K2==0)&&(K3==K4)) ||
					((K1==0)&&(K2==K3)&&(K3==K4))) {
				stop1=1;stop2=1;stop3=1;stop4=1;stop5=0;
				DOBITAK++;
				new Poker();
			}

			if (((K1==K2)&&(K2==K3)&&(K3==K5)) ||
					((K1==K2)&&(K2==K3)&&(K5==0)) ||
					((K1==K2)&&(K3==0)&&(K2==K5)) ||
					((K1==K3)&&(K2==0)&&(K3==K5)) ||
					((K1==0)&&(K2==K3)&&(K3==K5))) {
				stop1=1;stop2=1;stop3=1;stop4=0;stop5=1;
				DOBITAK++;
				new Poker();
			}

			if (((K1==K2)&&(K2==K4)&&(K4==K5)) ||
					((K1==K2)&&(K2==K4)&&(K5==0)) ||
					((K1==K2)&&(K4==0)&&(K2==K5)) ||
					((K1==K4)&&(K2==0)&&(K4==K5)) ||
					((K1==0)&&(K2==K4)&&(K4==K5))) {
				stop1=1;stop2=1;stop3=0;stop4=1;stop5=1;
				DOBITAK++;
				new Poker();
			}

			if (((K1==K3)&&(K3==K4)&&(K4==K5)) ||
					((K1==K3)&&(K3==K4)&&(K5==0)) ||
					((K1==K3)&&(K4==0)&&(K3==K5)) ||
					((K1==K4)&&(K3==0)&&(K4==K5)) ||
					((K1==0)&&(K3==K4)&&(K4==K5))) {
				stop1=1;stop2=0;stop3=1;stop4=1;stop5=1;
				DOBITAK++;
				new Poker();
			}

			if (((K2==K3)&&(K3==K4)&&(K4==K5)) ||
					((K2==K3)&&(K3==K4)&&(K5==0)) ||
					((K2==K3)&&(K4==0)&&(K3==K5)) ||
					((K2==K4)&&(K3==0)&&(K4==K5)) ||
					((K2==0)&&(K3==K4)&&(K4==K5))) {
				stop1=0;stop2=1;stop3=1;stop4=1;stop5=1;
				DOBITAK++;
				new Poker();
			}
		}

		//FULL HOUSE

		if (DOBITAK==0) {

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

				stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
				DOBITAK++;
				new Fullhouse();
			}
		}

		//FLUSH

		if (DOBITAK==0) {

			if (((B1==B2)&&(B2==B3)&&(B3==B4)&&(B4==B5)) ||
					((B1==B2)&&(B2==B3)&&(B3==B4)&&(K5==0)) ||
					((B1==B2)&&(B2==B3)&&(K4==0)&&(B3==B5)) ||
					((B1==B2)&&(K3==0)&&(B2==B4)&&(B4==B5)) ||
					((B1==B3)&&(K2==0)&&(B3==B4)&&(B4==B5)) ||
					((K1==0)&&(B2==B3)&&(B3==B4)&&(B4==B5))) {

				stop1=1;stop2=1;stop3=1;stop4=1;stop5=1;
				DOBITAK++;
				new Flush();
			}
		}

		//THREE OF A KIND

		if (DOBITAK==0) {

			if (((K1==K2)&&(K2==K3))||((K1==K2)&&(K3==0))||((K1==K3)&&(K2==0))||((K2==K3)&&(K1==0))) {
				stop1=1;stop2=1;stop3=1;stop4=0;stop5=0;
				DOBITAK++;
				new Threeofakind();
			}

			if (((K1==K2)&&(K2==K4))||((K1==K2)&&(K4==0))||((K1==K4)&&(K2==0))||((K2==K4)&&(K1==0))) {
				stop1=1;stop2=1;stop3=0;stop4=1;stop5=0;
				DOBITAK++;
				new Threeofakind();
			}

			if (((K1==K2)&&(K2==K5))||((K1==K2)&&(K5==0))||((K1==K5)&&(K2==0))||((K2==K5)&&(K1==0))) {
				stop1=1;stop2=1;stop3=0;stop4=0;stop5=1;
				DOBITAK++;
				new Threeofakind();
			}

			if (((K1==K3)&&(K3==K4))||((K1==K3)&&(K4==0))||((K1==K4)&&(K3==0))||((K3==K4)&&(K1==0))) {
				stop1=1;stop2=0;stop3=1;stop4=1;stop5=0;
				DOBITAK++;
				new Threeofakind();
			}

			if (((K1==K3)&&(K3==K5))||((K1==K3)&&(K5==0))||((K1==K5)&&(K3==0))||((K3==K5)&&(K1==0))) {
				stop1=1;stop2=0;stop3=1;stop4=0;stop5=1;
				DOBITAK++;
				new Threeofakind();
			}

			if (((K1==K4)&&(K4==K5))||((K1==K4)&&(K5==0))||((K1==K5)&&(K4==0))||((K4==K5)&&(K1==0))) {
				stop1=1;stop2=0;stop3=0;stop4=1;stop5=1;
				DOBITAK++;
				new Threeofakind();
			}

			if (((K2==K3)&&(K3==K4))||((K2==K3)&&(K4==0))||((K2==K4)&&(K3==0))||((K3==K4)&&(K2==0))) {
				stop1=0;stop2=1;stop3=1;stop4=1;stop5=0;
				DOBITAK++;
				new Threeofakind();
			}

			if (((K2==K3)&&(K3==K5))||((K2==K3)&&(K5==0))||((K2==K5)&&(K3==0))||((K3==K5)&&(K2==0))) {
				stop1=0;stop2=1;stop3=1;stop4=0;stop5=1;
				DOBITAK++;
				new Threeofakind();
			}

			if (((K2==K4)&&(K4==K5))||((K2==K4)&&(K5==0))||((K2==K5)&&(K4==0))||((K4==K5)&&(K2==0))) {
				stop1=0;stop2=1;stop3=0;stop4=1;stop5=1;
				DOBITAK++;
				new Threeofakind();
			}

			if (((K3==K4)&&(K4==K5))||((K3==K4)&&(K5==0))||((K3==K5)&&(K4==0))||((K4==K5)&&(K3==0))) {
				stop1=0;stop2=0;stop3=1;stop4=1;stop5=1;
				DOBITAK++;
				new Threeofakind();
			}
		}

		//2 PAIRS

		if (DOBITAK==0) {

			if (((K1==K2)&&(K3==K4))||((K1==K3)&&(K2==K4))||((K1==K4)&&(K2==K3))) {
				stop1=1;stop2=1;stop3=1;stop4=1;stop5=0;
				DOBITAK++;
				new Twopairs();
			}

			if (((K1==K2)&&(K3==K5))||((K1==K3)&&(K2==K5))||((K1==K5)&&(K2==K3))) {
				stop1=1;stop2=1;stop3=1;stop4=0;stop5=1;
				DOBITAK++;
				new Twopairs();
			}

			if (((K1==K2)&&(K4==K5))||((K1==K5)&&(K2==K4))||((K1==K4)&&(K2==K5))) {
				stop1=1;stop2=1;stop3=0;stop4=1;stop5=1;
				DOBITAK++;
				new Twopairs();
			}

			if (((K1==K3)&&(K4==K5))||((K1==K5)&&(K3==K4))||((K1==K4)&&(K3==K5))) {
				stop1=1;stop2=0;stop3=1;stop4=1;stop5=1;
				DOBITAK++;
				new Twopairs();
			}

			if (((K2==K3)&&(K4==K5))||((K3==K5)&&(K2==K4))||((K3==K4)&&(K2==K5))) {
				stop1=0;stop2=1;stop3=1;stop4=1;stop5=1;
				DOBITAK++;
				new Twopairs();
			}
		}

		//HIGH PAIR

		if (DOBITAK==0) {

			if (K1==K2) {
				stop1=1;stop2=1;stop3=0;stop4=0;stop5=0;
				DOBITAK++;
				if (K1>10) {
					new Highpair();
				}
				else {
					new Hold();
				}
			}
			if (K1==K3) {
				stop1=1;stop2=0;stop3=1;stop4=0;stop5=0;
				DOBITAK++;
				if (K1>10) {
					new Highpair();
				}
				else {
					new Hold();
				}
			}
			if (K1==K4) {
				stop1=1;stop2=0;stop3=0;stop4=1;stop5=0;
				DOBITAK++;
				if (K1>10) {
					new Highpair();
				}
				else {
					new Hold();
				}
			}
			if (K1==K5) {
				stop1=1;stop2=0;stop3=0;stop4=0;stop5=1;
				DOBITAK++;
				if (K1>10) {
					new Highpair();
				}
				else {
					new Hold();
				}
			}
			if (K2==K3) {
				stop1=0;stop2=1;stop3=1;stop4=0;stop5=0;
				DOBITAK++;
				if (K2>10) {
					new Highpair();
				}
				else {
					new Hold();
				}
			}
			if (K2==K4) {
				stop1=0;stop2=1;stop3=0;stop4=1;stop5=0;
				DOBITAK++;
				if (K2>10) {
					new Highpair();
				}
				else {
					new Hold();
				}
			}
			if (K2==K5) {
				stop1=0;stop2=1;stop3=0;stop4=0;stop5=1;
				DOBITAK++;
				if (K2>10) {
					new Highpair();
				}
				else {
					new Hold();
				}
			}
			if (K3==K4) {
				stop1=0;stop2=0;stop3=1;stop4=1;stop5=0;
				DOBITAK++;
				if (K3>10) {
					new Highpair();
				}
				else {
					new Hold();
				}
			}
			if (K3==K5) {
				stop1=0;stop2=0;stop3=1;stop4=0;stop5=1;
				DOBITAK++;
				if (K3>10) {
					new Highpair();
				}
				else {
					new Hold();
				}
			}
			if (K4==K5) {
				stop1=0;stop2=0;stop3=0;stop4=1;stop5=1;
				DOBITAK++;
				if (K4>10) {
					new Highpair();
				}
				else {
					new Hold();
				}
			}

		}

		//HIGH PAIR WITH JOKER

		if (DOBITAK==0) {

			if (K1==0) {
				stop1=1;
				if (K2>10) {
					stop2=1;stop3=0;stop4=0;stop5=0;
					DOBITAK++;new Highpair();
				}

				if (DOBITAK==0) {

					if (K3>10) {
						stop2=0;stop3=1;stop4=0;stop5=0;
						DOBITAK++;new Highpair();
					}
				}

				if (DOBITAK==0) {

					if (K4>10) {
						stop2=0;stop3=0;stop4=1;stop5=0;
						DOBITAK++;new Highpair();
					}
				}

				if (DOBITAK==0) {

					if (K5>10) {
						stop2=0;stop3=0;stop4=0;stop5=1;
						DOBITAK++;new Highpair();
					}
				}
			}
		}

		if (DOBITAK==0) {

			if (K2==0) {
				stop2=1;
				if (K1>10) {
					stop1=1;stop3=0;stop4=0;stop5=0;
					DOBITAK++;new Highpair();
				}

				if (DOBITAK==0) {

					if (K3>10) {
						stop1=0;stop3=1;stop4=0;stop5=0;
						DOBITAK++;new Highpair();
					}
				}

				if (DOBITAK==0) {

					if (K4>10) {
						stop1=0;stop3=0;stop4=1;stop5=0;
						DOBITAK++;new Highpair();
					}
				}

				if (DOBITAK==0) {

					if (K5>10) {
						stop1=0;stop3=0;stop4=0;stop5=1;
						DOBITAK++;new Highpair();
					}
				}
			}
		}

		if (DOBITAK==0) {

			if (K3==0) {
				stop3=1;
				if (K1>10) {
					stop1=1;stop2=0;stop4=0;stop5=0;
					DOBITAK++;new Highpair();
				}

				if (DOBITAK==0) {

					if (K2>10) {
						stop1=0;stop2=1;stop4=0;stop5=0;
						DOBITAK++;new Highpair();
					}
				}

				if (DOBITAK==0) {

					if (K4>10) {
						stop1=0;stop2=0;stop4=1;stop5=0;
						DOBITAK++;new Highpair();
					}
				}

				if (DOBITAK==0) {

					if (K5>10) {
						stop2=1;stop2=0;stop4=0;stop5=1;
						DOBITAK++;new Highpair();
					}
				}
			}
		}

		if (DOBITAK==0) {

			if (K4==0) {
				stop4=1;
				if (K1>10) {
					stop1=1;stop2=0;stop3=0;stop5=0;
					DOBITAK++;new Highpair();
				}

				if (DOBITAK==0) {

					if (K2>10) {
						stop1=0;stop2=1;stop3=0;stop5=0;
						DOBITAK++;new Highpair();
					}
				}

				if (DOBITAK==0) {

					if (K3>10) {
						stop1=0;stop2=0;stop3=1;stop5=0;
						DOBITAK++;new Highpair();
					}
				}

				if (DOBITAK==0) {

					if (K5>10) {
						stop1=0;stop2=0;stop3=0;stop5=1;
						DOBITAK++;new Highpair();
					}
				}
			}
		}

		if (DOBITAK==0) {

			if (K5==0) {
				stop5=1;
				if (K1>10) {
					stop1=1;stop2=0;stop3=0;stop4=0;
					DOBITAK++;new Highpair();
				}

				if (DOBITAK==0) {

					if (K2>10) {
						stop1=0;stop2=1;stop3=0;stop4=0;
						DOBITAK++;new Highpair();
					}
				}

				if (DOBITAK==0) {

					if (K3>10) {
						stop1=0;stop2=0;stop3=1;stop4=0;
						DOBITAK++;new Highpair();
					}
				}

				if (DOBITAK==0) {

					if (K4>10) {
						stop1=0;stop2=0;stop3=0;stop4=1;
						DOBITAK++;new Highpair();
					}
				}
			}

		}

		//JOKER

		if (DOBITAK==0) {

			if (K1==0) {
				stop1=1;stop2=0;stop3=0;stop4=0;stop5=0;
				new Hold();
			}
			if (K2==0) {
				stop1=0;stop2=1;stop3=0;stop4=0;stop5=0;
				new Hold();
			}
			if (K3==0) {
				stop1=0;stop2=0;stop3=1;stop4=0;stop5=0;
				new Hold();
			}
			if (K4==0) {
				stop1=0;stop2=0;stop3=0;stop4=1;stop5=0;
				new Hold();
			}
			if (K5==0) {
				stop1=0;stop2=0;stop3=0;stop4=0;stop5=1;
				new Hold();
			}
		}

	}
}
