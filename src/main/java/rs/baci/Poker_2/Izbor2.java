package rs.baci.Poker_2;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class Izbor2 {

    Clip dobitakSound;

    Izbor2() {

        URL dobitak = this.getClass().getClassLoader().getResource("resources/Dobitak.wav");
        AudioInputStream audioDobitak;
        try {
            assert dobitak != null;
            audioDobitak = AudioSystem.getAudioInputStream(dobitak);
        } catch (UnsupportedAudioFileException | IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            this.dobitakSound = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            throw new RuntimeException(ex);
        }
        try {
            dobitakSound.open(audioDobitak);
        } catch (LineUnavailableException | IOException ex) {
            throw new RuntimeException(ex);
        }
        this.dobitakSound.start();

    }

}
