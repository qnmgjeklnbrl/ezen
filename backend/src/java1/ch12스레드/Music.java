package java1.ch12스레드;

public class Music extends Thread {
	
	public void run() {
		while(true) {
			
			System.out.println("음악 재생중");
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}

	}
	
	
}
