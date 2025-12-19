1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int p = nums.length -1;
4        for (int i = 0; i <= p  ; i++) {
5            if (nums[i] == val) {
6                nums[i] = nums[p];
7                p--;
8                i--;
9            }
10        }
11        return p + 1;
12    }
13}