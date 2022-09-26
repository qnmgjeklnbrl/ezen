package java1.ch12스레드;

import java.util.Scanner;

public class EX4_예제1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1.음악재생 2. 영화재생");
			
			int ch = scanner.nextInt();
			if(ch==1) {
				Music music = new Music();
				music.start();
				
			}
			
			
		}
			
			
			
			
		
		
		
		
	}
	
	

}
