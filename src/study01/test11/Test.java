package study01.test11;

	class Test1{
		public static int num1=19;	 
	}	/*int num - new 써야한다(=인스턴스화 해야한다.) - 인스턴스 변수라고 불리는 이유.*/

	public class Test {
		static int num=3;//static이니까 new안만들어도 쓸 수 있다.
		
		
		public static void main(String[]args) {
			System.out.println(num);
			System.out.println(Test1.num1);//어디 클래스의 속성인지 알려줘야한다.
		}
}
//class는 static이다.
//접근제어자, static은 멤버변수에서만 쓸 수 있다!!