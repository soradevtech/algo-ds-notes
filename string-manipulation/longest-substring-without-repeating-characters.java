class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Set pointers for traversal of the string. bPointer is the one that moves the most.
        int aPointer = 0;
        int bPointer = 0;
        
        // Create a hash set that will store the unique characters
        HashSet hashSet = new HashSet();
        
        // Variable to store the value of max substing length that fits requirements
        int max = 0;
        
        // While loop that runs through the length of the string
        while(bPointer < s.length()) {
            // If the current character in question isn't contained in the hash set already, add it to 
            // the hash set. Increment the bPointer and update the max variable
            if(!hashSet.contains(s.charAt(bPointer))) {
                hashSet.add(s.charAt(bPointer));
                bPointer++;
            } else {
                // Else, remove the first instance of the character from the hash set, increment the
                // aPointer and update the max variable
                hashSet.remove(s.charAt(aPointer));
                aPointer++;
            }
            // Update the max variable   
            max = Math.max(hashSet.size(), max);
        }
        // Return max
        return max;
    }
}
