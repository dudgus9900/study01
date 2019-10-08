package study01.test10;
import java.util.ArrayList;
//배열을 이용한 정렬(모른다면 외워라!)
import java.util.Random;

public class Sort {
	
	public static void main(String[]args) {
		int[] nums=new int[10];
		Random r=new Random();
		//입력부
		for(int i=0;i<nums.length;i++) {
			nums[i]=r.nextInt(100);
		}
		
		//정렬
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					int tmpNum=nums[j];          //tmpNum 새로만들어서 작은수를 넣는다
					nums[i]=nums[j];
					nums[j]=tmpNum;
				}
			}
		}
			
		//출력부
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}


