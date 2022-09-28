package java1.ch12스레드.타이머스레드;

public class Timer extends Thread{

	
	@Override
	public void run() {
		int i = 1 ;
		while(true) {
			System.out.println(i+" 초");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			i++;
		}
		
	}
	
	
	
}
