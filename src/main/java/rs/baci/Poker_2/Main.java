package rs.baci.Poker_2;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException,
	IOException, LineUnavailableException, InterruptedException {
		
		//int game = 1;
			//while (game>0) {
		
				new MyFrame();
				
				if (MyFrame.delj==5) {
					
					System.out.println("THE END");
				}
				if (MyFrame.delj==1) {
					
					new Deljenje1();
					new Dobitak();
					new Izbor();
					new Deljenje2();
					
				}
				
				System.out.println("THE END");
				MyFrame.jk=60000;
			//}		 
	}
}	