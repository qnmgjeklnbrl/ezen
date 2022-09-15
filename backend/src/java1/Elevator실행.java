package java1;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class Elevator실행 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Timer timer = new Timer();
		Elevator elevator = new Elevator();
		
		
		
			
			System.out.println("4층");
			System.out.println("3층");
			System.out.println("2층");
			System.out.println("1층");
			System.out.println("0층");
			System.out.println("현재 엘레베이터 위치: "+elevator.e_c); 
			System.out.println("승객수 입력: "); int passengers = scanner.nextInt();
			for(int i =1; i<=passengers; i++) {
				System.out.println("승객"+i+"현재층 입력: "); int p_c = scanner.nextInt();	
				System.out.println("승객"+i+"목적층 입력: "); int p_d = scanner.nextInt();
				if(elevator.e_s==0) {
					if(elevator.e_c>p_c || elevator.e_c>p_d) {
						elevator.e_s=-1;	
					}else if(elevator.e_c<p_c || elevator.e_c<p_d){
						elevator.e_s=1;
					}
				}
			
				if(p_c==p_d) {
					System.out.println("현재층과 목적층이 같습니다. 다시 입력해주세요.");
					i--;
					continue;
					
				}else if (p_c < p_d) {
					elevator.o_u[p_c-1]=true;
					elevator.i_b[p_d-1]=true;
					
				}else {
					elevator.o_d[p_c-2]=true;
					elevator.i_b[p_d-1]=true;
				}
				
				
				
			}
			System.out.println("엘레베이터 운행 시작");
			if(elevator.e_s==1) {
				TimerTask task = new TimerTask() {
					
					@Override
					public void run() {
						elevator.elevator_up();
						
					}
				};
				timer.schedule(task, 0, 3000);
				
				
			}else if(elevator.e_s==-1) {
				
				
				TimerTask task = new TimerTask() {
					
					@Override
					public void run() {
						elevator.elevator_down();
						
					}
				};
				timer.schedule(task, 0, 3000);
				
				
				
				
				
			}
			
			
			
	
			
				
				
				
				
			
			
			
			
			
			
			
			
			
		
		
		
		
		
			
	}
	
}
