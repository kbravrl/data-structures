class Solution(object):
    def romanToInt(self, s):
        roman_to_integer = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }
        total = 0
        s = s.replace('IV', 'IIII').replace('IX', 'VIIII').replace('XL', 'XXXX')
        s = s.replace('XC', 'LXXXX').replace('CD', 'CCCC').replace('CM', 'DCCCC')

        return sum(map(lambda x: roman_to_integer[x], s))
