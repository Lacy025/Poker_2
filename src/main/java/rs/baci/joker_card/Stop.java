package rs.baci.joker_card;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Stop {
    Clip stop_card;
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
            this.stop_card = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            throw new RuntimeException(ex);
        }
        try {
            stop_card.open(audioStop);
        } catch (LineUnavailableException | IOException ex) {
            throw new RuntimeException(ex);
        }
        this.stop_card.start();
        Thread.sleep(200);
    }
}
