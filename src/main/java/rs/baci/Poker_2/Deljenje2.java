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

    int karta;
    int pauza;

    Deljenje2() throws InterruptedException {

        karta=0;
        pauza = 1;

        if (Dobitak.stop1==0) {

            Random karta01 = new Random();

            MyFrame.n1 = karta01.nextInt(53);

            while (MyFrame.n1==MyFrame.n2 ||
                    MyFrame.n1==MyFrame.n3 ||
                    MyFrame.n1==MyFrame.n4 ||
                    MyFrame.n1==MyFrame.n5) {

                MyFrame.n1 = karta01.nextInt(53);
                pauza++;
            }

            Thread.sleep(200-((pauza*10)+(MyFrame.n1*3)));


            MyFrame.JlabelK1.setVisible(false);
            frame.remove(MyFrame.JlabelK1);

            new Karta1();

            frame.add(Karta1.card1);
            Karta1.card1.setBounds(-8, 380, 400, 540);
            Karta1.card1.setVisible(true);
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
            karta++;

        }

        pauza=1;

        if (Dobitak.stop2==0) {

            Random karta02 = new Random();

            MyFrame.n2 = karta02.nextInt(53);

            while (MyFrame.n2==MyFrame.n1 ||
                    MyFrame.n2==MyFrame.n3 ||
                    MyFrame.n2==MyFrame.n4 ||
                    MyFrame.n2==MyFrame.n5) {

                MyFrame.n2 = karta02.nextInt(53);
                pauza++;
            }
            if (karta>0) {
                Thread.sleep(280);
            }

            else {
                Thread.sleep(200-((pauza*10)+(MyFrame.n2*3)));
            }

            MyFrame.JlabelK2.setVisible(false);
            frame.remove(MyFrame.JlabelK2);

            new Karta2();

            frame.add(Karta2.card2);
            Karta2.card2.setBounds(373, 380, 400, 540);
            Karta2.card2.setVisible(true);
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
            karta++;

        }

        pauza=1;

        if (Dobitak.stop3==0) {

            Random karta03 = new Random();

            MyFrame.n3 = karta03.nextInt(53);

            while (MyFrame.n3==MyFrame.n1 ||
                    MyFrame.n3==MyFrame.n2 ||
                    MyFrame.n3==MyFrame.n4 ||
                    MyFrame.n3==MyFrame.n5) {

                MyFrame.n3 = karta03.nextInt(53);
                pauza++;

            }
            if (karta>0) {
                Thread.sleep(280);
            }

            else {
                Thread.sleep(200-((pauza*10)+(MyFrame.n3*3)));
            }

            MyFrame.JlabelK3.setVisible(false);
            frame.remove(MyFrame.JlabelK3);

            new Karta3();

            frame.add(Karta3.card3);
            Karta3.card3.setBounds(753, 380, 400, 540);
            Karta3.card3.setVisible(true);
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
            karta++;

        }

        pauza=1;

        if (Dobitak.stop4==0) {

            Random karta04 = new Random();

            MyFrame.n4 = karta04.nextInt(53);

            while (MyFrame.n4==MyFrame.n1 ||
                    MyFrame.n4==MyFrame.n3 ||
                    MyFrame.n4==MyFrame.n2 ||
                    MyFrame.n4==MyFrame.n5) {

                MyFrame.n4 = karta04.nextInt(53);
                pauza++;

            }
            if (karta>0) {
                Thread.sleep(280);
            }

            else {
                Thread.sleep(200-((pauza*10)+(MyFrame.n4*3)));
            }

            MyFrame.JlabelK4.setVisible(false);
            frame.remove(MyFrame.JlabelK4);

            new Karta4();

            frame.add(Karta4.card4);
            Karta4.card4.setBounds(1133, 380, 400, 540);
            Karta4.card4.setVisible(true);
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
            karta++;

        }

        pauza=1;

        if (Dobitak.stop5==0) {

            Random karta05 = new Random();

            MyFrame.n5 = karta05.nextInt(53);

            while (MyFrame.n5==MyFrame.n1 ||
                    MyFrame.n5==MyFrame.n2 ||
                    MyFrame.n5==MyFrame.n3 ||
                    MyFrame.n5==MyFrame.n4) {

                MyFrame.n5 = karta05.nextInt(53);
                pauza++;

            }
            if (karta>0) {
                Thread.sleep(280);
            }

            else {
                Thread.sleep(200-((pauza*10)+(MyFrame.n5*3)));
            }

            MyFrame.JlabelK5.setVisible(false);
            frame.remove(MyFrame.JlabelK5);

            new Karta5();

            frame.add(Karta5.card5);
            Karta5.card5.setBounds(1512, 380, 400, 540);
            Karta5.card5.setVisible(true);
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

        Thread.sleep(100);

    }

}
