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
