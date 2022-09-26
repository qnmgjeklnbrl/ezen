package java1.ch12스레드;

import java.awt.Toolkit;

import javax.tools.Tool;

public class EX1_스레드 {
	
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		
		
		for(int i = 0 ; i<10 ; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			
			}
			
			
			
		
			
		}
		
		
		
		for( int i = 0 ; i<5 ; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
