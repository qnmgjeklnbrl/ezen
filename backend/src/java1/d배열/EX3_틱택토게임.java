package java1.d배열;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class EX3_틱택토게임 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String 승리 = " ";
		boolean 게임종료 = true;
		String[] 게임판 = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
		
		
		for(int i = 0 ; i<=8 ; i++) {
			System.out.print(게임판[i]);
			if(i==2 ||i==5) {
				System.out.println();
			}
			
				
		}
		while(게임종료){
			System.out.println("\n위치를 입력해주세요."); int 사용자 = scanner.nextInt();
			if(!게임판[사용자].equals("[ ]")) {
				System.out.println("이미 선택된 위치 입니다. 다시 선택해주세요.");
			}else {
				게임판[사용자] = " O ";
			}
			while(true) {
				Random random =new Random();
				int 컴퓨터 = random.nextInt(9);
				if(게임판[컴퓨터].equals("[ ]")){
					게임판[컴퓨터]=" X ";	
					break;
				}
			}
			
			
			
			for(int i = 0 ; i<=8 ; i++) {
				System.out.print(게임판[i]);
				if(i==2 ||i==5) {
					System.out.println();
				}
				
					
			}
		
		for(int i = 0 ; i<=6 ;i=i+3) {
			if(!게임판[i].equals("[ ]")&&게임판[i].equals(게임판[i+1])&&게임판[i+1].equals(게임판[i+2])) {
				승리=게임판[i];	System.out.println("게임종료)승리: "+게임판[i]);  게임종료 = false;
			}
		}
		for(int i = 0 ;  i<=2 ; i++) {
			if(!게임판[i].equals("[ ]") && 게임판[i] == 게임판[i+3] && 게임판[i+3] == 게임판[i+6] ) {
				승리=게임판[i];	System.out.println("게임종료)승리: "+게임판[i]);  게임종료 = false;
			}
		}
		for(int i = 0 ; i<=2 ; i=i+2 ) {
			if(i==0&&!게임판[i].equals("[ ]") && 게임판[i] == 게임판[i+4] && 게임판[i+4] == 게임판[i+8] ) {
				승리=게임판[i];	System.out.println("게임종료)승리: "+게임판[i]);  게임종료 = false;
			}else if(i==2&&!게임판[i].equals("[ ]") && 게임판[i] == 게임판[i+2] && 게임판[i+2] == 게임판[i+4] ) {
				승리=게임판[i];	System.out.println("게임종료)승리: "+게임판[i]);  게임종료 = false;
			}
			
		}
		if(!Arrays.asList(게임판).contains("[ ]")) {
			System.out.println("무승부입니다.");
			게임종료 = false;
		}
		
		
	   }
		
		
	}	
	
}








/*
 * 틱택토 게임 [조건 ] 1.게임판 9칸 사용 -> 배열 2.사용자가 알을 두고자 하는 위치 [인덱스] 입력 3.컴퓨터가 난수 생성
 * [0~8] 1. 난수의 위차가 이미 다른 알이 존재하면 재생성 [중복제거] 4.승리자 판단 [1.가로로 이기는수  2.세로로 이기는수   3.무승부로 이기는수]
 * 
 * [출력] 
 * [ ] [ ] [ ]  
 * [ ] [ ] [ ]
 * [ ] [ ] [ ]
 */