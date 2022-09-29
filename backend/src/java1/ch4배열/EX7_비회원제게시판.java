package java1.ch4배열;

import java.util.Scanner;

public class EX7_비회원제게시판 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String boardList[][]= new String [100][4];//행100개 열4개 짜리 테이블 2차원 배열로 선언
		
		while (true) { // 무한루프
			System.out.println("====================커뮤니티=============================");
			System.out.println("번호              작성자                     제목       ");
			for(int i =0 ; i<boardList.length; i++) {//반복문으로 배열에 저장된 글이 있는지 확인
				if(boardList[i][0]!=null) {				//만약에 i번째에 에 데이터가 저장되어 있으면 
					System.out.println(i+"   \t\t"+boardList[i][2]+"   \t\t\t"+boardList[i][0]);//i번째 글의 인덱스와 작성자 제목을 출력
				}
			}
			System.out.println("======================메뉴===========================");
			System.out.println("1.글쓰기      2.글보기");
			System.out.print("선택 : "); int btn = scanner.nextInt();//글쓰기 버튼과 글보기 버튼을 입력 받아서 btn변수에 저장
			if(btn==1) {//1번을 입력받았으면
				System.out.println("==============글 쓰기 페이지 ==============");//글쓰기 페이지 출력
				System.out.print("title: ");String title = scanner.next();//제목 내용 작성자 비밀번호 정보를 입력받아 각각의 String 변수에 저장
				System.out.print("content: ");String content = scanner.next();
				System.out.print("writer: "); String writer = scanner.next();
				System.out.print("password: "); String password = scanner.next();
				for(int i = 0 ; i<boardList.length; i++) {//반복문으로 boardList배열의 null이저장된 인덱스를 찾음
					if(boardList[i][0]==null) {//i번째 인덱스의 데이터가 null이면 위에서 입력받은 값을 각각 저장
						boardList[i][0]=title;
						boardList[i][1]=content;
						boardList[i][2]=writer;
						boardList[i][3]=password;
						
						break;//하나의 인덱스에만 저장해야 하므로 break로 반복문 탈출
					}
				}
	
		
				
				
				
				
				
				
				
				
				
				
			}else if(btn==2) {//2번을 입력받았을때
				int index;//입력받은 인덱스를 저장할 index변수 선언 (여러군데에서 사용할 예정이라 위에서 선언 )
				if(boardList[0][0]!=null) {//게시물이 하나라도 존재하면 아래 코드 실행
						
					
				
					System.out.println("=================게시물 상세 페이지==================");
					System.out.print("게시물번호(인덱스) 선택:  "); index = scanner.nextInt();//위에서 선언한 index 변수에 입력받은 값 저장
					if(boardList[index][0]!=null) {//입력받은 인덱스에 저장된 데이터가 있으면
						System.out.println("작성자: "+boardList[index][3]+"  제목: "+boardList[index][0]);//해당 인덱스의 작성자 제목 내용 출력
						System.out.println("내용: "+boardList[index][1] );
				
						System.out.println("===================================================");
						System.out.println("1. 목록보기(뒤로가기)       2.글삭제               3.글수정");
						System.out.print("선택: "); int btn2 = scanner.nextInt();//입력받은 숫자를 btn2변수에 저장
				
						if(btn2==1) {//1번을 입력받았을 때
							//목록보기 기능이므로 아무 코드도 작성 하지 않음 (if else if 구조로 코드를 작성했기 때문에 아래코드 실행 x 무한루프 처음으로 돌아감)
											
					
						}else if(btn2==2) {//2번을 입력 받았을때
							System.out.print("알림)현 게시물 비밀번호: "); String pw = scanner.next();//현재 글의 인덱스에 저장된 비밀번호와 일치 여부를 판단하기 위해 비밀번호을 입력받아서 변수에 저장
							if(boardList[index][3].equals(pw)) {//비밀번호가 일치한다면
								boardList[index][0]=null;    //해당 인덱스에 저장된 데이터들을 모두 null로 초기화
								boardList[index][1]=null;
								boardList[index][2]=null;
								boardList[index][3]=null;
								for( int i = index ; i<boardList.length ; i++  ) {//현재 인덱스를  앞으로 당기기위해 ( 빈공간을 없애려고)반복문 실행
									boardList[i][0] = boardList[i+1][0];
									boardList[i][1] = boardList[i+1][1];
									boardList[i][2] = boardList[i+1][2];
									boardList[i][3] = boardList[i+1][3];
							
									if( boardList[i+1][0] == null ) break;  //만약 i+1번째 인덱스가 null이면 마지막 글이란 뜻이므로 반복문 종료
								} 
								System.out.println("알림) 삭제 성공");
							}else {System.out.println("알림) 비밀번호가 다릅니다.");}//비밀번호가 일치하지 않을때
						
						
						
						
						
						
					
						}else if(btn2==3) {//3번을 입력받았을때
							System.out.print("알림)현 게시물 비밀번호: "); String pw = scanner.next();//현재 글의 인덱스에 저장된 비밀번호와 일치 여부를 판단하기 위해 비밀번호을 입력받아서 변수에 저장
							if(boardList[index][3].equals(pw)) {//비밀번호가 일치한다면 해당 글의 데이터를 입력받아 저장
								System.out.print("수정할 제목 : "); boardList[index][0]=scanner.next();
								System.out.print("수정할 내용 : "); boardList[index][1]=scanner.next();
							}else {
								System.out.println("알림) 비밀번호가 다릅니다.");//비밀번호가 틀렸을때
							}
						
						
						
					
						}else {
							System.out.println("알 수 없는 번호입니다. 다시입력해주세요.");//1,2,3이외의 값을 입력받았을때
						}
					}else {System.out.println("게시물이 존재하지 않습니다.");}//입력받은 인덱스에 해당하는 글이 존재 하지 않을때
				
				}else {System.out.println("게시물이 존재하지 않습니다.");}//게시물이 하나도 존재하지 않을때
				
				
			}else {
				System.out.println("알 수 없는 번호입니다. 다시입력해주세요.");//처음화면에서 1,2 이외에 값을 입력받았을때
				
				
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
