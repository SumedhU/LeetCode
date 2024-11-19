
class Solution {
    public boolean isPalindrome(String s) {
        int length_of_string = s.length();
        String string_lowercase = s.toLowerCase();
        if(length_of_string == 1){
            return true;
        } else{
            int i = 0;
            int j = length_of_string - 1;
            while(i<j){
                if(!Character.isLetterOrDigit(string_lowercase.charAt(i))){
                    i++;
                    continue;
                }
                if(!Character.isLetterOrDigit(string_lowercase.charAt(j))){
                    j--;
                    continue;
                }
                if(string_lowercase.charAt(i) != string_lowercase.charAt(j)){
                    System.out.println(s.charAt(i));
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }
}