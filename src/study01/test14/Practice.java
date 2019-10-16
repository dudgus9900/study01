package study01.test14;
//MapTest2에 for문 더하기
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Practice {
	public static void main(String[]args) {
		HashMap<String,String>map=new HashMap<String,String>();
		List<HashMap<String,String>>mapList=new ArrayList<HashMap<String,String>>();
		for(int i=1;i<=30;i++) {
			map= new HashMap<String,String>(); 
			map.put("이름", "박영현");
			map.put("나이",i+"");
			map.put("성별", "남자");
			if(i%2==0) {
				map.put("성별", "여자");
			}
			mapList.add(map);
		}
		for(int i=0;i<mapList.size();i++) {
			System.out.println(mapList.get(i));
		}
	}
}
//VO는 만들때 빡쏀데, 만들고 나서는 데이터 검증을 안해도된다.