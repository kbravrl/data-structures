class Solution(object):
    def two_sum(self, nums, target):
        nums_indices = {}

        for i, num in enumerate(nums):
            complement = target - num

            if complement in nums_indices:
                return [nums_indices[complement], i]

            nums_indices[num] = i
            

