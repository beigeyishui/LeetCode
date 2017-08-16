package leetcode.array;

import java.util.Arrays;

public class ArrayPartitior1_number561 {
	public static void main(String[] args) {
		int[] nums = {1,4,3,2};
		int sum = 0;
		
		Arrays.sort(nums);
		for(int i = 0; i < nums.length-1;i+=2) {
			sum += nums[i];
		}
		System.out.println(sum);
	}
	
}
