package study02;
//QueryBox를 자바로 표현해보기!
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[]args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//Class라는 정해지지 않은 class이다!(forName은 new안했고 삐뚫어졌다.→static)
			String url="jdbc:oracle:thin:@localhost:1521:xe";//jdbc:oracle:thin쿼리박스에 이미 저장되어 있어서 쿼리박스에서 안써도된다 
			String id="bdi";//쿼리박스에서 ID
			String pwd="12345678";//쿼리박에서 Pwd
			
			Connection con=DriverManager.getConnection(url,id,pwd);//쿼리박스 접속한거다.
			
			Statement stmt=con.createStatement();//SQL을 적을 칠판을 만든다.
			
			String sql="select*from user_info";//칠판에 select*from user_info; 쓴거다.
			ResultSet rs=stmt.executeQuery(sql);//쿼리박스의 실행결과를 가지고 있는게 rs요놈이다
			//(ResultSet은 MetaData에대한 정보,Data에대한 정보만 가지고있다.)
			while(rs.next()) {//rs.next()를 보고 다음에 올 데이터있네?(=true) 하고 내려서 그때 값이 나오는거다!!(next()→데이터타입 boolean)
				System.out.println(rs.getString("id")); //데이터값이 안나올때까지 반복할라고 while을 썼다.
				System.out.println(rs.getString("pwd"));
			    System.out.println(rs.getString("name"));
				System.out.println(rs.getString("etc"));
			}
		
		} catch (ClassNotFoundException | SQLException e) {//catch에 | 이거있으면 에러나오면 무조건 e.printStackTrace();로 온다.
			e.printStackTrace();
		}
	
	}
}
