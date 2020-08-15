// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

// Example 1:

// Input: ["flower","flow","flight"]
// Output: "fl"

// Example 2:

// Input: ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

// Note:

// All given inputs are in lowercase letters a-z.


class Solution {
    public String longestCommonPrefix(String[] strs) {
        // If the input has a length of 0, return an empty string
        if(strs.length == 0) return "";
        // Set a variable to reference the first array element
        String prefix = strs[0];
        
        // Loop through the array, starting at the second element and check if the first element
        // matches the other strings as an index of those strings. If not, reduce the first string
        // by 1 until it does or there is nothing left.
        for(int i=1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        
        return prefix;
    }
}
