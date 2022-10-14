package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.BoardDto;

public class BoardDao extends Dao {
	private static BoardDao boardDao = new BoardDao();
	public  static BoardDao getInstance() {return boardDao;}
	
	public boolean board(BoardDto dto) {
		
		String sql = "insert into board(title,writer,password,content) values(?,?,?,?)"; //글등록하기
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getWriter());
			ps.setString(3, dto.getPassword());
			ps.setString(4, dto.getContent());
			ps.executeUpdate();
			return true;
			
		} catch (SQLException e) {
			System.out.println(e+"dbdhfb");
		}
		
		
				
		
		
		
		return false;
		
		
		
	}
	
	
	
	public ArrayList<BoardDto> getboardlist() { //글목록 불러오기
		ArrayList<BoardDto> list = new ArrayList<>();
		String sql ="select * from board";
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				BoardDto boardDto = new BoardDto(
						 rs.getInt(1),
						 rs.getString(2),
						 rs.getString(3),
						 rs.getString(4),
						 rs.getString(5),
						 rs.getInt(6),
						 rs.getString(7)
						 
					
						);
				list.add(boardDto);	 
			}
			return list;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return list;
		
		
		
		
	}
	
	public boolean delete(int bno,String password) {//글삭제 메소드
		
		return false;
		
	}
	
}

