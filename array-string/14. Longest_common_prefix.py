class Solution(object):
    def longestCommonPrefix(self, strs):
        s = strs[0]
        for i in range(len(strs[0])):
            for j in strs[1:]:
                if i == len(j) or s[i] != j[i]:
                    return s[0:i]

        return s