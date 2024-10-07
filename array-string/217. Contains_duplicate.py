class Solution(object):
    def containsDuplicate(self, nums):
        seenElements = set()
        for num in nums:
            if num in seenElements:
                return True
        
            seenElements.add(num)
        return False


solution_instance = Solution()
nums = [1,2,3,1]
result = solution_instance.containsDuplicate(nums)
print(result)