package study01.test11;
//MapList만 사용해보기
import java.util.HashMap;

public class MapTest2 {

	void changeMap(HashMap<String,String> map){
		map = new HashMap<String,String>(); //이거 없으면 "나이","44"가 나온다!
		map.put("나이", "44");				//왜? 새로운 메모리를 생성한게 아니라
	}								//안의 key,value를 바꾼거라 안의 내용이 바뀐다.
	
	
	public static void main(String[]args) {
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("나이", "33");
		MapTest2 t2=new MapTest2();
		t2.changeMap(map);
		System.out.println(map);
	}
}
