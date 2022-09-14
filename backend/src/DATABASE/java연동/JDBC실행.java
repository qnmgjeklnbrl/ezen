package DATABASE.java연동;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.print.DocFlavor.STRING;

import com.mysql.cj.xdevapi.PreparableStatement;

public class JDBC실행 {
	public static void main(String[] args) {
		try {
			
			 Class.forName("com.mysql.cj.jdbc.Driver"); Connection con =
			  DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_db3","root",
			  "1234"); System.out.println("연동성공");
			  
				
				/*  String sql = "insert into member values('tess','나훈아','경기 부천시 중동')";
				  
				  PreparedStatement ps = con.prepareStatement(sql); ps.executeUpdate();
				  
				  sql = "insert into member values ('iyou', '아이유' , '인천 남구 주안동'  )"; ps =
				  con.prepareStatement(sql); ps.executeUpdate();
				  
				  sql = "insert into member values ('jyp', '박진영' , '경기 고양시 장항동'  )"; ps =
				  con.prepareStatement(sql); ps.executeUpdate();
				 */
				  String  sql = "update member set member_addr = '경기도 안산시 상록구' where member_id = 'jyp'";
			 
				  PreparedStatement ps = con.prepareStatement(sql); ps.executeUpdate();
			
			
		}catch(Exception e) {
			System.out.println("연동실패"+e);
		}
		
		
		
		
	}
}
