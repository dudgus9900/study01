package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	/*public static void main(String[]args){
		List<String> strList=new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		for(int i=0;i<strList.size();i++) {
			System.out.println(strList.get(i));
		}
	}ArrayList 복습*/
	public static void main(String[]args){
	Map<String,String> map=new HashMap<String,String>();//List와 마찬가지로 HashMap이 Map이라고 불릴수 있는 이유는 InterFace여서
	map.put("보물1호", "컴퓨터");
	map.put("보물2호","강아지");
	map.put("해야할일","많다");
	Set<String> keySet=map.keySet();
	Iterator <String>it=map.keySet().iterator();//iterator를 사용하여 위의 키값과 value를 기억하고
	//Iterator <String>it=keySet().iterator(); 25번라인 은 얘랑 똑같다.(데이터타입이 같자나 이건 혼자 생각해보자)
	
	while(it.hasNext()) {//has는 다음꺼 있어? 라고 물어보는거다.(it는 현재 어디서 끝날지 모르는 상황이기에 while을 썼다.)
		String key=it.next();		 //한명을 빼와라 두개가남는다.(뺄값이 없을때까지 다시 28번으로)
		System.out.println("key :"+key);
		String value=map.get(key);
		System.out.println("value :"+value);
	}//is,has는 return값이 boolean이다.
	
	for(int i=0;i<map.size();i++) {
		System.out.println(map.get("보물1호"));//Q:몇번방에 어떤key/value가 있는 지 확인하고싶을때는 어떻게 할까? →25번 라인으로가봐라!
	}							   //List에서는 indexOf로 할 수 있지만 (순서가 있어서), Map은 그렇게 할 수 가 없다.
	System.out.println(map.get("보물1호")==map.get("보물2호"));
	}
}/*만약 보물1호 - 컴퓨터
		 보물2호 - 컴퓨터를 쓴다면, 
		 이때 컴퓨터는 같은 메모리에 있는 같은 컴퓨터이다.*/
/*ArrayList는 순서가 중요할 때 쓰이고,
  Map은 순서 상관없이 키값이 중요하다.*/