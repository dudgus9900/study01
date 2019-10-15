package study01.test13;

public class Test2 {
	public static void main(String[]args) {
		String[] strs=new String[3];
		strs[0]="123";
		strs[1]="abc";
		strs[2]="def";
		
		String str="[";
		for(int i=0;i<strs.length;i++) {
			str+=strs[i]+",";
			/*if(i!=strs.length-1) {
				str+=',';  이렇게 해도 되나!!*/
			}
	
		str=str.substring(0,str.length());
		str+="]";
		System.out.println(str);
		
		String test="12345";
		test.substring(2);//"345"가 나온다.
		/*test를 345로 나오게 하고 싶을때
		  test=tes.substring(2);대입해버리면 되지!*/
		//test=test.substring(2,3);  2번방부터 "3"전까지 잘라서 나타낸다는것!
		System.out.println(test.substring(1));//test가 "2345"되는건 아니고 return을 해주는거다.
		System.out.println("12345".indexOf("3"));//test가 String이라서 indexOf가 된다면 "12345"도 가능하다!!
		System.out.println(str);
	}
}
/*substring-문자열을 잘라서 쓸때 사용하는것(indexOf랑 같이 많이 쓰이니까 알아두자!!)
 */
