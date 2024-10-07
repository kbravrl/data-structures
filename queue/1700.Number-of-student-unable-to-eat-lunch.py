class Solution(object):
    def countStudents(self, students, sandwiches):
        count_0 = students.count(0)
        count_1 = len(students) - count_0

        for sandwich in sandwiches:
            if sandwich == 0 and count_0 > 0:
                count_0 -= 1
            elif sandwich == 1 and count_1 > 0:
                count_1 -= 1
            else:
                break

        return count_0 + count_1