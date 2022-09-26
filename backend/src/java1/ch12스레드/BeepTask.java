package java1.ch12스레드;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	
	
	
	
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		toolkit.beep();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
