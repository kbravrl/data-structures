class Solution(object):
    def removeDuplicates(self, s, k):
        stack = []

        for char in s:
            if stack and stack[-1][0] == char:
                stack[-1] = (stack[-1][0], stack[-1][1] + 1)

                if stack[-1][1] == k:
                    stack.pop()
            else:
                stack.append((char, 1))

        result = []
        for char, count in stack:
            result.append(char * count)

        return ''.join(result)

