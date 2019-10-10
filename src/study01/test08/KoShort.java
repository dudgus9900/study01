package study01.test08;

class Cat{
	public void sleep() {
		System.out.println("고양이가 잡니다.");
	}
}
public class KoShort extends Cat{
	public void sleep() {
		System.out.println("코숏 고양이가 잡니다.");//overriding
	}
	public static void main(String[]args) {
		Cat ks =new KoShort();
		Cat[] cats=new Cat[4];
		cats[0]=new Cat();
		cats[1]=new KoShort();
		cats[0].sleep();
		cats[1].sleep();		
	}
}
