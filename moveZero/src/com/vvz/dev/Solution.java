package com.vvz.dev;

public class Solution {
	
//	public void moveZeroes(int[] nums) {
//        if(0 == nums.length || 1 == nums.length) {
//        	return;
//        }
//        int count = 0;//0µÄ¸öÊı
//        for(int i = 0; i < nums.length; i ++) {
//        	if(0 == nums[i]) {
//        		count ++;
//        	}
//        }
//        int temp = count;
//        while(0 != temp) {
//        	for(int i = 0; i < nums.length - 1 && 0 != temp; i ++) {
//        		if(0 == nums[i]) {
//        			for(int j = i + 1; j < nums.length; j ++) {
//        				nums[j - 1] = nums[j];
//        			}
//        			temp --;
//        		}
//        	}
//        	
//        }
//        for(int i = nums.length - count; i < nums.length; i ++) {
//    		nums[i] = 0;
//    	}
//        return;
//        
//    }
	
	public void moveZeroes(int[] nums) {
		if(0 == nums.length || 1 == nums.length) {
        	return;
        }
        int cur = 0;
        for(int i = 0; i < nums.length; i ++) {
        	if(0 != nums[i]) {
        		if(i != cur) {
        			nums[cur] = nums[i];
        		}
        		cur ++;
        	}
        }
        for(int i = cur; i < nums.length; i ++) {
        	nums[i] = 0;
        }
        
    }
}
