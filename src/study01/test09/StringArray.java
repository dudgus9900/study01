package study01.test09;
import java.util.ArrayList;
//Random변수 써서 int값을 String에 넣는 방법
import java.util.Random;

public class StringArray {

	public static void main(String[]args) {
		String[] strs=new String[10];
		//입력부
		Random ran=new Random();
		for(int i=0;i<strs.length;i++) {
			int rNum = ran.nextInt(20)+1;
			strs[i]=rNum+"";   
		}
		
		//출력부
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
		
	ArrayList<String> strList=new ArrayList<String>(); //data type:String만 담을수있는 ArrayList
	strList.add("adsdasd");				               //add를 100번하면 console에 100이된다 (=이 얘기는 방 개수를 더하는거다)
/*  strList.remove("adsdasd");                         지우는 방법*/
	System.out.println(strList.size());   
	
	ArrayList<Integer> numList=new ArrayList<Integer>();
	numList.add(1);
	numList.add(2);
	numList.add(3);
	System.out.println(numList);
	}	
}
/*List는 순서 X
list는 유동적으로 길이를 조절할 수 있다.
ArrayList<여기에는 정해져있는 DataType못들어간다!>
list는 to String하면 값이 나옵니다.
배열이 속도는 더빠르나, 편하고 요즘은 속도차이가 신경쓰일만큼 느리지도않다.
length같은 Property는없으나 Method가존재 ex)size()
*/


/*String[]strs=new String[0];
strs=new String[1];
strs[0]="1";
strs=new String[2];
strs[1]="2";
arrayPrintln(strs);  일반 배열에서는 0번째방의 값이 null이 된다 이래서 List를 많이 사용한다!*/

/*복습!	String str="ABCD";
System.out.println(str.indexOf("C"));			   String 배열에서 순서 찾는법  */

/*	ArrayList<String> strList=new ArrayList<String>();
strList.add("홍길동");
strList.add("임꺽정");
strList.add("이문수");
strList.add("김문수");
System.out.println("==우리반 출석부==");
for(int i=0;strList.size();i++) {
System.out.println("김문수는"+strList.indexOf("김문수")+"번째에 있어요~");    List에서도 순서 찾는건 똑같다(다만, 없는 데이터값을 찾을경우는 -1이 나온다.
}	*/

/* Wraper Class
	int-Integer
	long-Long
	
	
	int a=1;
	Integer i=new Integer(1); 정해져있지 않은 DataType으로 바꾼것이다!*/