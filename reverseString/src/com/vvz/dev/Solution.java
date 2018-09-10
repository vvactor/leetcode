package com.vvz.dev;

public class Solution {
	
	/**
	 * visit the String from tail to head, O(n),S(n)
	 * @param s
	 * @return
	 */
	public String reverseString(String s) {
		if(0 == s.length() || 1 == s.length()) {
			return s;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = s.length() - 1; i >= 0; i --) {
		sb.append(s.charAt(i));
		}
		return sb.toString();
	}
		 
	/**
	 * O(n/2),S(n)
	 * @param s
	 * @return
	 */
	public static String reverseString2(String s) {
        if(0 == s.length() || 1 == s.length()) {
			return s;
		}
        StringBuffer sb = new StringBuffer(s);
        int i = 0, j = s.length() - 1;
        for(; i < (s.length() - 1) / 2;  i ++, j --){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
        }
        if(0 == s.length() % 2){
        	char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(i + 1));
            sb.setCharAt(i + 1, temp);
        }
        s = sb.toString();
        return s;
    }
	
	public static void main(String[] args) {
		System.out.println(reverseString2("hello"));
	}
}
