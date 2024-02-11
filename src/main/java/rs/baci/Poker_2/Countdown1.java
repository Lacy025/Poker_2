package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Countdown1 implements MainFrame, Numbers {

	public Component Money_1 = new JLabel("" + MyFrame.cr);
	Timer timer1;
	Countdown1() throws InterruptedException {

		((JLabel) Money_1).setText(""+ MyFrame.cr--);

		timer1 = new Timer(50, e -> {

			double x1 = MyFrame.cr;

			if (x1 == -1) {((JLabel) Money_1).setText("" + 0);
				try {
					new Cash_2();
					Thread.sleep(900);
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException |
						 InterruptedException e1) {
					e1.printStackTrace();
				}

				Money_1.setBounds(1670,64,500,50);
				Money_1.setFont(font1);
				Money_1.setForeground(color3);
				((JComponent) Money_1).setOpaque(false);
				Money_1.setVisible(true);
				frame.add(Money_1);

				MyFrame.kr = 0;
				MyFrame.cr = -1;
				MyFrame.dealing = 5;
			}
			else if(((int)x1 / 100 != (x1 / 100)) && x1 > 0) {
				((JLabel) Money_1).setText(""+ MyFrame.cr--);
				try {
					new Cash_1();
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			else  {
				((Timer) (e.getSource())).stop();
				Money_1.setVisible(false);
				frame.remove(Money_1);
				try {
					new Countdown2();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		});
		frame.add(Money_1);

		Money_1.setBounds(1670,64,500,50);
		Money_1.setFont(font1);
		Money_1.setForeground(color3);
		((JComponent) Money_1).setOpaque(false);
		Money_1.setVisible(true);

		timer1.setInitialDelay(0);
		timer1.start();
	}
}