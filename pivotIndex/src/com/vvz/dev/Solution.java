package com.vvz.dev;

public class Solution {
	
	public int pivotIndex(int[] nums) {
		if(nums.length < 2)
            return -1;
        int leftSum = 0;
        int rightSum = 0;
        int sum = 0;
        for(int n:nums){
            sum += n;
        }
        System.out.println(sum);
        int i;
        for(i=0;i<nums.length;i++){
            if(i==0)
                leftSum = 0;
            else
                leftSum += nums[i-1];
            rightSum = sum - leftSum - nums[i];
            if(leftSum == rightSum)
                return i;
        }
        System.out.println(i);
        return -1;

        
    }
}
