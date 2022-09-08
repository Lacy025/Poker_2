package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Countdown1 implements MainFrame, Brojevi {

	public Component Jlabel13 = new JLabel(""+MyFrame.cr);

	Timer timer;

	Countdown1() throws InterruptedException {

		((JLabel) Jlabel13).setText(""+MyFrame.cr--);

		timer = new Timer(50, e -> { double x = MyFrame.cr;
			if (x==-1) {((JLabel) Jlabel13).setText(""+0);
				try {
					new Isplata2();Thread.sleep(900);
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException |
						 InterruptedException e1) {

					e1.printStackTrace();
				}
				Jlabel13.setBounds(1670,64,500,50);
				Jlabel13.setFont(font1);
				Jlabel13.setForeground(color3);
				((JComponent) Jlabel13).setOpaque(false);
				Jlabel13.setVisible(true);
				frame.add(Jlabel13);

				MyFrame.kr=0;MyFrame.cr=-1;MyFrame.delj=5;
			}
			else if(((int)x/100 != (x/100)) && x>0) { ((JLabel) Jlabel13).setText(""+MyFrame.cr--);
				try {
					new Isplata1();
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {

					e1.printStackTrace();
				} catch (InterruptedException ex) {
					throw new RuntimeException(ex);
				}
			}

			else  {

				((Timer) (e.getSource())).stop();
				Jlabel13.setVisible(false);
				frame.remove(Jlabel13);

				try {
					new Countdown2();

				} catch (InterruptedException e1) {

					e1.printStackTrace();
				}
			}
		});

		frame.add(Jlabel13);

		Jlabel13.setBounds(1670,64,500,50);
		Jlabel13.setFont(font1);
		Jlabel13.setForeground(color3);
		((JComponent) Jlabel13).setOpaque(false);
		Jlabel13.setVisible(true);

		timer.setInitialDelay(0);
		timer.start();
	}
}