package study01.test14;
//List, set method를 이용하여 심화학습을 해보자
import java.util.ArrayList;
import java.util.List;

public class Excute{

	public static void main(String[]args) {
		Person p =new Person();
		p.setName("박영현");
		p.setAge(27);
		p.setAddr("신갈");
		
		List<Person>pList=new ArrayList<Person>();//메모리 생성(복습Person자리는 정해져있지 않은 data type이 와야한다.)
		pList.add(p);//pList는 14번의 메모리를 바라본다.
		
		p=new Person();//새로운 메모리 생성
		p.setName("하늘");
		p.setAge(24);
		p.setAddr("인천");
		pList.add(p);//pList는 17번의 메모리를 바라본다.
		
		p=new Person();
		p.setName("길동");
		p.setAge(27);
		p.setAddr("속초");
		pList.add(p);//p를 건드리면 연결이 끊긴다. 그치만 안의 내용을 바꾸면 바뀐다!
					/*ex)p=pList.get(0); 을 하면 값이 달라지지 않는다.
						 p.srtName("재빈"); 이러면 값이 달라지지*/
		System.out.println(pList.get(0));
		System.out.println(pList.get(1));
		System.out.println(pList.get(2));
	}
}
/*garbage collector : 자바가 알아서 없어질 메모리를
 * 					  모으는 자리(언제 지워질지는 모른다.)-장점이나 단점이 될 수 있다.*/
