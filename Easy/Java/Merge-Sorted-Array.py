1class Solution(object):
2    def merge(self, nums1, m, nums2, n):
3        i =  m - 1 # end of nums 1 
4        j =  n - 1 # end of nums 2 
5        k = m + n - 1 # end of answer  
6        while j >= 0:  # while nums 2 not empty 
7            if i >= 0 and nums1[i] > nums2[j]: # still stpace in 1, and n1>n2
8                nums1[k] = nums1[i]  # put num1 as answer in answer
9                i -= 1 # go down 
10            else: # n2 > n1 
11                nums1[k] = nums2[j]  # Move nums2[j] to the correct position
12                j -= 1 #decremnt j 
13            k -= 1  # move over 1 
14        return nums1 
15        