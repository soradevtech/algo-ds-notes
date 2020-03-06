class Solution {
    public int romanToInt(String s) {
        // Set variables for the values of the individual numerals
        Map<Character, Integer> rMap = new HashMap();
        
        rMap.put('I', 1);
        rMap.put('V', 5);
        rMap.put('X', 10);
        rMap.put('L', 50);
        rMap.put('C', 100);
        rMap.put('D', 500);
        rMap.put('M', 1000);
        
        // Declare an output variable 
        int rInt = 0;
        
        // Create a loop that will iterate through the string 
        for(int i = 0; i < s.length(); i++) {
            // Make an if statement that checks if the current element has a value to the
            // left of it that is of lower value. Add the current element while subtracting
            // 2 times the lower value from rInt if true. Simply add the current element
            // otherwise.
            if(i > 0 && rMap.get(s.charAt(i)) > rMap.get(s.charAt(i-1))) {
                rInt += rMap.get(s.charAt(i)) - (2 * rMap.get(s.charAt(i-1)));
            } else {
                rInt += rMap.get(s.charAt(i));
            }
        }
            
        
        // return the output variable
        return rInt;
    }
}
