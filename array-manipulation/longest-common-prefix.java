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
