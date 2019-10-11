package study01.test05;

class Father{
	void work() {
		System.out.println("은행일을 하신다..");
	}
}
public class Son extends Father{
	void work() {
		//System.out.println("내 일을 한다.!");
	}
	public static void main(String[]args) {
		//Son s=new Son();
		//s.work();
		Father f=new Father();
		f.work();
	}

}
