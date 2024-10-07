class Solution(object):
    def replaceElements(self, arr):
        n = len(arr)
        for i in range(n-1):
            arr[i] = max(arr[i+1:])
        arr[-1] = -1
        return arr


     
