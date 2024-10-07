class Solution(object):
    def maxProfit(self, prices):
        min_price = prices[0]
        max_price = 0
        
        for price in prices:
            min_price = min(min_price, price)
            max_price = max(max_price, price - min_price)

        return max_price

solution_instance = Solution()
prices = [7, 2, 4, 3, 9]
result = solution_instance.maxProfit(prices)
print(result)