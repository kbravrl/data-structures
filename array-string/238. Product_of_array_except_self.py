class Solution(object):
    def productExceptSelf(self, nums):
        n = len(nums)
        result = [1] * n

        # Compute left products
        left = 1
        for i in range(n):
            result[i] = left
            left *= nums[i]

        # Compute right products and multiply with left products
        right = 1
        for i in range(n - 1, -1, -1):
            result[i] *= right
            right *= nums[i]

        return result