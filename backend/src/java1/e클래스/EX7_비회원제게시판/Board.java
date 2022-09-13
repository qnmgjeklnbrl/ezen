package java1.e클래스.EX7_비회원제게시판;

public class Board {
	String title ;
	String content;
	String writer;
	String password;
	int view;
	
	Board() {}
	
	Board( String title , String content, String writer , String password , int view){
		
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
		this.view = view;
		
	}
}
