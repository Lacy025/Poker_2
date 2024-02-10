package rs.baci.Poker_2;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;

public class Half extends Thread implements MainFrame, Winnings, Numbers {
	public void run() {
		Doubling.pola = 0;
		Doubling.karta = 0;
		MyFrame.Credit.setVisible(false);
		frame.remove(MyFrame.Credit);
		labelT10.setVisible(false);
		tabela.remove(labelT10);
		frame.add(Choice_2.you_win);
		Choice_2.you_win.setVisible(true);
		if (Doubling.duplo < 101) {
			while (Doubling.x3 != Doubling.duplo) {
				Doubling.duplo--;
				MyFrame.cr++;
				MyFrame.Credit.setVisible(false);
				frame.remove(MyFrame.Credit);
				((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
				frame.add(MyFrame.Credit);
				MyFrame.Credit.setVisible(true);
				labelT10.setVisible(false);
				labelT10.setText((int) Doubling.duplo + " ");
				labelT10.setHorizontalAlignment(JLabel.RIGHT);
				labelT10.setVerticalAlignment(JLabel.BOTTOM);
				labelT10.setFont(font2);
				labelT10.setForeground(color1);
				labelT10.setOpaque(false);
				tabela.add(labelT10);
				labelT10.setVisible(true);
				try {
					new Cash_1();
					Thread.sleep(40);
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException
						 | InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			labelT10.setVisible(false);
			tabela.remove(labelT10);
			labelT10.setText((int) Doubling.duplo + " ");
			tabela.add(labelT10);
			labelT10.setVisible(true);
			((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
			frame.add(MyFrame.Credit);
			MyFrame.Credit.setVisible(true);
			Choice_2.you_win.setVisible(true);
			try {
				new Cash_2();
				Thread.sleep(1000);
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
				e1.printStackTrace();
			}
			Doubling.karta = Doubling.xkarta;
			Doubling.pola = 0;
			Doubling.vecamanja = 1;
			Choice_2.you_win.setVisible(false);
			frame.remove(Choice_2.you_win);
		}
		if (Doubling.duplo == 200) {
			Doubling.duplo = Doubling.duplo - 100;
			MyFrame.cr = MyFrame.cr + 100;
			((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
			frame.add(MyFrame.Credit);
			MyFrame.Credit.setVisible(true);
			labelT10.setText((int) Doubling.duplo + " ");
			labelT10.setHorizontalAlignment(JLabel.RIGHT);
			labelT10.setVerticalAlignment(JLabel.BOTTOM);
			labelT10.setFont(font2);
			labelT10.setForeground(color1);
			labelT10.setOpaque(false);
			tabela.add(labelT10);
			labelT10.setVisible(true);
			try {
				new Cash_2();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				new Cash_2();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Doubling.karta = Doubling.xkarta;
			Doubling.pola = 0;
			Doubling.vecamanja = 1;
			Choice_2.you_win.setVisible(false);
			frame.remove(Choice_2.you_win);
		}

		if (Doubling.duplo > 100 && Doubling.duplo < 200) {
			int x4=(int) Doubling.duplo - 100;
			Doubling.duplo = Doubling.duplo - x4;
			MyFrame.cr = MyFrame.cr + x4;
			((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
			frame.add(MyFrame.Credit);
			MyFrame.Credit.setVisible(true);
			labelT10.setText((int) Doubling.duplo + " ");
			labelT10.setHorizontalAlignment(JLabel.RIGHT);
			labelT10.setVerticalAlignment(JLabel.BOTTOM);
			labelT10.setFont(font2);
			labelT10.setForeground(color1);
			labelT10.setOpaque(false);
			tabela.add(labelT10);
			labelT10.setVisible(true);
			try {
				new Cash_2();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			while (Doubling.x3 != Doubling.duplo) {
				Doubling.duplo--;
				MyFrame.cr++;
				MyFrame.Credit.setVisible(false);
				frame.remove(MyFrame.Credit);
				((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
				frame.add(MyFrame.Credit);
				MyFrame.Credit.setVisible(true);
				labelT10.setVisible(false);
				labelT10.setText((int) Doubling.duplo + " ");
				labelT10.setHorizontalAlignment(JLabel.RIGHT);
				labelT10.setVerticalAlignment(JLabel.BOTTOM);
				labelT10.setFont(font2);
				labelT10.setForeground(color1);
				labelT10.setOpaque(false);
				tabela.add(labelT10);
				labelT10.setVisible(true);
				try {
					new Cash_1();
					Thread.sleep(40);
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException
						 | InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			labelT10.setVisible(false);
			tabela.remove(labelT10);
			labelT10.setText((int) Doubling.duplo + " ");
			tabela.add(labelT10);
			labelT10.setVisible(true);
			((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
			frame.add(MyFrame.Credit);
			MyFrame.Credit.setVisible(true);
			Choice_2.you_win.setVisible(true);
			try {
				new Cash_2();
				Thread.sleep(1000);
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
				e1.printStackTrace();
			}
			Doubling.karta = Doubling.xkarta;
			Doubling.pola = 0;
			Doubling.vecamanja = 1;
			Choice_2.you_win.setVisible(false);
			frame.remove(Choice_2.you_win);
		}
		if (Doubling.duplo > 200) {
			if ((int) Doubling.duplo / 100 == Doubling.duplo / 100) {
				while (Doubling.duplo - Doubling.x3 > 99) {
					labelT10.setVisible(false);
					tabela.remove(labelT10);
					Doubling.duplo = Doubling.duplo - 100;
					MyFrame.cr = MyFrame.cr + 100;
					((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
					frame.add(MyFrame.Credit);
					MyFrame.Credit.setVisible(true);
					labelT10.setText((int) Doubling.duplo + " ");
					labelT10.setHorizontalAlignment(JLabel.RIGHT);
					labelT10.setVerticalAlignment(JLabel.BOTTOM);
					labelT10.setFont(font2);
					labelT10.setForeground(color1);
					labelT10.setOpaque(false);
					tabela.add(labelT10);
					labelT10.setVisible(true);
					try {
						new Cash_2();
						Thread.sleep(1000);
					} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
						e1.printStackTrace();
					}
				}
				if (Doubling.duplo - Doubling.x3 > 0) {
					Doubling.duplo = Doubling.x3;
					MyFrame.cr = MyFrame.cr + 50;
					labelT10.setVisible(false);
					tabela.remove(labelT10);
					labelT10.setText((int) Doubling.x3 + " ");
					tabela.add(labelT10);
					labelT10.setVisible(true);
					((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
					frame.add(MyFrame.Credit);
					MyFrame.Credit.setVisible(true);
					Choice_2.you_win.setVisible(true);
					try {
						new Cash_2();
						Thread.sleep(1000);
					} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
						e1.printStackTrace();
					}
				}
				labelT10.setVisible(false);
				tabela.remove(labelT10);
				labelT10.setText((int) Doubling.x3 + " ");
				tabela.add(labelT10);
				labelT10.setVisible(true);
				((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
				frame.add(MyFrame.Credit);
				MyFrame.Credit.setVisible(true);
				Choice_2.you_win.setVisible(true);
				try {
					new Cash_2();
					Thread.sleep(1000);
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
					e1.printStackTrace();
				}
				Doubling.karta = Doubling.xkarta;
				Doubling.pola = 0;
				Doubling.vecamanja = 1;
				Choice_2.you_win.setVisible(false);
				frame.remove(Choice_2.you_win);
			}
			else {
				labelT10.setVisible(false);
				tabela.remove(labelT10);
				int x5 = (int) (Doubling.duplo - (((int) Doubling.duplo / 100) * 100));
				Doubling.duplo = Doubling.duplo - x5;
				MyFrame.cr = MyFrame.cr + x5;
				((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
				frame.add(MyFrame.Credit);
				MyFrame.Credit.setVisible(true);
				labelT10.setText((int) Doubling.duplo + " ");
				labelT10.setHorizontalAlignment(JLabel.RIGHT);
				labelT10.setVerticalAlignment(JLabel.BOTTOM);
				labelT10.setFont(font2);
				labelT10.setForeground(color1);
				labelT10.setOpaque(false);
				tabela.add(labelT10);
				labelT10.setVisible(true);
				try {
					new Cash_2();
					Thread.sleep(1000);
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
					e1.printStackTrace();
				}
				while (Doubling.duplo - Doubling.x3 > 99) {
					labelT10.setVisible(false);
					tabela.remove(labelT10);
					Doubling.duplo = Doubling.duplo - 100;
					MyFrame.cr=MyFrame.cr + 100;
					((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
					frame.add(MyFrame.Credit);
					MyFrame.Credit.setVisible(true);
					labelT10.setText((int) Doubling.duplo + " ");
					labelT10.setHorizontalAlignment(JLabel.RIGHT);
					labelT10.setVerticalAlignment(JLabel.BOTTOM);
					labelT10.setFont(font2);
					labelT10.setForeground(color1);
					labelT10.setOpaque(false);
					tabela.add(labelT10);
					labelT10.setVisible(true);
					try {
						new Cash_2();
						Thread.sleep(1000);
					} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
						e1.printStackTrace();
					}
				}
				labelT10.setVisible(false);
				tabela.remove(labelT10);
				MyFrame.cr = MyFrame.cr + ((int) Doubling.duplo - Doubling.x3);
				Doubling.duplo = Doubling.x3;
				labelT10.setText((int) Doubling.duplo + " ");
				((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
				labelT10.setHorizontalAlignment(JLabel.RIGHT);
				labelT10.setVerticalAlignment(JLabel.BOTTOM);
				labelT10.setFont(font2);
				labelT10.setForeground(color1);
				labelT10.setOpaque(false);
				tabela.add(labelT10);
				labelT10.setVisible(true);
				frame.add(MyFrame.Credit);
				MyFrame.Credit.setVisible(true);
				try {
					new Cash_2();
					Thread.sleep(1000);
					new Cash_2();
					Thread.sleep(1000);
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
					e1.printStackTrace();
				}
				Doubling.karta = Doubling.xkarta;
				Doubling.pola = 0;
				Doubling.vecamanja = 1;
				Choice_2.you_win.setVisible(false);
				frame.remove(Choice_2.you_win);
			}
		}
	}
}
