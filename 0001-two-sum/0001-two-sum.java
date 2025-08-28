class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[]{0,0};
        // if only 2 elements 
        if(nums.length == 2) {
            answer[0] = 0;
            answer[1] = 1;
            return answer;
        }
        // if less then 2 
        if (nums.length < 2) {
            return answer; 
        }
        for(int i = 0 ; nums.length > i; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        return answer; 
    }
}