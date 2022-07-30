package rs.baci.Poker_2;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Stop {

    Clip stopcard;

    Stop() throws InterruptedException {

        URL stop = this.getClass().getClassLoader().getResource("resources/Stop.wav");
        AudioInputStream audioStop;
        try {
            assert stop != null;
            audioStop = AudioSystem.getAudioInputStream(stop);
        } catch (UnsupportedAudioFileException | IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            this.stopcard = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            throw new RuntimeException(ex);
        }
        try {
            stopcard.open(audioStop);
        } catch (LineUnavailableException | IOException ex) {
            throw new RuntimeException(ex);
        }
        this.stopcard.start();
        Thread.sleep(200);
    }

}
