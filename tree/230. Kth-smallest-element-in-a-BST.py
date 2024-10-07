class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution(object):
    def kthSmallest(self, root, k):
        def inorderTraversal(root):
            if root is None:
                return []
            return inorderTraversal(root.left) + [root.val] + inorderTraversal(root.right)

        inorder_list = inorderTraversal(root)

        return inorder_list[k - 1]
