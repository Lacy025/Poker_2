package rs.baci.Poker_2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;
import java.net.URL;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class MyFrame implements Brojevi, Dobici, MainFrame, KeyListener, Serializable {
	@Serial
	private static final long serialVersionUID = 1L;
	Clip introSound;
	Clip credit_sound;
	Clip bet_sound;
	Clip auto_hold_sound;
	Clip cashing_sound;
	static int kr;
	static int cr;
	static int ch;
	public int uu = 1;
	public static int ul = 1;
	public static int ah = 1;
	public static int blocked;
	public static int win_value;
	public static int final_value;
	public static int game;
	public static int dx0 = 1200;
	public static int dx1 = 1223;
	public static int dx2 = 1223;
	public static int dx3 = 1246;
	public static int dx4 = 1246;
	public static int dx5 = 1269;
	public static int dx6 = 1269;
	public static int dx7 = 1269;
	public static int dx8 = 1269;
	public static int dx9 = 1269;
	public static int jk = 60000;
	public static int dealing;
	static int breaking;
	public static int n1;
	public static int n2;
	public static int n3;
	public static int n4;
	public static int n5;
	public static int k01;
	public static int k02;
	public static int k03;
	public static int k04;
	public static int k05;
	public static int k06;
	public static int k07;
	public static int k08;
	public static int k09;
	public static int k10;
	public static int k11;
	public static Component Auto_hold = new JLabel("AUTOHOLD");
	public static Component Credit = new JLabel("" + cr);
	public static Component Bet = new JLabel("" + ul);
	public static Component Value_0 = new JLabel("" + d0 * ul);
	public static Component Value_1 = new JLabel("" + d1 * ul);
	public static Component Value_2 = new JLabel("" + d2 * ul);
	public static Component Value_3 = new JLabel("" + d3 * ul);
	public static Component Value_4 = new JLabel("" + d4 * ul);
	public static Component Value_5 = new JLabel("" + d5 * ul);
	public static Component Value_6 = new JLabel("" + d6 * ul);
	public static Component Value_7 = new JLabel("" + d7 * ul);
	public static Component Value_8 = new JLabel("" + d8 * ul);
	public static Component Value_9 = new JLabel("" + d9 * ul);
	public static Component Joker = new JLabel("JOKER");
	public static Component Card = new JLabel("CARD");
	public static Component Left_zero = new JLabel("  LACIKA BAČI");
	public static Component Right_zero = new JLabel("  SRBIJA 2022");
	public static Component Middle_1 = new JLabel("                    BIRAJTE ULOG");
	public static Component Middle_2 = new JLabel("                 PRITISNITE DELJENJE");
	private static BufferedImage loadImage(String path) {
		try {
			return ImageIO.read(Objects.requireNonNull(MyFrame.class.getClassLoader().getResource(path)));
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		}
	}
	static ImageIcon iconK1 = new ImageIcon(Objects.requireNonNull(loadImage("resources/53.png")));
	public static final Component Card_1 = new JLabel(iconK1);
	static ImageIcon iconK2 = new ImageIcon(Objects.requireNonNull(loadImage("resources/53.png")));
	public static final Component Card_2 = new JLabel(iconK2);
	static ImageIcon iconK3 = new ImageIcon(Objects.requireNonNull(loadImage("resources/53.png")));
	public static final Component Card_3 = new JLabel(iconK3);
	static ImageIcon iconK4 = new ImageIcon(Objects.requireNonNull(loadImage("resources/53.png")));
	public static final Component Card_4 = new JLabel(iconK4);
	static ImageIcon iconK5 = new ImageIcon(Objects.requireNonNull(loadImage("resources/53.png")));
	public static final Component Card_5 = new JLabel(iconK5);
	static ImageIcon iconJ1 = new ImageIcon(Objects.requireNonNull(loadImage("resources/0.png")));
	static final Component Joker_1 = new JLabel(iconJ1);
	static ImageIcon iconJ2 = new ImageIcon(Objects.requireNonNull(loadImage("resources/0.png")));
	static final Component Joker_2 = new JLabel(iconJ2);
	static ImageIcon iconJ3 = new ImageIcon(Objects.requireNonNull(loadImage("resources/0.png")));
	static final Component Joker_3 = new JLabel(iconJ3);
	static ImageIcon iconJ4 = new ImageIcon(Objects.requireNonNull(loadImage("resources/0.png")));
	static final Component Joker_4 = new JLabel(iconJ4);
	static ImageIcon iconJ5 = new ImageIcon(Objects.requireNonNull(loadImage("resources/0.png")));
	static final Component Joker_5 = new JLabel(iconJ5);

	static ImageIcon icon0 = new ImageIcon(Objects.requireNonNull(loadImage("resources/0.png")));
	static ImageIcon icon1 = new ImageIcon(Objects.requireNonNull(loadImage("resources/1.png")));
	static ImageIcon icon2 = new ImageIcon(Objects.requireNonNull(loadImage("resources/2.png")));
	static ImageIcon icon3 = new ImageIcon(Objects.requireNonNull(loadImage("resources/3.png")));
	static ImageIcon icon4 = new ImageIcon(Objects.requireNonNull(loadImage("resources/4.png")));
	static ImageIcon icon5 = new ImageIcon(Objects.requireNonNull(loadImage("resources/5.png")));
	static ImageIcon icon6 = new ImageIcon(Objects.requireNonNull(loadImage("resources/6.png")));
	static ImageIcon icon7 = new ImageIcon(Objects.requireNonNull(loadImage("resources/7.png")));
	static ImageIcon icon8 = new ImageIcon(Objects.requireNonNull(loadImage("resources/8.png")));
	static ImageIcon icon9 = new ImageIcon(Objects.requireNonNull(loadImage("resources/9.png")));
	static ImageIcon icon10 = new ImageIcon(Objects.requireNonNull(loadImage("resources/10.png")));
	static ImageIcon icon11 = new ImageIcon(Objects.requireNonNull(loadImage("resources/11.png")));
	static ImageIcon icon12 = new ImageIcon(Objects.requireNonNull(loadImage("resources/12.png")));
	static ImageIcon icon13 = new ImageIcon(Objects.requireNonNull(loadImage("resources/13.png")));
	static ImageIcon icon14 = new ImageIcon(Objects.requireNonNull(loadImage("resources/14.png")));
	static ImageIcon icon15 = new ImageIcon(Objects.requireNonNull(loadImage("resources/15.png")));
	static ImageIcon icon16 = new ImageIcon(Objects.requireNonNull(loadImage("resources/16.png")));
	static ImageIcon icon17 = new ImageIcon(Objects.requireNonNull(loadImage("resources/17.png")));
	static ImageIcon icon18 = new ImageIcon(Objects.requireNonNull(loadImage("resources/18.png")));
	static ImageIcon icon19 = new ImageIcon(Objects.requireNonNull(loadImage("resources/19.png")));
	static ImageIcon icon20 = new ImageIcon(Objects.requireNonNull(loadImage("resources/20.png")));
	static ImageIcon icon21 = new ImageIcon(Objects.requireNonNull(loadImage("resources/21.png")));
	static ImageIcon icon22 = new ImageIcon(Objects.requireNonNull(loadImage("resources/22.png")));
	static ImageIcon icon23 = new ImageIcon(Objects.requireNonNull(loadImage("resources/23.png")));
	static ImageIcon icon24 = new ImageIcon(Objects.requireNonNull(loadImage("resources/24.png")));
	static ImageIcon icon25 = new ImageIcon(Objects.requireNonNull(loadImage("resources/25.png")));
	static ImageIcon icon26 = new ImageIcon(Objects.requireNonNull(loadImage("resources/26.png")));
	static ImageIcon icon27 = new ImageIcon(Objects.requireNonNull(loadImage("resources/27.png")));
	static ImageIcon icon28 = new ImageIcon(Objects.requireNonNull(loadImage("resources/28.png")));
	static ImageIcon icon29 = new ImageIcon(Objects.requireNonNull(loadImage("resources/29.png")));
	static ImageIcon icon30 = new ImageIcon(Objects.requireNonNull(loadImage("resources/30.png")));
	static ImageIcon icon31 = new ImageIcon(Objects.requireNonNull(loadImage("resources/31.png")));
	static ImageIcon icon32 = new ImageIcon(Objects.requireNonNull(loadImage("resources/32.png")));
	static ImageIcon icon33 = new ImageIcon(Objects.requireNonNull(loadImage("resources/33.png")));
	static ImageIcon icon34 = new ImageIcon(Objects.requireNonNull(loadImage("resources/34.png")));
	static ImageIcon icon35 = new ImageIcon(Objects.requireNonNull(loadImage("resources/35.png")));
	static ImageIcon icon36 = new ImageIcon(Objects.requireNonNull(loadImage("resources/36.png")));
	static ImageIcon icon37 = new ImageIcon(Objects.requireNonNull(loadImage("resources/37.png")));
	static ImageIcon icon38 = new ImageIcon(Objects.requireNonNull(loadImage("resources/38.png")));
	static ImageIcon icon39 = new ImageIcon(Objects.requireNonNull(loadImage("resources/39.png")));
	static ImageIcon icon40 = new ImageIcon(Objects.requireNonNull(loadImage("resources/40.png")));
	static ImageIcon icon41 = new ImageIcon(Objects.requireNonNull(loadImage("resources/41.png")));
	static ImageIcon icon42 = new ImageIcon(Objects.requireNonNull(loadImage("resources/42.png")));
	static ImageIcon icon43 = new ImageIcon(Objects.requireNonNull(loadImage("resources/43.png")));
	static ImageIcon icon44 = new ImageIcon(Objects.requireNonNull(loadImage("resources/44.png")));
	static ImageIcon icon45 = new ImageIcon(Objects.requireNonNull(loadImage("resources/45.png")));
	static ImageIcon icon46 = new ImageIcon(Objects.requireNonNull(loadImage("resources/46.png")));
	static ImageIcon icon47 = new ImageIcon(Objects.requireNonNull(loadImage("resources/47.png")));
	static ImageIcon icon48 = new ImageIcon(Objects.requireNonNull(loadImage("resources/48.png")));
	static ImageIcon icon49 = new ImageIcon(Objects.requireNonNull(loadImage("resources/49.png")));
	static ImageIcon icon50 = new ImageIcon(Objects.requireNonNull(loadImage("resources/50.png")));
	static ImageIcon icon51 = new ImageIcon(Objects.requireNonNull(loadImage("resources/51.png")));
	static ImageIcon icon52 = new ImageIcon(Objects.requireNonNull(loadImage("resources/52.png")));

	public static Component joker = new JLabel(icon0);
	protected static Component heart_1 = new JLabel(icon1);
	protected static Component heart_2 = new JLabel(icon2);
	protected static Component heart_3 = new JLabel(icon3);
	protected static Component heart_4 = new JLabel(icon4);
	protected static Component heart_5 = new JLabel(icon5);
	protected static Component heart_6 = new JLabel(icon6);
	protected static Component heart_7 = new JLabel(icon7);
	protected static Component heart_8 = new JLabel(icon8);
	protected static Component heart_9 = new JLabel(icon9);
	protected static Component heart_10 = new JLabel(icon10);
	protected static Component heart_jack = new JLabel(icon11); 
	protected static Component heart_queen = new JLabel(icon12);
	protected static Component heart_king = new JLabel(icon13);
	protected static Component club_1 = new JLabel(icon14);
	protected static Component club_2 = new JLabel(icon15);
	protected static Component club_3 = new JLabel(icon16);
	protected static Component club_4 = new JLabel(icon17);
	protected static Component club_5 = new JLabel(icon18);
	protected static Component club_6 = new JLabel(icon19);
	protected static Component club_7 = new JLabel(icon20);
	protected static Component club_8 = new JLabel(icon21);
	protected static Component club_9 = new JLabel(icon22);
	protected static Component club_10 = new JLabel(icon23);
	protected static Component club_jack = new JLabel(icon24);
	protected static Component club_queen = new JLabel(icon25);
	protected static Component club_king = new JLabel(icon26);
	protected static Component diamond_1 = new JLabel(icon27);
	protected static Component diamond_2 = new JLabel(icon28);
	protected static Component diamond_3 = new JLabel(icon29);
	protected static Component diamond_4 = new JLabel(icon30);
	protected static Component diamond_5 = new JLabel(icon31);
	protected static Component diamond_6 = new JLabel(icon32);
	protected static Component diamond_7 = new JLabel(icon33);
	protected static Component diamond_8 = new JLabel(icon34);
	protected static Component diamond_9 = new JLabel(icon35);
	protected static Component diamond_10 = new JLabel(icon36);
	protected static Component diamond_jack = new JLabel(icon37);
	protected static Component diamond_queen = new JLabel(icon38);
	protected static Component diamond_king = new JLabel(icon39);
	protected static Component spade_1 = new JLabel(icon40);
	protected static Component spade_2 = new JLabel(icon41);
	protected static Component spade_3 = new JLabel(icon42);
	protected static Component spade_4 = new JLabel(icon43);
	protected static Component spade_5 = new JLabel(icon44);
	protected static Component spade_6 = new JLabel(icon45);
	protected static Component spade_7 = new JLabel(icon46);
	protected static Component spade_8 = new JLabel(icon47);
	protected static Component spade_9 = new JLabel(icon48);
	protected static Component spade_10 = new JLabel(icon49);
	protected static Component spade_jack = new JLabel(icon50);
	protected static Component spade_queen = new JLabel(icon51);
	protected static Component spade_king = new JLabel(icon52);

	public static int card_1;
	public static int card_2;
	public static int card_3;
	public static int card_4;
	public static int card_5;
	public static int color_1;
	public static int color_2;
	public static int color_3;
	public static int color_4;
	public static int color_5;
	
	MyFrame() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

		if (Dobitak.DOBITAK > 0) {
			URL kasa = this.getClass().getClassLoader().getResource("resources/Kraj.wav");
			AudioInputStream audioKasa;
			try {
				assert kasa != null;
				audioKasa = AudioSystem.getAudioInputStream(kasa);
			} catch (UnsupportedAudioFileException | IOException ex) {
				throw new RuntimeException(ex);
			}
			try {
				this.cashing_sound = AudioSystem.getClip();
			} catch (LineUnavailableException ex) {
				throw new RuntimeException(ex);
			}
			try {
				cashing_sound.open(audioKasa);
			} catch (LineUnavailableException | IOException ex) {
				throw new RuntimeException(ex);
			}
			this.cashing_sound.start();
		}
		if (cr < 10000) {
			frame.addKeyListener(this);
			breaking = 1;
		}
		if (cr > 0 && (Dupliranje.karta > 0 || Dobitak.DOBITAK > 0)) {
			while (game == 0 || breaking  <9999) {
				if (breaking == 1000) {
					Thread.sleep(400);
					breaking++;
				}
				if (breaking == 2000) {
					Thread.sleep(400);
					breaking++;
				}
				if (breaking == 3000) {
					Thread.sleep(400);
					breaking++;
				}
				if (breaking == 4000) {
					Thread.sleep(400);
					breaking++;
				}
				if (breaking == 5000) {
					Thread.sleep(400);
					breaking++;
				}
				if (breaking == 6000) {
					Thread.sleep(400);
					breaking++;
				}
				if (breaking == 7000) {
					Thread.sleep(400);
					breaking++;
				}
				if (breaking == 8000) {
					Thread.sleep(400);
					breaking++;
				}
				if (breaking == 9000) {
					Thread.sleep(400);
					breaking++;
				}
				breaking++;
			}
		}
		else {
			Thread.sleep(500);
		}
		Dobitak.DOBITAK = 0;
		new Clear1();
		new Clear2();
		breaking = 10000;

		if (cr == 0 && game == 0) {
		frame.setTitle("POKER");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0,0,0));
		frame.setLayout(null);
		frame.setSize(1920,1080);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			frame.setUndecorated(true);
			frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);

			MetalLookAndFeel.setCurrentTheme(new MyDefaultMetalTheme());
			try {
				UIManager.setLookAndFeel(new MetalLookAndFeel());
			} catch (Exception e) {
				e.printStackTrace();
			}

			SwingUtilities.updateComponentTreeUI(frame);

		Auto_hold.setVisible(true);

			URL intro = this.getClass().getClassLoader().getResource("resources/Intro.wav");
			assert intro != null;
			AudioInputStream audioIntro = AudioSystem.getAudioInputStream(intro);
			this.introSound = AudioSystem.getClip();
			introSound.open(audioIntro);
			introSound.start();

			Left_zero.setVisible(false);
			Right_zero.setVisible(false);

			frame.setVisible(true);
			frame.setResizable(false);

			frame.add(Left_zero);
			frame.add(Right_zero);

			Auto_hold.setBounds(1620,292,500,40);

			Card_1.setBounds(-5, 350, 400, 600);
			Card_2.setBounds(375, 350, 400, 600);
			Card_3.setBounds(755, 350, 400, 600);
			Card_4.setBounds(1135, 350, 400, 600);
			Card_5.setBounds(1515, 350, 400, 600);
			Left_zero.setBounds(20,950,300,40);
			Right_zero.setBounds(1580,950,300,40);

			frame.add(Auto_hold);
		}
		if (final_value > 0) {
			cr = cr - final_value;
		}
		final_value = 0;

		if (ul > cr && cr > 0) {
			ul = cr;
			((JLabel) Bet).setText(""+(ul));
			ulog();
			new Ulog();
		}

		if (cr == 0 & game == 1) {
			ul = 1;
			jk = 60000;
			frame.add(Left_zero);
			frame.add(Right_zero);
			Left_zero.setVisible(true);
			Right_zero.setVisible(true);
			Left_zero.setBounds(20,950,300,40);
			Right_zero.setBounds(1580,950,300,40);

			ch = 1;

			dx0 = 1200;
			dx1 = 1223;
			dx2 = 1223;
			dx3 = 1246;
			dx4 = 1246;
			dx5 = 1269;
			dx6 = 1269;
			dx7 = 1269;
			dx8 = 1269;
			dx9 = 1269;

			((JLabel) Bet).setText(""+(ul));
			ulog();
		}

		((JLabel) Credit).setText(""+(cr));

		Middle_1.setBounds(550,960,800,40);
		Middle_2.setBounds(550,960,800,40);

		label0.setBounds(0,L0,1300,32);
		label1.setBounds(0,L1,1300,32);
		label2.setBounds(0,L2,1300,32);
		label3.setBounds(0,L3,1300,32);
		label4.setBounds(0,L4,1300,32);
		label5.setBounds(0,L5,1300,32);
		label6.setBounds(0,L6,1300,32);
		label7.setBounds(0,L7,1300,32);
		label8.setBounds(0,L8,1300,32);
		label9.setBounds(0,L9,1300,32);
		label10.setBounds(1640,32,500,40);
		label11.setBounds(1660,160,500,40);

		Value_0.setBounds(dx0,L0,120,32);
		Value_1.setBounds(dx1,L1,120,32);
		Value_2.setBounds(dx2,L2,120,32);
		Value_3.setBounds(dx3,L3,120,32);
		Value_4.setBounds(dx4,L4,120,32);
		Value_5.setBounds(dx5,L5,120,32);
		Value_6.setBounds(dx6,L6,120,32);
		Value_7.setBounds(dx7,L7,120,32);
		Value_8.setBounds(dx8,L8,120,32);
		Value_9.setBounds(dx9,L9,120,32);

		Credit.setBounds(1670,64,500,50);
		Bet.setBounds(1690,192,500,50);

		frame.add(Credit);
		frame.add(Bet);
		
		frame.add(label0);
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label6);
		frame.add(label7);
		frame.add(label8);
		frame.add(label9);
		frame.add(label10);
		frame.add(label11);

		frame.add(Value_0);
		frame.add(Value_1);
		frame.add(Value_2);
		frame.add(Value_3);
		frame.add(Value_4);
		frame.add(Value_5);
		frame.add(Value_6);
		frame.add(Value_7);
		frame.add(Value_8);
		frame.add(Value_9);
		frame.add(Card_1);
		frame.add(Card_2);
		frame.add(Card_3);
		frame.add(Card_4);
		frame.add(Card_5);

		frame.add(Joker);
		frame.add(Card);
		frame.add(Middle_1);
		frame.add(Middle_2);

		Middle_1.setVisible(false);
		Middle_2.setVisible(false);

		label0.setVisible(true);
		label1.setVisible(true);
		label2.setVisible(true);
		label3.setVisible(true);
		label4.setVisible(true);
		label5.setVisible(true);
		label6.setVisible(true);
		label7.setVisible(true);
		label8.setVisible(true);
		label9.setVisible(true);

		Value_0.setVisible(true);
		Value_1.setVisible(true);
		Value_2.setVisible(true);
		Value_3.setVisible(true);
		Value_4.setVisible(true);
		Value_5.setVisible(true);
		Value_6.setVisible(true);
		Value_7.setVisible(true);
		Value_8.setVisible(true);
		Value_9.setVisible(true);

		Credit.setVisible(true);
		Bet.setVisible(true);
		
		label0.setForeground(color1);
		label1.setForeground(color2);
		label2.setForeground(color3);
		label3.setForeground(color3);
		label4.setForeground(color3);
		label5.setForeground(color3);
		label6.setForeground(color3);
		label7.setForeground(color3);
		label8.setForeground(color3);
		label9.setForeground(color3);
		label10.setForeground(color2);
		label11.setForeground(color1);

		Auto_hold.setForeground(color4);
		Credit.setForeground(color3);
		Bet.setForeground(color3);
		Value_0.setForeground(color1);
		Value_1.setForeground(color2);
		Value_2.setForeground(color3);
		Value_3.setForeground(color3);
		Value_4.setForeground(color3);
		Value_5.setForeground(color3);
		Value_6.setForeground(color3);
		Value_7.setForeground(color3);
		Value_8.setForeground(color3);
		Value_9.setForeground(color3);
		Left_zero.setForeground(color1);
		Right_zero.setForeground(color1);
		Left_zero.setBackground(color2);
		Right_zero.setBackground(color2);
		Middle_1.setForeground(color1);
		Middle_2.setForeground(color1);
		Middle_1.setBackground(color2);
		Middle_2.setBackground(color2);
		
		label0.setFont(font1);
		label1.setFont(font1);
		label2.setFont(font1);
		label3.setFont(font1);
		label4.setFont(font1);
		label5.setFont(font1);
		label6.setFont(font1);
		label7.setFont(font1);
		label8.setFont(font1);
		label9.setFont(font1);
		label10.setFont(font1);
		label11.setFont(font1);
		
		Auto_hold.setFont(font1);
		Credit.setFont(font1);
		Bet.setFont(font1);
		Value_0.setFont(font1);
		Value_1.setFont(font1);
		Value_2.setFont(font1);
		Value_3.setFont(font1);
		Value_4.setFont(font1);
		Value_5.setFont(font1);
		Value_6.setFont(font1);
		Value_7.setFont(font1);
		Value_8.setFont(font1);
		Value_9.setFont(font1);
		Left_zero.setFont(font1);
		Right_zero.setFont(font1);
		Middle_1.setFont(font1);
		Middle_2.setFont(font1);
		
		label0.setOpaque(false);
		label1.setOpaque(false);
		label2.setOpaque(false);
		label3.setOpaque(false);
		label4.setOpaque(false);
		label5.setOpaque(false);
		label6.setOpaque(false);
		label7.setOpaque(false);
		label8.setOpaque(false);
		label9.setOpaque(false);
		label10.setOpaque(false);
		label11.setOpaque(false);
		
		((JComponent) Auto_hold).setOpaque(false);
		((JComponent) Credit).setOpaque(false);
		((JComponent) Bet).setOpaque(false);
		((JComponent) Value_0).setOpaque(false);
		((JComponent) Value_1).setOpaque(false);
		((JComponent) Value_2).setOpaque(false);
		((JComponent) Value_3).setOpaque(false);
		((JComponent) Value_4).setOpaque(false);
		((JComponent) Value_5).setOpaque(false);
		((JComponent) Value_6).setOpaque(false);
		((JComponent) Value_7).setOpaque(false);
		((JComponent) Value_8).setOpaque(false);
		((JComponent) Value_9).setOpaque(false);
		((JComponent) Card_1).setOpaque(false);
		((JComponent) Card_2).setOpaque(false);
		((JComponent) Card_3).setOpaque(false);
		((JComponent) Card_4).setOpaque(false);
		((JComponent) Card_5).setOpaque(false);
		((JComponent) Joker).setOpaque(false);
		((JComponent) Card).setOpaque(false);
		((JComponent) Left_zero).setOpaque(true);
		((JComponent) Right_zero).setOpaque(true);
		((JComponent) Middle_1).setOpaque(true);
		((JComponent) Middle_2).setOpaque(true);

		Joker.setBounds(400, 180, 1000, 800);
		Card.setBounds(700, 420, 800, 800);
		Joker.setForeground(color2);
		Card.setForeground(color2);
		Joker.setFont(new Font("Algerian", Font.ITALIC, 272));
		Card.setFont(new Font("Algerian", Font.ITALIC, 272));
		Joker.setVisible(false);
		Card.setVisible(false);

		Middle_1.setVisible(false);
		Middle_2.setVisible(false);
		
		frame.add(Joker_1);
		Joker_1.setBounds(-5, 350, 400, 600);
		((JComponent) Joker_1).setOpaque(false);
		frame.add(Joker_2);
		Joker_2.setBounds(375, 350, 400, 600);
		((JComponent) Joker_2).setOpaque(false);
		frame.add(Joker_3);
		Joker_3.setBounds(755, 350, 400, 600);
		((JComponent) Joker_3).setOpaque(false);
		frame.add(Joker_4);
		Joker_4.setBounds(1135, 350, 400, 600);
		((JComponent) Joker_4).setOpaque(false);
		frame.add(Joker_5);
		Joker_5.setBounds(1515, 350, 400, 600);
		((JComponent) Joker_5).setOpaque(false);

		if (cr > 9999) {
			blocked = 1;
			frame.addKeyListener(this);
		}
		if (dealing != 1) {
			new Jokers();
		}
		if (dealing == 3) {
			jk = 60000;
			cr = 0;
			kr = 0;
			ul = 1;
			uu = 1;
			ah = 1;
			dealing = 0;

			Auto_hold.setVisible(false);
			frame.remove(Auto_hold);
			Credit.setVisible(false);
			frame.remove(Credit);
			Bet.setVisible(false);
			frame.remove(Bet);
			Value_0.setVisible(false);
			frame.remove(Value_0);
			Value_1.setVisible(false);
			frame.remove(Value_1);
			Value_2.setVisible(false);
			frame.remove(Value_2);
			Value_3.setVisible(false);
			frame.remove(Value_3);
			Value_4.setVisible(false);
			frame.remove(Value_4);
			Value_5.setVisible(false);
			frame.remove(Value_5);
			Value_6.setVisible(false);
			frame.remove(Value_6);
			Value_7.setVisible(false);
			frame.remove(Value_7);
			Value_8.setVisible(false);
			frame.remove(Value_8);
			Value_9.setVisible(false);
			frame.remove(Value_9);
			Left_zero.setVisible(false);
			frame.remove(Left_zero);
			Right_zero.setVisible(false);
			frame.remove(Right_zero);
			Middle_1.setVisible(false);
			frame.remove(Middle_1);
			Middle_2.setVisible(false);
			frame.remove(Middle_2);
			Joker.setVisible(false);
			frame.remove(Joker);
			Card.setVisible(false);
			frame.remove(Card);
			Card_1.setVisible(false);
			frame.remove(Card_1);
			Card_2.setVisible(false);
			frame.remove(Card_2);
			Card_3.setVisible(false);
			frame.remove(Card_3);
			Card_4.setVisible(false);
			frame.remove(Card_4);
			Card_5.setVisible(false);
			frame.remove(Card_5);
			Joker_1.setVisible(false);
			frame.remove(Joker_1);
			Joker_2.setVisible(false);
			frame.remove(Joker_2);
			Joker_3.setVisible(false);
			frame.remove(Joker_3);
			Joker_4.setVisible(false);
			frame.remove(Joker_4);
			Joker_5.setVisible(false);
			frame.remove(Joker_5);

			((JLabel) Bet).setText(String.valueOf(1));
			((JLabel) Value_0).setText(String.valueOf(d0));
			((JLabel) Value_1).setText(String.valueOf(d1));
			((JLabel) Value_2).setText(String.valueOf(d2));
			((JLabel) Value_3).setText(String.valueOf(d3));
			((JLabel) Value_4).setText(String.valueOf(d4));
			((JLabel) Value_5).setText(String.valueOf(d5));
			((JLabel) Value_6).setText(String.valueOf(d6));
			((JLabel) Value_7).setText(String.valueOf(d7));
			((JLabel) Value_8).setText(String.valueOf(d8));
			((JLabel) Value_9).setText(String.valueOf(d9));

			dx0 = 1200;
			dx1 = 1223;
			dx2 = 1223;
			dx3 = 1246;
			dx4 = 1246;
			dx5 = 1269;
			dx6 = 1269;
			dx7 = 1269;
			dx8 = 1269;
			dx9 = 1269;

			game = 0;
			frame.dispose();
	}
			frame.removeKeyListener(this);
}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		switch(e.getKeyCode()) {
		
		case 81 : // KEYPAD 'Q'
			if (breaking > 9999 && blocked == 0 && cr < 4901) {
				if (cr < 1 && game == 0) {
					this.introSound.stop();
				}
				ch = 0;

				URL kredit = this.getClass().getClassLoader().getResource("resources/Kredit.wav");
				AudioInputStream audioKredit;
				try {
					assert kredit != null;
					audioKredit = AudioSystem.getAudioInputStream(kredit);
				} catch (UnsupportedAudioFileException | IOException ex) {
					throw new RuntimeException(ex);
				}
				try {
					this.credit_sound = AudioSystem.getClip();
				} catch (LineUnavailableException ex) {
					throw new RuntimeException(ex);
				}
				try {
					credit_sound.open(audioKredit);
				} catch (LineUnavailableException | IOException ex) {
					throw new RuntimeException(ex);
				}
				this.credit_sound.start();

				Credit.setVisible(false);
				frame.remove(Credit);
				cr = cr + 100;
				((JLabel) Credit).setText(String.valueOf(cr));
				Credit.setBounds(1670, 64, 500, 50);
				Credit.setForeground(color3);
				Credit.setFont(font1);
				frame.add(Credit);
				Credit.setVisible(true);
				Left_zero.setVisible(false);
				Right_zero.setVisible(false);
				frame.remove(Left_zero);
				frame.remove(Right_zero);

            }
            break;

            case 53 : // KEYPAD '5'

			if (cr > 0 && breaking > 9999 && blocked == 0) {
				Bet.setVisible(false);
				frame.remove(Bet);
				int uu = ul + 1;

				if (uu == 41) {
					uu=1;
				}
				ul = uu;

				if (uu == cr + 1) {
					uu=1;
				}
				ul = uu;

				((JLabel) Bet).setText(String.valueOf(ul));
				frame.add(Bet);
				Bet.setBounds(1690,192,500,50);
				Bet.setForeground(color3);
				Bet.setFont(font1);
				((JComponent) Bet).setOpaque(false);
				Bet.setVisible(true);

				int ddx0 = 1200;
				if(uu > 9) {
					ddx0 = 1177;
				}
				dx0 = ddx0;

				Value_0.setVisible(false);
				frame.remove(Value_0);//FIVE OF A KIND
				((JLabel) Value_0).setText(String.valueOf(d0 * ul));
				frame.add(Value_0);
				Value_0.setBounds(dx0,L0,120,32);
				Value_0.setForeground(color1);
				Value_0.setFont(font1);
				((JComponent) Value_0).setOpaque(false);
				Value_0.setVisible(true);

				int ddx1 = 1223;
				if(uu > 1) {
					ddx1 = 1200;
				}
				if (uu>19) {
					ddx1 = 1177;
				}
				dx1 = ddx1;

				Value_1.setVisible(false);
				frame.remove(Value_1);//ROYAL FLUSH
				((JLabel) Value_1).setText(String.valueOf(d1*ul));
				frame.add(Value_1);
				Value_1.setBounds(dx1,L1,120,32);
				Value_1.setForeground(color2);
				Value_1.setFont(font1);
				((JComponent) Value_1).setOpaque(false);
				Value_1.setVisible(true);

				int ddx2 = 1223;
				if(uu > 9) {
					ddx2 = 1200;
				}
				dx2 = ddx2;

				Value_2.setVisible(false);
				frame.remove(Value_2);//STREET FLUSH
				((JLabel) Value_2).setText(String.valueOf(d2*ul));
				frame.add(Value_2);
				Value_2.setBounds(dx2,L2,120,32);
				Value_2.setForeground(color3);
				Value_2.setFont(font1);
				((JComponent) Value_2).setOpaque(false);
				Value_2.setVisible(true);

				int ddx3 = 1246;
				if(uu > 2) {
					ddx3 = 1223;
				}
				if(uu > 24) {
					ddx3 = 1200;
				}
				dx3 = ddx3;

				Value_3.setVisible(false);
				frame.remove(Value_3);//POKER
				((JLabel) Value_3).setText(String.valueOf(d3*ul));
				frame.add(Value_3);
				Value_3.setBounds(dx3,L3,120,32);
				Value_3.setForeground(color3);
				Value_3.setFont(font1);
				((JComponent) Value_3).setOpaque(false);
				Value_3.setVisible(true);

				int ddx4 = 1246;
				if(uu > 9) {
					ddx4 = 1223;
				}
				dx4 = ddx4;

				Value_4.setVisible(false);
				frame.remove(Value_4);//FULL HOUSE
				((JLabel) Value_4).setText(String.valueOf(d4*ul));
				frame.add(Value_4);
				Value_4.setBounds(dx4,L4,120,32);
				Value_4.setForeground(color3);
				Value_4.setFont(font1);
				((JComponent) Value_4).setOpaque(false);
				Value_4.setVisible(true);

				int ddx5 = 1269;
				if(uu > 1) {
					ddx5 = 1246;
				}
				if(uu > 14) {
					ddx5 = 1223;
				}
				dx5 = ddx5;

				Value_5.setVisible(false);
				frame.remove(Value_5);//FLUSH
				((JLabel) Value_5).setText(String.valueOf(d5*ul));
				frame.add(Value_5);
				Value_5.setBounds(dx5,L5,120,32);
				Value_5.setForeground(color3);
				Value_5.setFont(font1);
				((JComponent) Value_5).setOpaque(false);
				Value_5.setVisible(true);

				int ddx6 = 1269;
				if(uu > 1) {
					ddx6 = 1246;
				}
				if(uu > 19) {
					ddx6 = 1223;
				}
				dx6 = ddx6;

				Value_6.setVisible(false);
				frame.remove(Value_6);//STREET
				((JLabel) Value_6).setText(String.valueOf(d6*ul));
				frame.add(Value_6);
				Value_6.setBounds(dx6,L6,120,32);
				Value_6.setForeground(color3);
				Value_6.setFont(font1);
				((JComponent) Value_6).setOpaque(false);
				Value_6.setVisible(true);

				int ddx7 = 1269;
				if(uu > 3) {
					ddx7 = 1246;
				}
				if( uu > 33) {
					ddx7 = 1223;
				}
				dx7 = ddx7;

				Value_7.setVisible(false);
				frame.remove(Value_7);//THREE OF A KIND
				((JLabel) Value_7).setText(String.valueOf(d7*ul));
				frame.add(Value_7);
				Value_7.setBounds(dx7,L7,120,32);
				Value_7.setForeground(color3);
				Value_7.setFont(font1);
				((JComponent) Value_7).setOpaque(false);
				Value_7.setVisible(true);

				int ddx8 = 1269;
				if(uu > 4) {
					ddx8 = 1246;
				}
				dx8 = ddx8;

				Value_8.setVisible(false);
				frame.remove(Value_8);//2 PAIRS
				((JLabel) Value_8).setText(String.valueOf(d8*ul));
				frame.add(Value_8);
				Value_8.setBounds(dx8,L8,120,32);
				Value_8.setForeground(color3);
				Value_8.setFont(font1);
				((JComponent) Value_8).setOpaque(false);
				Value_8.setVisible(true);

				int ddx9 = 1269;
				if(uu > 9) {
					ddx9 = 1246;
				}
				dx9 = ddx9;

				Value_9.setVisible(false);
				frame.remove(Value_9);//HIGH PAIR
				((JLabel) Value_9).setText(String.valueOf(d9*ul));
				frame.add(Value_9);
				Value_9.setBounds(dx9,L9,120,32);
				Value_9.setForeground(color3);
				Value_9.setFont(font1);
				((JComponent) Value_9).setOpaque(false);
				Value_9.setVisible(true);

				URL ulog = this.getClass().getClassLoader().getResource("resources/Ulog.wav");
				AudioInputStream audioUlog;
				try {
					assert ulog != null;
					audioUlog = AudioSystem.getAudioInputStream(ulog);
				} catch (UnsupportedAudioFileException | IOException ex) {
					throw new RuntimeException(ex);
				}
				try {
					this.bet_sound = AudioSystem.getClip();
				} catch (LineUnavailableException ex) {
					throw new RuntimeException(ex);
				}
				try {
					bet_sound.open(audioUlog);
				} catch (LineUnavailableException | IOException ex) {
					throw new RuntimeException(ex);
				}
				this.bet_sound.start();
			}
			else {
				break;
			}
			break;
			
		case 32 : // KEYPAD 'SPACE'
			if (cr > 0 && breaking > 9999 && blocked == 0) {
				if (ah==1) {
					int aha = ah--;
					ah = aha;
					Auto_hold.setVisible(false);
					frame.remove(Auto_hold);
					ah = 0;
				}
				else {
					int aha = ah++;
					ah = aha;
					Auto_hold.setVisible(false);
					frame.remove(Auto_hold);
					ah = 1;
					Auto_hold = new JLabel("AUTOHOLD");
					frame.add(Auto_hold);
					Auto_hold.setBounds(1620,292,500,40);
					Auto_hold.setForeground(color4);
					Auto_hold.setFont(font1);
					((JComponent) Auto_hold).setOpaque(false);
					Auto_hold.setVisible(true);
				}

				URL autohold = this.getClass().getClassLoader().getResource("resources/Autohold.wav");
				AudioInputStream audioAutohold;
				try {
					assert autohold != null;
					audioAutohold = AudioSystem.getAudioInputStream(autohold);
				} catch (UnsupportedAudioFileException | IOException ex) {
					throw new RuntimeException(ex);
				}
				try {
					this.auto_hold_sound = AudioSystem.getClip();
				} catch (LineUnavailableException ex) {
					throw new RuntimeException(ex);
				}
				try {
					auto_hold_sound.open(audioAutohold);
				} catch (LineUnavailableException | IOException ex) {
					throw new RuntimeException(ex);
				}
				this.auto_hold_sound.start();
			}
			break;

		case 35 : // KEYPAD 'END'
			if (breaking > 9999) {
				Credit.setVisible(false);
				frame.remove(Credit);

			if (cr > 0) {
				Credit.setVisible(false);
				frame.remove(Credit);
				frame.removeKeyListener(this);
				Middle_1.setVisible(false);
				Middle_2.setVisible(false);
				frame.remove(Middle_1);
				frame.remove(Middle_2);
				frame.add(Left_zero);
				frame.add(Right_zero);
				Left_zero.setVisible(true);
				Right_zero.setVisible(true);
				Left_zero.setBounds(20,950,300,40);
				Right_zero.setBounds(1580,950,300,40);
				ch = 1;
				blocked = 0;

				try {
					new Countdown1();
				} catch (InterruptedException ex) {
					throw new RuntimeException(ex);
				}
			}
			else {
				Credit.setVisible(true);
				frame.add(Credit);
				}
			}
			break;

		case 10 : // KEYPAD 'ENTER'
			if (Dobitak.DOBITAK > 0) {
				breaking = 9999;
				this.cashing_sound.stop();
			}
			else if (cr > 0 && blocked == 0) {
				dealing = 1;
				breaking = 9999;
				game = 1;
				break;
			}
			else {
				break;
			}
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyReleased(KeyEvent e) {
	}
	void ulog() {
		((JLabel) Value_0).setText(String.valueOf(d0*ul));
		((JLabel) Value_1).setText(String.valueOf(d1*ul));
		((JLabel) Value_2).setText(String.valueOf(d2*ul));
		((JLabel) Value_3).setText(String.valueOf(d3*ul));
		((JLabel) Value_4).setText(String.valueOf(d4*ul));
		((JLabel) Value_5).setText(String.valueOf(d5*ul));
		((JLabel) Value_6).setText(String.valueOf(d6*ul));
		((JLabel) Value_7).setText(String.valueOf(d7*ul));
		((JLabel) Value_8).setText(String.valueOf(d8*ul));
		((JLabel) Value_9).setText(String.valueOf(d9*ul));
	}
}
