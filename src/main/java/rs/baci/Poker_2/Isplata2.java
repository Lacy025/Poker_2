package rs.baci.Poker_2;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Isplata2 {

	Clip isplata2Sound;
	
public Isplata2() throws UnsupportedAudioFileException, IOException, LineUnavailableException {


	URL isplata2 = this.getClass().getClassLoader().getResource("resources/Isplata2.wav");
	AudioInputStream audioIsplata2 = null;
	try {
		audioIsplata2 = AudioSystem.getAudioInputStream(isplata2);
	} catch (UnsupportedAudioFileException ex) {
		throw new RuntimeException(ex);
	} catch (IOException ex) {
		throw new RuntimeException(ex);
	}
	try {
		isplata2Sound = AudioSystem.getClip();
	} catch (LineUnavailableException ex) {
		throw new RuntimeException(ex);
	}
	try {
		isplata2Sound.open(audioIsplata2);
	} catch (LineUnavailableException ex) {
		throw new RuntimeException(ex);
	} catch (IOException ex) {
		throw new RuntimeException(ex);
	}
	isplata2Sound.start();
	}
	
}
