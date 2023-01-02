package rs.baci.Poker_2;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
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

public class Dupliranje implements MainFrame, KeyListener, Dobici, Brojevi {
    JLabel veca = new JLabel("8, 9, 10, J, Q, K = VEĆA");
    JLabel manja = new JLabel(" A, 2, 3, 4, 5, 6 = MANJA");
    public static JLabel VECA = new JLabel("VEĆA");
    public static JLabel MANJA = new JLabel("MANJA");
    private static BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(Objects.requireNonNull(MyFrame.class.getClassLoader().getResource(path)));
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return null;
        }
    }
    static ImageIcon prazna = new ImageIcon(Objects.requireNonNull(loadImage("resources/53.png")));

    public static JLabel PRAZNA = new JLabel(prazna);

    public static int vecamanja;
    int razmak;
    public static int karta;
    public static int xkarta;
    int kockanje;
    public static int pola;
    public static double duplo;
    int XVECA;
    int XMANJA;
    public static int x3;

    Clip VecaSound;
    Clip ManjaSound;
    Clip PogodioSound;

    Dupliranje() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

        Izbor2.izbor=0;
        pola=0;
        kockanje=1;

        duplo=MyFrame.ukupno;

        XVECA = 600;
        XMANJA = 600;

        frame.add(veca);
        frame.add(manja);
        veca.setBounds(660,920,500,40);
        manja.setBounds(660,960,500,40);
        veca.setForeground(color1);
        manja.setForeground(color1);
        veca.setFont(font1);
        manja.setFont(font1);
        veca.setOpaque(false);
        manja.setOpaque(false);

        VECA.setVisible(false);
        MANJA.setVisible(false);
        VECA.setForeground(color1);
        MANJA.setForeground(color1);
        VECA.setBounds(600,550,500,200);
        MANJA.setBounds(600,550,500,200);
        VECA.setFont(font2);
        MANJA.setFont(font2);
        VECA.setOpaque(false);
        MANJA.setOpaque(false);

        razmak = 0;
        karta = 1;
        vecamanja=1;

        while (kockanje==1) {

            if (karta==1) {

                frame.add(PRAZNA);
                PRAZNA.setVisible(true);
                PRAZNA.setBounds(-800, 350, 2000, 600);
                PRAZNA.setOpaque(false);

                provera();

                if (karta == 1) {

                    Random karta01 = new Random();

                    MyFrame.k01 = karta01.nextInt(49);

                    while (MyFrame.k01 == 0) {

                        MyFrame.k01 = karta01.nextInt(49);

                    }

                    new Karta01();

                    frame.addKeyListener(this);

                    while (vecamanja > 0) {

                        if (razmak == 200) {

                            vecasound();
                            veca.setVisible(true);
                            manja.setVisible(false);
                            Thread.sleep(300);
                            razmak++;

                        }

                        if (razmak == 400) {

                            manjasound();
                            veca.setVisible(false);
                            manja.setVisible(true);
                            Thread.sleep(300);
                            razmak = 0;

                        }
                        razmak++;
                    }

                    frame.removeKeyListener(this);

                    if (vecamanja > -3) {

                        veca.setVisible(false);
                        manja.setVisible(false);
                        frame.remove(veca);
                        frame.remove(manja);

                        PRAZNA.setVisible(false);
                        frame.remove(PRAZNA);
                        frame.add(Karta01.card01);
                        Karta01.card01.setBounds(-805, 350, 2000, 600);
                        Karta01.card01.setVisible(true);

                        if ((MyFrame.k01 > 24 && vecamanja == -1) || (MyFrame.k01 < 25 && vecamanja == -2)) {

                            pogodio();

                            pogodak();

                        } else {

                            promasaj();
                        }
                    }
                }
            }

            if (karta==2) {

                ((Container) Karta01.card01).add(PRAZNA);
                PRAZNA.setVisible(true);
                PRAZNA.setBounds(70, 0, 2000, 600);
                PRAZNA.setOpaque(false);

                provera();

                if (karta == 2) {

                    Random karta02 = new Random();

                    MyFrame.k02 = karta02.nextInt(49);

                    while (MyFrame.k02 == 0 ||
                            MyFrame.k02 == MyFrame.k01) {

                        MyFrame.k02 = karta02.nextInt(49);

                    }

                    new Karta02();

                    frame.add(veca);
                    frame.add(manja);

                    frame.addKeyListener(this);

                    while (vecamanja > 0) {

                        if (razmak == 200) {

                            vecasound();
                            veca.setVisible(true);
                            manja.setVisible(false);
                            Thread.sleep(275);
                            razmak++;

                        }

                        if (razmak == 400) {

                            manjasound();
                            veca.setVisible(false);
                            manja.setVisible(true);
                            Thread.sleep(275);
                            razmak = 0;

                        }
                        razmak++;
                    }

                    frame.removeKeyListener(this);

                    if (vecamanja > -3) {

                        veca.setVisible(false);
                        manja.setVisible(false);
                        frame.remove(veca);
                        frame.remove(manja);

                        PRAZNA.setVisible(false);
                        ((Container) Karta01.card01).remove(PRAZNA);
                        ((Container) Karta01.card01).add(Karta02.card02);
                        Karta02.card02.setBounds(70, 0, 2000, 600);
                        Karta02.card02.setVisible(true);
                        ((JComponent) Karta02.card02).setOpaque(false);

                        if ((MyFrame.k02 > 24 && vecamanja == -1) || (MyFrame.k02 < 25 && vecamanja == -2)) {

                            pogodio();

                            pogodak();

                        } else {

                            promasaj();

                        }
                    }
                }
            }

            if (karta==3) {

                ((Container) Karta02.card02).add(PRAZNA);
                PRAZNA.setVisible(true);
                PRAZNA.setBounds(70, 0, 2000, 600);
                PRAZNA.setOpaque(false);

                provera();

                if (karta == 3) {

                    Random karta03 = new Random();

                    MyFrame.k03 = karta03.nextInt(49);

                    while (MyFrame.k03 == 0 ||
                            MyFrame.k03 == MyFrame.k01 ||
                            MyFrame.k03 == MyFrame.k02) {

                        MyFrame.k03 = karta03.nextInt(49);

                    }

                    new Karta03();

                    frame.add(veca);
                    frame.add(manja);

                    frame.addKeyListener(this);

                    while (vecamanja > 0) {

                        if (razmak == 200) {

                            vecasound();
                            veca.setVisible(true);
                            manja.setVisible(false);
                            Thread.sleep(250);
                            razmak++;

                        }

                        if (razmak == 400) {

                            manjasound();
                            veca.setVisible(false);
                            manja.setVisible(true);
                            Thread.sleep(250);
                            razmak = 0;

                        }
                        razmak++;
                    }

                    frame.removeKeyListener(this);

                    if (vecamanja > -3) {

                        veca.setVisible(false);
                        manja.setVisible(false);
                        frame.remove(veca);
                        frame.remove(manja);

                        PRAZNA.setVisible(false);
                        ((Container) Karta02.card02).remove(PRAZNA);
                        ((Container) Karta02.card02).add(Karta03.card03);
                        Karta03.card03.setBounds(70, 0, 2000, 600);
                        Karta03.card03.setVisible(true);
                        ((JComponent) Karta03.card03).setOpaque(false);

                        if ((MyFrame.k03 > 24 && vecamanja == -1) || (MyFrame.k03 < 25 && vecamanja == -2)) {

                            pogodio();

                            pogodak();

                        } else {

                            promasaj();

                        }
                    }
                }
            }

            if (karta==4) {

                ((Container) Karta03.card03).add(PRAZNA);
                PRAZNA.setVisible(true);
                PRAZNA.setBounds(70, 0, 2000, 600);
                PRAZNA.setOpaque(false);

                provera();

                if (karta == 4) {

                    Random karta04 = new Random();

                    MyFrame.k04 = karta04.nextInt(49);

                    while (MyFrame.k04 == 0 ||
                            MyFrame.k04 == MyFrame.k01 ||
                            MyFrame.k04 == MyFrame.k02 ||
                            MyFrame.k04 == MyFrame.k03) {

                        MyFrame.k04 = karta04.nextInt(49);

                    }

                    new Karta04();

                    frame.add(veca);
                    frame.add(manja);

                    frame.addKeyListener(this);

                    while (vecamanja > 0) {

                        if (razmak == 200) {

                            vecasound();
                            veca.setVisible(true);
                            manja.setVisible(false);
                            Thread.sleep(225);
                            razmak++;

                        }

                        if (razmak == 400) {

                            manjasound();
                            veca.setVisible(false);
                            manja.setVisible(true);
                            Thread.sleep(225);
                            razmak = 0;

                        }
                        razmak++;
                    }

                    frame.removeKeyListener(this);

                    if (vecamanja > -3) {

                        veca.setVisible(false);
                        manja.setVisible(false);
                        frame.remove(veca);
                        frame.remove(manja);

                        PRAZNA.setVisible(false);
                        ((Container) Karta03.card03).remove(PRAZNA);
                        ((Container) Karta03.card03).add(Karta04.card04);
                        Karta04.card04.setBounds(70, 0, 2000, 600);
                        Karta04.card04.setVisible(true);
                        ((JComponent) Karta04.card04).setOpaque(false);

                        if ((MyFrame.k04 > 24 && vecamanja == -1) || (MyFrame.k04 < 25 && vecamanja == -2)) {

                            pogodio();

                            pogodak();

                        } else {

                            promasaj();

                        }
                    }
                }
            }

            if (karta==5) {

                ((Container) Karta04.card04).add(PRAZNA);
                PRAZNA.setVisible(true);
                PRAZNA.setBounds(70, 0, 2000, 600);
                PRAZNA.setOpaque(false);

                provera();

                if (karta == 5) {

                    Random karta05 = new Random();

                    MyFrame.k05 = karta05.nextInt(49);

                    while (MyFrame.k05 == 0 ||
                            MyFrame.k05 == MyFrame.k01 ||
                            MyFrame.k05 == MyFrame.k02 ||
                            MyFrame.k05 == MyFrame.k03 ||
                            MyFrame.k05 == MyFrame.k04) {

                        MyFrame.k05 = karta05.nextInt(49);

                    }

                    new Karta05();

                    frame.add(veca);
                    frame.add(manja);

                    frame.addKeyListener(this);

                    while (vecamanja > 0) {

                        if (razmak == 200) {

                            vecasound();
                            veca.setVisible(true);
                            manja.setVisible(false);
                            Thread.sleep(200);
                            razmak++;

                        }

                        if (razmak == 400) {

                            manjasound();
                            veca.setVisible(false);
                            manja.setVisible(true);
                            Thread.sleep(200);
                            razmak = 0;

                        }
                        razmak++;
                    }

                    frame.removeKeyListener(this);

                    if (vecamanja > -3) {

                        veca.setVisible(false);
                        manja.setVisible(false);
                        frame.remove(veca);
                        frame.remove(manja);

                        PRAZNA.setVisible(false);
                        ((Container) Karta04.card04).remove(PRAZNA);
                        ((Container) Karta04.card04).add(Karta05.card05);
                        Karta05.card05.setBounds(70, 0, 2000, 600);
                        Karta05.card05.setVisible(true);
                        ((JComponent) Karta05.card05).setOpaque(false);

                        if ((MyFrame.k05 > 24 && vecamanja == -1) || (MyFrame.k05 < 25 && vecamanja == -2)) {

                            pogodio();

                            pogodak();

                        } else {

                            promasaj();
                        }
                    }
                }
            }

            if (karta==6) {

                ((Container) Karta05.card05).add(PRAZNA);
                PRAZNA.setVisible(true);
                PRAZNA.setBounds(70, 0, 2000, 600);
                PRAZNA.setOpaque(false);

                provera();

                if (karta == 6) {

                    Random karta06 = new Random();

                    MyFrame.k06 = karta06.nextInt(49);

                    while (MyFrame.k06 == 0 ||
                            MyFrame.k06 == MyFrame.k01 ||
                            MyFrame.k06 == MyFrame.k02 ||
                            MyFrame.k06 == MyFrame.k03 ||
                            MyFrame.k06 == MyFrame.k04 ||
                            MyFrame.k06 == MyFrame.k05) {

                        MyFrame.k06 = karta06.nextInt(49);

                    }

                    new Karta06();

                    frame.add(veca);
                    frame.add(manja);

                    frame.addKeyListener(this);

                    while (vecamanja > 0) {

                        if (razmak == 200) {

                            vecasound();
                            veca.setVisible(true);
                            manja.setVisible(false);
                            Thread.sleep(175);
                            razmak++;

                        }

                        if (razmak == 400) {

                            manjasound();
                            veca.setVisible(false);
                            manja.setVisible(true);
                            Thread.sleep(175);
                            razmak = 0;

                        }
                        razmak++;
                    }

                    frame.removeKeyListener(this);

                    if (vecamanja > -3) {

                        veca.setVisible(false);
                        manja.setVisible(false);
                        frame.remove(veca);
                        frame.remove(manja);

                        PRAZNA.setVisible(false);
                        ((Container) Karta05.card05).remove(PRAZNA);
                        ((Container) Karta05.card05).add(Karta06.card06);
                        Karta06.card06.setBounds(70, 0, 2000, 600);
                        Karta06.card06.setVisible(true);
                        ((JComponent) Karta06.card06).setOpaque(false);

                        if ((MyFrame.k06 > 24 && vecamanja == -1) || (MyFrame.k06 < 25 && vecamanja == -2)) {

                            pogodio();

                            pogodak();

                        } else {

                            promasaj();

                        }
                    }
                }
            }

            if (karta==7) {

                ((Container) Karta06.card06).add(PRAZNA);
                PRAZNA.setVisible(true);
                PRAZNA.setBounds(70, 0, 2000, 600);
                PRAZNA.setOpaque(false);

                provera();

                if (karta == 7) {

                    Random karta07 = new Random();

                    MyFrame.k07 = karta07.nextInt(49);

                    while (MyFrame.k07 == 0 ||
                            MyFrame.k07 == MyFrame.k01 ||
                            MyFrame.k07 == MyFrame.k02 ||
                            MyFrame.k07 == MyFrame.k03 ||
                            MyFrame.k07 == MyFrame.k04 ||
                            MyFrame.k07 == MyFrame.k05 ||
                            MyFrame.k07 == MyFrame.k06) {

                        MyFrame.k07 = karta07.nextInt(49);

                    }

                    new Karta07();

                    frame.add(veca);
                    frame.add(manja);

                    frame.addKeyListener(this);

                    while (vecamanja > 0) {

                        if (razmak == 200) {

                            vecasound();
                            veca.setVisible(true);
                            manja.setVisible(false);
                            Thread.sleep(150);
                            razmak++;

                        }

                        if (razmak == 400) {

                            manjasound();
                            veca.setVisible(false);
                            manja.setVisible(true);
                            Thread.sleep(150);
                            razmak = 0;

                        }
                        razmak++;
                    }

                    frame.removeKeyListener(this);

                    if (vecamanja > -3) {

                        veca.setVisible(false);
                        manja.setVisible(false);
                        frame.remove(veca);
                        frame.remove(manja);

                        PRAZNA.setVisible(false);
                        ((Container) Karta06.card06).remove(PRAZNA);
                        ((Container) Karta06.card06).add(Karta07.card07);
                        Karta07.card07.setBounds(70, 0, 2000, 600);
                        Karta07.card07.setVisible(true);
                        ((JComponent) Karta07.card07).setOpaque(false);

                        if ((MyFrame.k07 > 24 && vecamanja == -1) || (MyFrame.k07 < 25 && vecamanja == -2)) {

                            pogodio();

                            pogodak();

                        } else {

                            promasaj();

                        }
                    }
                }
            }

            if (karta==8) {

                ((Container) Karta07.card07).add(PRAZNA);
                PRAZNA.setVisible(true);
                PRAZNA.setBounds(70, 0, 2000, 600);
                PRAZNA.setOpaque(false);

                provera();

                if (karta == 8) {

                    Random karta08 = new Random();

                    MyFrame.k08 = karta08.nextInt(49);

                    while (MyFrame.k08 == 0 ||
                            MyFrame.k08 == MyFrame.k01 ||
                            MyFrame.k08 == MyFrame.k02 ||
                            MyFrame.k08 == MyFrame.k03 ||
                            MyFrame.k08 == MyFrame.k04 ||
                            MyFrame.k08 == MyFrame.k05 ||
                            MyFrame.k08 == MyFrame.k06 ||
                            MyFrame.k08 == MyFrame.k07) {

                        MyFrame.k08 = karta08.nextInt(49);

                    }

                    new Karta08();

                    frame.add(veca);
                    frame.add(manja);

                    frame.addKeyListener(this);

                    while (vecamanja > 0) {

                        if (razmak == 200) {

                            vecasound();
                            veca.setVisible(true);
                            manja.setVisible(false);
                            Thread.sleep(125);
                            razmak++;

                        }

                        if (razmak == 400) {

                            manjasound();
                            veca.setVisible(false);
                            manja.setVisible(true);
                            Thread.sleep(125);
                            razmak = 0;

                        }
                        razmak++;
                    }

                    frame.removeKeyListener(this);

                    if (vecamanja > -3) {

                        veca.setVisible(false);
                        manja.setVisible(false);
                        frame.remove(veca);
                        frame.remove(manja);

                        PRAZNA.setVisible(false);
                        ((Container) Karta07.card07).remove(PRAZNA);
                        ((Container) Karta07.card07).add(Karta08.card08);
                        Karta08.card08.setBounds(70, 0, 2000, 600);
                        Karta08.card08.setVisible(true);
                        ((JComponent) Karta08.card08).setOpaque(false);

                        if ((MyFrame.k08 > 24 && vecamanja == -1) || (MyFrame.k08 < 25 && vecamanja == -2)) {

                            pogodio();

                            pogodak();

                        } else {

                            promasaj();
                        }
                    }
                }
            }

            if (karta==9) {

                ((Container) Karta08.card08).add(PRAZNA);
                PRAZNA.setVisible(true);
                PRAZNA.setBounds(70, 0, 2000, 600);
                PRAZNA.setOpaque(false);

                provera();

                if (karta == 9) {

                    Random karta09 = new Random();

                    MyFrame.k09 = karta09.nextInt(49);

                    while (MyFrame.k09 == 0 ||
                            MyFrame.k09 == MyFrame.k01 ||
                            MyFrame.k09 == MyFrame.k02 ||
                            MyFrame.k09 == MyFrame.k03 ||
                            MyFrame.k09 == MyFrame.k04 ||
                            MyFrame.k09 == MyFrame.k05 ||
                            MyFrame.k09 == MyFrame.k06 ||
                            MyFrame.k09 == MyFrame.k07 ||
                            MyFrame.k09 == MyFrame.k08) {

                        MyFrame.k09 = karta09.nextInt(49);

                    }

                    new Karta09();

                    frame.add(veca);
                    frame.add(manja);

                    frame.addKeyListener(this);

                    while (vecamanja > 0) {

                        if (razmak == 200) {

                            vecasound();
                            veca.setVisible(true);
                            manja.setVisible(false);
                            Thread.sleep(100);
                            razmak++;

                        }

                        if (razmak == 400) {

                            manjasound();
                            veca.setVisible(false);
                            manja.setVisible(true);
                            Thread.sleep(100);
                            razmak = 0;

                        }
                        razmak++;
                    }

                    frame.removeKeyListener(this);

                    if (vecamanja > -3) {

                        veca.setVisible(false);
                        manja.setVisible(false);
                        frame.remove(veca);
                        frame.remove(manja);

                        PRAZNA.setVisible(false);
                        ((Container) Karta08.card08).remove(PRAZNA);
                        ((Container) Karta08.card08).add(Karta09.card09);
                        Karta09.card09.setBounds(70, 0, 2000, 600);
                        Karta09.card09.setVisible(true);
                        ((JComponent) Karta09.card09).setOpaque(false);

                        if ((MyFrame.k09 > 24 && vecamanja == -1) || (MyFrame.k09 < 25 && vecamanja == -2)) {

                            pogodio();

                            pogodak();

                        } else {

                            promasaj();

                        }
                    }
                }
            }

            if (karta==10) {

                ((Container) Karta09.card09).add(PRAZNA);
                PRAZNA.setVisible(true);
                PRAZNA.setBounds(70, 0, 2000, 600);
                PRAZNA.setOpaque(false);

                provera();

                if (karta == 10) {

                    Random karta10 = new Random();

                    MyFrame.k10 = karta10.nextInt(49);

                    while (MyFrame.k10 == 0 ||
                            MyFrame.k10 == MyFrame.k01 ||
                            MyFrame.k10 == MyFrame.k02 ||
                            MyFrame.k10 == MyFrame.k03 ||
                            MyFrame.k10 == MyFrame.k04 ||
                            MyFrame.k10 == MyFrame.k05 ||
                            MyFrame.k10 == MyFrame.k06 ||
                            MyFrame.k10 == MyFrame.k07 ||
                            MyFrame.k10 == MyFrame.k08 ||
                            MyFrame.k10 == MyFrame.k09) {

                        MyFrame.k10 = karta10.nextInt(49);

                    }

                    new Karta10();

                    frame.add(veca);
                    frame.add(manja);

                    frame.addKeyListener(this);

                    while (vecamanja > 0) {

                        if (razmak == 200) {

                            vecasound();
                            veca.setVisible(true);
                            manja.setVisible(false);
                            Thread.sleep(75);
                            razmak++;

                        }

                        if (razmak == 400) {

                            manjasound();
                            veca.setVisible(false);
                            manja.setVisible(true);
                            Thread.sleep(75);
                            razmak = 0;

                        }
                        razmak++;
                    }

                    frame.removeKeyListener(this);

                    if (vecamanja > -3) {

                        veca.setVisible(false);
                        manja.setVisible(false);
                        frame.remove(veca);
                        frame.remove(manja);

                        PRAZNA.setVisible(false);
                        ((Container) Karta09.card09).remove(PRAZNA);
                        ((Container) Karta09.card09).add(Karta10.card10);
                        Karta10.card10.setBounds(70, 0, 2000, 600);
                        Karta10.card10.setVisible(true);
                        ((JComponent) Karta10.card10).setOpaque(false);

                        if ((MyFrame.k10 > 24 && vecamanja == -1) || (MyFrame.k10 < 25 && vecamanja == -2)) {

                            pogodio();

                            pogodak();

                        } else {

                            promasaj();

                        }
                    }
                }
            }

            if (karta==11) {

                ((Container) Karta10.card10).add(PRAZNA);
                PRAZNA.setVisible(true);
                PRAZNA.setBounds(70, 0, 2000, 600);
                PRAZNA.setOpaque(false);

                provera();

                if (karta == 11) {

                    Random karta11 = new Random();

                    MyFrame.k11 = karta11.nextInt(49);

                    while (MyFrame.k11 == 0 ||
                            MyFrame.k11 == MyFrame.k01 ||
                            MyFrame.k11 == MyFrame.k02 ||
                            MyFrame.k11 == MyFrame.k03 ||
                            MyFrame.k11 == MyFrame.k04 ||
                            MyFrame.k11 == MyFrame.k05 ||
                            MyFrame.k11 == MyFrame.k06 ||
                            MyFrame.k11 == MyFrame.k07 ||
                            MyFrame.k11 == MyFrame.k08 ||
                            MyFrame.k11 == MyFrame.k09 ||
                            MyFrame.k11 == MyFrame.k10) {

                        MyFrame.k11 = karta11.nextInt(49);

                    }

                    new Karta11();

                    frame.add(veca);
                    frame.add(manja);

                    frame.addKeyListener(this);

                    while (vecamanja > 0) {

                        if (razmak == 200) {

                            vecasound();
                            veca.setVisible(true);
                            manja.setVisible(false);
                            Thread.sleep(50);
                            razmak++;

                        }

                        if (razmak == 400) {

                            manjasound();
                            veca.setVisible(false);
                            manja.setVisible(true);
                            Thread.sleep(50);
                            razmak = 0;

                        }
                        razmak++;
                    }

                    frame.removeKeyListener(this);

                    if (vecamanja > -3) {

                        veca.setVisible(false);
                        manja.setVisible(false);
                        frame.remove(veca);
                        frame.remove(manja);

                        PRAZNA.setVisible(false);
                        ((Container) Karta10.card10).remove(PRAZNA);
                        ((Container) Karta10.card10).add(Karta11.card11);
                        Karta11.card11.setBounds(70, 0, 2000, 600);
                        Karta11.card11.setVisible(true);
                        ((JComponent) Karta11.card11).setOpaque(false);

                        if ((MyFrame.k11 > 24 && vecamanja == -1) || (MyFrame.k11 < 25 && vecamanja == -2)) {

                            pogodio();

                            pogodak();

                        } else {

                            promasaj();

                        }
                    }
                }
            }

            if (karta==12) {

                ((Container) Karta11.card11).add(PRAZNA);
                PRAZNA.setVisible(true);
                PRAZNA.setBounds(70, 0, 2000, 600);
                PRAZNA.setOpaque(false);
                karta=-3;

            }

            if (karta==-3) {

                frame.removeKeyListener(this);

                MyFrame.dobitak=(int)duplo;

                veca.setVisible(false);
                frame.remove(veca);
                manja.setVisible(false);
                frame.remove(manja);

                kockanje=0;
                new Kasiranje();

            }

            if (pola==1) {

                frame.removeKeyListener(this);

                veca.setVisible(false);
                frame.remove(veca);
                manja.setVisible(false);
                frame.remove(manja);
                labelT10.setVisible(false);
                tabela.remove(labelT10);
                MyFrame.Jlabelcr.setVisible(false);
                frame.remove(MyFrame.Jlabelcr);
                xkarta=karta;

                frame.add(Izbor2.pobeda);
                Izbor2.pobeda.setVisible(true);

                x3=((int)Dupliranje.duplo)/2;

                new Polovina();
                new Pobednik();
             /*
                Polovina polovina = new Polovina();
                Pobednik pobednik = new Pobednik();
                Thread Pobednik = new Thread(pobednik);
                polovina.start();
                Pobednik.start();
             */
                frame.add(veca);
                frame.add(manja);

            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch(e.getKeyCode()) {

            case 17 : // KEYPAD 'CTRL'

                int location = e.getKeyLocation();

                if (location == KeyEvent.KEY_LOCATION_LEFT) { // TIEF

                    vecamanja = -2;
                    VECA.setVisible(false);
                    frame.remove(VECA);
                    MANJA.setVisible(false);
                    frame.remove(MANJA);
                    MANJA.setBounds((XMANJA+(karta*60)),550,500,200);
                    frame.add(MANJA);
                    MANJA.setVisible(true);
                    break;
                }

                if (location == KeyEvent.KEY_LOCATION_RIGHT) { // HOCH

                    vecamanja = -1;
                    MANJA.setVisible(false);
                    frame.remove(MANJA);
                    VECA.setVisible(false);
                    frame.remove(VECA);
                    VECA.setBounds((XVECA+(karta*60)),550,500,200);
                    frame.add(VECA);
                    VECA.setVisible(true);
                    break;
                }

            case 53 : // KEYPAD '5' - UZIMANJE POLOVINE

                if (duplo>1) {

                    vecamanja = -100;
                    pola = 1;

                    break;

                }

                else {

                    break;

                }

            case 32 : // KEYPAD 'SPACE' - KASIRANJE

                vecamanja = -100;
                karta = -3;
                kockanje = 0;

                break;

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    void vecasound() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        URL tasterveca = this.getClass().getClassLoader().getResource("resources/Hoch.wav");
        AudioInputStream audioVeca;
        try {
            assert tasterveca != null;
            audioVeca = AudioSystem.getAudioInputStream(tasterveca);
        } catch (UnsupportedAudioFileException | IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            this.VecaSound = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            throw new RuntimeException(ex);
        }
        try {
            VecaSound.open(audioVeca);
        } catch (LineUnavailableException | IOException ex) {
            throw new RuntimeException(ex);
        }
        this.VecaSound.start();

    }

    void manjasound() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        URL tastermanja = this.getClass().getClassLoader().getResource("resources/Tief.wav");
        AudioInputStream audioManja;
        try {
            assert tastermanja != null;
            audioManja = AudioSystem.getAudioInputStream(tastermanja);
        } catch (UnsupportedAudioFileException | IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            this.ManjaSound = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            throw new RuntimeException(ex);
        }
        try {
            ManjaSound.open(audioManja);
        } catch (LineUnavailableException | IOException ex) {
            throw new RuntimeException(ex);
        }
        this.ManjaSound.start();

    }

    void pogodio() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        URL pogodak = this.getClass().getClassLoader().getResource("resources/Pogodak.wav");
        AudioInputStream audioPogodak;
        try {
            assert pogodak != null;
            audioPogodak = AudioSystem.getAudioInputStream(pogodak);
        } catch (UnsupportedAudioFileException | IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
            this.PogodioSound = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            throw new RuntimeException(ex);
        }
        try {
            PogodioSound.open(audioPogodak);
        } catch (LineUnavailableException | IOException ex) {
            throw new RuntimeException(ex);
        }
        this.PogodioSound.start();

    }

    void clearing() {

        frame.removeKeyListener(this);

        MyFrame.dobitak = MyFrame.dobitak-100;
        MyFrame.cr = MyFrame.cr+100;

    }

    void pogodak() throws InterruptedException {

        frame.add(Izbor2.pobeda);
        Izbor2.pobeda.setVisible(true);
        karta++;
        vecamanja=1;

        labelT10.setVisible(false);
        tabela.remove(labelT10);
        duplo=duplo*2;
        labelT10.setText(""+String.valueOf((int)duplo+" "));
        tabela.add(labelT10);
        labelT10.setVisible(true);

        Thread.sleep(1400);

        Izbor2.pobeda.setVisible(false);
        frame.remove(Izbor2.pobeda);

    }

    void promasaj() throws InterruptedException {

        labelT10.setVisible(false);
        tabela.remove(labelT10);
        labelT10.setText(0+" ");
        tabela.add(labelT10);
        labelT10.setVisible(true);
        kockanje=0;

        clearing();

        Dobitak.DOBITAK = 0;
        Izbor2.izbor = 0;

    }
    void provera() {

        if (duplo>9999) {

            vecamanja=-100;
            karta=-3;
            kockanje=0;

        }

    }

}
