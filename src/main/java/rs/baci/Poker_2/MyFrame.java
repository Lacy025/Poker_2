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


public class MyFrame implements Brojevi, Dobici, MainFrame, KeyListener {
	
	@Serial
	private static final long serialVersionUID = 1L;
	Clip introSound;
	Clip kreditSound;
	Clip ulogSound;
	Clip autoholdSound;
	Clip kasaSound;
	
	static int kr;
	static int cr;
	public int uu = 1;
	public static int ul = 1;
	public static int ah = 1;
	static int ch;
	public static int dobitak;
	public static int ukupno;
	public static int igra;
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
	public static int delj;
	static int prekid;

	public static int n1;
	public static int n2;
	public static int n3;
	public static int n4;
	public static int n5;
	
	public static Component Jlabelah = new JLabel("AUTOHOLD");
	public static Component Jlabelcr = new JLabel(""+cr);
	public static Component Jlabelul = new JLabel(""+ul);
	public static Component Jlabeld0 = new JLabel(""+d0*ul);
	public static Component Jlabeld1 = new JLabel(""+d1*ul);
	public static Component Jlabeld2 = new JLabel(""+d2*ul);
	public static Component Jlabeld3 = new JLabel(""+d3*ul);
	public static Component Jlabeld4 = new JLabel(""+d4*ul);
	public static Component Jlabeld5 = new JLabel(""+d5*ul);
	public static Component Jlabeld6 = new JLabel(""+d6*ul);
	public static Component Jlabeld7 = new JLabel(""+d7*ul);
	public static Component Jlabeld8 = new JLabel(""+d8*ul);
	public static Component Jlabeld9 = new JLabel(""+d9*ul);
	public static Component JlabelR1 = new JLabel("JOKER");
	public static Component JlabelR2 = new JLabel("CARD");
	public static Component JlabelL = new JLabel("  LACIKA BAČI");
	public static Component JlabelR = new JLabel("  SRBIJA 2022");
	public static Component JlabelM1 = new JLabel("                    BIRAJTE ULOG");
	public static Component JlabelM2 = new JLabel("                 PRITISNITE DELJENJE");

	private static BufferedImage loadImage(String path) {
		try {
			return ImageIO.read(Objects.requireNonNull(MyFrame.class.getClassLoader().getResource(path)));
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		}
	}

	static ImageIcon iconK1 = new ImageIcon(Objects.requireNonNull(loadImage("resources/53.png")));
	public static final Component JlabelK1 = new JLabel(iconK1);
	static ImageIcon iconK2 = new ImageIcon(Objects.requireNonNull(loadImage("resources/53.png")));
	public static final Component JlabelK2 = new JLabel(iconK2);
	static ImageIcon iconK3 = new ImageIcon(Objects.requireNonNull(loadImage("resources/53.png")));
	public static final Component JlabelK3 = new JLabel(iconK3);
	static ImageIcon iconK4 = new ImageIcon(Objects.requireNonNull(loadImage("resources/53.png")));
	public static final Component JlabelK4 = new JLabel(iconK4);
	static ImageIcon iconK5 = new ImageIcon(Objects.requireNonNull(loadImage("resources/53.png")));
	public static final Component JlabelK5 = new JLabel(iconK5);
	static ImageIcon iconJ1 = new ImageIcon(Objects.requireNonNull(loadImage("resources/0.png")));
	static final Component JlabelJ1 = new JLabel(iconJ1);
	static ImageIcon iconJ2 = new ImageIcon(Objects.requireNonNull(loadImage("resources/0.png")));
	static final Component JlabelJ2 = new JLabel(iconJ2);
	static ImageIcon iconJ3 = new ImageIcon(Objects.requireNonNull(loadImage("resources/0.png")));
	static final Component JlabelJ3 = new JLabel(iconJ3);
	static ImageIcon iconJ4 = new ImageIcon(Objects.requireNonNull(loadImage("resources/0.png")));
	static final Component JlabelJ4 = new JLabel(iconJ4);
	static ImageIcon iconJ5 = new ImageIcon(Objects.requireNonNull(loadImage("resources/0.png")));
	static final Component JlabelJ5 = new JLabel(iconJ5);

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

