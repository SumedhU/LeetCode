class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left_pointer = 0;
        int right_pointer = numbers.length - 1;
        while(left_pointer < right_pointer){
            if(numbers[left_pointer] + numbers[right_pointer] > target){
                right_pointer -= 1;
            }
            if(numbers[left_pointer] + numbers[right_pointer] < target){
                left_pointer += 1;
            }
            if(numbers[left_pointer] + numbers[right_pointer] == target){
                break;
            }
        }
        int[] result = {left_pointer + 1, right_pointer + 1};
        return result;
    }
}
