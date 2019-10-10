package study01.test11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[]args) {
		List<String> strList1=new ArrayList<String>();//ArrayList가 List를 바라보고 있으니까 이 코딩이 성립된다!
		List<String> strList2=new LinkedList<String>();//LinkedList는 순서를 모르나 앞뒤를 안다!
		/*List<String>→strList1로바꿔도맞다.*/
		strList1.add("1");
		strList1.add("2");
		strList1.add("3");
		strList2.add("1");
		strList2.add("2");
		strList2.add("3");
		System.out.println(strList1);
		System.out.println(strList2);
		
		strList1.remove(0);
		strList2.remove(0);
		System.out.println(strList1);
		System.out.println(strList2);
		
		strList1.set(0,"4");
		strList2.set(0,"4");
		System.out.println(strList1);
		System.out.println(strList2);
		System.out.println(strList1.size());
		System.out.println(strList2.size());
	}
}
//List는 Interface이다.(=new안된다.)
//순서대로 입력하고 순서대로 빼는 애들 중에는 ArrayTest가 와따다~!
//LinkedList는 숫자를 누락시키거나 수정해야할때 쓴다.(왜?ArrayList는 방을 빼면 알아서 방의 수를 다 옮겨서 복잡해진다.)