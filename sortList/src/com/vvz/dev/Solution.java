package com.vvz.dev;

import java.util.List;

public class Solution {

    public ListNode sortList(ListNode head) {

        if(null == head || null == head.next){
            return head;
        }
        ListNode tail = head;
        int length = 1;
        while(null != tail.next){
            tail = tail.next;
            length ++;
        }
        head = mergeSort(null, head, length);
        return head;
    }

    private ListNode mergeSort(ListNode preHead, ListNode head, int length){
        if(null == head || 1 >= length){
            return head;
        }
        int left = length / 2;
        int right = length - left;

        //sort the left part
        head = mergeSort(preHead, head, left);

        //sort the right part
        ListNode pMid = head;
        for (int i = 0; i < left - 1; i++) {
            pMid = pMid.next;
        }
        mergeSort(pMid, pMid.next, right);

        //p1 -> left part; p2 -> right part
        ListNode p1 = head, p2 = pMid.next, pre1 = preHead, pre2 = pMid;
        if(p1.val > p2.val){
            head = p2;
        }

        while(left > 0 && right > 0){
            if(p1.val > p2.val){
                pre2.next = p2.next;
                p2.next = p1;
                if(null != pre1){
                    pre1.next = p2;
                }
                //pre1 move to p2
                pre1 = p2;
                //p2 move to pre2.next
                p2 = pre2.next;
                right --;
            }else{
                pre1 = p1;
                p1 = p1.next;
                left --;
            }
        }

        return head;
    }

}
