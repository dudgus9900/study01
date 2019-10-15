package study01.test13;
//ArrayList를 사용하지 않고 배열만으로 List처럼 활용하기
public class ListTest {

	private String[] strs;	//String배열 선언
	
	public ListTest() {
		this.strs=new String[0];	//1.String배열의 방0개를 만들었다.
	}								//Q:배열의 방을 한개 더늘리고싶다!!
	public int size() {
		return this.strs.length;	//2.size라는 생성자를 만들고 return값을 정의해준다.
	}
	public void add(String str) {	//String이 올 수 있는 메소드를 만들고
		//String[] tmpStr=this.strs; 스왑하는 방법   tmpStr이라는 String배열을 만들고 거기에 5번라인 strs를 대입
		this.strs=new String[this.strs.length+1];//3. 1.의 스트링배열의 길이에 1을 더하는 메모리(=방)을 만들어 준다. 
		this.strs[this.strs.length-1]=str;//이러면 방갯수가 늘어나고 마지막 방에 넣고싶은 값이 나온다.										 	
		/*for(int i=0;i<tmpStr.length;i++) {   
			this.strs[i]=tmpStr[i];
		}*/
	}	
	
	
	public static void main(String[]args) {
		ListTest lt=new ListTest();	//ListTest의 메소드를 이용하기 위해 ListTest의 메모리 생성
		lt.add("A");			//0개의 방에 3. 때문에 1을 더해 1개의 방이 생겨서 넣을 수 있다.(방개수1)
		lt.add("B");			//1개의 방에 3. 때문에 1을 더해 1개의 방이 생겨서 넣을 수 있다.(방개수2)
		lt.add("C");			//2개의 방에 3. 때문에 1을 더해 1개의 방이 생겨서 넣을 수 있다.(방개수3)
		
		
		System.out.println(lt.size());
		System.out.println(lt.strs[0]+","+lt.strs[1]+","+lt.strs[2]);
		
	}
}
/*List를 안쓰고 List처럼 쓰는방법이다.
  그럼으로 19번라인에서 0번째방에 A가들어가고
  20번라인에서는 1번째방에 B가 들어가나 0번째방의 A가 사라진다.(왜? 14번에서 초기화가 되버리니까)*/
