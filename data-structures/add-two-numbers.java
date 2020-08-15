/**
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Set a dummy list node
        ListNode dummyHead = new ListNode(0);
        
        // Declare the new list, starting with the dummy
        ListNode l3 = dummyHead;
        
        // Set the variable to hold the digit to carry over to the next pair of list nodes
        int carry = 0;
        
        // Loop through the two input lists at the same time and add their nodes to create new nodes
        while(l1 != null || l2 != null) {
            // Create conditionals that will set the variables to be added to the available list node
            // or 0 if the node has no value
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            
            // Create a sum to split into the digit for the current position and the number to
            // carry over
            int listSum = val1 + val2 + carry;
            carry = listSum / 10;
            int lastNum = listSum % 10;
            
            // Set the new node to the result in lastNum and store it into the new list
            ListNode newNode = new ListNode(lastNum);
            l3.next = newNode;
            
            // Move all the lists forward by one node, if possible
            if(l1 != null) {l1 = l1.next;}
            if(l2 != null) {l2 = l2.next;}
            l3 = l3.next;
        }
        
        // If there is a value left over in carry after both nodes have been iterated through,
        // add that value as a new node at the end
        if(carry > 0) {
            l3.next = new ListNode(carry);
        }
        
        // Return the new list, starting with the next value of dummy head
        return dummyHead.next;
    }
}
