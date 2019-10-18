package study02.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {

	private static final String URL;
	private static final String ID;
	private static final String PWD;
	private static final String DRIVER_NAME;

	static {
		URL = "jdbc:oracle:thin:@localhost:1521:xe";
		ID = "BDI";
		PWD = "12345678";
		DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(DRIVER_NAME);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static Connection con;

	public static Connection getCon() { // throws SQLException 일어날수도 있는 오류를 넘겨준것
		if (con == null) {
			try {
				con = DriverManager.getConnection(URL, ID, PWD);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}
}