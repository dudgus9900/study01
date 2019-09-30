package study01.test05;

import study01.test04.PrivateTest;

public class PublicTest {
	public int num;
	
	public static void main(String[]args) {
		PublicTest publicTest=new PublicTest();
		System.out.println(publicTest.num);
		PrivateTest privateTest=new PrivateTest();
		System.out.println(privateTest.num);
	}
}
