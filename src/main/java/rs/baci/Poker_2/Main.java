package rs.baci.Poker_2;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
	public static void main(String[] args) throws UnsupportedAudioFileException,
	IOException, LineUnavailableException, InterruptedException {
		
		int game = 1;

		while (game > 0) {
			new MyFrame();
			if (MyFrame.dealing == 1) {
				new Deal_Cards_1();
				new Win();
				new Choice_1();
			}
			if (MyFrame.dealing == 2) {
				new Deal_Cards_2();
				new Win();
				new Choice_2();
				if (Choice_2.choice == 3) {
					new Doubling();
				}
			}
			MyFrame.jk = 60000;

			if (MyFrame.final_value > 0) {
				Thread.sleep(50);
			}
			if (MyFrame.final_value == 0) {
				Thread.sleep(50);
			}
			MyFrame.breaking = 0;
		}
	}
}	