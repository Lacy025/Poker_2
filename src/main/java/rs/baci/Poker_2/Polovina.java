package rs.baci.Poker_2;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Polovina extends Thread implements MainFrame, Dobici, Brojevi {
	
	Timer timer3;
	
	@Override
	public void run() {
		
		Dupliranje.pola=0;
		Dupliranje.karta=0;
		
		MyFrame.Jlabelcr.setVisible(false);
		frame.remove(MyFrame.Jlabelcr);
		
		labelT10.setVisible(false);
		tabela.remove(labelT10);
		
		frame.add(Izbor2.pobeda);
		Izbor2.pobeda.setVisible(true);
		
		if (Dupliranje.duplo<101) {
			
			timer3 = new Timer(50, e -> {
				
				if (Dupliranje.x3 != Dupliranje.duplo) {
					
					Dupliranje.duplo--;
					MyFrame.cr++;
					
					labelT10.setText(""+String.valueOf((int)Dupliranje.duplo+" "));
					((JLabel) MyFrame.Jlabelcr).setText(""+String.valueOf(MyFrame.cr));
					labelT10.setHorizontalAlignment(JLabel.RIGHT);
		    		labelT10.setVerticalAlignment(JLabel.BOTTOM);
					labelT10.setFont(font2);
					labelT10.setForeground(color1);
					labelT10.setOpaque(false);
					tabela.add(labelT10);
					labelT10.setVisible(true);
					frame.add(MyFrame.Jlabelcr);
		    		MyFrame.Jlabelcr.setVisible(true);
		    		
		    		try {
		    			
						new Isplata1();
						
					} catch (UnsupportedAudioFileException | IOException | LineUnavailableException
							| InterruptedException e1) {
						
						e1.printStackTrace();
					}
		    		
				}
				
				else {
					
					((Timer) (e.getSource())).stop();
					
					labelT10.setVisible(false);
	    			tabela.remove(labelT10);
	    			labelT10.setText(String.valueOf((int)Dupliranje.duplo+" "));
	    			tabela.add(labelT10);
	    			labelT10.setVisible(true);
	    			
	    			((JLabel) MyFrame.Jlabelcr).setText(""+String.valueOf(MyFrame.cr));
	    			frame.add(MyFrame.Jlabelcr);
	    			MyFrame.Jlabelcr.setVisible(true);
	    			Izbor2.pobeda.setVisible(true);
	    			
	    			try {
	    				
						new Isplata2();
						
						Thread.sleep(1000);
						
					} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
						
						e1.printStackTrace();
					}
	    			
					Dupliranje.karta=Dupliranje.xkarta;
					Dupliranje.pola=0;
					Dupliranje.vecamanja=1;
					
					Izbor2.pobeda.setVisible(false);
					frame.remove(Izbor2.pobeda);
				}
			});
    	
    		timer3.setInitialDelay(0);
    		timer3.start();
			
		}
		
		if (Dupliranje.duplo==200) {
			
					Dupliranje.duplo=Dupliranje.duplo-100;
					MyFrame.cr=MyFrame.cr+100;
					
					labelT10.setText(""+String.valueOf((int)Dupliranje.duplo+" "));
					((JLabel) MyFrame.Jlabelcr).setText(""+String.valueOf(MyFrame.cr));
					labelT10.setHorizontalAlignment(JLabel.RIGHT);
		    		labelT10.setVerticalAlignment(JLabel.BOTTOM);
					labelT10.setFont(font2);
					labelT10.setForeground(color1);
					labelT10.setOpaque(false);
					tabela.add(labelT10);
					labelT10.setVisible(true);
					frame.add(MyFrame.Jlabelcr);
		    		MyFrame.Jlabelcr.setVisible(true);
						
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
						
	    			
					Dupliranje.karta=Dupliranje.xkarta;
					Dupliranje.pola=0;
					Dupliranje.vecamanja=1;
					
					Izbor2.pobeda.setVisible(false);
					frame.remove(Izbor2.pobeda);
					
		}
		
		if (Dupliranje.duplo>100&&Dupliranje.duplo<200) {
			
					int x4=(int)Dupliranje.duplo-100;
			
					Dupliranje.duplo=Dupliranje.duplo-x4;
					MyFrame.cr=MyFrame.cr+x4;
					
					labelT10.setText(""+String.valueOf((int)Dupliranje.duplo+" "));
					((JLabel) MyFrame.Jlabelcr).setText(""+String.valueOf(MyFrame.cr));
					labelT10.setHorizontalAlignment(JLabel.RIGHT);
		    		labelT10.setVerticalAlignment(JLabel.BOTTOM);
					labelT10.setFont(font2);
					labelT10.setForeground(color1);
					labelT10.setOpaque(false);
					tabela.add(labelT10);
					labelT10.setVisible(true);
					frame.add(MyFrame.Jlabelcr);
		    		MyFrame.Jlabelcr.setVisible(true);
		    		
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
					
					timer3 = new Timer(50, e -> {
						
						if (Dupliranje.x3 != Dupliranje.duplo) {
							
							Dupliranje.duplo--;
							MyFrame.cr++;
							
							labelT10.setText(""+String.valueOf((int)Dupliranje.duplo+" "));
							((JLabel) MyFrame.Jlabelcr).setText(""+String.valueOf(MyFrame.cr));
							labelT10.setHorizontalAlignment(JLabel.RIGHT);
				    		labelT10.setVerticalAlignment(JLabel.BOTTOM);
							labelT10.setFont(font2);
							labelT10.setForeground(color1);
							labelT10.setOpaque(false);
							tabela.add(labelT10);
							labelT10.setVisible(true);
							frame.add(MyFrame.Jlabelcr);
				    		MyFrame.Jlabelcr.setVisible(true);
				    		
				    		try {
				    			
								new Isplata1();
								
							} catch (UnsupportedAudioFileException | IOException | LineUnavailableException
									| InterruptedException e1) {
								
								e1.printStackTrace();
							}
				    		
						}
						
						else {
							
							((Timer) (e.getSource())).stop();
							
							labelT10.setVisible(false);
			    			tabela.remove(labelT10);
			    			labelT10.setText(String.valueOf((int)Dupliranje.duplo+" "));
			    			tabela.add(labelT10);
			    			labelT10.setVisible(true);
			    			
			    			((JLabel) MyFrame.Jlabelcr).setText(""+String.valueOf(MyFrame.cr));
			    			frame.add(MyFrame.Jlabelcr);
			    			MyFrame.Jlabelcr.setVisible(true);
			    			Izbor2.pobeda.setVisible(true);
			    			
			    			try {
			    				
								new Isplata2();
								
								Thread.sleep(1000);
								
							} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
								
								e1.printStackTrace();
							}
			    			
							Dupliranje.karta=Dupliranje.xkarta;
							Dupliranje.pola=0;
							Dupliranje.vecamanja=1;
							
							Izbor2.pobeda.setVisible(false);
							frame.remove(Izbor2.pobeda);
						}
					});
		    	
		    		timer3.setInitialDelay(0);
		    		timer3.start();
			
		}
		
		if (Dupliranje.duplo>200) {
			
			if ((int)Dupliranje.duplo/100==Dupliranje.duplo/100) {
					
						while (Dupliranje.duplo-Dupliranje.x3>99) {
							
							labelT10.setVisible(false);
			    			tabela.remove(labelT10);
						
							Dupliranje.duplo=Dupliranje.duplo-100;
							MyFrame.cr=MyFrame.cr+100;
							
							labelT10.setText(""+String.valueOf((int)Dupliranje.duplo+" "));
							((JLabel) MyFrame.Jlabelcr).setText(""+String.valueOf(MyFrame.cr));
							labelT10.setHorizontalAlignment(JLabel.RIGHT);
				    		labelT10.setVerticalAlignment(JLabel.BOTTOM);
							labelT10.setFont(font2);
							labelT10.setForeground(color1);
							labelT10.setOpaque(false);
							tabela.add(labelT10);
							labelT10.setVisible(true);
							frame.add(MyFrame.Jlabelcr);
				    		MyFrame.Jlabelcr.setVisible(true);
				    		
							try {
								
								new Isplata2();
								Thread.sleep(1000);
								
							} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
								
								e1.printStackTrace();
							}
							}
								
							if (Dupliranje.duplo-Dupliranje.x3>0) {
								
								Dupliranje.duplo=Dupliranje.x3;
								MyFrame.cr=MyFrame.cr+50;
								
								labelT10.setVisible(false);
				    			tabela.remove(labelT10);
				    			labelT10.setText(String.valueOf((int)Dupliranje.x3+" "));
				    			tabela.add(labelT10);
				    			labelT10.setVisible(true);
				    			
				    			((JLabel) MyFrame.Jlabelcr).setText(""+String.valueOf(MyFrame.cr));
				    			frame.add(MyFrame.Jlabelcr);
				    			MyFrame.Jlabelcr.setVisible(true);
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
				    			labelT10.setText(String.valueOf((int)Dupliranje.x3+" "));
				    			tabela.add(labelT10);
				    			labelT10.setVisible(true);
				    			
				    			((JLabel) MyFrame.Jlabelcr).setText(""+String.valueOf(MyFrame.cr));
				    			frame.add(MyFrame.Jlabelcr);
				    			MyFrame.Jlabelcr.setVisible(true);
				    			Izbor2.pobeda.setVisible(true);
								
				    			try {
				    				
									new Isplata2();
									Thread.sleep(1000);
									
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
									
									e1.printStackTrace();
								}
				    			
								Dupliranje.karta=Dupliranje.xkarta;
								Dupliranje.pola=0;
								Dupliranje.vecamanja=1;
								
								Izbor2.pobeda.setVisible(false);
								frame.remove(Izbor2.pobeda);
			    			
						}
				
						else {
				
							labelT10.setVisible(false);
			    			tabela.remove(labelT10);
			    			
			    			int x5=(int) (Dupliranje.duplo-(((int)Dupliranje.duplo/100)*100));
						
			    			Dupliranje.duplo=Dupliranje.duplo-x5;
							MyFrame.cr=MyFrame.cr+x5;
							
							labelT10.setText(""+String.valueOf((int)Dupliranje.duplo+" "));
							((JLabel) MyFrame.Jlabelcr).setText(""+String.valueOf(MyFrame.cr));
							labelT10.setHorizontalAlignment(JLabel.RIGHT);
				    		labelT10.setVerticalAlignment(JLabel.BOTTOM);
							labelT10.setFont(font2);
							labelT10.setForeground(color1);
							labelT10.setOpaque(false);
							tabela.add(labelT10);
							labelT10.setVisible(true);
							frame.add(MyFrame.Jlabelcr);
				    		MyFrame.Jlabelcr.setVisible(true);
				    		
							try {
								
								new Isplata2();
								Thread.sleep(1000);
								
							} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
								
								e1.printStackTrace();
							}
							
							while (Dupliranje.duplo-Dupliranje.x3>99) {
								
								labelT10.setVisible(false);
				    			tabela.remove(labelT10);
							
								Dupliranje.duplo=Dupliranje.duplo-100;
								MyFrame.cr=MyFrame.cr+100;
								
								labelT10.setText(""+String.valueOf((int)Dupliranje.duplo+" "));
								((JLabel) MyFrame.Jlabelcr).setText(""+String.valueOf(MyFrame.cr));
								labelT10.setHorizontalAlignment(JLabel.RIGHT);
					    		labelT10.setVerticalAlignment(JLabel.BOTTOM);
								labelT10.setFont(font2);
								labelT10.setForeground(color1);
								labelT10.setOpaque(false);
								tabela.add(labelT10);
								labelT10.setVisible(true);
								frame.add(MyFrame.Jlabelcr);
					    		MyFrame.Jlabelcr.setVisible(true);
					    		
								try {
									
									new Isplata2();
									Thread.sleep(1000);
									
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
									
									e1.printStackTrace();
								}
								}
							
								labelT10.setVisible(false);
				    			tabela.remove(labelT10);
								
								MyFrame.cr=MyFrame.cr+((int)Dupliranje.duplo-Dupliranje.x3);
								Dupliranje.duplo=Dupliranje.x3;
								
				    			labelT10.setText(String.valueOf((int)Dupliranje.duplo+" "));
				    			((JLabel) MyFrame.Jlabelcr).setText(""+String.valueOf(MyFrame.cr));
				    			labelT10.setHorizontalAlignment(JLabel.RIGHT);
					    		labelT10.setVerticalAlignment(JLabel.BOTTOM);
								labelT10.setFont(font2);
								labelT10.setForeground(color1);
								labelT10.setOpaque(false);
								tabela.add(labelT10);
								labelT10.setVisible(true);
								frame.add(MyFrame.Jlabelcr);
					    		MyFrame.Jlabelcr.setVisible(true);
								
				    			try {
				    				
									new Isplata2();
									Thread.sleep(1000);
									new Isplata2();
									Thread.sleep(1000);
									
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e1) {
									
									e1.printStackTrace();
								}
				    			
								Dupliranje.karta=Dupliranje.xkarta;
								Dupliranje.pola=0;
								Dupliranje.vecamanja=1;
								
								Izbor2.pobeda.setVisible(false);
								frame.remove(Izbor2.pobeda);
				
						}
			
		}
	}
}
