// O(n^2) time complexity, O(1) space complexity
class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";
        
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < s.length(); i++) {
            int len1 = palLength(s, i, i);
            int len2 = palLength(s, i, i+1);
            int len = Math.max(len1, len2);
            
            if(len > end - start + 1) {
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    public int palLength(String s, int left, int right) {
        if(s == null || left > right) return 0;
        
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return right - left - 1;
    }
}

// I want to test out this solution
class Solution {
    public String longestPalindrome(String s) {
        // Reverse the string and store it into a variable
        
        // Initialize the temp variable and the variable to store the output variable
        
        // Loop through the input string and compare it against the reversed string
            // If the character is equal to the other character, add it to the temp storage variable
            
            // If not, compare the temp variable to the output variable in terms of string size
            // and replace strings if the temp variable is larger
        
        // Create a helper function that compares the string length in the temp variable to the string
        // in the output variable. Replace the string in the output if the temp string is larger
    }
}
