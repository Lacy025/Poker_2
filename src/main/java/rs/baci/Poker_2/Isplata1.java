package rs.baci.Poker_2;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Isplata1 {

	Clip isplata1Sound;
	
public Isplata1() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

	URL isplata1 = this.getClass().getClassLoader().getResource("resources/Isplata1.wav");
	AudioInputStream audioIsplata1;
	try {
		assert isplata1 != null;
		audioIsplata1 = AudioSystem.getAudioInputStream(isplata1);
	} catch (UnsupportedAudioFileException | IOException ex) {
		throw new RuntimeException(ex);
	}
	try {
		isplata1Sound = AudioSystem.getClip();
	} catch (LineUnavailableException ex) {
		throw new RuntimeException(ex);
	}
	try {
		isplata1Sound.open(audioIsplata1);
	} catch (LineUnavailableException | IOException ex) {
		throw new RuntimeException(ex);
	}
	isplata1Sound.start();
	}
	
}
