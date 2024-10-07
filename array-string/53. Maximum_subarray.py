class Solution(object):
    def maxSubArray(self, nums):
        if not nums:
            return 0
    
        max_sum = current_sum = nums[0]
    
        for num in nums[1:]:
            current_sum = max(num, current_sum + num)
            max_sum = max(max_sum, current_sum)
        
        return max_sum
    
solution_instance = Solution()
nums = [-2,1,-3,4,-1,2,1,-5,4]
result = solution_instance.maxSubArray(nums)
print(result)