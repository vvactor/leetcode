package com.vvz.dev;

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    	int i = 0, j = 0, time = 0;
        for(; j < n; i ++) {
        	if(i < m + n) {
        		if(nums1[i] <= nums2[j]) {
        			continue;
        		}else {
        			for(int pos = m - 1 + time; pos >= i; pos --) {
        				nums1[pos + 1] = nums1[pos];
        			}
        			nums1[i] = nums2[j];
        			j ++;
        			time ++;
        		}
        	}else {
        		break;
        	}
        }
        if(j < n) {
        	for(int pos2 = j + m; pos2 < m + n; pos2 ++, j ++) {
        		nums1[pos2] = nums2[j];
        	}
        }
    }
    public static void main(String[] args) {
		int[] nums1 = {4,0,0,0,0,0};
		int[] nums2 = {1,2,3,4,5,6};
		StringBuffer s = new StringBuffer();
		Solution.merge(nums1, 1, nums2, 5);
	}
}
