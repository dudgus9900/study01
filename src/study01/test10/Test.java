package study01.test10;

import java.util.Random;

public class Test{
	
	public static void main(String[]args) {
		Random ran= new Random();
		int fNum=ran.nextInt(100);                  //자기영역이 없자나 = 메소드의 호출
		int sNum=ran.nextInt(10);
		System.out.println(fNum);
		System.out.println(sNum);
		String str=fNum+"."+sNum;					//double로 만들라면 String으로 만들어줘야함!
		System.out.println(str);
		double db=Double.parseDouble(str);
		System.out.println(db+1);					//double로바뀐지 확인하려면 +숫자 해봐라
		}
	}
