class Solution(object):
    def decodeString(self, s):
        stack_num = []
        stack_str = []
        current_str = ""
        current_num = ""

        for char in s:
            if char.isdigit():
                current_num += char
            elif char == '[':
                stack_num.append(int(current_num))
                stack_str.append(current_str)
                current_num = ""
                current_str = ""
            elif char == ']':
                num = stack_num.pop()
                prev_str = stack_str.pop()
                current_str = prev_str + current_str * num
            else:
                current_str += char

        return current_str