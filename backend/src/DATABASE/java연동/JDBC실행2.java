package DATABASE.java연동;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Result;

public class JDBC실행2 {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_db3", "root", "1234");
			System.out.println("연동성공");
			
			String sql = "insert into product values('바나나', '1500', '21-07-01', '델몬트', '17')";
			PreparedStatement ps = con.prepareStatement(sql); ps.executeUpdate();
			sql = "insert into product values('카스', '2500', '22-03-01', 'OB', '3')";
			ps = con.prepareStatement(sql); ps.executeUpdate();
			
			sql = "insert into product values('삼각김밥', '800', '22-09-01', 'CJ', '22')";
			
			ps = con.prepareStatement(sql); ps.executeUpdate();
			
			
			
			sql = "update product set amount = '3' where product_name ='카스' ";
			ps = con.prepareStatement(sql); ps.executeUpdate();
			
			sql = "delete product where product_name = '삼각김밥'";
			ps = con.prepareStatement(sql); ps.executeUpdate();
			
			sql = "select * from product";
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.print("제품명: "+rs.getString(1)+"\t");
				System.out.print("가격: "+rs.getInt(2)+"\t");
				System.out.print("제조일자: "+rs.getString(3)+"\t");
				System.out.print("회사: "+rs.getString(4)+"\t");
				System.out.print("재고: "+rs.getInt(5)+"\n");
			}
			
		} catch (Exception e) {
			System.out.println("오류발생"+e);
		}
	
	}
}
