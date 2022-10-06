package model.dao;

import java.sql.Connection;

import model.dto.MemberDto;

public class MemberDao extends Dao{

	private static MemberDao mdao = new MemberDao();
	public static MemberDao getInstance () {return mdao;}
	
	public boolean signup(MemberDto dto) {
		String sql = "insert into member values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString (1, dto.getId());
			ps.setString (2, dto.getPw());
			ps.setString (3, dto.getName());
			ps.setString (4, dto.getPhone());
			
			ps.executeUpdate();
			return true;
			
					
		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}
		return false;
	}
	
	
}
