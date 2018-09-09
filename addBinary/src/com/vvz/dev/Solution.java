package com.vvz.dev;

public class Solution {

    public String addBinary(String a, String b) {
        int lengthA = a.length(), lengthB = b.length();
//        int length = lengthA > lengthB ? lengthA : lengthB;
        int carry = 0;
        StringBuffer sb = new StringBuffer();
        while(0 < lengthA || 0 < lengthB){
            int numA = 0, numB = 0;
            if(0 < lengthA){
                numA = Integer.parseInt(a.substring(lengthA - 1, lengthA));
            }
            if(0 < lengthB){
                numB = Integer.parseInt(b.substring(lengthB - 1, lengthB));
            }

            int sum = carry + numA + numB;
            //011 111 000 001
            if(2 <= sum){
                carry = 1;
                if(3 == sum){
                    sb.append("1");
                }else{
                    sb.append("0");
                }

            }else{
                carry = 0;
                if(1 == sum){
                    sb.append("1");
                }else{
                    sb.append("0");
                }
            }
            lengthA --;
            lengthB --;
        }
        if(1 == carry){
            sb.append("1");
        }
        return sb.reverse().toString();
    }
}
