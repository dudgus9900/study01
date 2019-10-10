package study01.test10;

class Father{
	public void test(){
		System.out.println("난 아빠 테스트");
	}
	public class Son extends Father {
		public void test() {
			System.out.println("난 아들 테스트");
		}
		public void sonsTest() {
			System.out.println("난 아빠한테 없는 기능");
		}
		public void main(String[] args) {
			Father s=new Son();  // Son은 Father이라고 불릴 수 있기떄문에
			
			Son s2=(Son)s;
			s2.sonsTest();
			
			Father f=new Father();
			if(f instanceof Son) { //2.그래서 instanceof를 써서 확인하는거다
				s2=(Son)f;		   //1.에러는 안나는데 결과값이 안나온다.(Compile로 잡아낼수 있는게 아니어서
				s2.sonsTest();
			}
		}
	}
}


