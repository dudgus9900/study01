package study01.test13;
//주소값이 아닌 값을 구하는 방법
public class Test {
	public static void main(String[]args) {
		String[] strs=new String[3];
		strs[0]="123";
		strs[1]="abc";
		strs[2]="def";
		
		String str="[";
		for(int i=0;i<strs.length;i++) {
			str+=strs[i];
			if(i!=strs.length-1) {
				str+=',';
			}
		}
		str+="]";
		System.out.println(str);
	}
}
//이 방법이 싫다면 Test2로 가봐라