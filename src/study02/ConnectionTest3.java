package study02;
//Map과 List도 사용하고  ConnectionTest의 심화학습
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionTest3 {

	public static void main(String[]args) {
		
		Connection con=null;//finally에서 쓰려고 일단 Connection을 선언해준다.
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String id="bdi";
			String pwd="12345678";
			
			con=DriverManager.getConnection(url,id,pwd);//17의 Connection을 보고 쓸 수 있다.
			Statement stmt=con.createStatement();
			
			String sql="select*from user_info";
			ResultSet rs=stmt.executeQuery(sql);
			List<Map<String,String>>userList=new ArrayList<Map<String,String>>();			
			
			while(rs.next()) {
				System.out.println(rs.getString("id"));
				Map<String,String>userMap=new HashMap<String,String>();
				userMap.put("id", rs.getString("id"));
				userMap.put("pwd", rs.getString("pwd"));
				userMap.put("name", rs.getString("name"));
				userMap.put("age", rs.getString("age"));
				userMap.put("etc", rs.getString("etc"));
				userList.add(userMap);
			}
			System.out.println(userList);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
/*순서대로 입력하고 순서대로 뽑을때 가장 빠른게 ArrayList여서 ArrayList를 사용한다!!
  LinkedList는 순서 상관없이 거기서 뽑고 지지고 볶을때 사용한다!
  LinkedHashMap 중요한 키와 밸류가 있을때 사용한다!(잘안쓰인다)*/
 