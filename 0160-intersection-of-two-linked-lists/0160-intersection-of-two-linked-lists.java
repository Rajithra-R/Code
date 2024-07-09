/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// Intersect val = 2 ; A = 1,9,1,2,4  ; B = 3,2,4
// a=1,b=3 ; a=9;b=2 ; a=1;b=4 ; a=2,b=null -> b=1 ; a=4,b=9 ; a=null -> a=3,b=1 ; a=2,b=2  => return a -> 2

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
        {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while(a != b)
        {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }
}