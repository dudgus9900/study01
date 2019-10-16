package study02;
//ConnectionTest의 연습
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest2 {

	public static void main(String[]args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String id="bdi";
			String pwd="12345678";
			
			Connection con=DriverManager.getConnection(url,id,pwd);
			
			Statement stmt=con.createStatement();
			
			String sql="select*from user_info";
			ResultSet rs= stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("pwd"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("etc"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
