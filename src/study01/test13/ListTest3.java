package study01.test13;

public class ListTest3 {
	String[] strs;
	
	public ListTest3() {
		this.strs=new String[0];
	}
	public int size() {
		return this.strs.length;
	}
	public void add(String str) {
		this.strs=new String[this.strs.length+1];
		this.strs[this.strs.length-1]=str;
	}
	public static void main(String[]args) {
		ListTest3 lt3=new ListTest3();
		lt3.add("가");
		lt3.add("나");
		lt3.add("다");
		
		System.out.println(lt3.size());
		
		
	}
}
