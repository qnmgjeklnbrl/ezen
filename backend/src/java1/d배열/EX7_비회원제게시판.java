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
				System.out.println("==============글 쓰기 페이지 ==============");
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
				int index;
				if(boardList[0][0]!=null) {
						
					
				
					System.out.println("=================게시물 상세 페이지==================");
					System.out.print("게시물번호(인덱스) 선택:  "); index = scanner.nextInt();
					if(boardList[index][0]!=null) {
						System.out.println("작성자: "+boardList[index][3]+"  제목: "+boardList[index][0]);
						System.out.println("내용: "+boardList[index][1] );
				
						System.out.println("===================================================");
						System.out.println("1. 목록보기(뒤로가기)       2.글삭제               3.글수정");
						System.out.print("선택: "); int btn2 = scanner.nextInt();
				
						if(btn2==1) {
					
					
						}else if(btn2==2) {
							System.out.print("알림)현 게시물 비밀번호: "); String pw = scanner.next();
							if(boardList[index][3].equals(pw)) {
								boardList[index][0]=null;
								boardList[index][1]=null;
								boardList[index][2]=null;
								boardList[index][3]=null;
								for( int i = index ; i<boardList.length ; i++  ) {
									boardList[i][0] = boardList[i+1][0];
									boardList[i][1] = boardList[i+1][1];
									boardList[i][2] = boardList[i+1][2];
									boardList[i][3] = boardList[i+1][3];
							
									if( boardList[i+1][0] == null ) break; 
								} 
								System.out.println("알림) 삭제 성공");
							}else {System.out.println("알림) 비밀번호가 다릅니다.");}
						
						
						
						
						
						
					
						}else if(btn2==3) {
							System.out.print("알림)현 게시물 비밀번호: "); String pw = scanner.next();
							if(boardList[index][3].equals(pw)) {
								System.out.print("수정할 제목 : "); boardList[index][0]=scanner.next();
								System.out.print("수정할 내용 : "); boardList[index][1]=scanner.next();
							}else {
								System.out.println("알림) 비밀번호가 다릅니다.");
							}
						
						
						
					
						}else {
							System.out.println("알 수 없는 번호입니다. 다시입력해주세요.");
						}
					}else {System.out.println("게시물이 존재하지 않습니다.");}
				
				}else {System.out.println("게시물이 존재하지 않습니다.");}
				
				
			}else {
				System.out.println("알 수 없는 번호입니다. 다시입력해주세요.");
				
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
