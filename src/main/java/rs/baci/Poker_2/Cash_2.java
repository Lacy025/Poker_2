package rs.baci.Poker_2;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Cash_2 {
	Clip cash_2_Sound;
public Cash_2() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	URL cash_2 = this.getClass().getClassLoader().getResource("resources/Cash_2.wav");
	AudioInputStream audio_Cash_2;
	try {
		assert cash_2 != null;
		audio_Cash_2 = AudioSystem.getAudioInputStream(cash_2);
	} catch (UnsupportedAudioFileException | IOException ex) {
		throw new RuntimeException(ex);
	}
	try {
		cash_2_Sound = AudioSystem.getClip();
	} catch (LineUnavailableException ex) {
		throw new RuntimeException(ex);
	}
	try {
		cash_2_Sound.open(audio_Cash_2);
	} catch (LineUnavailableException | IOException ex) {
		throw new RuntimeException(ex);
	}
	cash_2_Sound.start();
	}
}
