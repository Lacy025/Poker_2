package rs.baci.joker_card;

public class Winner implements Runnable, MainFrame {
	public void run() {
		while (Doubling.x3 != Doubling.twice) {
			Choice_2.you_win.setVisible(false);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Choice_2.you_win.setVisible(true);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
		}
	}
}
