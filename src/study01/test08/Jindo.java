package study01.test08;

class Animal{
	
}
class Dog extends Animal{
	public void test() {
		System.out.println("난 Dog의 테스트 Method야!");
	}
}

public class Jindo extends Dog{

	public static void main(String[]args) {
		Dog jindo=new Jindo();
		jindo.test();
	}
}