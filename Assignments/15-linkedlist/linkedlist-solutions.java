## Easy
1- [Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/) `leetcode`

import java.util.*;
class find_disappeared_numbers
{
    public static void main(String args[])
    {
        int[] a = {1 , 2 , 5 , 6 , 2 , 5};
        List <Integer> result = findDisappearedNumbers(a);
        if(result.size() == 0)
            System.out.println("No disappeared elements");
        else
            for(int i : result)
                System.out.print(i + " ");
    }
    static List <Integer> findDisappearedNumbers(int[] a)
    {
        List <Integer> result = new ArrayList <Integer>();
        HashSet <Integer> mark = new HashSet <Integer>();
        for(int i : a)
            mark.add(i);
        for(int i = 1 ; i <= a.length ; i++)
            if(!mark.contains(i))
                result.add(i);
        return result;
    }
}

## Medium

1- [Sort List](https://leetcode.com/problems/sort-list/)`leetcode`

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
       if(head==null || head.next==null){
           return head;
       }

       //partition the list
       ListNode p1 = head;
       ListNode firstEnd = getFirstEnd(head);
       ListNode p2 = firstEnd.next;
       firstEnd.next = null;

       //sort each list
       p1 = sortList(p1);
       p2 = sortList(p2);

       //merge two lists
       return merge(p1, p2);
   }

   //get the list partition point
   private ListNode getFirstEnd(ListNode head){
       ListNode p1 = head;
       ListNode p2 = head;
       while(p1!=null && p2!=null){
           if(p2.next==null||p2.next.next==null){
               return p1;
           }

           p1 = p1.next;
           p2 = p2.next.next;
       }

       return head;
   }

   //merge two list
   private ListNode merge(ListNode n1, ListNode n2){
       ListNode head = new ListNode(0);
       ListNode p = head;
       ListNode p1 = n1;
       ListNode p2 = n2; 
       while(p1!=null && p2!=null){
           if(p1.val<p2.val){
               p.next = p1;
               p1 = p1.next;
           }else{
               p.next = p2;
               p2 = p2.next;
           }

           p = p.next;
       }

       if(p1!=null){
           p.next = p1;
       }

       if(p2!=null){
           p.next = p2;
       }

       return head.next;
   }
}