package rs.baci.Poker_2;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Cash_1 {
	public static Clip cash_1_Sound;
public Cash_1() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
	URL cash_1 = this.getClass().getClassLoader().getResource("resources/Cash_1.wav");
	AudioInputStream audio_Cash_1;
	try {
		assert cash_1 != null;
		audio_Cash_1 = AudioSystem.getAudioInputStream(cash_1);
	} catch (UnsupportedAudioFileException | IOException ex) {
		throw new RuntimeException(ex);
	}
	try {
		Cash_1.cash_1_Sound = AudioSystem.getClip();
	} catch (LineUnavailableException ex) {
		throw new RuntimeException(ex);
	}
	try {
		Cash_1.cash_1_Sound.open(audio_Cash_1);
	} catch (LineUnavailableException | IOException ex) {
		throw new RuntimeException(ex);
	}
	Cash_1.cash_1_Sound.start();
	Thread.sleep(10);
	}
}
