package study01.test10;
//예외처리(=try/catch) 
public class ExceptionTset {

	public static void main(String[]args) {
		System.out.println("시작합니다.");
		String strNum="일이삼사";
		try {
			System.out.println(strNum+"을 int형으로 바꾸는 작업을 시작합니다.");
			int num=Integer.parseInt(strNum);   //문법적으로 틀린게 없어서 오류가 안뜨는것이나, 실행때 오류가난다.(=실행전까지는 모른다)
			System.out.println(strNum+"을 int형으로 바꾸는 작업을 끝났습니다.");
		
		}catch(Exception e) {					//parseInt에 마우스를 갖다대보면 class가 exception으로 뜬다. - exception은 무조건 exception class
			System.out.println("장난치냐?");
			System.out.println(strNum+"sms 숫자가 아닙니다.");
		
		}finally {
			System.out.println("난 무조건 실행됨");//얘는 catch에 잡히든 안잡히든 무조건 실행됨
		}
	}			//catch안일어날라고 하면 "일이삼사" →"1234"로 바꿔바라
}

/*try과정에서 오류나면 바로 catch로 간다.
  일상 중 인증하는곳에서 오류나는 것도 예외처리이다.
  */