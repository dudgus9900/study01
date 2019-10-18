package study02.user;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Execute2 {
	Connection con = DBCon.getCon();
	Scanner scan = new Scanner(System.in);

	void insert() {
		System.out.println("id를 입력해주세요.");
		String id = "'" + scan.nextLine() + "'";
		System.out.println("pwd를 입력해주세요.");
		String pwd = "'" + scan.nextLine() + "'";
		System.out.println("name를 입력해주세요.");
		String name = "'" + scan.nextLine() + "'";
		System.out.println("age를 입력해주세요.");
		String age = "'" + scan.nextLine() + "'";
		System.out.println("etc를 입력해주세요.");
		String etc = "'" + scan.nextLine() + "'";
		String sql = "insert into user_info(id,pwd,name,age,etc) ";
		sql += "values(" + id + "," + pwd + "," + name + "," + age + "," + etc + ")";
		System.out.println(sql);
		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("인서트된 갯수 :" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	void update() {
		System.out.println("업데이트하고 싶은 항목을 입력해주세요(id,pwd,name,age,etc)");
		String sql = "update user_info set " + scan.nextLine() + " =";
		System.out.println("변경하고 싶은 값을 입력해주세요(age를 입력했다면 숫자만 입력해주세요)");
		sql += "'" + scan.nextLine() + "'";
		System.out.println("변경하고 싶은 항의 항목을 입력해주세요(id,pwd,name,age,etc)");
		sql += " where " + scan.nextLine() + "=";
		System.out.println("변경하고 싶은 항의 이름을 입력해주세요");
		sql += "'" + scan.nextLine() + "'";
		System.out.println(sql);
		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("변경된 항의 갯수" + result);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	void delete() {
		System.out.println("삭제하고 싶은 항목을 입력해주세요(id,pwd,name,age,etc)");
		String sql = "delete from user_info where ";
		String str1 = scan.nextLine();
		sql += str1;
		System.out.println("삭제하고 싶은" + str1 + "를 입력해주세요");
		String str2 = scan.nextLine();
		sql += "=" + "'" + str2 + "'";
		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("삭제된 갯수" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	void select() {
		System.out.println("검색하고 싶은 항목을 입력해주세요(id,pwd,name,age,etc)");
		String str = scan.nextLine();
		String sql = "select " + str + " from user_info";
		Statement stmt;
		try {
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("나온" + str + "갯수" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	void initResponse() {
		String res = "";
		while (!res.equals("q")) {
			System.out.println("원하는 서비스 번호를 입력하세요.");
			System.out.println("1. 유저 생성");
			System.out.println("2. 유저 삭제");
			System.out.println("3. 유저 수정");
			System.out.println("4. 유저 조회");
			System.out.println("q. 종료");
			res = scan.nextLine();
			System.out.println("선택한 명령어는 " + res + "번 입니다");
			if ("1".equals(res)) {
				insert();
			} else if ("2".equals(res)) {
				delete();
			} else if ("3".equals(res)) {
				update();
			} else if ("4".equals(res)) {
				select();
			} else if ("q".equals(res)) {
				System.out.println("시스템이 종료됩니다");
			} else {
				System.out.println("입력하신 서비스 번호가 없습니다");
			}

		}

	}

	public static void main(String[] args) {
		Execute2 ex = new Execute2();
		ex.initResponse();

	}
}
