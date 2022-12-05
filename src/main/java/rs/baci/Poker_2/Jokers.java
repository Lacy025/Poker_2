package rs.baci.Poker_2;

public class Jokers implements MainFrame {

	Jokers() {

		while (MyFrame.delj==0) {

			if (MyFrame.jk==5000) {

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(false);
					MyFrame.JlabelR.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(false);
					MyFrame.JlabelM2.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==10000) {

				if (MyFrame.blokada==1) {

					MyFrame.Jlabelcr.setVisible(false);
					frame.remove(MyFrame.Jlabelcr);

				}

				MyFrame.JlabelR1.setVisible(false);
				MyFrame.JlabelR2.setVisible(false);
				MyFrame.JlabelK1.setVisible(false);
				MyFrame.JlabelJ1.setVisible(true);

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(true);
					MyFrame.JlabelR.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(true);
					MyFrame.JlabelM2.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==15000) {

				if (MyFrame.cr==0||MyFrame.ch==1) {
					MyFrame.JlabelL.setVisible(false);
					MyFrame.JlabelR.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(true);
					MyFrame.JlabelM2.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==20000) {

				if (MyFrame.blokada==1) {

					frame.add(MyFrame.Jlabelcr);
					MyFrame.Jlabelcr.setVisible(true);

				}

				MyFrame.JlabelJ1.setVisible(false);
				MyFrame.JlabelK2.setVisible(false);
				MyFrame.JlabelJ2.setVisible(true);
				MyFrame.JlabelK1.setVisible(true);

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(true);
					MyFrame.JlabelR.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(false);
					MyFrame.JlabelM2.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==25000) {

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(false);
					MyFrame.JlabelR.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(false);
					MyFrame.JlabelM2.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==30000) {

				if (MyFrame.blokada==1) {

					MyFrame.Jlabelcr.setVisible(false);
					frame.remove(MyFrame.Jlabelcr);

				}

				MyFrame.JlabelJ2.setVisible(false);
				MyFrame.JlabelK3.setVisible(false);
				MyFrame.JlabelJ3.setVisible(true);
				MyFrame.JlabelK2.setVisible(true);

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(true);
					MyFrame.JlabelR.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(true);
					MyFrame.JlabelM2.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==35000) {

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(false);
					MyFrame.JlabelR.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(true);
					MyFrame.JlabelM2.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==40000) {

				if (MyFrame.blokada==1) {

					frame.add(MyFrame.Jlabelcr);
					MyFrame.Jlabelcr.setVisible(true);

				}

				MyFrame.JlabelJ3.setVisible(false);
				MyFrame.JlabelK4.setVisible(false);
				MyFrame.JlabelJ4.setVisible(true);
				MyFrame.JlabelK3.setVisible(true);

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(true);
					MyFrame.JlabelR.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(false);
					MyFrame.JlabelM2.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==45000) {

				if (MyFrame.cr==0||MyFrame.ch==1) {
					MyFrame.JlabelL.setVisible(false);
					MyFrame.JlabelR.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;
				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(false);
					MyFrame.JlabelM2.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==50000) {

				if (MyFrame.blokada==1) {

					MyFrame.Jlabelcr.setVisible(false);
					frame.remove(MyFrame.Jlabelcr);

				}

				MyFrame.JlabelJ4.setVisible(false);
				MyFrame.JlabelK5.setVisible(false);
				MyFrame.JlabelJ5.setVisible(true);
				MyFrame.JlabelK4.setVisible(true);

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(true);
					MyFrame.JlabelR.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(true);
					MyFrame.JlabelM2.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==55000) {

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(false);
					MyFrame.JlabelR.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(true);
					MyFrame.JlabelM2.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==60000) {

				if (MyFrame.blokada==1) {

					frame.add(MyFrame.Jlabelcr);
					MyFrame.Jlabelcr.setVisible(true);

				}

				MyFrame.JlabelK1.setVisible(false);
				MyFrame.JlabelK2.setVisible(false);
				MyFrame.JlabelK3.setVisible(false);
				MyFrame.JlabelK4.setVisible(false);
				MyFrame.JlabelK5.setVisible(false);
				MyFrame.JlabelJ1.setVisible(false);
				MyFrame.JlabelJ2.setVisible(false);
				MyFrame.JlabelJ3.setVisible(false);
				MyFrame.JlabelJ4.setVisible(false);
				MyFrame.JlabelJ5.setVisible(false);
				MyFrame.JlabelR1.setVisible(true);
				MyFrame.JlabelR2.setVisible(true);

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(true);
					MyFrame.JlabelR.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(false);
					MyFrame.JlabelM2.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==65000) {

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(false);
					MyFrame.JlabelR.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(false);
					MyFrame.JlabelM2.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==70000) {

				if (MyFrame.blokada==1) {

					MyFrame.Jlabelcr.setVisible(false);
					frame.remove(MyFrame.Jlabelcr);

				}

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(true);
					MyFrame.JlabelR.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(true);
					MyFrame.JlabelM2.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==75000) {

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(false);
					MyFrame.JlabelR.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(true);
					MyFrame.JlabelM2.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==80000) {

				if (MyFrame.blokada==1) {

					frame.add(MyFrame.Jlabelcr);
					MyFrame.Jlabelcr.setVisible(true);

				}

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(true);
					MyFrame.JlabelR.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(false);
					MyFrame.JlabelM2.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==85000) {

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(false);
					MyFrame.JlabelR.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(false);
					MyFrame.JlabelM2.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==90000) {

				if (MyFrame.blokada==1) {

					MyFrame.Jlabelcr.setVisible(false);
					frame.remove(MyFrame.Jlabelcr);

				}

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(true);
					MyFrame.JlabelR.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(true);
					MyFrame.JlabelM2.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==95000) {

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(false);
					MyFrame.JlabelR.setVisible(true);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;
				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(true);
					MyFrame.JlabelM2.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk++;

				}
			}

			if (MyFrame.jk==100000) {

				if (MyFrame.blokada==1) {

					frame.add(MyFrame.Jlabelcr);
					MyFrame.Jlabelcr.setVisible(true);

				}

				MyFrame.JlabelR1.setVisible(false);
				MyFrame.JlabelR2.setVisible(false);
				MyFrame.JlabelK1.setVisible(true);
				MyFrame.JlabelK2.setVisible(true);
				MyFrame.JlabelK3.setVisible(true);
				MyFrame.JlabelK4.setVisible(true);
				MyFrame.JlabelK5.setVisible(true);

				if (MyFrame.cr==0||MyFrame.ch==1) {

					MyFrame.JlabelL.setVisible(true);
					MyFrame.JlabelR.setVisible(false);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk=0;

				}

				if (MyFrame.cr>0) {

					MyFrame.JlabelM1.setVisible(false);
					MyFrame.JlabelM2.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					MyFrame.jk=0;
				}
			}

			MyFrame.jk++;

		}
	}
}
