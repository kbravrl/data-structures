class Solution(object):
    def kWeakestRows(self, mat, k):
        m = len(mat)
        soldiers = sorted(range(m), key=lambda i: sum(mat[i]))

        return soldiers[:k]