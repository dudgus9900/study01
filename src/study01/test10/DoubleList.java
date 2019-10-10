package study01.test10;
//test09 ArrayTest /test10 IntergerList 통합하여 사용하기
import java.util.ArrayList;
import java.util.Random;

public class DoubleList {

	public static void main(String[]args) {
		ArrayList<String> strList=new ArrayList<String>();  // 지금 표준어는 new ArrayList<> - String을 생략한다.(연습할떄는 있이 하자!)
		ArrayList<Double> doubleList=new ArrayList<Double>();
		Random r=new Random();
		for(int i=0;i<10;i++) {
			strList.add(r.nextInt(100)+"."+r.nextInt(10));
			doubleList.add(Double.parseDouble(strList.get(i)));  //parseDouble 은 new를 안썼다 =얘도 static이다!
		}
		
		
		for(int i=0;i<doubleList.size();i++) {                //ArrayList를 통한 정렬 test10-Sort와 연계해서 공부!!
			for(int j=i+1;j<doubleList.size();j++) {
				if(doubleList.get(i)>doubleList.get(j)) {
					double tmpDouble=doubleList.get(j);
					doubleList.set(i, doubleList.get(j));
					doubleList.set(j,tmpDouble);
				}
			}
			
			
			
		}
		System.out.println(doubleList);
		System.out.println(doubleList.get(0)+doubleList.get(1)); //  List에서는 불러올때get  세팅할때 set이용
	}
}
	



/* 맨처음 값은 비교할 대상이 없기에 메모리에 저장합니다.(13.4)
 * 저장된 값과 두번째 값을 비교하고 더작은 수를 저장합니다.(13.4<55.4)→13.4
 * 두번째 저장된 값을 세번째 값을 비교하고 더 작은수를 저장합니다.(13.4>4.3)→4.3
 * 세번째 저장된 값을 네번째 값을 비교하고 더 작은수를 저장합니다.(4.4>4.3)→4.3
 * 네번째 저장된 값을 다섯번째 값을 비교하고 더 작은수를 저장합니다.(4.3<7.0)→4.3
 * 다섯번째 저장된 값을 여섯번째 값을 비교하고 더 작은수를 저장합니다.(4.3<71.4)→4.3
 * 이 루틴으로 반복을해서 나온값을 첫번쨰 순위로 두고 저장합니다.
 * 첫번째 값을 빼고 다시 루틴을 돌리며 하나씩 비교하며 저장합니다.*/

 /* ArrayList<Double>nums=new ArrayList<Double>();
  nums.add(1.1);
  nums.add(1.3);
  nums.add(0.5);
  nums.set(0.0.5);  (방번호.넣을값) */
