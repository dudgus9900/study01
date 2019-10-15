package study01.test13;
//remove를 배열로만 해서 이해해보기
public class Test3 {
	public static void main(String[]args) {
		String[]strs=new String[3];
		strs[0]="1";
		strs[1]="2";
		strs[2]="3";//1번방을 지우고싶다!!
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

