package com.vvz.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
	       List<List<Integer>> result = new ArrayList<List<Integer>>();
	        if(3 > nums.length) {
	        	return result;
	        } 
	        
	        Arrays.sort(nums);
	        for(int k = 0; k < nums.length; k ++) {
	        	if(nums[k] > 0) {
	        		break;
	        	}
	        	if(k > 0 && nums[k] == nums[k - 1]) {
	        		continue;
	        	}
	        	int target = 0 - nums[k];
	        	int begin = k + 1;
	        	int end = nums.length - 1;
	        	while(begin < end) {
	        		if(nums[begin] + nums[end] == target) {
	        			List<Integer> eleList = new ArrayList<Integer>();
	        			eleList.add(nums[k]);
	        			eleList.add(nums[begin]);
	        			eleList.add(nums[end]);
	        			result.add(eleList);
	        			while(begin < end && nums[begin] == nums[begin + 1]) {
	        				++ begin;
	        			}
	        			while(begin < end && nums[end] == nums[end - 1]) {
	        				-- end;
	        			}
	        			++ begin;
	        			-- end;
	        		}else if(nums[begin] + nums[end] < target) {
	        			++ begin;
	        		}else {
	        			-- end;
	        		}
	        	}
	        }
	        return result;
	    }
}
