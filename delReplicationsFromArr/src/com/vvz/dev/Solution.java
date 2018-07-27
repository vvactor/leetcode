package com.vvz.dev;

public class Solution {
	
	public int removeDuplicates(int[] nums) {
		if(0 == nums.length || 1 == nums.length) {
			return nums.length;
		}
		int len = 0;
	    for (int i = 0; i < nums.length; i ++) {
		    if (nums[i] != nums[len]){
		        len ++;
		        nums[len] = nums[i];
		    }
        }
        len += 1; 
        return len;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
