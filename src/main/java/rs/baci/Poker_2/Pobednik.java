package rs.baci.Poker_2;

public class Pobednik implements Runnable, MainFrame {

	@Override
	public void run() {
			
		while (Dupliranje.x3 != Dupliranje.duplo) {
		
			Izbor2.pobeda.setVisible(false);
			
			try {
				
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			Izbor2.pobeda.setVisible(true);
			
				try {
					
					Thread.sleep(500);
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
		}
	}
}