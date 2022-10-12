package model.dto;

public class BoardDto {
	
	private int bno;	
	private	String title;
	private	String writer;
	private	String password;
	private	String content;
	private int view;
	
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public BoardDto(int bno, String title,String content, String writer,  String password, int view, String bdate) {
		super();
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.password = password;
		this.content = content;
		this.view = view;
		this.bdate = bdate;
	}
	private String bdate;
	public BoardDto(String title, String writer, String password, String content ) {
		super();
		this.title = title;
		this.writer = writer;
		this.password = password;
		this.content = content;
		
		
	}
	public BoardDto() {
		super();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "BoradDto [title=" + title + ", writer=" + writer + ", password=" + password + ", content=" + content
				+ ", view=" + view + "]";
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
}
