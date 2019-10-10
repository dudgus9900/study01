package study01.test10;
//ArrayList 사용해서 값을 불러오는 방법
import java.util.ArrayList;

public class IntegerList {

	public static void main(String[]args) {
		
		ArrayList<Integer>al= new ArrayList<Integer>();    //<>안썻을경우는 Object임
		al.add(10);                         //0번쨰 방을 하나 만들고 거기에 10을 넣은것(null아님)
		al.add(20);		                    //1번쨰 방을 하나 만들고 거기에 20을 넣은것
		al.add(30);							//2번째 방을 하나 만들고 거기에 30을 넣은것
		for(int i=0;i<al.size();i++) {		//배열은 length / List는 size()라는 변수를 갖는것
		System.out.println(al.get(i));		//객체지향에서는 get을써서 가져오는것이다.
		
		}
	}
}
