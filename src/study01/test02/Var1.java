package study01.test02;

public class Var1 {
		public static void main(String[]args) {
			int num1=1;
			int num2=5;
			if(num1==2) {
				num2=10;
				System.out.println("num1은");
				System.out.println("2입니다");
				System.out.println(num2);
			}
			
			for(;num1<10;num1=num1+1) {
				System.out.println(num1);
			}
			
			System.out.println(num1);
		}
		
}
