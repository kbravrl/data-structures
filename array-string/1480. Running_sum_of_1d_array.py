class Solution(object):
    def runningSum(self, nums):
        n = len(nums)
        result= [0] * n
        result[0] = nums[0]

        for i in range(1,n):
            result[i] = nums[i] + result[i-1] 
        return result
    
