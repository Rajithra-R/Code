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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode(-1);
        // store all the list in some dup nodes for manipulation
        ListNode cur = list; 
        ListNode p1 = list1;
        ListNode p2 = list2;
        while(p1 != null && p2 != null)
        {
            if(p1.val <= p2.val)
            {
                cur.next = p1;
                p1 = p1.next;
            }
            else
            {
                cur.next = p2;
                p2 = p2.next;
            }
            cur = cur.next;
        }
        
        while(p1 != null)
        {
            cur.next = p1;
            p1 = p1.next;
            cur = cur.next;
        }
        while(p2 != null)
        {
            cur.next = p2;
            p2 = p2.next;
            cur = cur.next;
        }
        return list.next;
    }
}