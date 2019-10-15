package study01.test13;
//배열과 remove를 사용해보기
public class Test4 {
	public static void main(String[]args) {
		String[] strs=new String[3];
		strs[0]="a";
		strs[1]="b";
		strs[2]="c";
		String[]tmp=strs;
		strs=new String[strs.length-1];
		for(int i=0;i<1;i++) {
			strs[i]=tmp[i];
		}
		for(int i=1+1;i<tmp.length;i++) {
			strs[i-1]=tmp[i];
		}
		
	
	for(int i=1+1;i<tmp.length;i++) {	
	System.out.println(strs[i]);
	}	
	}
}

