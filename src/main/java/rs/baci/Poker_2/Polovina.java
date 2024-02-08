package rs.baci.Poker_2;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;

public class Polovina extends Thread implements MainFrame, Dobici, Brojevi {
	public void run() {
		Dupliranje.pola = 0;
		Dupliranje.karta = 0;
		MyFrame.Credit.setVisible(false);
		frame.remove(MyFrame.Credit);
		labelT10.setVisible(false);
		tabela.remove(labelT10);
		frame.add(Izbor2.pobeda);
		Izbor2.pobeda.setVisible(true);
		if (Dupliranje.duplo < 101) {
			while (Dupliranje.x3 != Dupliranje.duplo) {
				Dupliranje.duplo--;
				MyFrame.cr++;
				MyFrame.Credit.setVisible(false);
				frame.remove(MyFrame.Credit);
				((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
				frame.add(MyFrame.Credit);
				MyFrame.Credit.setVisible(true);
				labelT10.setVisible(false);
				labelT10.setText((int) Dupliranje.duplo + " ");
				labelT10.setHorizontalAlignment(JLabel.RIGHT);
				labelT10.setVerticalAlignment(JLabel.BOTTOM);
				labelT10.setFont(font2);
				labelT10.setForeground(color1);
				labelT10.setOpaque(false);
				tabela.add(labelT10);
				labelT10.setVisible(true);
				try {
					new Isplata1();
					Thread.sleep(40);
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException
						 | InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			labelT10.setVisible(false);
			tabela.remove(labelT10);
			labelT10.setText((int) Dupliranje.duplo + " ");
			tabela.add(labelT10);
			labelT10.setVisible(true);
			((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
			frame.add(MyFrame.Credit);
			MyFrame.Credit.setVisible(true);
			Izbor2.pobeda.setVisible(true);
			try {
				new Isplata2();
				Thread.sleep(1000);
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
				e1.printStackTrace();
			}
			Dupliranje.karta = Dupliranje.xkarta;
			Dupliranje.pola = 0;
			Dupliranje.vecamanja = 1;
			Izbor2.pobeda.setVisible(false);
			frame.remove(Izbor2.pobeda);
		}
		if (Dupliranje.duplo == 200) {
			Dupliranje.duplo = Dupliranje.duplo - 100;
			MyFrame.cr = MyFrame.cr + 100;
			((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
			frame.add(MyFrame.Credit);
			MyFrame.Credit.setVisible(true);
			labelT10.setText((int) Dupliranje.duplo + " ");
			labelT10.setHorizontalAlignment(JLabel.RIGHT);
			labelT10.setVerticalAlignment(JLabel.BOTTOM);
			labelT10.setFont(font2);
			labelT10.setForeground(color1);
			labelT10.setOpaque(false);
			tabela.add(labelT10);
			labelT10.setVisible(true);
			try {
				new Isplata2();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				new Isplata2();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Dupliranje.karta = Dupliranje.xkarta;
			Dupliranje.pola = 0;
			Dupliranje.vecamanja = 1;
			Izbor2.pobeda.setVisible(false);
			frame.remove(Izbor2.pobeda);
		}

		if (Dupliranje.duplo > 100 && Dupliranje.duplo < 200) {
			int x4=(int)Dupliranje.duplo - 100;
			Dupliranje.duplo = Dupliranje.duplo - x4;
			MyFrame.cr = MyFrame.cr + x4;
			((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
			frame.add(MyFrame.Credit);
			MyFrame.Credit.setVisible(true);
			labelT10.setText((int) Dupliranje.duplo + " ");
			labelT10.setHorizontalAlignment(JLabel.RIGHT);
			labelT10.setVerticalAlignment(JLabel.BOTTOM);
			labelT10.setFont(font2);
			labelT10.setForeground(color1);
			labelT10.setOpaque(false);
			tabela.add(labelT10);
			labelT10.setVisible(true);
			try {
				new Isplata2();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			while (Dupliranje.x3 != Dupliranje.duplo) {
				Dupliranje.duplo--;
				MyFrame.cr++;
				MyFrame.Credit.setVisible(false);
				frame.remove(MyFrame.Credit);
				((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
				frame.add(MyFrame.Credit);
				MyFrame.Credit.setVisible(true);
				labelT10.setVisible(false);
				labelT10.setText((int) Dupliranje.duplo + " ");
				labelT10.setHorizontalAlignment(JLabel.RIGHT);
				labelT10.setVerticalAlignment(JLabel.BOTTOM);
				labelT10.setFont(font2);
				labelT10.setForeground(color1);
				labelT10.setOpaque(false);
				tabela.add(labelT10);
				labelT10.setVisible(true);
				try {
					new Isplata1();
					Thread.sleep(40);
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException
						 | InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			labelT10.setVisible(false);
			tabela.remove(labelT10);
			labelT10.setText((int) Dupliranje.duplo + " ");
			tabela.add(labelT10);
			labelT10.setVisible(true);
			((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
			frame.add(MyFrame.Credit);
			MyFrame.Credit.setVisible(true);
			Izbor2.pobeda.setVisible(true);
			try {
				new Isplata2();
				Thread.sleep(1000);
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
				e1.printStackTrace();
			}
			Dupliranje.karta = Dupliranje.xkarta;
			Dupliranje.pola = 0;
			Dupliranje.vecamanja = 1;
			Izbor2.pobeda.setVisible(false);
			frame.remove(Izbor2.pobeda);
		}
		if (Dupliranje.duplo > 200) {
			if ((int)Dupliranje.duplo / 100 == Dupliranje.duplo / 100) {
				while (Dupliranje.duplo - Dupliranje.x3 > 99) {
					labelT10.setVisible(false);
					tabela.remove(labelT10);
					Dupliranje.duplo = Dupliranje.duplo - 100;
					MyFrame.cr = MyFrame.cr + 100;
					((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
					frame.add(MyFrame.Credit);
					MyFrame.Credit.setVisible(true);
					labelT10.setText((int) Dupliranje.duplo + " ");
					labelT10.setHorizontalAlignment(JLabel.RIGHT);
					labelT10.setVerticalAlignment(JLabel.BOTTOM);
					labelT10.setFont(font2);
					labelT10.setForeground(color1);
					labelT10.setOpaque(false);
					tabela.add(labelT10);
					labelT10.setVisible(true);
					try {
						new Isplata2();
						Thread.sleep(1000);
					} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
						e1.printStackTrace();
					}
				}
				if (Dupliranje.duplo - Dupliranje.x3 > 0) {
					Dupliranje.duplo = Dupliranje.x3;
					MyFrame.cr = MyFrame.cr + 50;
					labelT10.setVisible(false);
					tabela.remove(labelT10);
					labelT10.setText((int) Dupliranje.x3 + " ");
					tabela.add(labelT10);
					labelT10.setVisible(true);
					((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
					frame.add(MyFrame.Credit);
					MyFrame.Credit.setVisible(true);
					Izbor2.pobeda.setVisible(true);
					try {
						new Isplata2();
						Thread.sleep(1000);
					} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
						e1.printStackTrace();
					}
				}
				labelT10.setVisible(false);
				tabela.remove(labelT10);
				labelT10.setText((int) Dupliranje.x3 + " ");
				tabela.add(labelT10);
				labelT10.setVisible(true);
				((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
				frame.add(MyFrame.Credit);
				MyFrame.Credit.setVisible(true);
				Izbor2.pobeda.setVisible(true);
				try {
					new Isplata2();
					Thread.sleep(1000);
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
					e1.printStackTrace();
				}
				Dupliranje.karta = Dupliranje.xkarta;
				Dupliranje.pola = 0;
				Dupliranje.vecamanja = 1;
				Izbor2.pobeda.setVisible(false);
				frame.remove(Izbor2.pobeda);
			}
			else {
				labelT10.setVisible(false);
				tabela.remove(labelT10);
				int x5 = (int) (Dupliranje.duplo - (((int)Dupliranje.duplo / 100) * 100));
				Dupliranje.duplo = Dupliranje.duplo - x5;
				MyFrame.cr = MyFrame.cr + x5;
				((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
				frame.add(MyFrame.Credit);
				MyFrame.Credit.setVisible(true);
				labelT10.setText((int) Dupliranje.duplo + " ");
				labelT10.setHorizontalAlignment(JLabel.RIGHT);
				labelT10.setVerticalAlignment(JLabel.BOTTOM);
				labelT10.setFont(font2);
				labelT10.setForeground(color1);
				labelT10.setOpaque(false);
				tabela.add(labelT10);
				labelT10.setVisible(true);
				try {
					new Isplata2();
					Thread.sleep(1000);
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
					e1.printStackTrace();
				}
				while (Dupliranje.duplo - Dupliranje.x3 > 99) {
					labelT10.setVisible(false);
					tabela.remove(labelT10);
					Dupliranje.duplo = Dupliranje.duplo - 100;
					MyFrame.cr=MyFrame.cr + 100;
					((JLabel) MyFrame.Credit).setText(String.valueOf(MyFrame.cr));
					frame.add(MyFrame.Credit);
					MyFrame.Credit.setVisible(true);
					labelT10.setText((int) Dupliranje.duplo + " ");
					labelT10.setHorizontalAlignment(JLabel.RIGHT);
					labelT10.setVerticalAlignment(JLabel.BOTTOM);
					labelT10.setFont(font2);
					labelT10.setForeground(color1);
					labelT10.setOpaque(false);
					tabela.add(labelT10);
					labelT10.setVisible(true);
					try {
						new Isplata2();
						Thread.sleep(1000);
					} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
						e1.printStackTrace();
					}
				}
				labelT10.setVisible(false);
				tabela.remove(labelT10);
				MyFrame.cr = MyFrame.cr + ((int)Dupliranje.duplo - Dupliranje.x3);
				Dupliranje.duplo = Dupliranje.x3;
				labelT10.setText((int) Dupliranje.duplo + " ");
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
					new Isplata2();
					Thread.sleep(1000);
					new Isplata2();
					Thread.sleep(1000);
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
					e1.printStackTrace();
				}
				Dupliranje.karta = Dupliranje.xkarta;
				Dupliranje.pola = 0;
				Dupliranje.vecamanja = 1;
				Izbor2.pobeda.setVisible(false);
				frame.remove(Izbor2.pobeda);
			}
		}
	}
}
