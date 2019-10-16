package study01.test15;
//LinkedHashMap에 대해 알아보자
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest3 {

	public static void main(String[]args) {
		Map<String,String> map=new LinkedHashMap<String,String>();
		map.put("좋아하는 음식1", "피자");
		map.put("좋아하는 음식2", "치킨");
		map.put("좋아하는 음식3", "햄버거");
		map.put("좋아하는 음식4", "삼겹살");
		map.put("좋아하는 음식5", "소고기");
		map.put("테스트2", "123132");
		map.put("테스트1", "123132");
		map.put("테스트2", "123132");
		map.put("테스트3", "123132");
		map.put("테스트5", "123132");
	
		Iterator<String>it=map.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println("key:"+key+",value:"+map.get(key));
		}
	}
}
/*순서가 있는게 아니라 링크를 탄 key와 value의 앞뒤를 알고 있기때문에
   순서대로 나오는 것이다.(순서있는것X)*/