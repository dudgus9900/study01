package study01.test10;
//final
public class FinalTest {
	final int num=3;      //상수 즉, 얘는 이제 변할수가없어!!
	/*final int num; 을 넣으면 오류난다!  왜?? 선언하면 자바가 알아서 정해지는거라 변수가되잖아!
	 * 하고싶다면 초기화까지 같이해줘야한다!!
	 * final int num=1;  이건 오류안난다*/
	
	public static void main(String[]args) {
	int num=3;
	String str="num은 3이 맞습니다.";
	if(num!=3) {
		str="num은 3이 아닙니다";
	}
	str = (num==3)?"num은 3이 맞습니다.":"num은 3이 아닙니다.";
	System.out.println(str);							//삼항연산자
		
	System.out.println(str instanceof String); //instance of : 나 얘라고 불러도되?라고 이해하자!!
	}
}
/* 프로그램내에서 절대로 변하면 안되는 것들 지정할때 사용!
 * 보통 static과 같이 쓴다(접근제어자:public)*/
