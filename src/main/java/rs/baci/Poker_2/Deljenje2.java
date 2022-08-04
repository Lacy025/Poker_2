package rs.baci.Poker_2;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;

public class Deljenje2 implements MainFrame {

    Clip karta1Sound;
    Clip karta2Sound;
    Clip karta3Sound;
    Clip karta4Sound;
    Clip karta5Sound;

    public static int m1 = 0;
    public static int m2 = 0;
    public static int m3 = 0;
    public static int m4 = 0;
    public static int m5 = 0;

    int PAUZA = 0;

    Deljenje2() throws InterruptedException {

        if (Dobitak.stop1==0) {

            Random karta06 = new Random();

            m1 = karta06.nextInt(53);

            while (m1==Deljenje1.n2 ||
                    m1==Deljenje1.n3 ||
                    m1==Deljenje1.n4 ||
                    m1==Deljenje1.n5) {

                m1 = karta06.nextInt(53);

            }

            MyFrame.JlabelK1.setVisible(false);
            frame.remove(MyFrame.JlabelK1);

            MyFrame.n1=m1;
            new Karta1();

            frame.add(Karta1.card1);
            Karta1.card1.setVisible(true);
            Karta1.card1.setBounds(-8, 380, 400, 540);
            ((JComponent) Karta1.card1).setOpaque(false);


            URL karta1 = this.getClass().getClassLoader().getResource("resources/Karta1.wav");
            AudioInputStream audioKarta1;
            try {
                assert karta1 != null;
                audioKarta1 = AudioSystem.getAudioInputStream(karta1);
            } catch (UnsupportedAudioFileException | IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                this.karta1Sound = AudioSystem.getClip();
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            }
            try {
                karta1Sound.open(audioKarta1);
            } catch (LineUnavailableException | IOException ex) {
                throw new RuntimeException(ex);
            }
            this.karta1Sound.start();
            PAUZA++;

        }

        if (Dobitak.stop2==0) {

            Random karta07 = new Random();

            m2 = karta07.nextInt(53);

            while (m2==Deljenje1.n1 ||
                    m2==Deljenje1.n3 ||
                    m2==Deljenje1.n4 ||
                    m2==Deljenje1.n5) {

                m2 = karta07.nextInt(53);

            }
            if (PAUZA>0) {
                Thread.sleep(280);
            }

            MyFrame.JlabelK2.setVisible(false);
            frame.remove(MyFrame.JlabelK2);

            MyFrame.n2=m2;
            new Karta2();

            frame.add(Karta2.card2);
            Karta2.card2.setVisible(true);
            Karta2.card2.setBounds(373, 380, 400, 540);
            ((JComponent) Karta2.card2).setOpaque(false);

            URL karta2 = this.getClass().getClassLoader().getResource("resources/Karta2.wav");
            AudioInputStream audioKarta2;
            try {
                assert karta2 != null;
                audioKarta2 = AudioSystem.getAudioInputStream(karta2);
            } catch (UnsupportedAudioFileException | IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                this.karta2Sound = AudioSystem.getClip();
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            }
            try {
                karta2Sound.open(audioKarta2);
            } catch (LineUnavailableException | IOException ex) {
                throw new RuntimeException(ex);
            }
            this.karta2Sound.start();
            PAUZA++;

        }

        if (Dobitak.stop3==0) {

            Random karta08 = new Random();

            m3 = karta08.nextInt(53);

            while (m3==Deljenje1.n1 ||
                    m3==Deljenje1.n2 ||
                    m3==Deljenje1.n4 ||
                    m3==Deljenje1.n5) {

                m3 = karta08.nextInt(53);

            }
            if (PAUZA>0) {
                Thread.sleep(280);
            }

            MyFrame.JlabelK3.setVisible(false);
            frame.remove(MyFrame.JlabelK3);

            MyFrame.n3=m3;
            new Karta3();

            frame.add(Karta3.card3);
            Karta3.card3.setVisible(true);
            Karta3.card3.setBounds(753, 380, 400, 540);
            ((JComponent) Karta3.card3).setOpaque(false);

            URL karta3 = this.getClass().getClassLoader().getResource("resources/Karta3.wav");
            AudioInputStream audioKarta3;
            try {
                assert karta3 != null;
                audioKarta3 = AudioSystem.getAudioInputStream(karta3);
            } catch (UnsupportedAudioFileException | IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                this.karta3Sound = AudioSystem.getClip();
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            }
            try {
                karta3Sound.open(audioKarta3);
            } catch (LineUnavailableException | IOException ex) {
                throw new RuntimeException(ex);
            }
            this.karta3Sound.start();
            PAUZA++;

        }

        if (Dobitak.stop4==0) {

            Random karta09 = new Random();

            m4 = karta09.nextInt(53);

            while (m4==Deljenje1.n1 ||
                    m4==Deljenje1.n2 ||
                    m4==Deljenje1.n3 ||
                    m4==Deljenje1.n5) {

                m4 = karta09.nextInt(53);

            }
            if (PAUZA>0) {
                Thread.sleep(280);
            }

            MyFrame.JlabelK4.setVisible(false);
            frame.remove(MyFrame.JlabelK4);

            MyFrame.n4=m4;
            new Karta4();

            frame.add(Karta4.card4);
            Karta4.card4.setVisible(true);
            Karta4.card4.setBounds(1133, 380, 400, 540);
            ((JComponent) Karta4.card4).setOpaque(false);

            URL karta4 = this.getClass().getClassLoader().getResource("resources/Karta4.wav");
            AudioInputStream audioKarta4;
            try {
                assert karta4 != null;
                audioKarta4 = AudioSystem.getAudioInputStream(karta4);
            } catch (UnsupportedAudioFileException | IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                this.karta4Sound = AudioSystem.getClip();
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            }
            try {
                karta4Sound.open(audioKarta4);
            } catch (LineUnavailableException | IOException ex) {
                throw new RuntimeException(ex);
            }
            this.karta4Sound.start();
            PAUZA++;

        }

        if (Dobitak.stop5==0) {

            Random karta10 = new Random();

            m5 = karta10.nextInt(53);

            while (m5==Deljenje1.n1 ||
                    m5==Deljenje1.n2 ||
                    m5==Deljenje1.n3 ||
                    m5==Deljenje1.n4) {

                m5 = karta10.nextInt(53);

            }
            if (PAUZA>0) {
                Thread.sleep(280);
            }

            MyFrame.JlabelK5.setVisible(false);
            frame.remove(MyFrame.JlabelK5);

            MyFrame.n5=m5;
            new Karta5();

            frame.add(Karta5.card5);
            Karta5.card5.setVisible(true);
            Karta5.card5.setBounds(1512, 380, 400, 540);
            ((JComponent) Karta5.card5).setOpaque(false);

            URL karta5 = this.getClass().getClassLoader().getResource("resources/Karta5.wav");
            AudioInputStream audioKarta5;
            try {
                assert karta5 != null;
                audioKarta5 = AudioSystem.getAudioInputStream(karta5);
            } catch (UnsupportedAudioFileException | IOException ex) {
                throw new RuntimeException(ex);
            }
            try {
                this.karta5Sound = AudioSystem.getClip();
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            }
            try {
                karta5Sound.open(audioKarta5);
            } catch (LineUnavailableException | IOException ex) {
                throw new RuntimeException(ex);
            }
            this.karta5Sound.start();


        }

    }

}
