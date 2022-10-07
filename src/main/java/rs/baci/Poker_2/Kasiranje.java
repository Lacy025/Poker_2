package rs.baci.Poker_2;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Kasiranje implements Brojevi, Dobici, MainFrame {
	
	int kasa;
	
	Kasiranje() throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		labelT10.setVisible(false);
		tabela.remove(labelT10);
		
		MyFrame.Jlabelcr.setVisible(false);
		frame.remove(MyFrame.Jlabelcr);
		
		kasa=1;
		
		frame.add(Izbor2.pobeda);
		Izbor2.pobeda.setVisible(true);
			
		new Upis1();
			
		while (kasa>0&&MyFrame.dobitak>-1) {
			
			if (kasa==5000) {
				
				Izbor2.pobeda.setVisible(true);
				Thread.sleep(500);
				kasa++;
				
			}	
					
			if (kasa==10000&&MyFrame.dobitak>-1) {
					
				Izbor2.pobeda.setVisible(false);
				Thread.sleep(500);
				kasa=0;
				
			}
			
			kasa++;
		
			}
			
			Thread.sleep(400);
			Izbor2.pobeda.setVisible(true);
		
	}

}
