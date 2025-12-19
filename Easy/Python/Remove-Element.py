1class Solution(object):
2    def removeElement(self, nums, val):
3        k = 0  # point 
4        for i in range(len(nums)): # i is value not index 
5            if nums[i] != val: #curr not val 
6                nums[k] = nums[i]  # shift to k 
7                k += 1 #inc
8        return k  # New length of nums without `val` elements