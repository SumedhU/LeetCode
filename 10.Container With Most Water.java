class Solution {
    public int maxArea(int[] height) {
       int maximum_water_stored = 0; 
       int i = 0, j = height.length - 1;

       while (i<j){
            if(Math.min(height[i], height[j]) * (j-i) > maximum_water_stored){
                maximum_water_stored = Math.min(height[i], height[j]) * (j-i);
            }
            if(height[i] < height[j]){
                i++;
                continue;
            }
            if(height[i] >= height[j]){
                j--;
                continue;
            }
        } 
        return maximum_water_stored;
    }
}