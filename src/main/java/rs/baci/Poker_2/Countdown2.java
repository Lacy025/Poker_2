package rs.baci.Poker_2;

import java.awt.Component;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Countdown2 implements MainFrame, Numbers {
	
	public Component Money_2 = new JLabel(""+ MyFrame.cr);
	Timer timer;
	Countdown2() throws InterruptedException {
		 		timer = new Timer(1000, e -> {
		 		if(MyFrame.cr > -1) {
					 ((JLabel) Money_2).setText("" + MyFrame.cr);
					 MyFrame.cr = MyFrame.cr - 100;
	            try {
					new Cash_2();
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
					e1.printStackTrace();
				}
	            }
	            else  {
					((Timer) (e.getSource())).stop();
					frame.remove(Money_2);
	            	MyFrame.kr = 0;
                    MyFrame.cr = -1;
                    MyFrame.dealing = 3;
	            }});
		    	frame.add(Money_2);
		    	
		    	Money_2.setBounds(1670,64,500,50);
		        Money_2.setFont(font1);
		    	Money_2.setForeground(color3);
		    	((JComponent) Money_2).setOpaque(false);
		    	Money_2.setVisible(true);
		    	
		    	timer.setInitialDelay(0);
			    timer.start();                     
	}
}
