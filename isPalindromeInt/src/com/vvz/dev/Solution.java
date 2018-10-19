package com.vvz.dev;

public class Solution {
	
	/* Method 1: Transfer the integer number to a String instance, 
	then compare characters from the beginning and end position. */
    public boolean isPalindrome1(int x) {
    	if(0 > x){
            return false;
        }
        String str = Integer.toString(x);
        int begin = 0, end = str.length() - 1;
        while(begin <= end) {
        	if(str.charAt(begin) != str.charAt(end)) {
        		return false;
        	}
        	begin ++;
        	end --;
        }
        return true;
    }
    
    /* Method 2: Directly compare the first palce of the number with the last place, if they aren't equal with each other
     * ,then return false; if they are equal with each other, then compute the next pair of numbers of x */
    public boolean isPalindrome(int x) {
    	if(0 > x) {
    		return false;
    	}
    	int div = 1;
    	while(10 <=  x / div) {
    		div *= 10;
    	}
    	while(0 != x) {
    		int begin = x / div;
    		int end = x % 10;
    		if(begin != end) {
    			return false;
    		}
    		x = x % div /10;
    		div /= 100;
    	}
    	return true;
    }
}
