package rs.baci.Poker_2;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Doubling implements MainFrame, KeyListener, Winnings, Numbers {
    JLabel high = new JLabel("8, 9, 10, J, Q, K = HOCH");
    JLabel low = new JLabel(" A, 2, 3, 4, 5, 6 = TIEF");
    public static JLabel High = new JLabel("HOCH");
    public static JLabel Low = new JLabel("TIEF");
    private static BufferedImage loadImage() {
        try {
            return ImageIO.read(Objects.requireNonNull(MyFrame.class.getClassLoader().getResource("resources/53.png")));
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return null;
        }
    }
    static ImageIcon blank = new ImageIcon(Objects.requireNonNull(loadImage()));
    public static JLabel Blank = new JLabel(blank);
    public static int high_low;
    int between;
    public static int double_card;
    public static int half_card;
    int gambling;
    public static int half;
    public static double twice;
    int x_high;
    int x_low;
    public static int x3;
    Clip High_Sound;
    Clip Low_Sound;
    Clip Bingo_Sound;
    Doubling() throws InterruptedException {

        Choice_2.choice = 0;
        half = 0;
        gambling = 1;

        twice = MyFrame.final_value;

        x_high = 600;
        x_low = 600;

        frame.add(high);
        frame.add(low);
        high.setBounds(660,920,500,40);
        low.setBounds(660,960,500,40);
        high.setForeground(color1);
        low.setForeground(color1);
        high.setFont(font1);
        low.setFont(font1);
        high.setOpaque(false);
        low.setOpaque(false);

        High.setVisible(false);
        Low.setVisible(false);
        High.setForeground(color1);
        Low.setForeground(color1);
        High.setBounds(600,550,500,200);
        Low.setBounds(600,550,500,200);
        High.setFont(font2);
        Low.setFont(font2);
        High.setOpaque(false);
        Low.setOpaque(false);

        between = 0;
        double_card = 1;
        high_low = 1;

        while (gambling == 1) {
            if (double_card == 1) {
                frame.add(Blank);
                Blank.setVisible(true);
                Blank.setBounds(-800, 350, 2000, 600);
                Blank.setOpaque(false);
                Check();
                if (double_card == 1) {
                    Random card_01 = new Random();
                    MyFrame.k01 = card_01.nextInt(49);
                    while (MyFrame.k01 == 0) {
                        MyFrame.k01 = card_01.nextInt(49);
                    }
                    new Card_01();
                    frame.addKeyListener(this);
                    while (high_low > 0) {
                        if (between == 200) {
                            High_sound();
                            high.setVisible(true);
                            low.setVisible(false);
                            Thread.sleep(300);
                            between++;
                        }
                        if (between == 400) {
                            Low_sound();
                            high.setVisible(false);
                            low.setVisible(true);
                            Thread.sleep(300);
                            between = 0;
                        }
                        between++;
                    }
                    frame.removeKeyListener(this);

                    if (high_low > -3) {
                        high.setVisible(false);
                        low.setVisible(false);
                        frame.remove(high);
                        frame.remove(low);
                        Blank.setVisible(false);
                        frame.remove(Blank);
                        frame.add(Card_01.card01);
                        Card_01.card01.setBounds(-805, 350, 2000, 600);
                        Card_01.card01.setVisible(true);
                        if ((MyFrame.k01 > 24 && high_low == -1) || (MyFrame.k01 < 25 && high_low == -2)) {
                            Hit();
                            Bingo();
                        }
                        else {
                            Miss();
                        }
                    }
                }
            }
            if (double_card == 2) {
                ((Container) Card_01.card01).add(Blank);
                Blank.setVisible(true);
                Blank.setBounds(70, 0, 2000, 600);
                Blank.setOpaque(false);
                Check();

                if (double_card == 2) {

                    Random card_02 = new Random();
                    MyFrame.k02 = card_02.nextInt(49);
                    while (MyFrame.k02 == 0 ||
                            MyFrame.k02 == MyFrame.k01) {
                        MyFrame.k02 = card_02.nextInt(49);
                    }
                    new Card_02();
                    frame.add(high);
                    frame.add(low);
                    frame.addKeyListener(this);
                    while (high_low > 0) {
                        if (between == 200) {
                            High_sound();
                            high.setVisible(true);
                            low.setVisible(false);
                            Thread.sleep(275);
                            between++;
                        }
                        if (between == 400) {
                            Low_sound();
                            high.setVisible(false);
                            low.setVisible(true);
                            Thread.sleep(275);
                            between = 0;
                        }
                        between++;
                    }
                    frame.removeKeyListener(this);

                    if (high_low > -3) {
                        high.setVisible(false);
                        low.setVisible(false);
                        frame.remove(high);
                        frame.remove(low);
                        Blank.setVisible(false);
                        ((Container) Card_01.card01).remove(Blank);
                        ((Container) Card_01.card01).add(Card_02.card02);
                        Card_02.card02.setBounds(70, 0, 2000, 600);
                        Card_02.card02.setVisible(true);
                        ((JComponent) Card_02.card02).setOpaque(false);
                        if ((MyFrame.k02 > 24 && high_low == -1) || (MyFrame.k02 < 25 && high_low == -2)) {
                            Hit();
                            Bingo();
                        }
                        else {
                            Miss();
                        }
                    }
                }
            }
            if (double_card == 3) {
                ((Container) Card_02.card02).add(Blank);
                Blank.setVisible(true);
                Blank.setBounds(70, 0, 2000, 600);
                Blank.setOpaque(false);
                Check();

                if (double_card == 3) {
                    Random card_03 = new Random();
                    MyFrame.k03 = card_03.nextInt(49);
                    while (MyFrame.k03 == 0 ||
                            MyFrame.k03 == MyFrame.k01 || MyFrame.k03 == MyFrame.k02) {
                        MyFrame.k03 = card_03.nextInt(49);
                    }
                    new Card_03();

                    frame.add(high);
                    frame.add(low);
                    frame.addKeyListener(this);
                    while (high_low > 0) {
                        if (between == 200) {
                            High_sound();
                            high.setVisible(true);
                            low.setVisible(false);
                            Thread.sleep(250);
                            between++;
                        }
                        if (between == 400) {
                            Low_sound();
                            high.setVisible(false);
                            low.setVisible(true);
                            Thread.sleep(250);
                            between = 0;
                        }
                        between++;
                    }
                    frame.removeKeyListener(this);

                    if (high_low > -3) {
                        high.setVisible(false);
                        low.setVisible(false);
                        frame.remove(high);
                        frame.remove(low);
                        Blank.setVisible(false);
                        ((Container) Card_02.card02).remove(Blank);
                        ((Container) Card_02.card02).add(Card_03.card03);
                        Card_03.card03.setBounds(70, 0, 2000, 600);
                        Card_03.card03.setVisible(true);
                        ((JComponent) Card_03.card03).setOpaque(false);
                        if ((MyFrame.k03 > 24 && high_low == -1) || (MyFrame.k03 < 25 && high_low == -2)) {
                            Hit();
                            Bingo();
                        }
                        else {
                            Miss();
                        }
                    }
                }
            }
            if (double_card == 4) {
                ((Container) Card_03.card03).add(Blank);
                Blank.setVisible(true);
                Blank.setBounds(70, 0, 2000, 600);
                Blank.setOpaque(false);
                Check();
                if (double_card == 4) {
                    Random card_04 = new Random();
                    MyFrame.k04 = card_04.nextInt(49);
                    while (MyFrame.k04 == 0 ||
                            MyFrame.k04 == MyFrame.k01 || MyFrame.k04 == MyFrame.k02 ||
                            MyFrame.k04 == MyFrame.k03) {
                        MyFrame.k04 = card_04.nextInt(49);
                    }
                    new Card_04();
                    frame.add(high);
                    frame.add(low);
                    frame.addKeyListener(this);
                    while (high_low > 0) {
                        if (between == 200) {
                            High_sound();
                            high.setVisible(true);
                            low.setVisible(false);
                            Thread.sleep(225);
                            between++;
                        }
                        if (between == 400) {
                            Low_sound();
                            high.setVisible(false);
                            low.setVisible(true);
                            Thread.sleep(225);
                            between = 0;
                        }
                        between++;
                    }
                    frame.removeKeyListener(this);

                    if (high_low > -3) {
                        high.setVisible(false);
                        low.setVisible(false);
                        frame.remove(high);
                        frame.remove(low);
                        Blank.setVisible(false);
                        ((Container) Card_03.card03).remove(Blank);
                        ((Container) Card_03.card03).add(Card_04.card04);
                        Card_04.card04.setBounds(70, 0, 2000, 600);
                        Card_04.card04.setVisible(true);
                        ((JComponent) Card_04.card04).setOpaque(false);
                        if ((MyFrame.k04 > 24 && high_low == -1) || (MyFrame.k04 < 25 && high_low == -2)) {
                            Hit();
                            Bingo();
                        }
                        else {
                            Miss();
                        }
                    }
                }
            }
            if (double_card == 5) {
                ((Container) Card_04.card04).add(Blank);
                Blank.setVisible(true);
                Blank.setBounds(70, 0, 2000, 600);
                Blank.setOpaque(false);
                Check();
                if (double_card == 5) {
                    Random card_05 = new Random();
                    MyFrame.k05 = card_05.nextInt(49);
                    while (MyFrame.k05 == 0 ||
                            MyFrame.k05 == MyFrame.k01 || MyFrame.k05 == MyFrame.k02 ||
                            MyFrame.k05 == MyFrame.k03 || MyFrame.k05 == MyFrame.k04) {
                        MyFrame.k05 = card_05.nextInt(49);
                    }
                    new Card_05();
                    frame.add(high);
                    frame.add(low);
                    frame.addKeyListener(this);
                    while (high_low > 0) {
                        if (between == 200) {
                            High_sound();
                            high.setVisible(true);
                            low.setVisible(false);
                            Thread.sleep(200);
                            between++;
                        }
                        if (between == 400) {
                            Low_sound();
                            high.setVisible(false);
                            low.setVisible(true);
                            Thread.sleep(200);
                            between = 0;
                        }
                        between++;
                    }
                    frame.removeKeyListener(this);

                    if (high_low > -3) {
                        high.setVisible(false);
                        low.setVisible(false);
                        frame.remove(high);
                        frame.remove(low);
                        Blank.setVisible(false);
                        ((Container) Card_04.card04).remove(Blank);
                        ((Container) Card_04.card04).add(Card_05.card05);
                        Card_05.card05.setBounds(70, 0, 2000, 600);
                        Card_05.card05.setVisible(true);
                        ((JComponent) Card_05.card05).setOpaque(false);
                        if ((MyFrame.k05 > 24 && high_low == -1) || (MyFrame.k05 < 25 && high_low == -2)) {
                            Hit();
                            Bingo();
                        }
                        else {
                            Miss();
                        }
                    }
                }
            }
            if (double_card == 6) {
                ((Container) Card_05.card05).add(Blank);
                Blank.setVisible(true);
                Blank.setBounds(70, 0, 2000, 600);
                Blank.setOpaque(false);
                Check();
                if (double_card == 6) {
                    Random card_06 = new Random();
                    MyFrame.k06 = card_06.nextInt(49);
                    while (MyFrame.k06 == 0 ||
                            MyFrame.k06 == MyFrame.k01 || MyFrame.k06 == MyFrame.k02 ||
                            MyFrame.k06 == MyFrame.k03 || MyFrame.k06 == MyFrame.k04 ||
                            MyFrame.k06 == MyFrame.k05) {
                        MyFrame.k06 = card_06.nextInt(49);
                    }
                    new Card_06();
                    frame.add(high);
                    frame.add(low);
                    frame.addKeyListener(this);
                    while (high_low > 0) {
                        if (between == 200) {
                            High_sound();
                            high.setVisible(true);
                            low.setVisible(false);
                            Thread.sleep(175);
                            between++;
                        }
                        if (between == 400) {
                            Low_sound();
                            high.setVisible(false);
                            low.setVisible(true);
                            Thread.sleep(175);
                            between = 0;
                        }
                        between++;
                    }
                    frame.removeKeyListener(this);

                    if (high_low > -3) {
                        high.setVisible(false);
                        low.setVisible(false);
                        frame.remove(high);
                        frame.remove(low);
                        Blank.setVisible(false);
                        ((Container) Card_05.card05).remove(Blank);
                        ((Container) Card_05.card05).add(Card_06.card06);
                        Card_06.card06.setBounds(70, 0, 2000, 600);
                        Card_06.card06.setVisible(true);
                        ((JComponent) Card_06.card06).setOpaque(false);
                        if ((MyFrame.k06 > 24 && high_low == -1) || (MyFrame.k06 < 25 && high_low == -2)) {
                            Hit();
                            Bingo();
                        }
                        else {
                            Miss();
                        }
                    }
                }
            }
            if (double_card == 7) {
                ((Container) Card_06.card06).add(Blank);
                Blank.setVisible(true);
                Blank.setBounds(70, 0, 2000, 600);
                Blank.setOpaque(false);
                Check();
                if (double_card == 7) {
                    Random card_07 = new Random();
                    MyFrame.k07 = card_07.nextInt(49);
                    while (MyFrame.k07 == 0 ||
                            MyFrame.k07 == MyFrame.k01 || MyFrame.k07 == MyFrame.k02 ||
                            MyFrame.k07 == MyFrame.k03 || MyFrame.k07 == MyFrame.k04 ||
                            MyFrame.k07 == MyFrame.k05 || MyFrame.k07 == MyFrame.k06) {
                        MyFrame.k07 = card_07.nextInt(49);
                    }
                    new Card_07();
                    frame.add(high);
                    frame.add(low);
                    frame.addKeyListener(this);
                    while (high_low > 0) {
                        if (between == 200) {
                            High_sound();
                            high.setVisible(true);
                            low.setVisible(false);
                            Thread.sleep(150);
                            between++;
                        }
                        if (between == 400) {
                            Low_sound();
                            high.setVisible(false);
                            low.setVisible(true);
                            Thread.sleep(150);
                            between = 0;
                        }
                        between++;
                    }
                    frame.removeKeyListener(this);

                    if (high_low > -3) {
                        high.setVisible(false);
                        low.setVisible(false);
                        frame.remove(high);
                        frame.remove(low);
                        Blank.setVisible(false);
                        ((Container) Card_06.card06).remove(Blank);
                        ((Container) Card_06.card06).add(Card_07.card07);
                        Card_07.card07.setBounds(70, 0, 2000, 600);
                        Card_07.card07.setVisible(true);
                        ((JComponent) Card_07.card07).setOpaque(false);
                        if ((MyFrame.k07 > 24 && high_low == -1) || (MyFrame.k07 < 25 && high_low == -2)) {
                            Hit();
                            Bingo();
                        }
                        else {
                            Miss();
                        }
                    }
                }
            }
            if (double_card == 8) {
                ((Container) Card_07.card07).add(Blank);
                Blank.setVisible(true);
                Blank.setBounds(70, 0, 2000, 600);
                Blank.setOpaque(false);
                Check();
                if (double_card == 8) {
                    Random card_08 = new Random();
                    MyFrame.k08 = card_08.nextInt(49);
                    while (MyFrame.k08 == 0 ||
                            MyFrame.k08 == MyFrame.k01 || MyFrame.k08 == MyFrame.k02 ||
                            MyFrame.k08 == MyFrame.k03 || MyFrame.k08 == MyFrame.k04 ||
                            MyFrame.k08 == MyFrame.k05 || MyFrame.k08 == MyFrame.k06 ||
                            MyFrame.k08 == MyFrame.k07) {
                        MyFrame.k08 = card_08.nextInt(49);
                    }
                    new Card_08();
                    frame.add(high);
                    frame.add(low);
                    frame.addKeyListener(this);
                    while (high_low > 0) {
                        if (between == 200) {
                            High_sound();
                            high.setVisible(true);
                            low.setVisible(false);
                            Thread.sleep(125);
                            between++;
                        }
                        if (between == 400) {
                            Low_sound();
                            high.setVisible(false);
                            low.setVisible(true);
                            Thread.sleep(125);
                            between = 0;
                        }
                        between++;
                    }
                    frame.removeKeyListener(this);

                    if (high_low > -3) {
                        high.setVisible(false);
                        low.setVisible(false);
                        frame.remove(high);
                        frame.remove(low);
                        Blank.setVisible(false);
                        ((Container) Card_07.card07).remove(Blank);
                        ((Container) Card_07.card07).add(Card_08.card08);
                        Card_08.card08.setBounds(70, 0, 2000, 600);
                        Card_08.card08.setVisible(true);
                        ((JComponent) Card_08.card08).setOpaque(false);
                        if ((MyFrame.k08 > 24 && high_low == -1) || (MyFrame.k08 < 25 && high_low == -2)) {
                            Hit();
                            Bingo();
                        }
                        else {
                            Miss();
                        }
                    }
                }
            }
            if (double_card == 9) {
                ((Container) Card_08.card08).add(Blank);
                Blank.setVisible(true);
                Blank.setBounds(70, 0, 2000, 600);
                Blank.setOpaque(false);
                Check();
                if (double_card == 9) {
                    Random card_09 = new Random();
                    MyFrame.k09 = card_09.nextInt(49);
                    while (MyFrame.k09 == 0 ||
                            MyFrame.k09 == MyFrame.k01 || MyFrame.k09 == MyFrame.k02 ||
                            MyFrame.k09 == MyFrame.k03 || MyFrame.k09 == MyFrame.k04 ||
                            MyFrame.k09 == MyFrame.k05 || MyFrame.k09 == MyFrame.k06 ||
                            MyFrame.k09 == MyFrame.k07 || MyFrame.k09 == MyFrame.k08) {
                        MyFrame.k09 = card_09.nextInt(49);
                    }
                    new Card_09();
                    frame.add(high);
                    frame.add(low);
                    frame.addKeyListener(this);
                    while (high_low > 0) {
                        if (between == 200) {
                            High_sound();
                            high.setVisible(true);
                            low.setVisible(false);
                            Thread.sleep(100);
                            between++;
                        }
                        if (between == 400) {
                            Low_sound();
                            high.setVisible(false);
                            low.setVisible(true);
                            Thread.sleep(100);
                            between = 0;
                        }
                        between++;
                    }
                    frame.removeKeyListener(this);

                    if (high_low > -3) {

                        high.setVisible(false);
                        low.setVisible(false);
                        frame.remove(high);
                        frame.remove(low);
                        Blank.setVisible(false);
                        ((Container) Card_08.card08).remove(Blank);
                        ((Container) Card_08.card08).add(Card_09.card09);
                        Card_09.card09.setBounds(70, 0, 2000, 600);
                        Card_09.card09.setVisible(true);
                        ((JComponent) Card_09.card09).setOpaque(false);
                        if ((MyFrame.k09 > 24 && high_low == -1) || (MyFrame.k09 < 25 && high_low == -2)) {
                            Hit();
                            Bingo();
                        }
                        else {
                            Miss();
                        }
                    }
                }
            }
            if (double_card == 10) {
                ((Container) Card_09.card09).add(Blank);
                Blank.setVisible(true);
                Blank.setBounds(70, 0, 2000, 600);
                Blank.setOpaque(false);
                Check();
                if (double_card == 10) {
                    Random card_10 = new Random();
                    MyFrame.k10 = card_10.nextInt(49);
                    while (MyFrame.k10 == 0 ||
                            MyFrame.k10 == MyFrame.k01 || MyFrame.k10 == MyFrame.k02 ||
                            MyFrame.k10 == MyFrame.k03 || MyFrame.k10 == MyFrame.k04 ||
                            MyFrame.k10 == MyFrame.k05 || MyFrame.k10 == MyFrame.k06 ||
                            MyFrame.k10 == MyFrame.k07 || MyFrame.k10 == MyFrame.k08 ||
                            MyFrame.k10 == MyFrame.k09) {
                        MyFrame.k10 = card_10.nextInt(49);
                    }
                    new Card_10();
                    frame.add(high);
                    frame.add(low);
                    frame.addKeyListener(this);
                    while (high_low > 0) {
                        if (between == 200) {
                            High_sound();
                            high.setVisible(true);
                            low.setVisible(false);
                            Thread.sleep(75);
                            between++;
                        }
                        if (between == 400) {
                            Low_sound();
                            high.setVisible(false);
                            low.setVisible(true);
                            Thread.sleep(75);
                            between = 0;
                        }
                        between++;
                    }
                    frame.removeKeyListener(this);

                    if (high_low > -3) {
                        high.setVisible(false);
                        low.setVisible(false);
                        frame.remove(high);
                        frame.remove(low);
                        Blank.setVisible(false);
                        ((Container) Card_09.card09).remove(Blank);
                        ((Container) Card_09.card09).add(Card_10.card10);
                        Card_10.card10.setBounds(70, 0, 2000, 600);
                        Card_10.card10.setVisible(true);
                        ((JComponent) Card_10.card10).setOpaque(false);
                        if ((MyFrame.k10 > 24 && high_low == -1) || (MyFrame.k10 < 25 && high_low == -2)) {
                            Hit();
                            Bingo();
                        }
                        else {
                            Miss();
                        }
                    }
                }
            }
            if (double_card == 11) {
                ((Container) Card_10.card10).add(Blank);
                Blank.setVisible(true);
                Blank.setBounds(70, 0, 2000, 600);
                Blank.setOpaque(false);
                Check();
                if (double_card == 11) {
                    Random card_11 = new Random();
                    MyFrame.k11 = card_11.nextInt(49);
                    while (MyFrame.k11 == 0 ||
                            MyFrame.k11 == MyFrame.k01 || MyFrame.k11 == MyFrame.k02 ||
                            MyFrame.k11 == MyFrame.k03 || MyFrame.k11 == MyFrame.k04 ||
                            MyFrame.k11 == MyFrame.k05 || MyFrame.k11 == MyFrame.k06 ||
                            MyFrame.k11 == MyFrame.k07 || MyFrame.k11 == MyFrame.k08 ||
                            MyFrame.k11 == MyFrame.k09 || MyFrame.k11 == MyFrame.k10) {
                        MyFrame.k11 = card_11.nextInt(49);
                    }
                    new Card_11();
                    frame.add(high);
                    frame.add(low);
                    frame.addKeyListener(this);
                    while (high_low > 0) {
                        if (between == 200) {
                            High_sound();
                            high.setVisible(true);
                            low.setVisible(false);
                            Thread.sleep(50);
                            between++;
                        }
                        if (between == 400) {
                            Low_sound();
                            high.setVisible(false);
                            low.setVisible(true);
                            Thread.sleep(50);
                            between = 0;
                        }
                        between++;
                    }
                    frame.removeKeyListener(this);

                    if (high_low > -3) {
                        high.setVisible(false);
                        low.setVisible(false);
                        frame.remove(high);
                        frame.remove(low);
                        Blank.setVisible(false);
                        ((Container) Card_10.card10).remove(Blank);
                        ((Container) Card_10.card10).add(Card_11.card11);
                        Card_11.card11.setBounds(70, 0, 2000, 600);
                        Card_11.card11.setVisible(true);
                        ((JComponent) Card_11.card11).setOpaque(false);
                        if ((MyFrame.k11 > 24 && high_low == -1) || (MyFrame.k11 < 25 && high_low == -2)) {
                            Hit();
                            Bingo();
                        }
                        else {
                            Miss();
                        }
                    }
                }
            }
            if (double_card == 12) {
                ((Container) Card_11.card11).add(Blank);
                Blank.setVisible(true);
                Blank.setBounds(70, 0, 2000, 600);
                Blank.setOpaque(false);
                double_card =- 3;
            }
            if (double_card == -3) {
                frame.removeKeyListener(this);
                MyFrame.win_value = (int)twice;
                high.setVisible(false);
                frame.remove(high);
                low.setVisible(false);
                frame.remove(low);
                gambling = 0;
                new Cashing();
            }
            if (half == 1) {
                frame.removeKeyListener(this);
                high.setVisible(false);
                frame.remove(high);
                low.setVisible(false);
                frame.remove(low);
                labelT10.setVisible(false);
                table.remove(labelT10);
                MyFrame.Credit.setVisible(false);
                frame.remove(MyFrame.Credit);
                half_card = double_card;
                frame.add(Choice_2.you_win);
                Choice_2.you_win.setVisible(true);
                x3 = ((int) Doubling.twice) / 2;
                Half half = new Half();
                Winner winner = new Winner();
                Thread Winner = new Thread(winner);
                half.start();
                Winner.start();
                frame.add(high);
                frame.add(low);
            }
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {

        switch(e.getKeyCode()) {

            case 17 : // KEYPAD 'CTRL'

                int location = e.getKeyLocation();

                if (location == KeyEvent.KEY_LOCATION_LEFT) { // LOW
                    high_low = -2;
                    High.setVisible(false);
                    frame.remove(High);
                    Low.setVisible(false);
                    frame.remove(Low);
                    Low.setBounds((x_low + (double_card * 60)),550,500,200);
                    frame.add(Low);
                    Low.setVisible(true);
                    break;
                }
                if (location == KeyEvent.KEY_LOCATION_RIGHT) { // HIGH
                    high_low = -1;
                    Low.setVisible(false);
                    frame.remove(Low);
                    High.setVisible(false);
                    frame.remove(High);
                    High.setBounds((x_high + (double_card * 60)),550,500,200);
                    frame.add(High);
                    High.setVisible(true);
                    break;
                }

            case 53 : // KEYPAD '5' - TAKE HALF

                if (twice > 1) {
                    high_low = -100;
                    half = 1;
                }
                break;

            case 32 : // KEYPAD 'SPACE' - TAKE ALL

                high_low = -100;
                double_card = -3;
                gambling = 0;
                break;
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
    void High_sound() {
        URL key_high = this.getClass().getClassLoader().getResource("resources/High.wav");
        AudioInputStream audio_High;
        try {
            assert key_high != null;
            audio_High = AudioSystem.getAudioInputStream(key_high);
        } catch (UnsupportedAudioFileException | IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            this.High_Sound = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            throw new RuntimeException(ex);
        }
        try {
            High_Sound.open(audio_High);
        } catch (LineUnavailableException | IOException ex) {
            throw new RuntimeException(ex);
        }
        this.High_Sound.start();
    }
    void Low_sound() {
        URL key_low = this.getClass().getClassLoader().getResource("resources/Low.wav");
        AudioInputStream audio_Low;
        try {
            assert key_low != null;
            audio_Low = AudioSystem.getAudioInputStream(key_low);
        } catch (UnsupportedAudioFileException | IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            this.Low_Sound = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            throw new RuntimeException(ex);
        }
        try {
            Low_Sound.open(audio_Low);
        } catch (LineUnavailableException | IOException ex) {
            throw new RuntimeException(ex);
        }
        this.Low_Sound.start();
    }
    void Hit() {
        URL hit = this.getClass().getClassLoader().getResource("resources/Bingo.wav");
        AudioInputStream audio_Hit;
        try {
            assert hit != null;
            audio_Hit = AudioSystem.getAudioInputStream(hit);
        } catch (UnsupportedAudioFileException | IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            this.Bingo_Sound = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            throw new RuntimeException(ex);
        }
        try {
            Bingo_Sound.open(audio_Hit);
        } catch (LineUnavailableException | IOException ex) {
            throw new RuntimeException(ex);
        }
        this.Bingo_Sound.start();
    }
    void clearing() {
        frame.removeKeyListener(this);
        MyFrame.win_value = MyFrame.win_value - 100;
        MyFrame.cr = MyFrame.cr + 100;
    }
    void Bingo() throws InterruptedException {
        frame.add(Choice_2.you_win);
        Choice_2.you_win.setVisible(true);
        double_card++;
        high_low = 1;
        labelT10.setVisible(false);
        table.remove(labelT10);
        twice = twice * 2;
        labelT10.setText((int) twice + " ");
        table.add(labelT10);
        labelT10.setVisible(true);
        Thread.sleep(1400);
        Choice_2.you_win.setVisible(false);
        frame.remove(Choice_2.you_win);
    }
    void Miss() {
        labelT10.setVisible(false);
        table.remove(labelT10);
        labelT10.setText(0 + " ");
        table.add(labelT10);
        labelT10.setVisible(true);
        gambling = 0;
        clearing();
        Win.winner = 0;
        Choice_2.choice = 0;
    }
    void Check() {
        if (twice > 9999) {
            high_low =- 100;
            double_card =- 3;
            gambling = 0;
        }
    }
}
