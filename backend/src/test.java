import java.util.Timer;
import java.util.TimerTask;

public class test {

	public static void main(String[] args) {
		Timer timer = new Timer();
		
			
		
		String[][] board  = new String[20][40];
		
		
		
	
		TimerTask timerTask = new TimerTask() {
			
			 int num =20;
			public void run() {
				
			
				num--;
				
				
				
				for(int i = 0 ; i<=19 ; i++) {
					for(int j = 0; j<=39; j++) {
						if(i==num) {board[num][5]="■";  }	
						else{board[i][j] = "□";}
						System.out.print(board[i][j]);
					}
					System.out.print("\n");
					
				}
				
			}
		};
		timer.schedule(timerTask,2000,2000);
		
	}
}
