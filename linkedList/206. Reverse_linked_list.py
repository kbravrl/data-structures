class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def reverseList(self, head):
        new = None
        while head:
            current = head
            head = head.next
            current.next = new
            new = current
        return new