	public static Component Jlabel0 = new JLabel(icon0);
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
	public static int karta2;
	public static int karta3;
	public static int karta4;
	public static int karta5;
	public static int boja1;
	public static int boja2;
	public static int boja3;
	public static int boja4;
	public static int boja5;
	
	MyFrame() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {

		if (Dobitak.DOBITAK>0) {

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

		frame.addKeyListener(this);

		prekid=1;

		if (cr>0) {

			while (igra==0||prekid<9999) {

				if (prekid==1000) {
					Thread.sleep(400);
					prekid++;
				}
				if (prekid==2000) {
					Thread.sleep(400);
					prekid++;
				}
				if (prekid==3000) {
					Thread.sleep(400);
					prekid++;
				}
				if (prekid==4000) {
					Thread.sleep(400);
					prekid++;
				}
				if (prekid==5000) {
					Thread.sleep(400);
					prekid++;
				}
				if (prekid==6000) {
					Thread.sleep(400);
					prekid++;
				}
				if (prekid==7000) {
					Thread.sleep(400);
					prekid++;
				}
				if (prekid==8000) {
					Thread.sleep(400);
					prekid++;
				}
				if (prekid==9000) {
					Thread.sleep(400);
					prekid++;
				}
				prekid++;
			}

		}

		Dobitak.DOBITAK=0;
		new Clear();
		prekid=10000;

		if (cr==0&&igra==0) {

		frame.setTitle("POKER");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0,0,0));
		frame.setLayout(null);
		frame.setSize(1920,1080);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		Jlabelah.setVisible(true);

			URL intro = this.getClass().getClassLoader().getResource("resources/Intro.wav");
			assert intro != null;
			AudioInputStream audioIntro = AudioSystem.getAudioInputStream(intro);
			this.introSound = AudioSystem.getClip();
			introSound.open(audioIntro);
			introSound.start();

			JlabelL.setVisible(false);
			JlabelR.setVisible(false);

			frame.setVisible(true);
			frame.setResizable(false);

			frame.add(JlabelL);
			frame.add(JlabelR);

			Jlabelah.setBounds(1620,292,500,40);

			JlabelK1.setBounds(-5, 350, 400, 600);
			JlabelK2.setBounds(375, 350, 400, 600);
			JlabelK3.setBounds(755, 350, 400, 600);
			JlabelK4.setBounds(1135, 350, 400, 600);
			JlabelK5.setBounds(1515, 350, 400, 600);
			JlabelL.setBounds(20,950,300,40);
			JlabelR.setBounds(1580,950,300,40);

			frame.add(Jlabelah);

		}

		if (ukupno>0) {
			cr=cr-ukupno;
		}

		ukupno=0;

		if (ul>cr&&cr>0) {

			ul=cr;
			((JLabel) Jlabelul).setText(""+(ul));

			((JLabel) Jlabeld0).setText(""+String.valueOf(d0*ul));
			((JLabel) Jlabeld1).setText(""+String.valueOf(d1*ul));
			((JLabel) Jlabeld2).setText(""+String.valueOf(d2*ul));
			((JLabel) Jlabeld3).setText(""+String.valueOf(d3*ul));
			((JLabel) Jlabeld4).setText(""+String.valueOf(d4*ul));
			((JLabel) Jlabeld5).setText(""+String.valueOf(d5*ul));
			((JLabel) Jlabeld6).setText(""+String.valueOf(d6*ul));
			((JLabel) Jlabeld7).setText(""+String.valueOf(d7*ul));
			((JLabel) Jlabeld8).setText(""+String.valueOf(d8*ul));
			((JLabel) Jlabeld9).setText(""+String.valueOf(d9*ul));

			new Ulog();

		}

