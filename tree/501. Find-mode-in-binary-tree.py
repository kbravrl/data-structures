class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution(object):
    def findMode(self, root):
        if root is None:
            return []

        def inorder_traversal(node):
            if node:
                inorder_traversal(node.left)
                counts[node.val] = counts.get(node.val, 0) + 1
                inorder_traversal(node.right)

        counts = {}
        inorder_traversal(root)

        max_count = max(counts.values())
        max_val = [key for key, value in counts.values if value == max_count]
        return max_val
