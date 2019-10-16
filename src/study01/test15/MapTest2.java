package study01.test15;
//MapTest 연습!
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[]args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("이름", "박영현");
		map.put("나이", "27");
		map.put("성별", "남자");
		Set<String> keySet=map.keySet();
		Iterator<String> it=keySet.iterator();
		
		while(it.hasNext()) {
			String key =it.next();
			System.out.println("key:"+key);
			String value=map.get(key);
			System.out.println("value:"+value);
		}
		System.out.println(map.get("이름"));
		System.out.println(map.get("나이"));
		System.out.println(map.get("성별"));
		System.out.println(map.get("이름")==map.get("성별"));
	}
}
