package study01.test08;

public class Test {
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	public static int multiple(int a,int b,int c) {
		return a*b;
	}
	public static void main(String[]args) {
		int sum=add(100,200,123);
		
		sum+=10;
		sum++;
		sum--;
		sum*=10;
		sum/=20;
		System.out.println(sum);
	}
}
