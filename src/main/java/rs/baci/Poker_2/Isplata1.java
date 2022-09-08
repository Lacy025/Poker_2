package rs.baci.Poker_2;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Isplata1 {

	public static Clip isplata1Sound;
	
public Isplata1() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {

	URL isplata1 = this.getClass().getClassLoader().getResource("resources/Isplata1.wav");
	AudioInputStream audioIsplata1;
	try {
		assert isplata1 != null;
		audioIsplata1 = AudioSystem.getAudioInputStream(isplata1);
	} catch (UnsupportedAudioFileException | IOException ex) {
		throw new RuntimeException(ex);
	}
	try {
		Isplata1.isplata1Sound = AudioSystem.getClip();
	} catch (LineUnavailableException ex) {
		throw new RuntimeException(ex);
	}
	try {
		Isplata1.isplata1Sound.open(audioIsplata1);
	} catch (LineUnavailableException | IOException ex) {
		throw new RuntimeException(ex);
	}
	Isplata1.isplata1Sound.start();
	Thread.sleep(10);
	}
	
}
