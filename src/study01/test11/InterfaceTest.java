package study01.test11;


interface Promise{
	void test();		//선언만 가능하다(자기영역을 가질수가 없음)
	void test1();		//interface는 접근제어자 기본적으로 public!!
	}					//이건 이렇게쓸꺼야 까지만 정해준다.(방법까지는 안해주고 설계만정함)
						

class Father{
	void test2() {	//접근제어자default
		
	}
}

public class InterfaceTest extends Father implements Promise { //Interface=설계서  class=구현한것(영어로 implement
	public void test() { 						//아무것도 안하는 로직이어도 꼭!!overriding!!
												//왜??interface에서 꼭나오라고 설계하라고했으니까
	}
	public void test1() {
		
	}
	public void test2() {		//Father클래스의 접근제어자가 default라 상속받는것들은 default보다  작으면 안됨!!
								//public은 default보다 크니까 쓸 수 있다.
	}
	public String toString() { //InterfaceTest가 extends Father가 없다면 Object를 상속받는데
		return "메모리주소 싫어";//Object에 toString이 저장되어있다.toString은 String이라는 데이터타입을 갖는다!
	}
 }
	
/*	InterfaceTest implements Promise
 * public void test() {
 인터페이스는 무조건 overriding해줘야한다!!
 Interface 메모리 생성 불가!!
 데이터타입으로는 생성 가능*/

/*int test;				//변수 선언
void test() {}			//method선언(자기영역있어야함)*/