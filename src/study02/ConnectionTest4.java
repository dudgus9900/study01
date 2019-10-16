package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest4 {

	public static final String URL="jdbc:oracle:thin:@localhost:1521:xe";//final 때문에 URL대문자로 쓴다.(알려줘야해서)
	public static final String ID="bdi";//전화번호는 바뀌지 않으니까 그냥 static final로 값을 고정해놓는다.
	public static final String PWD="12345678";//이러면 어디서든 쓸 수있지만 값을 바꿀 수 는 없다.
	public static final String DRIVER_NAME="oracle.jdbc.driver.OracleDriver";
	
	public static void main(String[]args) {
		try {
			Class.forName(DRIVER_NAME);//여기서 jar파일이 없거나 손상되어 있다면 오류가 난다.
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		Connection con=null;
		try {
			con=DriverManager.getConnection(URL,ID,PWD);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}

