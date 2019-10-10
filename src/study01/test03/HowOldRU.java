package study01.test03;

import java.util.Scanner;

public class HowOldRU {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("나이가 어떻게 되세요?");
		String age=scan.nextLine();
		System.out.println("저는"+age+"살입니다.");
		int num = Integer.parseInt(age);
			if(num<=10) {
				System.out.println("���");
			}else if(num<=20) {
				System.out.println("û�ҳ�");
			}else if(num<=40) {
				System.out.println("û��");
			}else {
				System.out.println("����");
			}
	}
}