		if (cr==0&igra==1) {

			ul=1;jk=60000;

			frame.add(JlabelL);
			frame.add(JlabelR);
			JlabelL.setVisible(true);
			JlabelR.setVisible(true);
			JlabelL.setBounds(20,950,300,40);
			JlabelR.setBounds(1580,950,300,40);

			ch=1;

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

			((JLabel) Jlabelul).setText(""+(ul));

			((JLabel) Jlabeld0).setText(""+String.valueOf(d0*ul));
			((JLabel) Jlabeld1).setText(""+String.valueOf(d1*ul));
			((JLabel) Jlabeld2).setText(""+String.valueOf(d2*ul));
			((JLabel) Jlabeld3).setText(""+String.valueOf(d3*ul));
			((JLabel) Jlabeld4).setText(""+String.valueOf(d4*ul));
			((JLabel) Jlabeld5).setText(""+String.valueOf(d5*ul));
			((JLabel) Jlabeld6).setText(""+String.valueOf(d6*ul));
			((JLabel) Jlabeld7).setText(""+String.valueOf(d7*ul));
			((JLabel) Jlabeld8).setText(""+String.valueOf(d8*ul));
			((JLabel) Jlabeld9).setText(""+String.valueOf(d9*ul));

		}

		((JLabel) Jlabelcr).setText(""+(cr));

		JlabelM1.setBounds(550,960,800,40);
		JlabelM2.setBounds(550,960,800,40);

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

		Jlabeld0.setBounds(dx0,L0,120,32);
		Jlabeld1.setBounds(dx1,L1,120,32);
		Jlabeld2.setBounds(dx2,L2,120,32);
		Jlabeld3.setBounds(dx3,L3,120,32);
		Jlabeld4.setBounds(dx4,L4,120,32);
		Jlabeld5.setBounds(dx5,L5,120,32);
		Jlabeld6.setBounds(dx6,L6,120,32);
		Jlabeld7.setBounds(dx7,L7,120,32);
		Jlabeld8.setBounds(dx8,L8,120,32);
		Jlabeld9.setBounds(dx9,L9,120,32);

		Jlabelcr.setBounds(1670,64,500,50);
		Jlabelul.setBounds(1690,192,500,50);

		frame.add(Jlabelcr);
		frame.add(Jlabelul);
		
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

		Jlabeld0.setVisible(true);
		Jlabeld1.setVisible(true);
		Jlabeld2.setVisible(true);
		Jlabeld3.setVisible(true);
		Jlabeld4.setVisible(true);
		Jlabeld5.setVisible(true);
		Jlabeld6.setVisible(true);
		Jlabeld7.setVisible(true);
		Jlabeld8.setVisible(true);
		Jlabeld9.setVisible(true);

		Jlabelcr.setVisible(true);
		Jlabelul.setVisible(true);
		
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

		Jlabelah.setForeground(color4);
		Jlabelcr.setForeground(color3);
		Jlabelul.setForeground(color3);
		Jlabeld0.setForeground(color1);
		Jlabeld1.setForeground(color2);
		Jlabeld2.setForeground(color3);
		Jlabeld3.setForeground(color3);
		Jlabeld4.setForeground(color3);
		Jlabeld5.setForeground(color3);
		Jlabeld6.setForeground(color3);
		Jlabeld7.setForeground(color3);
		Jlabeld8.setForeground(color3);
		Jlabeld9.setForeground(color3);
		JlabelL.setForeground(color1);
		JlabelR.setForeground(color1);
		JlabelL.setBackground(color2);
		JlabelR.setBackground(color2);
		JlabelM1.setForeground(color1);
		JlabelM2.setForeground(color1);
		JlabelM1.setBackground(color2);
		JlabelM2.setBackground(color2);
		
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
		
