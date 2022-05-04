class Solution {
    public int romanToInt(String s) {
        int[] nums = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == "I".charAt(0)){
                nums[i] = 1;
            } else if(s.charAt(i) == "V".charAt(0)){
                nums[i] = 5;
            } else if(s.charAt(i) == "X".charAt(0)){
                nums[i] = 10;
            } else if(s.charAt(i) == "L".charAt(0)){
                nums[i] = 50;
            } else if(s.charAt(i) == "C".charAt(0)){
                nums[i] = 100;
            } else if(s.charAt(i) == "D".charAt(0)){
                nums[i] = 500;
            } else if(s.charAt(i) == "M".charAt(0)){
                nums[i] = 1000;
            }
        }
        int Sum = 0;
        for(int j =0; j < nums.length; j++){
            if(j!= 0 && nums[j] > nums[j-1]){
                Sum = Sum - (nums[j-1] * 2) + nums[j];
            }else{
                Sum = Sum + nums[j];
            }
        }
        return Sum;
    }
}