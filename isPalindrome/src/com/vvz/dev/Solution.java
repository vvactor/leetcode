package com.vvz.dev;

public class Solution {
    public static boolean isPalindrome(String s) {
        boolean result = true;
        if(0 == s.length() || 1 == s.length()){
            return result;
        }
        //reverse direction put the String into StringBuilder
        StringBuilder sb1 = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                    || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                    char temp = (char)(s.charAt(i) + 32);
                    sb1.append(temp);
                }else{
                    sb1.append(s.charAt(i));
                }

            }
        }
        System.out.println(sb1.toString());
        //forward direction put the String into anther StringBuilder
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                    || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                    char temp2= (char)(s.charAt(i) + 32);
                    sb2.append(temp2);
                }else{
                    sb2.append(s.charAt(i));
                }

            }
        }
        System.out.println(sb2.toString());
        if(!sb1.toString().equals(sb2.toString())){
            result = false;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(Solution.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
