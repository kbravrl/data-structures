class Solution(object):
    def maxProduct(self, nums):
        num1, num2 = 0, 0

        for num in nums:
            if num > num1:
                num2 = num1
                num1 = num
            elif num > num2:
                num2 = num

        return (num1-1)*(num2-1)