class Solution {
    public boolean isSubsequence(String s, String t) {
        int last_location = 0;
        int total_found = 0;
        // Time Complexity is N^2
        for(int j = 0; j< s.length(); j++){
            for(int i = last_location; i< t.length(); i++){
                if(t.charAt(i) == s.charAt(j)){
                    last_location = i+1;
                    total_found += 1; 
                    break;
                }
            }
        }
        if(total_found == s.length()){
            return true;
        }
        return false;
    }
}

class Solution2 {
    public boolean isSubsequence(String s, String t) {
        int total_found = 0;
        if(s.isEmpty() ){ 
            return true;  
        }
        if(t.isEmpty()){
            return false;
        }
        for(int i = 0; i<t.length(); i++){
            if(s.charAt(total_found) == t.charAt(i)){
                total_found += 1;
            }
            if(total_found == s.length()){
                return true;
            }
        }
        return false;
    }
}

