package study01.test14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaptTest2 {
	public static void main(String[]args) {
		HashMap<String,String>map =new HashMap<String,String>();
		map.put("이름","홍길동");
		map.put("나이","45");
		
		List<HashMap<String,String>> mapList=new ArrayList<HashMap<String,String>>();
		//List는 기본적으로 Interface List를 설계삼아 만든거기에 Interface이다.
		//그럼으로 ArrayList라고 쓰지 않고 List로 써도된다. 왜? List로 불릴수 있으니까.
		mapList.add(map);
		map.put("성별", "남자");
		
		map=new HashMap<String,String>();
		map.put("이름","박영현");
		map.put("나이","27");
		map.put("성별", "남자");
		mapList.add(map);
		
		System.out.println(mapList);
	
		//List<List<HashMap<String,String>>>mapListMapList;
		//HashMap<String,List<HashMap<String,String>>>totalMap; - 정해져있지 않은 data type이라면 List든 Map이든 들어갈수있다.
		
	}
}
//Map 출력 시 대괄호가 나오고  List 출력 시 중괄호가 나온다.