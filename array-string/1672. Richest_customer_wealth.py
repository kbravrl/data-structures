class Solution(object):
    def maximumWealth(self, accounts):
        return max([sum(i) for i in accounts])
    
class Solution(object):
    def maximumWealth(self, accounts):
        max_1 = 0
        for i in accounts:
            max_1 = max(sum(i), max_1)
        return max_1