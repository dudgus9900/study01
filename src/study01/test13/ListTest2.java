package study01.test13;
//List를 사용하지 않은 배열의 한계
public class ListTest2 {
	private String[] strs;//String배열 선언
	
	public ListTest2() {
		this.strs=new String[0];//1.String배열의 방0개를 만들었다.
	}
	//Q:배열의 방을 한개 더늘리고싶다!!
	public int size() {
		return this.strs.length;//2.size라는 생성자를 만들고 return값을 정의해준다.
	}
	
	public void add(String str) {//String이 올 수 있는 메소드를 만들고
		String[] tmpStrs=this.strs;
		this.strs=new String[this.strs.length+1];//3. 1.의 스트링배열의 길이에 1을 더하는 메모리(=방)을 만들어 준다.
		this.strs[this.strs.length-1]=str;
		for(int i=0;i<tmpStrs.length;i++) {
			this.strs[i]=tmpStrs[i];
		}
	}
	
	public static void main(String[]args) {//ListTest의 메소드를 이용하기 위해 ListTest의 메모리 생성
		ListTest2 lt2=new ListTest2();
		lt2.add("a");
		lt2.add("b");
		lt2.add("c");
		
		System.out.println(lt2.size());
		System.out.println(lt2.strs[0]+","+lt2.strs[1]+","+lt2.strs[2]);
		
	}
}
