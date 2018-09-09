package com.vvz.dev;

public class Solution {

    public int dominantIndex(int[] nums) {
        if(0 == nums.length){
            return -1;
        }
        int max1 = -1, max2 = -1, maxIndex = 0;
        for(int i  = 0; i < nums.length; i ++){
            if(nums[i] > max1){
                max2 = max1;
                max1 = nums[i];
                maxIndex = i;
            }else if(nums[i] > max2){
                max2 = nums[i];
            }
        }
        return max1 >= 2 * max2 ? maxIndex: -1;
    }

}
