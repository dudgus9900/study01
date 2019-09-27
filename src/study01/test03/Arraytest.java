package study01.test03;

public class Arraytest {
	public static void main(String[]args) {
		int[] nums=new int[10];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		nums[3]=4;
		for(int i=0;i<nums.length;i++) { 
			nums[i]=(i+1)*2;
			System.out.println(nums[i]);
		}
	}
}
