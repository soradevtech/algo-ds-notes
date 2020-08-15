/**
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
*/

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
