package com.vvz.dev;

public class Solution {
	
	public int strStr(String haystack, String needle) {
        int result = -1;
        
        if(null == haystack || null == needle || haystack.length() < needle.length()) {
        	return -1;
        }
        if(0 == needle.length()) {
        	return 0;
        }
        if(haystack.equals(needle)) {
        	return 0;
        }
        for(int i = 0; i < haystack.length() - needle.length() + 1; i ++) {
        	int posHaystack = i;
        	int posNeedle = 0;
        	boolean flag = true;
        	while(posNeedle < needle.length()) {
        		if(needle.charAt(posNeedle) != haystack.charAt(posHaystack)) {
        			flag = false;
        			break;
        		}
        		posHaystack ++;
        		posNeedle ++;
        	}
        	if(flag) {
        		result = i;
        		break;
        	}
        }
        return result;
    }
}
