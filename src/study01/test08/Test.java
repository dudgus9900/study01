package study01.test08;

public class Test {
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	public static int multiple(int a,int b,int c) {
		return a*b;				//overloading
	}
	public static void main(String[]args) {
		int sum=add(100,200,123); //423이된다
		
		sum+=10;				  //433
		sum++;					  //434
		sum--;					  //433
		sum*=10;				  //4330
		sum/=20;				  //216.5
		System.out.println(sum);  //int이기 때문에 소수점 버린다.
	}
}