		Jlabelah.setFont(font1);
		Jlabelcr.setFont(font1);
		Jlabelul.setFont(font1);
		Jlabeld0.setFont(font1);
		Jlabeld1.setFont(font1);
		Jlabeld2.setFont(font1);
		Jlabeld3.setFont(font1);
		Jlabeld4.setFont(font1);
		Jlabeld5.setFont(font1);
		Jlabeld6.setFont(font1);
		Jlabeld7.setFont(font1);
		Jlabeld8.setFont(font1);
		Jlabeld9.setFont(font1);
		JlabelL.setFont(font1);
		JlabelR.setFont(font1);
		JlabelM1.setFont(font1);
		JlabelM2.setFont(font1);
		
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
		((JComponent) JlabelM1).setOpaque(true);
		((JComponent) JlabelM2).setOpaque(true);

		JlabelR1.setBounds(400, 180, 1000, 800);
		JlabelR2.setBounds(700, 420, 800, 800);
		JlabelR1.setForeground(color2);
		JlabelR2.setForeground(color2);
		JlabelR1.setFont(new Font("Algerian", Font.ITALIC, 272));
		JlabelR2.setFont(new Font("Algerian", Font.ITALIC, 272));
		JlabelR1.setVisible(false);
		JlabelR2.setVisible(false);

		frame.add(JlabelR1);
		frame.add(JlabelR2);
		frame.add(JlabelM1);
		frame.add(JlabelM2);

		JlabelM1.setVisible(false);
		JlabelM2.setVisible(false);
		
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

