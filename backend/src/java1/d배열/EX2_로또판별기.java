package java1.d배열;

import java.util.Random;
import java.util.Scanner;

public class EX2_로또판별기 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] 구매번호 = new int[6];
		int[] 추첨번호 = new int[6];
		
		for(int i = 0; i<6 ; i++) {
			System.out.print("안내)"+(i+1)+"번째 번호 선택: ");
			구매번호[i]= scanner.nextInt();
			if( 구매번호[i]<1 ||구매번호[i]>45 ) {
				i--;
				System.err.println("안내)선택할 수 없는 번호입니다.");
				continue;
				
			}
			boolean 중복체크 = false;
			for(int j = 0 ;j<i;j++ ) {
				if(구매번호[i]==구매번호[j]) {
					System.out.println("안내)이미 선택한 번호입니다.");
					
					중복체크 = true;
					
					
				}
				if(중복체크==true) {
					i--;continue;
				}
			}
		}
		for(int i = 0 ; i<6; i++ ) {
			Random random = new  Random();
			추첨번호[i] = random.nextInt(45)+1;
			for(int j = 0 ;j<i;j++ ) {
				if(추첨번호[i]==추첨번호[j]) {
					i--; 
				}
			}
		
		}
		int count = 0;
		for(int i = 0 ;i<6; i++) {
			for(int j = 0 ; j<6; j++ ) {
				if(구매번호[i]==추첨번호[j]) {
					count++;
				}
			}
		}
		if(count==6) {
			System.out.println("(맞은개수: 6개) 1등입니다.");
		}else if(count==5) {
			System.out.println("(맞은개수: 5개) 2등입니다.");
		}else if(count==4) {
			System.out.println("(맞은개수: 4개) 3등입니다.");
		}else if(count==3) {
			System.out.println("(맞은개수: 3개) 4등입니다.");
		}else if(count==2) {
			System.out.println("(맞은개수: 3개) 5등입니다.");
		}else {System.out.println("꽝 입니다."+"맞은개수: "+count);}
		
		
		
		
		
			
		
		
		
		
		
		
	}
	
}
	
	
	
