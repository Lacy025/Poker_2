package rs.baci.Poker_2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serial;
import java.net.URL;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame implements Brojevi, Dobici, MainFrame, KeyListener {
	
	@Serial
	private static final long serialVersionUID = 1L;
	
	Clip introSound;
	Clip kreditSound;
	Clip ulogSound;
	Clip autoholdSound;
	Clip deljenjeSound;
	
	static int kr;
	static int cr;
	public int uu = 1;
	public int ul = 1;
	public int ah = 1;
	
	public int dx0 = 1200;
	public int dx1 = 1223;
	public int dx2 = 1223;
	public int dx3 = 1246;
	public int dx4 = 1246;
	public int dx5 = 1269;
	public int dx6 = 1269;
	public int dx7 = 1269;
	public int dx8 = 1269;
	public int dx9 = 1269;
	
	public static int jk = 60000;
	static int delj;
	
	public static int n1;
	public static int n2;
	public static int n3;
	public static int n4;
	public static int n5;
	
	public Component Jlabelah = new JLabel("AUTOHOLD");
	public Component Jlabelcr = new JLabel(""+cr);
	public Component Jlabelul = new JLabel(""+ul);
	public Component Jlabeld0 = new JLabel(""+d0*ul);
	public Component Jlabeld1 = new JLabel(""+d1*ul);
	public Component Jlabeld2 = new JLabel(""+d2*ul);
	public Component Jlabeld3 = new JLabel(""+d3*ul);
	public Component Jlabeld4 = new JLabel(""+d4*ul);
	public Component Jlabeld5 = new JLabel(""+d5*ul);
	public Component Jlabeld6 = new JLabel(""+d6*ul);
	public Component Jlabeld7 = new JLabel(""+d7*ul);
	public Component Jlabeld8 = new JLabel(""+d8*ul);
	public Component Jlabeld9 = new JLabel(""+d9*ul);
	public Component JlabelR1 = new JLabel("JOKER");
	public Component JlabelR2 = new JLabel("CARD");
	public Component JlabelL = new JLabel("  LACIKA BAČI");
	public Component JlabelR = new JLabel("  SRBIJA 2022");

	private static BufferedImage loadImage(String path) {
		try {
			return ImageIO.read(Objects.requireNonNull(MyFrame.class.getClassLoader().getResource(path)));
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		}
	}

	static ImageIcon iconK1 = new ImageIcon(loadImage("resources/53.png"));
	public static final Component JlabelK1 = new JLabel(iconK1);
	static ImageIcon iconK2 = new ImageIcon(loadImage("resources/53.png"));
	public static final Component JlabelK2 = new JLabel(iconK2);
	static ImageIcon iconK3 = new ImageIcon(loadImage("resources/53.png"));
	public static final Component JlabelK3 = new JLabel(iconK3);
	static ImageIcon iconK4 = new ImageIcon(loadImage("resources/53.png"));
	public static final Component JlabelK4 = new JLabel(iconK4);
	static ImageIcon iconK5 = new ImageIcon(loadImage("resources/53.png"));
	public static final Component JlabelK5 = new JLabel(iconK5);
	static ImageIcon iconJ1 = new ImageIcon(loadImage("resources/0.png"));
	private static final Component JlabelJ1 = new JLabel(iconJ1);
	static ImageIcon iconJ2 = new ImageIcon(loadImage("resources/0.png"));
	private static final Component JlabelJ2 = new JLabel(iconJ2);
	static ImageIcon iconJ3 = new ImageIcon(loadImage("resources/0.png"));
	private static final Component JlabelJ3 = new JLabel(iconJ3);
	static ImageIcon iconJ4 = new ImageIcon(loadImage("resources/0.png"));
	private static final Component JlabelJ4 = new JLabel(iconJ4);
	static ImageIcon iconJ5 = new ImageIcon(loadImage("resources/0.png"));
	private static final Component JlabelJ5 = new JLabel(iconJ5);

	static ImageIcon icon0 = new ImageIcon(loadImage("resources/0.png"));
	static ImageIcon icon1 = new ImageIcon(loadImage("resources/1.png"));
	static ImageIcon icon2 = new ImageIcon(loadImage("resources/2.png"));
	static ImageIcon icon3 = new ImageIcon(loadImage("resources/3.png"));
	static ImageIcon icon4 = new ImageIcon(loadImage("resources/4.png"));
	static ImageIcon icon5 = new ImageIcon(loadImage("resources/5.png"));
	static ImageIcon icon6 = new ImageIcon(loadImage("resources/6.png"));
	static ImageIcon icon7 = new ImageIcon(loadImage("resources/7.png"));
	static ImageIcon icon8 = new ImageIcon(loadImage("resources/8.png"));
	static ImageIcon icon9 = new ImageIcon(loadImage("resources/9.png"));
	static ImageIcon icon10 = new ImageIcon(loadImage("resources/10.png"));
	static ImageIcon icon11 = new ImageIcon(loadImage("resources/11.png"));
	static ImageIcon icon12 = new ImageIcon(loadImage("resources/12.png"));
	static ImageIcon icon13 = new ImageIcon(loadImage("resources/13.png"));
	static ImageIcon icon14 = new ImageIcon(loadImage("resources/14.png"));
	static ImageIcon icon15 = new ImageIcon(loadImage("resources/15.png"));
	static ImageIcon icon16 = new ImageIcon(loadImage("resources/16.png"));
	static ImageIcon icon17 = new ImageIcon(loadImage("resources/17.png"));
	static ImageIcon icon18 = new ImageIcon(loadImage("resources/18.png"));
	static ImageIcon icon19 = new ImageIcon(loadImage("resources/19.png"));
	static ImageIcon icon20 = new ImageIcon(loadImage("resources/20.png"));
	static ImageIcon icon21 = new ImageIcon(loadImage("resources/21.png"));
	static ImageIcon icon22 = new ImageIcon(loadImage("resources/22.png"));
	static ImageIcon icon23 = new ImageIcon(loadImage("resources/23.png"));
	static ImageIcon icon24 = new ImageIcon(loadImage("resources/24.png"));
	static ImageIcon icon25 = new ImageIcon(loadImage("resources/25.png"));
	static ImageIcon icon26 = new ImageIcon(loadImage("resources/26.png"));
	static ImageIcon icon27 = new ImageIcon(loadImage("resources/27.png"));
	static ImageIcon icon28 = new ImageIcon(loadImage("resources/28.png"));
	static ImageIcon icon29 = new ImageIcon(loadImage("resources/29.png"));
	static ImageIcon icon30 = new ImageIcon(loadImage("resources/30.png"));
	static ImageIcon icon31 = new ImageIcon(loadImage("resources/31.png"));
	static ImageIcon icon32 = new ImageIcon(loadImage("resources/32.png"));
	static ImageIcon icon33 = new ImageIcon(loadImage("resources/33.png"));
	static ImageIcon icon34 = new ImageIcon(loadImage("resources/34.png"));
	static ImageIcon icon35 = new ImageIcon(loadImage("resources/35.png"));
	static ImageIcon icon36 = new ImageIcon(loadImage("resources/36.png"));
	static ImageIcon icon37 = new ImageIcon(loadImage("resources/37.png"));
	static ImageIcon icon38 = new ImageIcon(loadImage("resources/38.png"));
	static ImageIcon icon39 = new ImageIcon(loadImage("resources/39.png"));
	static ImageIcon icon40 = new ImageIcon(loadImage("resources/40.png"));
	static ImageIcon icon41 = new ImageIcon(loadImage("resources/41.png"));
	static ImageIcon icon42 = new ImageIcon(loadImage("resources/42.png"));
	static ImageIcon icon43 = new ImageIcon(loadImage("resources/43.png"));
	static ImageIcon icon44 = new ImageIcon(loadImage("resources/44.png"));
	static ImageIcon icon45 = new ImageIcon(loadImage("resources/45.png"));
	static ImageIcon icon46 = new ImageIcon(loadImage("resources/46.png"));
	static ImageIcon icon47 = new ImageIcon(loadImage("resources/47.png"));
	static ImageIcon icon48 = new ImageIcon(loadImage("resources/48.png"));
	static ImageIcon icon49 = new ImageIcon(loadImage("resources/49.png"));
	static ImageIcon icon50 = new ImageIcon(loadImage("resources/50.png"));
	static ImageIcon icon51 = new ImageIcon(loadImage("resources/51.png"));
	static ImageIcon icon52 = new ImageIcon(loadImage("resources/52.png"));
	
	protected static Component Jlabel0 = new JLabel(icon0);
	protected static Component Jlabel1 = new JLabel(icon1);
	protected static Component Jlabel2 = new JLabel(icon2);
	protected static Component Jlabel3 = new JLabel(icon3);
	protected static Component Jlabel4 = new JLabel(icon4);
	protected static Component Jlabel5 = new JLabel(icon5);
	protected static Component Jlabel6 = new JLabel(icon6);
	protected static Component Jlabel7 = new JLabel(icon7);
	protected static Component Jlabel8 = new JLabel(icon8);
	protected static Component Jlabel9 = new JLabel(icon9);
	protected static Component Jlabel10 = new JLabel(icon10);
	protected static Component Jlabel11 = new JLabel(icon11);
	protected static Component Jlabel12 = new JLabel(icon12);
	protected static Component Jlabel13 = new JLabel(icon13);
	protected static Component Jlabel14 = new JLabel(icon14);
	protected static Component Jlabel15 = new JLabel(icon15);
	protected static Component Jlabel16 = new JLabel(icon16);
	protected static Component Jlabel17 = new JLabel(icon17);
	protected static Component Jlabel18 = new JLabel(icon18);
	protected static Component Jlabel19 = new JLabel(icon19);
	protected static Component Jlabel20 = new JLabel(icon20);
	protected static Component Jlabel21 = new JLabel(icon21);
	protected static Component Jlabel22 = new JLabel(icon22);
	protected static Component Jlabel23 = new JLabel(icon23);
	protected static Component Jlabel24 = new JLabel(icon24);
	protected static Component Jlabel25 = new JLabel(icon25);
	protected static Component Jlabel26 = new JLabel(icon26);
	protected static Component Jlabel27 = new JLabel(icon27);
	protected static Component Jlabel28 = new JLabel(icon28);
	protected static Component Jlabel29 = new JLabel(icon29);
	protected static Component Jlabel30 = new JLabel(icon30);
	protected static Component Jlabel31 = new JLabel(icon31);
	protected static Component Jlabel32 = new JLabel(icon32);
	protected static Component Jlabel33 = new JLabel(icon33);
	protected static Component Jlabel34 = new JLabel(icon34);
	protected static Component Jlabel35 = new JLabel(icon35);
	protected static Component Jlabel36 = new JLabel(icon36);
	protected static Component Jlabel37 = new JLabel(icon37);
	protected static Component Jlabel38 = new JLabel(icon38);
	protected static Component Jlabel39 = new JLabel(icon39);
	protected static Component Jlabel40 = new JLabel(icon40);
	protected static Component Jlabel41 = new JLabel(icon41);
	protected static Component Jlabel42 = new JLabel(icon42);
	protected static Component Jlabel43 = new JLabel(icon43);
	protected static Component Jlabel44 = new JLabel(icon44);
	protected static Component Jlabel45 = new JLabel(icon45);
	protected static Component Jlabel46 = new JLabel(icon46);
	protected static Component Jlabel47 = new JLabel(icon47);
	protected static Component Jlabel48 = new JLabel(icon48);
	protected static Component Jlabel49 = new JLabel(icon49);
	protected static Component Jlabel50 = new JLabel(icon50);
	protected static Component Jlabel51 = new JLabel(icon51);
	protected static Component Jlabel52 = new JLabel(icon52);
	
	public static Component card1 = new JLabel();
	public static Component card2 = new JLabel();
	public static Component card3 = new JLabel();
	public static Component card4 = new JLabel();
	public static Component card5 = new JLabel();
	
	public static int karta1;
	public static int boja1;
	public static int karta2;
	public static int boja2;
	public static int karta3;
	public static int boja3;
	public static int karta4;
	public static int boja4;
	public static int karta5;
	public static int boja5;
	
	MyFrame() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		frame.setTitle("POKER");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0,0,0));
		frame.setLayout(null);
		frame.setSize(1920,1080);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		Jlabelah.setVisible(true);
		JlabelL.setVisible(true);
		JlabelR.setVisible(false);
		
		label0.setBounds(0,0,1300,40);
		label1.setBounds(0,32,500,40);
		label2.setBounds(0,64,500,40);
		label3.setBounds(0,96,500,40);
		label4.setBounds(0,128,500,40);
		label5.setBounds(0,160,500,40);
		label6.setBounds(0,196,500,40);
		label7.setBounds(0,228,500,40);
		label8.setBounds(0,260,500,40);
		label9.setBounds(0,292,500,40);
		label10.setBounds(1640,32,500,40);
		label11.setBounds(1660,160,500,40);
		
		Jlabelah.setBounds(1620,292,500,40);
		Jlabelcr.setBounds(1670,64,500,50);
		Jlabelul.setBounds(1690,192,500,40);
		Jlabeld0.setBounds(dx0,0,120,40);
		Jlabeld1.setBounds(dx1,32,120,40);
		Jlabeld2.setBounds(dx2,64,120,40);
		Jlabeld3.setBounds(dx3,96,120,40);
		Jlabeld4.setBounds(dx4,128,120,40);
		Jlabeld5.setBounds(dx5,160,120,40);
		Jlabeld6.setBounds(dx6,192,120,40);
		Jlabeld7.setBounds(dx7,224,120,40);
		Jlabeld8.setBounds(dx8,256,120,40);
		Jlabeld9.setBounds(dx9,288,120,40);
		JlabelK1.setBounds(-5, 350, 400, 600);
		JlabelK2.setBounds(375, 350, 400, 600);
		JlabelK3.setBounds(755, 350, 400, 600);
		JlabelK4.setBounds(1135, 350, 400, 600);
		JlabelK5.setBounds(1515, 350, 400, 600);
		JlabelL.setBounds(20,950,300,40);
		JlabelR.setBounds(1580,950,300,40);
		
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
		
		frame.add(Jlabelah);
		frame.add(Jlabelcr);
		frame.add(Jlabelul);
		frame.add(Jlabeld0);
		frame.add(Jlabeld1);
		frame.add(Jlabeld2);
		frame.add(Jlabeld3);
		frame.add(Jlabeld4);
		frame.add(Jlabeld5);
		frame.add(Jlabeld6);
		frame.add(Jlabeld7);
		frame.add(Jlabeld8);
		frame.add(Jlabeld9);
		frame.add(JlabelK1);
		frame.add(JlabelK2);
		frame.add(JlabelK3);
		frame.add(JlabelK4);
		frame.add(JlabelK5);
		frame.add(JlabelR1);
		frame.add(JlabelR2);
		frame.add(JlabelL);
		frame.add(JlabelR);
		
		label0.setForeground(Color.YELLOW);
		label1.setForeground(Color.RED);
		label0.setBackground(Color.BLUE);
		label2.setForeground(new Color(240, 185, 206));
		label3.setForeground(new Color(240, 185, 206));
		label4.setForeground(new Color(240, 185, 206));
		label5.setForeground(new Color(240, 185, 206));
		label6.setForeground(new Color(240, 185, 206));
		label7.setForeground(new Color(240, 185, 206));
		label8.setForeground(new Color(240, 185, 206));
		label9.setForeground(new Color(240, 185, 206));
		label10.setForeground(Color.RED);
		label11.setForeground(Color.YELLOW);
		
		Jlabelah.setForeground(Color.BLUE);
		Jlabelcr.setForeground(new Color(240, 185, 206));
		Jlabelul.setForeground(new Color(240, 185, 206));
		Jlabeld0.setForeground(Color.YELLOW);
		Jlabeld0.setBackground(Color.BLUE);
		Jlabeld1.setForeground(Color.RED);
		Jlabeld2.setForeground(new Color(240, 185, 206));
		Jlabeld3.setForeground(new Color(240, 185, 206));
		Jlabeld4.setForeground(new Color(240, 185, 206));
		Jlabeld5.setForeground(new Color(240, 185, 206));
		Jlabeld6.setForeground(new Color(240, 185, 206));
		Jlabeld7.setForeground(new Color(240, 185, 206));
		Jlabeld8.setForeground(new Color(240, 185, 206));
		Jlabeld9.setForeground(new Color(240, 185, 206));
		JlabelL.setForeground(Color.YELLOW);
		JlabelR.setForeground(Color.YELLOW);
		JlabelL.setBackground(Color.RED);
		JlabelR.setBackground(Color.RED);
		
		label0.setFont(new Font("Verdana", Font.PLAIN, 36));
		label1.setFont(new Font("Verdana", Font.PLAIN, 36));
		label2.setFont(new Font("Verdana", Font.PLAIN, 36));
		label3.setFont(new Font("Verdana", Font.PLAIN, 36));
		label4.setFont(new Font("Verdana", Font.PLAIN, 36));
		label5.setFont(new Font("Verdana", Font.PLAIN, 36));
		label6.setFont(new Font("Verdana", Font.PLAIN, 36));
		label7.setFont(new Font("Verdana", Font.PLAIN, 36));
		label8.setFont(new Font("Verdana", Font.PLAIN, 36));
		label9.setFont(new Font("Verdana", Font.PLAIN, 36));
		label10.setFont(new Font("Verdana", Font.PLAIN, 36));
		label11.setFont(new Font("Verdana", Font.PLAIN, 36));
		
		Jlabelah.setFont(new Font("Verdana", Font.PLAIN, 36));
		Jlabelcr.setFont(new Font("Verdana", Font.PLAIN, 36));
		Jlabelul.setFont(new Font("Verdana", Font.PLAIN, 36));
		Jlabeld0.setFont(new Font("Verdana", Font.PLAIN, 36));
		Jlabeld1.setFont(new Font("Verdana", Font.PLAIN, 36));
		Jlabeld2.setFont(new Font("Verdana", Font.PLAIN, 36));
		Jlabeld3.setFont(new Font("Verdana", Font.PLAIN, 36));
		Jlabeld4.setFont(new Font("Verdana", Font.PLAIN, 36));
		Jlabeld5.setFont(new Font("Verdana", Font.PLAIN, 36));
		Jlabeld6.setFont(new Font("Verdana", Font.PLAIN, 36));
		Jlabeld7.setFont(new Font("Verdana", Font.PLAIN, 36));
		Jlabeld8.setFont(new Font("Verdana", Font.PLAIN, 36));
		Jlabeld9.setFont(new Font("Verdana", Font.PLAIN, 36));
		JlabelL.setFont(new Font("Verdana", Font.PLAIN, 36));
		JlabelR.setFont(new Font("Verdana", Font.PLAIN, 36));
		
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
		
		((JComponent) Jlabelah).setOpaque(false);
		((JComponent) Jlabelcr).setOpaque(false);
		((JComponent) Jlabelul).setOpaque(false);
		((JComponent) Jlabeld0).setOpaque(false);
		((JComponent) Jlabeld1).setOpaque(false);
		((JComponent) Jlabeld2).setOpaque(false);
		((JComponent) Jlabeld3).setOpaque(false);
		((JComponent) Jlabeld4).setOpaque(false);
		((JComponent) Jlabeld5).setOpaque(false);
		((JComponent) Jlabeld6).setOpaque(false);
		((JComponent) Jlabeld7).setOpaque(false);
		((JComponent) Jlabeld8).setOpaque(false);
		((JComponent) Jlabeld9).setOpaque(false);
		((JComponent) JlabelK1).setOpaque(false);
		((JComponent) JlabelK2).setOpaque(false);
		((JComponent) JlabelK3).setOpaque(false);
		((JComponent) JlabelK4).setOpaque(false);
		((JComponent) JlabelK5).setOpaque(false);
		((JComponent) JlabelR1).setOpaque(false);
		((JComponent) JlabelR2).setOpaque(false);
		((JComponent) JlabelL).setOpaque(true);
		((JComponent) JlabelR).setOpaque(true);
		
	/*	label0.setBackground(Color.BLUE);
		label0.setOpaque(true);label0.setForeground(Color.YELLOW);
		label0.add(Jlabeld0);
		((JComponent) Jlabeld0).setOpaque(true);
	*/	
		frame.setVisible(true);
		frame.setResizable(false);
		
		frame.add(JlabelJ1);
		JlabelJ1.setBounds(-5, 350, 400, 600);
		((JComponent) JlabelJ1).setOpaque(false);
		frame.add(JlabelJ2);
		JlabelJ2.setBounds(375, 350, 400, 600);
		((JComponent) JlabelJ2).setOpaque(false);
		frame.add(JlabelJ3);
		JlabelJ3.setBounds(755, 350, 400, 600);
		((JComponent) JlabelJ3).setOpaque(false);
		frame.add(JlabelJ4);
		JlabelJ4.setBounds(1135, 350, 400, 600);
		((JComponent) JlabelJ4).setOpaque(false);
		frame.add(JlabelJ5);
		JlabelJ5.setBounds(1515, 350, 400, 600);
		((JComponent) JlabelJ5).setOpaque(false);
		
		JlabelR1.setBounds(400, 180, 1000, 800);
		JlabelR2.setBounds(700, 420, 800, 800);
		JlabelR1.setForeground(Color.RED);
		JlabelR2.setForeground(Color.RED);
		JlabelR1.setFont(new Font("Algerian", Font.ITALIC, 272));
		JlabelR2.setFont(new Font("Algerian", Font.ITALIC, 272));
		JlabelR1.setVisible(false);
		JlabelR2.setVisible(false);

		URL intro = this.getClass().getClassLoader().getResource("resources/Intro.wav");
		AudioInputStream audioIntro = AudioSystem.getAudioInputStream(intro);
		this.introSound = AudioSystem.getClip();
		introSound.open(audioIntro);
		introSound.start();
		
		frame.addKeyListener(this);
		
		while (delj==0) {
				
				if(jk==5000) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
				if(jk==10000) {
					JlabelR1.setVisible(false);
					JlabelR2.setVisible(false);
					JlabelK1.setVisible(false);
					JlabelJ1.setVisible(true);
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
				}	
				if(jk==15000) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
				if(jk==20000) {
					JlabelJ1.setVisible(false);
					JlabelK2.setVisible(false);
					JlabelJ2.setVisible(true);
					JlabelK1.setVisible(true);
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
				if(jk==25000) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
				if(jk==30000) {
					JlabelJ2.setVisible(false);
					JlabelK3.setVisible(false);
					JlabelJ3.setVisible(true);
					JlabelK2.setVisible(true);
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
				if(jk==35000) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
				if(jk==40000) {
					JlabelJ3.setVisible(false);
					JlabelK4.setVisible(false);
					JlabelJ4.setVisible(true);
					JlabelK3.setVisible(true);
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
				if(jk==45000) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
				if(jk==50000) {
					JlabelJ4.setVisible(false);
					JlabelK5.setVisible(false);
					JlabelJ5.setVisible(true);
					JlabelK4.setVisible(true);
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
				if(jk==55000) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
				if(jk==60000) {	
					JlabelK1.setVisible(false);
					JlabelK2.setVisible(false);
					JlabelK3.setVisible(false);
					JlabelK4.setVisible(false);
					JlabelK5.setVisible(false);
					JlabelJ1.setVisible(false);
					JlabelJ2.setVisible(false);
					JlabelJ3.setVisible(false);
					JlabelJ4.setVisible(false);
					JlabelJ5.setVisible(false);
					JlabelR1.setVisible(true);
					JlabelR2.setVisible(true);
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
					}
				if(jk==65000) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
					}
				if(jk==70000) {
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
					}
				if(jk==75000) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
					}
				if(jk==80000) {
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
					}
				if(jk==85000) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
					}
				if(jk==90000) {
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
					}
				if(jk==95000) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
					}
				if(jk==100000) {
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					JlabelR1.setVisible(false);
					JlabelR2.setVisible(false);
					JlabelK1.setVisible(true);
					JlabelK2.setVisible(true);
					JlabelK3.setVisible(true);
					JlabelK4.setVisible(true);
					JlabelK5.setVisible(true);
					Thread.sleep(500);
					jk=0;
					
					}
				
				jk++;
			
			}
			
		if (delj==3) {
			
			jk=60000;cr=0;kr=0;ul=1;uu=1;ah=1;delj=0;
			Jlabel13.setVisible(false);
			frame.remove(Jlabelah);
			frame.remove(Jlabelcr);
			frame.remove(Jlabelul);
			frame.remove(Jlabeld0);
			frame.remove(Jlabeld1);
			frame.remove(Jlabeld2);
			frame.remove(Jlabeld3);
			frame.remove(Jlabeld4);
			frame.remove(Jlabeld5);
			frame.remove(Jlabeld6);
			frame.remove(Jlabeld7);
			frame.remove(Jlabeld8);
			frame.remove(Jlabeld9);
			frame.remove(JlabelL);
			frame.remove(JlabelR);
			frame.remove(JlabelR1);
			frame.remove(JlabelR2);
			frame.remove(JlabelK1);
			frame.remove(JlabelK2);
			frame.remove(JlabelK3);
			frame.remove(JlabelK4);
			frame.remove(JlabelK5);
			frame.remove(JlabelJ1);
			frame.remove(JlabelJ2);
			frame.remove(JlabelJ3);
			frame.remove(JlabelJ4);
			frame.remove(JlabelJ5);
			frame.dispose();
	}

			frame.removeKeyListener(this);
			
}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		switch(e.getKeyCode()) {
		
		case 81 :

			URL kredit = this.getClass().getClassLoader().getResource("resources/Kredit.wav");
			AudioInputStream audioKredit = null;
			try {
				audioKredit = AudioSystem.getAudioInputStream(kredit);
			} catch (UnsupportedAudioFileException ex) {
				throw new RuntimeException(ex);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
			try {
				this.kreditSound = AudioSystem.getClip();
			} catch (LineUnavailableException ex) {
				throw new RuntimeException(ex);
			}
			try {
				kreditSound.open(audioKredit);
			} catch (LineUnavailableException ex) {
				throw new RuntimeException(ex);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}

			this.introSound.stop();
			this.kreditSound.stop();
			this.kreditSound.start();
			
			
			Jlabelcr.setVisible(false);
			frame.remove(Jlabelcr);
			Jlabelcr.setVisible(false);
			frame.remove(Jlabelcr);
			int kr = cr+100;cr=kr;
			Jlabelcr = new JLabel(""+cr);
			Jlabelcr.setBounds(1670,64,500,50);
			Jlabelcr.setForeground(new Color(240, 185, 206));
			Jlabelcr.setFont(new Font("Verdana", Font.PLAIN, 36));
			((JComponent) Jlabel13).setOpaque(false);
			frame.add(Jlabelcr);
			Jlabelcr.setVisible(true);
			
			break;
			
		case 53 : 
			
			if (cr>0) {
			Jlabelul.setVisible(false);
			frame.remove(Jlabelul);
			int uu = ul+1;
			if (uu==41) {
				uu=1;
				}ul=uu;
			if (uu==cr+1) {
				uu=1;
				}
				ul=uu;
			Jlabelul = new JLabel(""+ul);
			frame.add(Jlabelul);
			Jlabelul.setBounds(1690,192,500,50);
			Jlabelul.setForeground(new Color(240, 185, 206));
			Jlabelul.setFont(new Font("Verdana", Font.PLAIN, 36));
			((JComponent) Jlabelul).setOpaque(false);
			Jlabelul.setVisible(true);
			
			int ddx0=1200;if(uu>9) {ddx0=1177;}dx0=ddx0;
			Jlabeld0.setVisible(false);
			frame.remove(Jlabeld0);//FIVE OF A KIND
			Jlabeld0 = new JLabel(""+d0*ul);
			frame.add(Jlabeld0);
			Jlabeld0.setBounds(dx0,0,120,40);
			Jlabeld0.setForeground(Color.YELLOW);
			Jlabeld0.setFont(new Font("Verdana", Font.PLAIN, 36));
			((JComponent) Jlabeld0).setOpaque(false);
			Jlabeld0.setVisible(true);
			
			int ddx1=1223;if(uu>1) {ddx1=1200;} if(uu>19) {ddx1=1177;}dx1=ddx1;
			Jlabeld1.setVisible(false);
			frame.remove(Jlabeld1);//ROYAL FLUSH
			Jlabeld1 = new JLabel(""+d1*ul);
			frame.add(Jlabeld1);
			Jlabeld1.setBounds(dx1,32,120,40);
			Jlabeld1.setForeground(Color.RED);
			Jlabeld1.setFont(new Font("Verdana", Font.PLAIN, 36));
			((JComponent) Jlabeld1).setOpaque(false);
			Jlabeld1.setVisible(true);
			
			int ddx2=1223;if(uu>9) {ddx2=1200;} dx2=ddx2;
			Jlabeld2.setVisible(false);
			frame.remove(Jlabeld2);//STREET FLUSH
			Jlabeld2 = new JLabel(""+d2*ul);
			frame.add(Jlabeld2);
			Jlabeld2.setBounds(dx2,64,120,40);
			Jlabeld2.setForeground(new Color(240, 185, 206));
			Jlabeld2.setFont(new Font("Verdana", Font.PLAIN, 36));
			((JComponent) Jlabeld2).setOpaque(false);
			Jlabeld2.setVisible(true);
			
			int ddx3=1246;if(uu>2) {ddx3=1223;} if(uu>24) {ddx3=1200;} dx3=ddx3;
			Jlabeld3.setVisible(false);
			frame.remove(Jlabeld3);//POKER
			Jlabeld3 = new JLabel(""+d3*ul);
			frame.add(Jlabeld3);
			Jlabeld3.setBounds(dx3,96,120,40);
			Jlabeld3.setForeground(new Color(240, 185, 206));
			Jlabeld3.setFont(new Font("Verdana", Font.PLAIN, 36));
			((JComponent) Jlabeld3).setOpaque(false);
			Jlabeld3.setVisible(true);
			
			int ddx4=1246;if(uu>9) {ddx4=1223;} dx4=ddx4;
			Jlabeld4.setVisible(false);
			frame.remove(Jlabeld4);//FULL HOUSE
			Jlabeld4 = new JLabel(""+d4*ul);
			frame.add(Jlabeld4);
			Jlabeld4.setBounds(dx4,128,120,40);
			Jlabeld4.setForeground(new Color(240, 185, 206));
			Jlabeld4.setFont(new Font("Verdana", Font.PLAIN, 36));
			((JComponent) Jlabeld4).setOpaque(false);
			Jlabeld4.setVisible(true);
			
			int ddx5=1269;if(uu>1) {ddx5=1246;} if(uu>14) {ddx5=1223;} dx5=ddx5;
			Jlabeld5.setVisible(false);
			frame.remove(Jlabeld5);//FLUSH
			Jlabeld5 = new JLabel(""+d5*ul);
			frame.add(Jlabeld5);
			Jlabeld5.setBounds(dx5,160,120,40);
			Jlabeld5.setForeground(new Color(240, 185, 206));
			Jlabeld5.setFont(new Font("Verdana", Font.PLAIN, 36));
			((JComponent) Jlabeld5).setOpaque(false);
			Jlabeld5.setVisible(true);
			
			int ddx6=1269;if(uu>1) {ddx6=1246;} if(uu>19) {ddx6=1223;} dx6=ddx6;
			Jlabeld6.setVisible(false);
			frame.remove(Jlabeld6);//STREET
			Jlabeld6 = new JLabel(""+d6*ul);
			frame.add(Jlabeld6);
			Jlabeld6.setBounds(dx6,192,120,40);
			Jlabeld6.setForeground(new Color(240, 185, 206));
			Jlabeld6.setFont(new Font("Verdana", Font.PLAIN, 36));
			((JComponent) Jlabeld6).setOpaque(false);
			Jlabeld6.setVisible(true);
			
			int ddx7=1269;if(uu>3) {ddx7=1246;} if(uu>33) {ddx7=1223;} dx7=ddx7;
			Jlabeld7.setVisible(false);
			frame.remove(Jlabeld7);//THREE OF A KIND
			Jlabeld7 = new JLabel(""+d7*ul);
			frame.add(Jlabeld7);
			Jlabeld7.setBounds(dx7,224,120,40);
			Jlabeld7.setForeground(new Color(240, 185, 206));
			Jlabeld7.setFont(new Font("Verdana", Font.PLAIN, 36));
			((JComponent) Jlabeld7).setOpaque(false);
			Jlabeld7.setVisible(true);
			
			int ddx8=1269;if(uu>4) {ddx8=1246;} dx8=ddx8;
			Jlabeld8.setVisible(false);
			frame.remove(Jlabeld8);//2 PAIRS
			Jlabeld8 = new JLabel(""+d8*ul);
			frame.add(Jlabeld8);
			Jlabeld8.setBounds(dx8,256,120,40);
			Jlabeld8.setForeground(new Color(240, 185, 206));
			Jlabeld8.setFont(new Font("Verdana", Font.PLAIN, 36));
			((JComponent) Jlabeld8).setOpaque(false);
			Jlabeld8.setVisible(true);
			
			int ddx9=1269;if(uu>9) {ddx9=1246;} dx9=ddx9;
			Jlabeld9.setVisible(false);
			frame.remove(Jlabeld9);//HIGH PAIR
			Jlabeld9 = new JLabel(""+d9*ul);
			frame.add(Jlabeld9);
			Jlabeld9.setBounds(dx9,288,120,40);
			Jlabeld9.setForeground(new Color(240, 185, 206));
			Jlabeld9.setFont(new Font("Verdana", Font.PLAIN, 36));
			((JComponent) Jlabeld9).setOpaque(false);
			Jlabeld9.setVisible(true);



				URL ulog = this.getClass().getClassLoader().getResource("resources/Ulog.wav");
				AudioInputStream audioUlog = null;
				try {
					audioUlog = AudioSystem.getAudioInputStream(ulog);
				} catch (UnsupportedAudioFileException ex) {
					throw new RuntimeException(ex);
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
				try {
					this.ulogSound = AudioSystem.getClip();
				} catch (LineUnavailableException ex) {
					throw new RuntimeException(ex);
				}
				try {
					ulogSound.open(audioUlog);
				} catch (LineUnavailableException ex) {
					throw new RuntimeException(ex);
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
				this.ulogSound.start();
			}
			
			else {
				
				break;
			}
			
			break;
			
		case 32 : 
			
			if (cr>0) {
				if (ah==1) { int aha=ah--;ah=aha;
				Jlabelah.setVisible(false);
				frame.remove(Jlabelah);ah=0;
				}
				else { int aha=ah++;ah=aha;
				Jlabelah.setVisible(false);
				frame.remove(Jlabelah);ah=1;
				Jlabelah = new JLabel("AUTOHOLD");
				frame.add(Jlabelah);
				Jlabelah.setBounds(1620,292,500,40);
				Jlabelah.setForeground(Color.BLUE);
				Jlabelah.setFont(new Font("Verdana", Font.PLAIN, 36));
				((JComponent) Jlabelah).setOpaque(false);
				Jlabelah.setVisible(true);
				}

				URL autohold = this.getClass().getClassLoader().getResource("resources/Autohold.wav");
				AudioInputStream audioAutohold = null;
				try {
					audioAutohold = AudioSystem.getAudioInputStream(autohold);
				} catch (UnsupportedAudioFileException ex) {
					throw new RuntimeException(ex);
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
				try {
					this.autoholdSound = AudioSystem.getClip();
				} catch (LineUnavailableException ex) {
					throw new RuntimeException(ex);
				}
				try {
					autoholdSound.open(audioAutohold);
				} catch (LineUnavailableException ex) {
					throw new RuntimeException(ex);
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
				this.autoholdSound.start();
			}
			break;

			case 109 : 
				
				Jlabelcr.setVisible(false);
				frame.remove(Jlabelcr);
			
			if (cr>0) {
				
				Jlabelcr.setVisible(false);
				frame.remove(Jlabelcr);
				frame.removeKeyListener(this);
				
				try {
					
					new Countdown1();
					
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				break;
				
				}
			
			else {
				
				Jlabelcr.setVisible(true);
				frame.add(Jlabelcr);
				
			break;
			
				}
			
			case 10 : 
				
				if (cr>0) {
					
				delj=1;
				JlabelR1.setVisible(false);
				JlabelR2.setVisible(false);
				JlabelL.setVisible(false);
				JlabelR.setVisible(false);
				frame.remove(JlabelR1);
				frame.remove(JlabelR2);
				frame.remove(JlabelL);
				frame.remove(JlabelR);
				JlabelJ1.setVisible(false);
				JlabelJ2.setVisible(false);
				JlabelJ3.setVisible(false);
				JlabelJ4.setVisible(false);
				JlabelJ5.setVisible(false);
				frame.remove(JlabelJ1);
				frame.remove(JlabelJ2);
				frame.remove(JlabelJ3);
				frame.remove(JlabelJ4);
				frame.remove(JlabelJ5);
				Jlabelcr.setVisible(false);
				frame.remove(Jlabelcr);
				cr=cr-ul;
				Jlabelcr = new JLabel(""+cr);
				Jlabelcr.setBounds(1670,64,500,50);
				Jlabelcr.setForeground(new Color(240, 185, 206));
				Jlabelcr.setFont(new Font("Verdana", Font.PLAIN, 36));
				((JComponent) Jlabelcr).setOpaque(false);
				frame.add(Jlabelcr);
				Jlabelcr.setVisible(true);

					URL deljenje = this.getClass().getClassLoader().getResource("resources/Deljenje.wav");
					AudioInputStream audioDeljenje = null;
					try {
						audioDeljenje = AudioSystem.getAudioInputStream(deljenje);
					} catch (UnsupportedAudioFileException ex) {
						throw new RuntimeException(ex);
					} catch (IOException ex) {
						throw new RuntimeException(ex);
					}
					try {
						this.deljenjeSound = AudioSystem.getClip();
					} catch (LineUnavailableException ex) {
						throw new RuntimeException(ex);
					}
					try {
						deljenjeSound.open(audioDeljenje);
					} catch (LineUnavailableException ex) {
						throw new RuntimeException(ex);
					} catch (IOException ex) {
						throw new RuntimeException(ex);
					}
					this.deljenjeSound.start();
				
				frame.add(JlabelK1);
				frame.add(JlabelK2);
				frame.add(JlabelK3);
				frame.add(JlabelK4);
				frame.add(JlabelK5);
				JlabelK1.setVisible(true);
				JlabelK2.setVisible(true);
				JlabelK3.setVisible(true);
				JlabelK4.setVisible(true);
				JlabelK5.setVisible(true);
				
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
}
