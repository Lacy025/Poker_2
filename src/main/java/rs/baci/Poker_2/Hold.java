package rs.baci.Poker_2;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;

public class Hold implements MainFrame, Numbers {
	static JLabel hold1 = new JLabel(" HOLD");
	static JLabel hold2 = new JLabel(" HOLD");
	static JLabel hold3 = new JLabel(" HOLD");
	static JLabel hold4 = new JLabel(" HOLD");
	static JLabel hold5 = new JLabel(" HOLD");
	Hold() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
		if (MyFrame.dealing == 1 && Win.stop1 == 1 && MyFrame.ah == 1) {
			hold1.setBounds(120,914,130,40);
			frame.add(hold1);
			hold1.setForeground(color1);
			hold1.setBackground(color2);
			hold1.setFont(font1);
			hold1.setOpaque(true);
			hold1.setVisible(true);
			new Stop();
		}
		if (MyFrame.dealing == 1 && Win.stop2 == 1 && MyFrame.ah == 1) {
			hold2.setBounds(500,914,130,40);
			frame.add(hold2);
			hold2.setForeground(color1);
			hold2.setBackground(color2);
			hold2.setFont(font1);
			hold2.setOpaque(true);
			hold2.setVisible(true);
			new Stop();
		}
		if (MyFrame.dealing == 1 && Win.stop3 == 1 && MyFrame.ah == 1) {
			hold3.setBounds(890,914,130,40);
			frame.add(hold3);
			hold3.setForeground(color1);
			hold3.setBackground(color2);
			hold3.setFont(font1);
			hold3.setOpaque(true);
			hold3.setVisible(true);
			new Stop();
		}
		if (MyFrame.dealing == 1 && Win.stop4 == 1 && MyFrame.ah == 1) {
			hold4.setBounds(1270,914,130,40);
			frame.add(hold4);
			hold4.setForeground(color1);
			hold4.setBackground(color2);
			hold4.setFont(font1);
			hold4.setOpaque(true);
			hold4.setVisible(true);
			new Stop();
		}
		if (MyFrame.dealing == 1 && Win.stop5 == 1 && MyFrame.ah == 1) {
			hold5.setBounds(1650,914,130,40);
			frame.add(hold5);
			hold5.setForeground(color1);
			hold5.setBackground(color2);
			hold5.setFont(font1);
			hold5.setOpaque(true);
			hold5.setVisible(true);
			new Stop();
		}
	}
}
