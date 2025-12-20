1import java.util.Map;
2import java.util.HashMap;
3
4class Solution {
5    public void rotate(int[] nums, int k) {
6        Map<Integer, Integer> dict = new HashMap<>(); 
7        int n = nums.length;
8        for(int i = 0; n > i; i++) {
9            dict.put(i, nums[i]);
10        }
11        int newIdx = 0;
12        for(int idx = 0; n > idx; idx++) {
13            int val = dict.get(idx); 
14            if ((idx + k) >= n) {
15                newIdx = (idx + k) % n;
16                nums[newIdx] = val;
17            } 
18            if ((idx + k) < n) {
19                newIdx = idx + k;
20                nums[newIdx] = val;
21            }
22        }
23    }
24}