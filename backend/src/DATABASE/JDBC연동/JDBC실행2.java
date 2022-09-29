package DATABASE.JDBC연동;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC실행2 {
	
	public static void main(String[] args) {
		try {
		// 1. DB연동 
		Connection con = DriverManager.getConnection( 
				"jdbc:mysql://localhost:3306/shop_db3", 
				"root",
				"1234");
		System.out.println("연동성공");
		
		// 2. SQL 작성
		/*
		String sql = "insert into product values('바나나',1500,'2021-07-01','델몬트',17)";
		// 3. SQL 조작[연결] 
		PreparedStatement ps = con.prepareStatement(sql);
		// 4. SQL 실행 
		ps.executeUpdate();
		
		sql = "insert into product values('카스',2500,'2022-03-01','OB', 3 )";
		ps = con.prepareStatement(sql);
		ps.executeUpdate();
		
		sql = "insert into product values('삼각김밥',800,'2023-09-01','CJ',22)";
		ps = con.prepareStatement(sql);
		ps.executeUpdate();
		*/
		
		// 1. 카스의 재고수량을 10로 수정
		//String sql = "update product set amount = 10 where product_name='카스'";
		
		// 2. 삼각김밥 제거 
		//String sql = "delete from product where prodcut_name = '삼각김밥'";
		
		// 3. 모든 제품의 정보를 console 출력  
		//String sql = "select * from prodcut"
		
		
		
		}catch (Exception e) { System.out.println("오류발생 : " + e );}

	}
}
