package study01.test11;
//MapList와 ArrayList를 이용해보자!	List와Map은 Collection뭐시기다.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest {

	public static void main(String[]args) {
		HashMap<String,String>human=new HashMap<String,String>();//<Integer,String>이면 오류난다!(데이터 타입이다르니까)
		human.put("이름", "박영현");//이름이라는 key를 지정해줘야 박영현이라는 value가 이름인지 안다! 
		/*human.put("이름", "임꺽정"); 2개가 저장되는게 아니라 덮어쓰는거라 s.o.p이름하면 임꺽정나온다.*/
		System.out.println(human);
		
		List<HashMap<String,String>>people=
				new ArrayList<HashMap<String,String>>();
		
		people.add(human);
		people.add(human);
		//human.put("이름", "임꺽정"); 이 경우는 임꺽정이 나온다.
		//people.get(1).put("이름", "김길동"); 이럴경우에는 0번방,1번방 모두 김길동이네
		human=new HashMap<String,String>();
		human.put("이름", "임꺽정");
		System.out.println(human);
		System.out.println(people.get(0));
		}
}
/*Map은 순서가 없다. 키의 데이터타입 밸류의 데이터타입을 정해줘야한다!.
 map.put(key(중복X),value(중복O))
HashMap, LinkedMap
메모리생성 하면 새로운 메모리가 생기기때문에 안에있는 값이 없어지지!
-그치만 안에있는 human.put("key", "value")을 바꾸면 출력 값이 바뀐다. */