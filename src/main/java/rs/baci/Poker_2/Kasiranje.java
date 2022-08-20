package rs.baci.Poker_2;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class Kasiranje {

    Clip kasaSound;
    Kasiranje() {

        URL kasa = this.getClass().getClassLoader().getResource("resources/Kraj.wav");
        AudioInputStream audioKasa;
        try {
            assert kasa != null;
            audioKasa = AudioSystem.getAudioInputStream(kasa);
        } catch (UnsupportedAudioFileException | IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            this.kasaSound = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            throw new RuntimeException(ex);
        }
        try {
            kasaSound.open(audioKasa);
        } catch (LineUnavailableException | IOException ex) {
            throw new RuntimeException(ex);
        }
        this.kasaSound.start();

    }

}
