package study01.test13;
//ListTest,Test2 응용
public class ListTest3 {
	String[] strs;
	
	public ListTest3() {
		this.strs=new String[0];
	}
	public int size() {
		return this.strs.length;
	}
	public void add(String str) {
		String[] tmpStr=this.strs;
		this.strs=new String[this.strs.length+1];
		this.strs[this.strs.length-1]=str;
		for(int i=0;i<tmpStr.length;i++) {   
			this.strs[i]=tmpStr[i];
		}
	}
	public String toString() {
		String str="[";
		for(int i=0;i<strs.length;i++) {
			str+=strs[i]+",";
		}
			str=str.substring(0,str.length());
			str+="]";
			return str;
	}
	public static void main(String[]args) {
		ListTest3 lt3=new ListTest3();
		lt3.add("가");
		lt3.add("나");
		lt3.add("다");
		
		System.out.println(lt3);
		System.out.println(lt3.size());
	}
}