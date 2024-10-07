class Solution(object):
    def findCircleNum(self, isConnected):
        def dfs(node):
            for neighbor in range(len(isConnected)):
                if isConnected[node][neighbor] == 1 and not visited[neighbor]:
                    visited[neighbor] = True
                    dfs(neighbor)

        n = len(isConnected)
        visited = [False] * n
        num_provinces = 0

        for i in range(n):
            if not visited[i]:
                visited[i] = True
                dfs(i)
                num_provinces += 1

        return num_provinces