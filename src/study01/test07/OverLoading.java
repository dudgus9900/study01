package study01.test07;

public class OverLoading {
	public void test() {
		System.out.println("test()메소드 호출");
		
	}
	public void test(int num) {
		System.out.println("test(int num)메소드 호출");
	}
	public void test(String str) {
		System.out.println("test(String str)메소드 호출");
	}
	public void test(String str,int num) {
		System.out.println("test(String str,int num)메소드 호출");
	}
	public void test(int num,String str) {
		System.out.println("test(String str,int num)메소드 호출");
	}
	public static void main(String[]args) {
		OverLoading ol =new OverLoading();
		ol.test("박영현",5);
	
		int a=1;
		String str ="abc";
		System.out.println(a);
		System.out.println(str);
	}
}
