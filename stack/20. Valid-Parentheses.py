class Solution(object):
    def isValid(self, s):
        brackets = {')': '(', '}': '{', ']': '['}
        stack = []

        for char in s:
            if char in '({[':
                stack.append(char)

            else:
                if not stack or (brackets[char] != stack.pop()):
                    return False

        return not stack