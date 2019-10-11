package study01.test06;

public class MethodTest {
	public static void main(String[]args) {
		String str="1234567";
		int idx=str.indexOf("34");
		int b=Integer.parseInt(str);
		System.out.println("34는 str의"+idx+"index자리에 있네요");
		
		String name="경훈,선호,영현,종서,동민,혜영";
		String[] strs=name.split(",");
		for(int i=0;i<strs.length;i++) {
			System.out.println("이름:"+strs[i]);
		}
				
	}
}
