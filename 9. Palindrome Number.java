// 9. Palindrome Number
// Example
// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.

class Solution {
    public boolean isPalindrome(int x) {
        String pal_check = Integer.toString(x);
        for(int i=0; i< pal_check.length()/2; i++){
            if(pal_check.charAt(i) != pal_check.charAt(pal_check.length() -1 -i)){
                return false;
            }    
        }
        return true;
    }
}