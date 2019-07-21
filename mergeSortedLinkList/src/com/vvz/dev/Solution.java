package com.vvz.dev;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(null == l1 || null == l2){
            return l1 == null? l2: l1;
        }
        ListNode result = new ListNode(l1.val < l2.val? l1.val: l2.val);
        if(l1.val < l2.val){
            l1 = l1.next;
        }else{
            l2 = l2.next;
        }
        ListNode pos = result;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                pos.next = l1;
                l1 = l1.next;
            }else{
                pos.next = l2;
                l2 = l2.next;
            }
            pos = pos.next;
        }
        if(l1 != null){
            pos.next = l1;
        }
        if(l2 != null){
            pos.next = l2;
        }
        return result;
    }
}
