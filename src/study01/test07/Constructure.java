package study01.test07;

import java.util.Scanner;

public class Constructure {
	int num=5;
	public Constructure() {
	System.out.println(num);
	System.out.println("아 내가 호출되었구나!");
	}
	public Constructure(int num) {
		System.out.println("아 num파라메터가 있는 날 호출하였구나!");
	}
	
	
	public static void main(String[]args) {
		Constructure c=new Constructure();
		System.out.println(c.num);
		}
}
