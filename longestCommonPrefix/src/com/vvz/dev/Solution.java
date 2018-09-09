package com.vvz.dev;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(0 == strs.length){
            return "";
        }
        int min = Integer.MAX_VALUE;
        String minStr = "";
        for (int i = 0; i < strs.length; i++) {
            if(min > strs[i].length()){
                min = strs[i].length();
                minStr = strs[i];
            }
        }
        if(0 == min){
            return "";
        }
        for(int i = min; i >= 0; i --){
            String result = minStr.substring(0, i);
            int j = 0;
            for (; j < strs.length; j ++) {
                if(!strs[j].substring(0, i).equals(result)){
                    break;
                }
            }
            if(j == strs.length){
                return result;
            }
        }
        return "";
    }
}
