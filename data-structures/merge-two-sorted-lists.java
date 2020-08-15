/**
Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Create a variable to store the current node being worked on as well as a
        // Variable to point to the head node
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        
        // Loop through both lists to check which node has the least value. Push that node into
        // the new list
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                dummy.next = l1;
                // Replace the node of lesser value with its next property, moving 
                // the list forward
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            // Set the dummy variable to the next value in its node, moving the variable forward
            dummy = dummy.next;
        }
        
        // Once one of the lists are empty, the loop will end and the rest of the other list will be
        // appended to the new list
        if(l1 != null) {
            dummy.next = l1;
        } else {
            dummy.next = l2;
        }
        
        // Return the next property of the head variable, which still has a reference to the original
        // ListNode created when dummy was declared
        return head.next;
    }
}
