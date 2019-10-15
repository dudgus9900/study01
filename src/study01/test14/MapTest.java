package study01.test14;
//VO와 Map의 장점과 단점 / 차이점
import java.util.HashMap;

public class MapTest {

	public static void main(String[]args) {
		HashMap<String,Object>map =new HashMap<String,Object>();
		map.put("name", "박영현");
		map.put("age", "27");
		map.put("addr", "신갈");
		map.put("age", (int)map.get("age")+1);
		System.out.println(map.get("age"));
		
	}
}
/*안 좋은 코딩이다. 왜?
  value값을 Object로 했기 때문에 어떤 값이든 다~~들어간다.
  또 Map에서는 System.out.println(map.get("gae")); 이렇게 써도 오류가 안나서 개발자의 잘못인지 아닌지를 파악하기 어렵다.
단!!, VO를 사용하는 것과의 차이점은 다른 data type이나 다른 메소드를 추가할때
map.put("trans", "남");맵은 key값만 바꾸면 되는데
p.setTrans("남");VO는 받는 VO의 타입도 바꿔줘야 하는 불편이있다.*/