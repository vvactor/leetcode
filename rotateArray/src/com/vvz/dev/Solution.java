package com.vvz.dev;

public class Solution {
	 public void rotate(int[] nums, int k) {
		 int length = nums.length;
         while (k > 0)
         {
             int temp = nums[length - 1];
             for (int j = length - 2; j >= 0; j--)
             {
                 nums[j + 1] = nums[j];
             }
             nums[0] = temp;
             k--;
         }
	 }
}
