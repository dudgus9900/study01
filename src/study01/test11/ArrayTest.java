package study01.test11;
//다중배열에 대해 알아보자!
public class ArrayTest {

	public static void main(String[]args) {//주차장을 생각해서 이해하면 쉽다.
		int[][]nums=new int[4][];//nums의 데이터타입은 int[]이다.
		nums[0]=new int[3];		 //0층의 방개수는 3개지만
		System.out.println(nums[0][1]);
		nums[1]=new int[10];	 //1층의 방개수는 10개이다
		System.out.println(nums[0].length);//length라는 속성을 가지고있네?얘도 정해져있지않은 데이터타입
		System.out.println(nums[1].length);
		
		int[] ns=new int[3];
		System.out.println(ns.length);
	}
}
