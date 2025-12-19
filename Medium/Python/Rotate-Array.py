1class Solution(object):
2    def rotate(self, nums, k):
3        dic = dict(enumerate(nums)) # create dict of array ex) { (0,1), (1,2) ....}
4        n = len(nums) # max length 
5        for idx in dic:
6            val = dic.get(idx) # get val from dic 
7            if (idx + k) >= n: #if out of bounds use mod for positioning 
8                newIdx = (idx + k) % n  
9                nums[newIdx] = val # update positioning on array in place 
10            elif (idx + k < n): # if in bounds 
11                newIdx = idx + k # add idx + k
12                nums[newIdx] = val # update positioning on array in place 
13
14            