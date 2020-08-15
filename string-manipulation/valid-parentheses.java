/**
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.
*/

class Solution {
    public boolean isValid(String s) {
        // Check if the string is even. All valid strings should be
        if(s.length() % 2 != 0) {return false;}
        
        // Create a stack to check the combinations of parentheses
        Stack<Character> stack = new Stack();
        
        // Loop through each character in the string to push and pop the stack if necessary
        for(char x : s.toCharArray()) {
            if(x == '(' || x == '{' || x == '[') {
                // Push any opening bracket into the stack. Any closing bracket is compared to
                // the last element in the stack to see if they match, provided the stack is
                // not empty.
                stack.push(x);
            } else if(x == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if(x == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if(x == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
        }
        
        // Return whether the stack is empty or not
        return stack.isEmpty();
    }
}
