package rs.baci.Poker_2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Countdown2 implements MainFrame {
	
	public Component Jlabel13 = new JLabel(""+ MyFrame.cr);
	
	Timer timer;
	
	Countdown2() throws InterruptedException { 
		
		 		timer = new Timer(1000, e -> {
			 	
		 		if(MyFrame.cr>-1) { ((JLabel) Jlabel13).setText(""+String.valueOf(MyFrame.cr));
                    MyFrame.cr = MyFrame.cr-100;
			 	
	            try {
					new Isplata2();
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            }
	            else  {((Timer) (e.getSource())).stop();frame.remove(Jlabel13);
	            MyFrame.kr=0;
                    MyFrame.cr=-1;
                    MyFrame.delj=3;
	            }
		 		
		 		});
		 		
		    	frame.add(Jlabel13);
		    	
		    	Jlabel13.setBounds(1670,64,500,50);
		        Jlabel13.setFont(new Font("Verdana", Font.PLAIN, 36));
		    	Jlabel13.setForeground(new Color(240, 185, 206));
		    	((JComponent) Jlabel13).setOpaque(false);
		    	Jlabel13.setVisible(true);
		    	
		    	timer.setInitialDelay(0);
			    timer.start();                     
	}
}
