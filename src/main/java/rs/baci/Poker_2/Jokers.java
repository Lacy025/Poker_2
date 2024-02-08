package rs.baci.Poker_2;

public class Jokers implements MainFrame {
	Jokers() {
		while (MyFrame.dealing == 0) {
			if (MyFrame.jk == 5000) {
				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(false);
					MyFrame.Right_zero.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(false);
					MyFrame.Middle_2.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 10000) {
				if (MyFrame.blocked == 1) {
					MyFrame.Credit.setVisible(false);
					frame.remove(MyFrame.Credit);
				}
				MyFrame.Joker.setVisible(false);
				MyFrame.Card.setVisible(false);
				MyFrame.Card_1.setVisible(false);
				MyFrame.Joker_1.setVisible(true);
				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(true);
					MyFrame.Right_zero.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(true);
					MyFrame.Middle_2.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 15000) {
				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(false);
					MyFrame.Right_zero.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(true);
					MyFrame.Middle_2.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 20000) {
				if (MyFrame.blocked == 1) {
					frame.add(MyFrame.Credit);
					MyFrame.Credit.setVisible(true);
				}
				MyFrame.Joker_1.setVisible(false);
				MyFrame.Card_2.setVisible(false);
				MyFrame.Joker_2.setVisible(true);
				MyFrame.Card_1.setVisible(true);
				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(true);
					MyFrame.Right_zero.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(false);
					MyFrame.Middle_2.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 25000) {
				if (MyFrame.cr ==0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(false);
					MyFrame.Right_zero.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(false);
					MyFrame.Middle_2.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 30000) {
				if (MyFrame.blocked == 1) {
					MyFrame.Credit.setVisible(false);
					frame.remove(MyFrame.Credit);
				}
				MyFrame.Joker_2.setVisible(false);
				MyFrame.Card_3.setVisible(false);
				MyFrame.Joker_3.setVisible(true);
				MyFrame.Card_2.setVisible(true);
				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(true);
					MyFrame.Right_zero.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(true);
					MyFrame.Middle_2.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 35000) {
				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(false);
					MyFrame.Right_zero.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(true);
					MyFrame.Middle_2.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 40000) {
				if (MyFrame.blocked == 1) {
					frame.add(MyFrame.Credit);
					MyFrame.Credit.setVisible(true);
				}
				MyFrame.Joker_3.setVisible(false);
				MyFrame.Card_4.setVisible(false);
				MyFrame.Joker_4.setVisible(true);
				MyFrame.Card_3.setVisible(true);
				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(true);
					MyFrame.Right_zero.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(false);
					MyFrame.Middle_2.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 45000) {
				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(false);
					MyFrame.Right_zero.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(false);
					MyFrame.Middle_2.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 50000) {
				if (MyFrame.blocked == 1) {
					MyFrame.Credit.setVisible(false);
					frame.remove(MyFrame.Credit);
				}
				MyFrame.Joker_4.setVisible(false);
				MyFrame.Card_5.setVisible(false);
				MyFrame.Joker_5.setVisible(true);
				MyFrame.Card_4.setVisible(true);
				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(true);
					MyFrame.Right_zero.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(true);
					MyFrame.Middle_2.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 55000) {
				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(false);
					MyFrame.Right_zero.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(true);
					MyFrame.Middle_2.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 60000) {
				if (MyFrame.blocked == 1) {
					frame.add(MyFrame.Credit);
					MyFrame.Credit.setVisible(true);
				}
				MyFrame.Card_1.setVisible(false);
				MyFrame.Card_2.setVisible(false);
				MyFrame.Card_3.setVisible(false);
				MyFrame.Card_4.setVisible(false);
				MyFrame.Card_5.setVisible(false);
				MyFrame.Joker_1.setVisible(false);
				MyFrame.Joker_2.setVisible(false);
				MyFrame.Joker_3.setVisible(false);
				MyFrame.Joker_4.setVisible(false);
				MyFrame.Joker_5.setVisible(false);
				MyFrame.Joker.setVisible(true);
				MyFrame.Card.setVisible(true);

				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(true);
					MyFrame.Right_zero.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(false);
					MyFrame.Middle_2.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 65000) {
				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(false);
					MyFrame.Right_zero.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(false);
					MyFrame.Middle_2.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 70000) {
				if (MyFrame.blocked == 1) {
					MyFrame.Credit.setVisible(false);
					frame.remove(MyFrame.Credit);
				}
				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(true);
					MyFrame.Right_zero.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(true);
					MyFrame.Middle_2.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 75000) {
				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(false);
					MyFrame.Right_zero.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(true);
					MyFrame.Middle_2.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 80000) {
				if (MyFrame.blocked == 1) {
					frame.add(MyFrame.Credit);
					MyFrame.Credit.setVisible(true);
				}
				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(true);
					MyFrame.Right_zero.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(false);
					MyFrame.Middle_2.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 85000) {
				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(false);
					MyFrame.Right_zero.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(false);
					MyFrame.Middle_2.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 90000) {
				if (MyFrame.blocked == 1) {
					MyFrame.Credit.setVisible(false);
					frame.remove(MyFrame.Credit);
				}
				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(true);
					MyFrame.Right_zero.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(true);
					MyFrame.Middle_2.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 95000) {
				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(false);
					MyFrame.Right_zero.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(true);
					MyFrame.Middle_2.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk++;
				}
			}
			if (MyFrame.jk == 100000) {
				if (MyFrame.blocked == 1) {
					frame.add(MyFrame.Credit);
					MyFrame.Credit.setVisible(true);
				}
				MyFrame.Joker.setVisible(false);
				MyFrame.Card.setVisible(false);
				MyFrame.Card_1.setVisible(true);
				MyFrame.Card_2.setVisible(true);
				MyFrame.Card_3.setVisible(true);
				MyFrame.Card_4.setVisible(true);
				MyFrame.Card_5.setVisible(true);

				if (MyFrame.cr == 0 || MyFrame.ch == 1) {
					MyFrame.Left_zero.setVisible(true);
					MyFrame.Right_zero.setVisible(false);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk = 0;
				}
				if (MyFrame.cr > 0) {
					MyFrame.Middle_1.setVisible(false);
					MyFrame.Middle_2.setVisible(true);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					MyFrame.jk = 0;
				}
			}
			MyFrame.jk++;
		}
	}
}
