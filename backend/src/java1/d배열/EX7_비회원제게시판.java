package java1.d배열;

import java.util.Scanner;

public class EX7_비회원제게시판 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String boardList[][]= new String [100][4];
		
		while (true) {
			System.out.println("====================커뮤니티=============================");
			System.out.println("번호              작성자                     제목       ");
			for(int i =0 ; i<boardList.length; i++) {
				if(boardList[i][0]!=null) {
					System.out.println(i+"   \t\t"+boardList[i][2]+"   \t\t\t"+boardList[i][0]);
				}
			}
			System.out.println("======================메뉴===========================");
			System.out.println("1.글쓰기      2.글보기");
			System.out.print("선택 : "); int btn = scanner.nextInt();
			if(btn==1) {//글쓰기
				
				System.out.print("title: ");String title = scanner.next();
				System.out.print("content: ");String content = scanner.next();
				System.out.print("writer: "); String writer = scanner.next();
				System.out.print("password: "); String password = scanner.next();
				for(int i = 0 ; i<boardList.length; i++) {
					if(boardList[i][0]==null) {
						boardList[i][0]=title;
						boardList[i][1]=content;
						boardList[i][2]=writer;
						boardList[i][3]=password;
						
						break;
					}
				}
	
		
				
				
				
				
				
				
				
				
				
				
			}else if(btn==2) {
				
				
			}else {
				System.out.println("다시입력해주세요.");
				
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
