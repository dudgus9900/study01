package study01.test08;

class Father{
	int a=3;
	Father(){
		System.out.println("1 난 아빠클래스의 생성자임!");
	}
}

public class Constructor extends Father{
	int b=10;
	Constructor(){
		System.out.println(a);
		System.out.println(b);
		System.out.println("2 난 생성자 클래스의 생성자임!");
	}
	public static void main(String[]args) {
		Constructor c=new Constructor();
		
	}
}
