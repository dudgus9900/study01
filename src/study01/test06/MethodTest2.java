package study01.test06;

public class MethodTest2 {
	int num=1;
	
	int getNum() {
		System.out.println(num);
		int num=3;
		System.out.println(num);
		System.out.println(this.num);
		return 1;
	}
	
	public static void main(String[]args) {
		
		MethodTest2 mt2=new MethodTest2();
		mt2.getNum();
		
	}
}
