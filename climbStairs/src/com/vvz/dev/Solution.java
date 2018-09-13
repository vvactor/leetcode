package com.vvz.dev;

public class Solution {
	public int climbStairs(int n) {
		if(2 >= n) {
			return n;
		}
		int methods = 0;
		int methods1 = 1, methods2 =2;
		for(int i = 3; i <= n; i ++) {
			methods = methods1 + methods2;
			methods1 = methods2;
			methods2 = methods;
		}
		return methods;
	}
}
