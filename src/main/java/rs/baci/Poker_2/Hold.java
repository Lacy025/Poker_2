package rs.baci.Poker_2;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Hold implements MainFrame {

	JLabel hold1 = new JLabel(" STOP");
	JLabel hold2 = new JLabel(" STOP");
	JLabel hold3 = new JLabel(" STOP");
	JLabel hold4 = new JLabel(" STOP");
	JLabel hold5 = new JLabel(" STOP");

	Hold() throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {

		if (Dobitak1.stop1==1) {

			hold1.setBounds(120,920,130,40);
			frame.add(hold1);
			hold1.setForeground(Color.YELLOW);
			hold1.setBackground(Color.RED);
			hold1.setFont(new Font("Verdana", Font.PLAIN, 36));
			hold1.setOpaque(true);
			hold1.setVisible(true);
			new Stop();
		}

		if (Dobitak1.stop2==1) {

			hold2.setBounds(500,920,130,40);
			frame.add(hold2);
			hold2.setForeground(Color.YELLOW);
			hold2.setBackground(Color.RED);
			hold2.setFont(new Font("Verdana", Font.PLAIN, 36));
			hold2.setOpaque(true);
			hold2.setVisible(true);
			new Stop();
		}

		if (Dobitak1.stop3==1) {

			hold3.setBounds(890,920,130,40);
			frame.add(hold3);
			hold3.setForeground(Color.YELLOW);
			hold3.setBackground(Color.RED);
			hold3.setFont(new Font("Verdana", Font.PLAIN, 36));
			hold3.setOpaque(true);
			hold3.setVisible(true);
			new Stop();
		}

		if (Dobitak1.stop4==1) {

			hold4.setBounds(1270,920,130,40);
			frame.add(hold4);
			hold4.setForeground(Color.YELLOW);
			hold4.setBackground(Color.RED);
			hold4.setFont(new Font("Verdana", Font.PLAIN, 36));
			hold4.setOpaque(true);
			hold4.setVisible(true);
			new Stop();
		}

		if (Dobitak1.stop5==1) {

			hold5.setBounds(1650,920,130,40);
			frame.add(hold5);
			hold5.setForeground(Color.YELLOW);
			hold5.setBackground(Color.RED);
			hold5.setFont(new Font("Verdana", Font.PLAIN, 36));
			hold5.setOpaque(true);
			hold5.setVisible(true);
			new Stop();
		}

	}

}
