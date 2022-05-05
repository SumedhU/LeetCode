class Solution {
    public int maxArea(int[] height) {
        int water = 0, start =0, end = height.length -1 , area=0;
        while(start<end){
            if(height[start] > height[end]){
                area = height[end] * (end-start);
                if(area > water){
                    water = area;
                }
                end--;
            }else{
                area = height[start] * (end-start);
                if(area > water){
                    water = area;
                }
                start++;
            }
        }
        return water;
    }
}