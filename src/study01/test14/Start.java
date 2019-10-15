package study01.test14;
//인터페이스의 몸통 가지게 하는 방법
interface Test{
	static void print() {//java1.8부터 인터페이스에서도 static을 사용해서 몸통을 가질 수 있다.
		System.out.println("난 인터페이스 test()");
	}
	default void print2() {//default는 접근제어자 default가 아니고 몸통을 가질 수 있게하는 default
		
	}
}
public class Start {
	public static void main(String[]args) {
		Test.print();
	}
}
/*●final는method/class에도 쓸 수 있다.

class End{{
	final void test() {
		System.out.println("난 End's test메소드");
	}
}

public class Start extends End{
	static final String STR_EXAM="Abc"
	void test(){                                -overridig이 안된다!
	System.out.println("난 Start's test메소드");	-그럼 어떨때 쓰이느냐? 기능을 바꾸지 못하게 할때!
	}											-ex)펜은 쓰는것이다. 그런데 형광펜 색깔펜 등을 한다고 해서 펜의
	public static void main(String[]args) {		-기능을 못바꾸게 하려고 할때!
	}
}
--●class에 final로 정해져있으면 상속이 불가능!!--

public class Start extends String{
 	static final String STR-EXAM="Abc";         -오류가 난다
 												-왜? class에 final이 있는데 상속을 하려고 했기떄문
 	public static void main(String[]args){
 	}
 }*/
 