package study01.test13;

public class Practice {

	String[] strs;//1.String배열을 선언
	
	public Practice() {//2.Practice class에있는 strs를 사용하기위해 생성
		this.strs=new String[0];//3.String배열의 방개수를 생성
	}
	public int size() {//4.사이즈 값을 지정해줄 메소드를 만든다.
		return this.strs.length;//return값으로 strs의 length를 준다.
	}
	public void add(String str) {
		String[] tmpStr=this.strs;
		this.strs=new String[this.strs.length+1];
		this.strs[this.strs.length-1]=str;
		//for(int i=0;i)
	}
	
}
