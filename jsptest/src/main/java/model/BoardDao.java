package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BoardDao {
	Connection con;	PreparedStatement ps;	ResultSet rs;
	public BoardDao() {
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			 con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jsptest", 
					"root",
					"1234");
		}catch (Exception e) { System.out.println(e);}
	}
	
	
	public boolean bwrite(String btitle, String bwriter ,String bpassword, String bcontent) {
		String sql = "insert into board(btitle,bwriter,bpassword,bcontent) values(?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, btitle);
			ps.setString(2, bwriter);
			ps.setString(3, bcontent);
			ps.setString(4, bpassword);
			ps.executeUpdate();
			return true; 
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
		
		return false;
	}
	
	
	public ArrayList<BoardDto> blist() {
		String sql = "select * from board";
		ArrayList<BoardDto> list = new ArrayList<>();
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
						rs.getString(6),
						rs.getInt(7)
				
						);
				list.add(boardDto);
				
			}
			return list;
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
	
	public BoardDto getboard(int bno) {
		String sql = "select btitle,bwriter,bcontent from board where bno="+bno;
		BoardDto boardDto = new BoardDto();
		try {
			ps=con.prepareStatement(sql);
			rs= ps.executeQuery();
			if(rs.next()) {	
				boardDto.setBtitle(rs.getString(1));
				boardDto.setBwriter(rs.getString(2));
				boardDto.setBcontent(rs.getString(3));		
			}return boardDto;
		} catch (Exception e) {
			System.out.println(e);
		}
		return boardDto;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
