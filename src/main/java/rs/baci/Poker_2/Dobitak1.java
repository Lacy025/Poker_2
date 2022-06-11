package rs.baci.Poker_2;

import java.util.ArrayList;
import java.util.List;

public class Dobitak1 {
	
	Dobitak1() throws InterruptedException {
	
	 int K1 = MyFrame.karta1;
	 int K2 = MyFrame.karta2;
	 int K3 = MyFrame.karta3;
	 int K4 = MyFrame.karta4;
	 int K5 = MyFrame.karta5;
	
	 List<Integer> karte = new ArrayList <Integer>();
	 
	 karte.add(K1);
	 karte.add(K2);
	 karte.add(K3);
	 karte.add(K4);
	 karte.add(K5);
	 
	 int B1 = MyFrame.boja1;
     int B2 = MyFrame.boja2;
     int B3 = MyFrame.boja3;
     int B4 = MyFrame.boja4;
     int B5 = MyFrame.boja5;
     
     List<Integer> boje = new ArrayList<Integer>();
     
     boje.add(B1);
     boje.add(B2);
     boje.add(B3);
     boje.add(B4);
     boje.add(B5);
	 
	 //Collections.sort(karte);
	 
	 int y = 0;
	 boolean joker = false;
	 
	 for (int n : karte) {
		 
         if (n == y) {
             joker = true;
             break; 
         }
     }
	 
	 if (joker) {
		 
         new Joker();
	 }
     
     System.out.println(karte);
	
	 Thread.sleep(5000);MyFrame.delj = 2;
	 
	 /*
     System.out.println(" 1 : " + Collections.frequency(karte, 1));
     System.out.println(" 2 : " + Collections.frequency(karte, 2));
     System.out.println(" 3 : " + Collections.frequency(karte, 3));
     System.out.println(" 4 : " + Collections.frequency(karte, 4));
     System.out.println(" 5 : " + Collections.frequency(karte, 5));
     System.out.println(" 6 : " + Collections.frequency(karte, 6));
     System.out.println(" 7 : " + Collections.frequency(karte, 7));
     System.out.println(" 8 : " + Collections.frequency(karte, 8));
     System.out.println(" 9 : " + Collections.frequency(karte, 9));
     System.out.println("10 : " + Collections.frequency(karte, 10));
     System.out.println(" J : " + Collections.frequency(karte, 11));
     System.out.println(" D : " + Collections.frequency(karte, 12));
     System.out.println(" K : " + Collections.frequency(karte, 13));
     System.out.println(" Y : " + Collections.frequency(karte, 0));
     
     System.out.println("SRCE : " + Collections.frequency(boje, 1));
     System.out.println(" MAK : " + Collections.frequency(boje, 2));
     System.out.println("KARO : " + Collections.frequency(boje, 3));
     System.out.println(" PIK : " + Collections.frequency(boje, 4));
     */
	 
	 System.exit(0);
	
	}
}
