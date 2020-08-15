/**
7. Reverse Integer
Easy

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321

Example 2:

Input: -123
Output: -321

Example 3:

Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/

class Solution {
    public int reverse(int x) {
        
        int result = 0;
        int sign = x < 0 ? -1 : 1;
        x = x * sign;
        
        while (x != 0) {
            int mod = x % 10;
            result += (mod * Math.pow(10, String.valueOf(x).length() - 1));
            if(result == Integer.MIN_VALUE || result == Integer.MAX_VALUE) {
                return 0;
                }
            x = x / 10;
        }
        
        return result * sign;
    }
}
