package study01.test14;
//InterFace와 class의 몸통이 왜 있을 수 있고 없어야하는지
//추상class!!
class Son extends AbstractTest{
	
	@Override
	public void test() {
		System.out.println("test");
	}	
}

public abstract class AbstractTest {
	
	public abstract void test();
	
	public static void main(String[]args) {
		//AbstractTest at=new AbstractTest(); 이게 오류가난다. 왜? new를 쓸라면 어디있는지 
		//알아야하는데 abstract 즉 추상 class로 만들어 버렸기 떄문에 
		//어디있는에 있는지 모른다.
		AbstractTest at=new Son();
		at.test();//이건 오류가 안난다. 왜? 위의 상속된 class Son에서 Overriding해서 무엇을 나타낼지 알려주었기 때문에!!
	}										
}
/*InterFace는 new를 쓸 수 가 없기 때문에
몸통을 가질 수 가 없으나, class는 new를 쓸 수 있기에 몸통을 가지고 있어야한다.*/

/*Abstract class(추상class)는 무조건 상속을 받을 class에서만 사용가능하다!*/