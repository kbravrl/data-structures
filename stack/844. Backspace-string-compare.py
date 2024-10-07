class Solution(object):
    def backspaceCompare(self, s, t):
        def build(l):
            stack = []
            for char in l:
                if char != '#':
                    stack.append(char)
                elif stack:
                    stack.pop()
            return "".join(stack)

        return build(s) == build(t)