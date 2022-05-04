import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int operations = 0, low = 0, high = nums.length - 1;
        while(low < high){
            if(nums[low] + nums[high] == k){
                low++;
                high--;
                operations++;
            }else if(nums[low] + nums[high] > k){
                
                high--;
            }else{
                low++;
            }
        }
        return operations;
    }
}