import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // int[] nums = new int[nums1.length + nums2.length];
        int[] nums = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        Arrays.sort(nums);
        
        if(nums.length %  2 ==0){
            System.out.println(nums[nums.length/2]);
            float value = (nums[nums.length/2] + nums[(nums.length/2) - 1])/(float)2;
            
            return value;
        }else{
            return nums[nums.length/2];
        }
    }
}