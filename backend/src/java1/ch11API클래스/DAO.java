package java1.ch11API클래스;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.print.DocFlavor.STRING;

public class DAO {
	private static DAO dao = new DAO();
	private Connection con;			// Connection  		: db연동 인터페이스
	private PreparedStatement ps;	// PreparedStatement: sql연동/조작 인터페이스 
	private ResultSet rs;			// ResultSet 		: sql결과[쿼리] 조작 인테페이스 	
	 DAO getInstance() {return dao;} 
	
	
	
	
	private void DAO() {
	
			try {
				con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/calendar", "root",  "1234");
			}catch (Exception e) { System.out.println("경고) DB연동 실패 : " + e ); } 
		
	} 
	
	
	
	
	
	
	
	
	boolean 일정추가(String date ,String comment) {
		String sql = "insert into calendar values(0,?,?)";
		try {
			ps =con.prepareStatement(sql);
			ps.setString(1, date);
			ps.setString(2, comment);
			return true;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return true;
		
		 
	}
	
	
	

}
