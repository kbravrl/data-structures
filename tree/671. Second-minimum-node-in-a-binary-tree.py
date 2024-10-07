class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution(object):
    def findSecondMinimumValue(self, root):
        def dfs(root):
            if root:
                uniques.add(root.val)
                dfs(root.left)
                dfs(root.right)

        uniques = set()
        dfs(root)

        if len(uniques) < 2:
            return -1

        first_min_val = min(uniques)
        uniques.remove(first_min_val)

        return min(uniques)



