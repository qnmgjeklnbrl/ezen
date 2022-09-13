package java1.e클래스.EX7_비회원제게시판;

import java.util.Scanner;

public class EX7실행 {
	public static void main(String[] args) {
		
		/////////////////////////////////// 1번만 실행되는 구역 ///////////////////////////////////////
		// 0. 메모리 
		Scanner scanner = new Scanner(System.in); // 입력객체
		Board[] boardlist = new Board[100]; // Board 객체 100개를 저장 할 수 있는 배열 선언 
		
		//////////////////////////////////////////////////////////////////////////////////////////////////
		
		/////////////////////////////////// 무한 실행되는 구역 //////////////////////////////////////////
		while( true ) {
			///////////////////////////////////// 모든 게시물 객체 [배열] 출력  //////////////////////////////////////////
			System.out.println("------------------- 비회원 게시판 ----------------------");
			System.out.println("번호\t\t작성자\t\t제목");
				// 1. 
//			for( int index = 0 ; index<boardlist.length ; index++ ) {
//				System.out.printf("%d\t%s\t%s \n " , index , boardlist[index].writer , boardlist[index].title );
//			}
				// 2. 
			int num = 0;
			for( Board temp : boardlist ) { // 배열내 모든 객체를 하나씩 temp 객체에 반복 대입
				num++;
				if( temp != null )System.out.printf("%d\t\t%s\t\t%s\n" , num , temp.writer , temp.title );
				// 만일 객체가 존재하면 출력 
			}
			//////////////////////////////////////////////////////////////////////////////////////////////////
			
			System.out.println("-----------------------------------------------------");
			System.out.print("1.글쓰기 2.글보기 선택 : ");
			int ch = scanner.nextInt(); // 출력 -> 입력( int ) -> 저장 ( int ) -> 제어( if )
			
			///////////////////////////// 1번을 입력했을때 실행되는 구역 ///////////////////////////////////
			if( ch == 1 ) { 
				// 1.출력[ 안내 ] -> 입력 -> 저장 
				System.out.print("제목 : ");		String title = scanner.next();
				System.out.print("내용 : ");		String content = scanner.next();
				System.out.print("작성자 : ");	String writer = scanner.next();
				System.out.print("비밀번호 : ");	String password = scanner.next();
				// 2. 저장된 변수 4개를 하나의 객체로 만들기[ 4개변수를 묶음 -> 편하기 ]
//				Board regist = new Board();
//					regist.title = title; regist.content = content; regist.writer = writer; regist.password = password;
				Board regist = new Board(title, content, writer, password, 0 );
				// 객체선언 : 클래스명 변수명 = new 생성자( 매개변수 순서대로 ); 
				// 3. 배열에 객체 저장 [ 빈 공간을 찾아서 빈 공간에 저장 ] 
				for( int index = 0 ; index<boardlist.length ; index++ ) {
					if( boardlist[index] == null ) { // 만일 해당 인덱스의 객체가 없으면 
						boardlist[index] = regist; 	
						System.out.println("안내] 글 등록이 되었습니다."); 
						break; 
					} // if end 
				} // for end 
			} // if end 
			///////////////////////////////////////////////////////////////////////////////////////
			else if( ch == 2 ) {
				System.out.println("글번호 선택: "); int boardnumber = scanner.nextInt();
				System.out.println("제목 : "+ boardlist[boardnumber].title);
				System.out.println("작성자 : "+ boardlist[boardnumber].writer);
				System.out.println("내용 : "+ boardlist[boardnumber].content);
				
				System.out.println("1.목록보기 2.글삭제 3.글수정  선택: "); int btn = scanner.nextInt();
				if(btn == 1) {
					
					
				}
				else if (btn==2) {
					System.out.println("비밀번호 입력: "); 
					
				}
				else if (btn==3) {
					
					
				}
				else {
					System.out.println("알수없는 번호입니다.");
					
				}
				
				
			}
			else {
				System.out.println("알수없는 번호입니다.");
			}
			
		}  // while end 
		//////////////////////////////////////////////////////////////////////////////////////////////////
	} // main end 
} // class end 

/*
 
 	설계 [ 메모리 ] 
 		1. 제목 2.내용 3.작성자 4.비밀번호
 		선택지 : 1. 2차원배열  	2.클래스->객체->1차원배열
 	클래스 설계 
 		클래스 멤버 : 필드 , 생성자 , 메소드 
 		1. 필드 : 메모리 저장
 			1. 문자열 제목
 			2. 문자열 내용 
 			3. 문자열 작성자
 			4. 정수열 비밀번호 
 			5. 정수열 조회수
 		2. 생성자
 			1. 빈[매개변수가 없는 ] 생성자
 			2. 풀[모든 매개변수가 있는 ] 생성자		
 */