		while (delj==0) {

			if(jk==5000) {
				if (cr==0||ch==1) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(false);
					JlabelM2.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
			}

			if(jk==10000) {
				JlabelR1.setVisible(false);
				JlabelR2.setVisible(false);
				JlabelK1.setVisible(false);
				JlabelJ1.setVisible(true);
				if (cr==0||ch==1) {
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(false);
					JlabelM2.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
			}

			if(jk==15000) {
				if (cr==0||ch==1) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(false);
					JlabelM2.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
			}

			if(jk==20000) {
				JlabelJ1.setVisible(false);
				JlabelK2.setVisible(false);
				JlabelJ2.setVisible(true);
				JlabelK1.setVisible(true);
				if (cr==0||ch==1) {
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(false);
					JlabelM2.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
			}

			if(jk==25000) {
				if (cr==0||ch==1) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(false);
					JlabelM2.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
			}

			if(jk==30000) {
				JlabelJ2.setVisible(false);
				JlabelK3.setVisible(false);
				JlabelJ3.setVisible(true);
				JlabelK2.setVisible(true);
				if (cr==0||ch==1) {
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(true);
					JlabelM2.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
			}

			if(jk==35000) {
				if (cr==0||ch==1) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(true);
					JlabelM2.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
			}
			if(jk==40000) {
				JlabelJ3.setVisible(false);
				JlabelK4.setVisible(false);
				JlabelJ4.setVisible(true);
				JlabelK3.setVisible(true);
				if (cr==0||ch==1) {
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(true);
					JlabelM2.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
			}
			if(jk==45000) {
				if (cr==0||ch==1) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(true);
					JlabelM2.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
			}
			if(jk==50000) {
				JlabelJ4.setVisible(false);
				JlabelK5.setVisible(false);
				JlabelJ5.setVisible(true);
				JlabelK4.setVisible(true);

				if (cr==0||ch==1) {
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(true);
					JlabelM2.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
			}
			if(jk==55000) {
				if (cr==0||ch==1) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(false);
					JlabelM2.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
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

				if (cr==0||ch==1) {
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(false);
					JlabelM2.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
			}

			if(jk==65000) {
				if (cr==0||ch==1) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(false);
					JlabelM2.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
			}

			if(jk==70000) {
				if (cr==0||ch==1) {
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(false);
					JlabelM2.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
			}

			if(jk==75000) {
				if (cr==0||ch==1) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(false);
					JlabelM2.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
			}

			if(jk==80000) {
				if (cr==0||ch==1) {
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(true);
					JlabelM2.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
			}

			if(jk==85000) {
				if (cr==0||ch==1) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(true);
					JlabelM2.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
			}

			if(jk==90000) {
				if (cr==0||ch==1) {
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(true);
					JlabelM2.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
			}

			if(jk==95000) {
				if (cr==0||ch==1) {
					JlabelL.setVisible(false);
					JlabelR.setVisible(true);
					Thread.sleep(500);
					jk++;
				}
				else {
					JlabelM1.setVisible(true);
					JlabelM2.setVisible(false);
					Thread.sleep(500);
					jk++;
				}
			}

			if(jk==100000) {
				JlabelR1.setVisible(false);
				JlabelR2.setVisible(false);
				JlabelK1.setVisible(true);
				JlabelK2.setVisible(true);
				JlabelK3.setVisible(true);
				JlabelK4.setVisible(true);
				JlabelK5.setVisible(true);

				if (cr==0||ch==1) {
					JlabelL.setVisible(true);
					JlabelR.setVisible(false);
					Thread.sleep(500);
					jk=0;
				}
				else {
					JlabelM1.setVisible(true);
					JlabelM2.setVisible(false);
					Thread.sleep(500);
					jk=0;
				}
			}
			jk++;

		}
			
		if (delj==5) {

			jk=60000;cr=0;kr=0;ul=1;uu=1;ah=1;delj=0;

			Jlabelah.setVisible(false);
			frame.remove(Jlabelah);
			Jlabelcr.setVisible(false);
			frame.remove(Jlabelcr);
			Jlabelul.setVisible(false);
			frame.remove(Jlabelul);
			Jlabeld0.setVisible(false);
			frame.remove(Jlabeld0);
			Jlabeld1.setVisible(false);
			frame.remove(Jlabeld1);
			Jlabeld2.setVisible(false);
			frame.remove(Jlabeld2);
			Jlabeld3.setVisible(false);
			frame.remove(Jlabeld3);
			Jlabeld4.setVisible(false);
			frame.remove(Jlabeld4);
			Jlabeld5.setVisible(false);
			frame.remove(Jlabeld5);
			Jlabeld6.setVisible(false);
			frame.remove(Jlabeld6);
			Jlabeld7.setVisible(false);
			frame.remove(Jlabeld7);
			Jlabeld8.setVisible(false);
			frame.remove(Jlabeld8);
			Jlabeld9.setVisible(false);
			frame.remove(Jlabeld9);
			JlabelL.setVisible(false);
			frame.remove(JlabelL);
			JlabelR.setVisible(false);
			frame.remove(JlabelR);
			JlabelM1.setVisible(false);
			frame.remove(JlabelM1);
			JlabelM2.setVisible(false);
			frame.remove(JlabelM2);
			JlabelR1.setVisible(false);
			frame.remove(JlabelR1);
			JlabelR2.setVisible(false);
			frame.remove(JlabelR2);
			JlabelK1.setVisible(false);
			frame.remove(JlabelK1);
			JlabelK2.setVisible(false);
			frame.remove(JlabelK2);
			JlabelK3.setVisible(false);
			frame.remove(JlabelK3);
			JlabelK4.setVisible(false);
			frame.remove(JlabelK4);
			JlabelK5.setVisible(false);
			frame.remove(JlabelK5);
			JlabelJ1.setVisible(false);
			frame.remove(JlabelJ1);
			JlabelJ2.setVisible(false);
			frame.remove(JlabelJ2);
			JlabelJ3.setVisible(false);
			frame.remove(JlabelJ3);
			JlabelJ4.setVisible(false);
			frame.remove(JlabelJ4);
			JlabelJ5.setVisible(false);
			frame.remove(JlabelJ5);

			((JLabel) Jlabelul).setText(""+String.valueOf(1));
			((JLabel) Jlabeld0).setText(""+String.valueOf(d0));
			((JLabel) Jlabeld1).setText(""+String.valueOf(d1));
			((JLabel) Jlabeld2).setText(""+String.valueOf(d2));
			((JLabel) Jlabeld3).setText(""+String.valueOf(d3));
			((JLabel) Jlabeld4).setText(""+String.valueOf(d4));
			((JLabel) Jlabeld5).setText(""+String.valueOf(d5));
			((JLabel) Jlabeld6).setText(""+String.valueOf(d6));
			((JLabel) Jlabeld7).setText(""+String.valueOf(d7));
			((JLabel) Jlabeld8).setText(""+String.valueOf(d8));
			((JLabel) Jlabeld9).setText(""+String.valueOf(d9));

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

			igra=0;

			frame.dispose();

	}
			frame.removeKeyListener(this);
}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		switch(e.getKeyCode()) {
		
		case 81 :

			if (prekid>9999) {

				if (cr < 1 && igra == 0) {

					this.introSound.stop();

				}

				URL kredit = this.getClass().getClassLoader().getResource("resources/Kredit.wav");
				AudioInputStream audioKredit;
				try {
					assert kredit != null;
					audioKredit = AudioSystem.getAudioInputStream(kredit);
				} catch (UnsupportedAudioFileException | IOException ex) {
					throw new RuntimeException(ex);
				}
				try {
					this.kreditSound = AudioSystem.getClip();
				} catch (LineUnavailableException ex) {
					throw new RuntimeException(ex);
				}
				try {
					kreditSound.open(audioKredit);
				} catch (LineUnavailableException | IOException ex) {
					throw new RuntimeException(ex);
				}
				this.kreditSound.start();

				Jlabelcr.setVisible(false);
				frame.remove(Jlabelcr);
				cr = cr + 100;
				((JLabel) Jlabelcr).setText("" + String.valueOf(cr));
				Jlabelcr.setBounds(1670, 64, 500, 50);
				Jlabelcr.setForeground(color3);
				Jlabelcr.setFont(font1);
				frame.add(Jlabelcr);
				Jlabelcr.setVisible(true);
				JlabelL.setVisible(false);
				JlabelR.setVisible(false);
				frame.remove(JlabelL);
				frame.remove(JlabelR);

				break;

			}
			else {
				break;
			}
			
		case 53 :

			if (cr>0&&prekid>9999) {

				Jlabelul.setVisible(false);
				frame.remove(Jlabelul);
				int uu = ul+1;

				if (uu==41) {
					uu=1;
				}
				ul=uu;

				if (uu==cr+1) {
					uu=1;
				}
				ul=uu;
				((JLabel) Jlabelul).setText(""+String.valueOf(ul));
				frame.add(Jlabelul);
				Jlabelul.setBounds(1690,192,500,50);
				Jlabelul.setForeground(color3);
				Jlabelul.setFont(font1);
				((JComponent) Jlabelul).setOpaque(false);
				Jlabelul.setVisible(true);

				int ddx0=1200;if(uu>9) {ddx0=1177;}dx0=ddx0;
				Jlabeld0.setVisible(false);
				frame.remove(Jlabeld0);//FIVE OF A KIND
				((JLabel) Jlabeld0).setText(""+String.valueOf(d0*ul));
				frame.add(Jlabeld0);
				Jlabeld0.setBounds(dx0,L0,120,32);
				Jlabeld0.setForeground(color1);
				Jlabeld0.setFont(font1);
				((JComponent) Jlabeld0).setOpaque(false);
				Jlabeld0.setVisible(true);

				int ddx1=1223;if(uu>1) {ddx1=1200;} if(uu>19) {ddx1=1177;}dx1=ddx1;
				Jlabeld1.setVisible(false);
				frame.remove(Jlabeld1);//ROYAL FLUSH
				((JLabel) Jlabeld1).setText(""+String.valueOf(d1*ul));
				frame.add(Jlabeld1);
				Jlabeld1.setBounds(dx1,L1,120,32);
				Jlabeld1.setForeground(color2);
				Jlabeld1.setFont(font1);
				((JComponent) Jlabeld1).setOpaque(false);
				Jlabeld1.setVisible(true);

				int ddx2=1223;if(uu>9) {ddx2=1200;} dx2=ddx2;
				Jlabeld2.setVisible(false);
				frame.remove(Jlabeld2);//STREET FLUSH
				((JLabel) Jlabeld2).setText(""+String.valueOf(d2*ul));
				frame.add(Jlabeld2);
				Jlabeld2.setBounds(dx2,L2,120,32);
				Jlabeld2.setForeground(color3);
				Jlabeld2.setFont(font1);
				((JComponent) Jlabeld2).setOpaque(false);
				Jlabeld2.setVisible(true);

				int ddx3=1246;if(uu>2) {ddx3=1223;} if(uu>24) {ddx3=1200;} dx3=ddx3;
				Jlabeld3.setVisible(false);
				frame.remove(Jlabeld3);//POKER
				((JLabel) Jlabeld3).setText(""+String.valueOf(d3*ul));
				frame.add(Jlabeld3);
				Jlabeld3.setBounds(dx3,L3,120,32);
				Jlabeld3.setForeground(color3);
				Jlabeld3.setFont(font1);
				((JComponent) Jlabeld3).setOpaque(false);
				Jlabeld3.setVisible(true);

				int ddx4=1246;if(uu>9) {ddx4=1223;} dx4=ddx4;
				Jlabeld4.setVisible(false);
				frame.remove(Jlabeld4);//FULL HOUSE
				((JLabel) Jlabeld4).setText(""+String.valueOf(d4*ul));
				frame.add(Jlabeld4);
				Jlabeld4.setBounds(dx4,L4,120,32);
				Jlabeld4.setForeground(color3);
				Jlabeld4.setFont(font1);
				((JComponent) Jlabeld4).setOpaque(false);
				Jlabeld4.setVisible(true);

				int ddx5=1269;if(uu>1) {ddx5=1246;} if(uu>14) {ddx5=1223;} dx5=ddx5;
				Jlabeld5.setVisible(false);
				frame.remove(Jlabeld5);//FLUSH
				((JLabel) Jlabeld5).setText(""+String.valueOf(d5*ul));
				frame.add(Jlabeld5);
				Jlabeld5.setBounds(dx5,L5,120,32);
				Jlabeld5.setForeground(color3);
				Jlabeld5.setFont(font1);
				((JComponent) Jlabeld5).setOpaque(false);
				Jlabeld5.setVisible(true);

				int ddx6=1269;if(uu>1) {ddx6=1246;} if(uu>19) {ddx6=1223;} dx6=ddx6;
				Jlabeld6.setVisible(false);
				frame.remove(Jlabeld6);//STREET
				((JLabel) Jlabeld6).setText(""+String.valueOf(d6*ul));
				frame.add(Jlabeld6);
				Jlabeld6.setBounds(dx6,L6,120,32);
				Jlabeld6.setForeground(color3);
				Jlabeld6.setFont(font1);
				((JComponent) Jlabeld6).setOpaque(false);
				Jlabeld6.setVisible(true);

				int ddx7=1269;if(uu>3) {ddx7=1246;} if(uu>33) {ddx7=1223;} dx7=ddx7;
				Jlabeld7.setVisible(false);
				frame.remove(Jlabeld7);//THREE OF A KIND
				((JLabel) Jlabeld7).setText(""+String.valueOf(d7*ul));
				frame.add(Jlabeld7);
				Jlabeld7.setBounds(dx7,L7,120,32);
				Jlabeld7.setForeground(color3);
				Jlabeld7.setFont(font1);
				((JComponent) Jlabeld7).setOpaque(false);
				Jlabeld7.setVisible(true);

				int ddx8=1269;if(uu>4) {ddx8=1246;} dx8=ddx8;
				Jlabeld8.setVisible(false);
				frame.remove(Jlabeld8);//2 PAIRS
				((JLabel) Jlabeld8).setText(""+String.valueOf(d8*ul));
				frame.add(Jlabeld8);
				Jlabeld8.setBounds(dx8,L8,120,32);
				Jlabeld8.setForeground(color3);
				Jlabeld8.setFont(font1);
				((JComponent) Jlabeld8).setOpaque(false);
				Jlabeld8.setVisible(true);

				int ddx9=1269;if(uu>9) {ddx9=1246;} dx9=ddx9;
				Jlabeld9.setVisible(false);
				frame.remove(Jlabeld9);//HIGH PAIR
				((JLabel) Jlabeld9).setText(""+String.valueOf(d9*ul));
				frame.add(Jlabeld9);
				Jlabeld9.setBounds(dx9,L9,120,32);
				Jlabeld9.setForeground(color3);
				Jlabeld9.setFont(font1);
				((JComponent) Jlabeld9).setOpaque(false);
				Jlabeld9.setVisible(true);

				URL ulog = this.getClass().getClassLoader().getResource("resources/Ulog.wav");
				AudioInputStream audioUlog;
				try {
					assert ulog != null;
					audioUlog = AudioSystem.getAudioInputStream(ulog);
				} catch (UnsupportedAudioFileException | IOException ex) {
					throw new RuntimeException(ex);
				}
				try {
					this.ulogSound = AudioSystem.getClip();
				} catch (LineUnavailableException ex) {
					throw new RuntimeException(ex);
				}
				try {
					ulogSound.open(audioUlog);
				} catch (LineUnavailableException | IOException ex) {
					throw new RuntimeException(ex);
				}
				this.ulogSound.start();
			}
			
			else {
				
				break;
			}
			
			break;
			
		case 32 : 
			
			if (cr>0&&prekid>9999) {

				if (ah==1) { int aha=ah--;ah=aha;
				Jlabelah.setVisible(false);
				frame.remove(Jlabelah);ah=0;
				}
				else {
					int aha=ah++;ah=aha;
					Jlabelah.setVisible(false);
					frame.remove(Jlabelah);ah=1;
					Jlabelah = new JLabel("AUTOHOLD");
					frame.add(Jlabelah);
					Jlabelah.setBounds(1620,292,500,40);
					Jlabelah.setForeground(color4);
					Jlabelah.setFont(font1);
					((JComponent) Jlabelah).setOpaque(false);
					Jlabelah.setVisible(true);
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
					this.autoholdSound = AudioSystem.getClip();
				} catch (LineUnavailableException ex) {
					throw new RuntimeException(ex);
				}
				try {
					autoholdSound.open(audioAutohold);
				} catch (LineUnavailableException | IOException ex) {
					throw new RuntimeException(ex);
				}
				this.autoholdSound.start();
			}

			break;

			case 109 :

				if (prekid>9999) {

				Jlabelcr.setVisible(false);
				frame.remove(Jlabelcr);
			
			if (cr>0) {

				Jlabelcr.setVisible(false);
				frame.remove(Jlabelcr);
				frame.removeKeyListener(this);

				JlabelM1.setVisible(false);
				JlabelM2.setVisible(false);
				frame.remove(JlabelM1);
				frame.remove(JlabelM2);
				frame.add(JlabelL);
				frame.add(JlabelR);
				JlabelL.setVisible(true);
				JlabelR.setVisible(true);
				JlabelL.setBounds(20,950,300,40);
				JlabelR.setBounds(1580,950,300,40);
				ch=1;

				try {
					new Countdown1();
				} catch (InterruptedException ex) {
					throw new RuntimeException(ex);
				}

				break;
				
				}
			
			else {
				Jlabelcr.setVisible(true);
				frame.add(Jlabelcr);

				break;
					}
				}

			else {
				break;
					}
			
			case 10 :

				if (Dobitak.DOBITAK>0) {

					prekid=10000;
					this.kasaSound.stop();

				}

				if (cr>0) {

					delj=1;
					prekid=10000;
					igra=1;

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
