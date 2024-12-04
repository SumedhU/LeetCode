import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) { 
        HashSet<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2; i++){
            int left = i+1, right= nums.length -1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right] == 0){
                    ArrayList<Integer> sum = new ArrayList<Integer>();
                    sum.add(nums[i]);
                    sum.add(nums[left]);
                    sum.add(nums[right]);
                    result.add(sum);
                    left++;
                } else if(nums[i]+nums[left]+nums[right]>0){
                    right--;
                } else {
                    left++;
                }

            }
        }
        List<List<Integer>> arr = new ArrayList<>(result);
        return arr;
    }
}