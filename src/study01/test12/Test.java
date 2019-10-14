package study01.test12;

public class Test {

	public String str= "난 테스트의 str변수";
	
	public Test()/*생성자다(class와 이름도 같다.*/ {
		System.out.println("난 테스트 생성자");//생성자-메모리가 다 정해져있을때 생성된다.
	}
	public void a() {
		System.out.println("난 테스트의 a메소드");
	}
	public static void main(String[]args) {
		Test t=new Test();
		t.a();
	}
}
/*Interface는 행동메소드의 집합으로 보고   위의 코딩은 종으로봐라
	고양이가 뛴다							고양이
	강아지가 뛴다							강아지
	사람이 뛴다    						사람*/