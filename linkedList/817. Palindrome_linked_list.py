class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def isPalindrome(self, head):
        if head is None or head.next is None:
            return True

        def reverseList(head):
            pre = None
            next_node = None

            while head:
                next_node = head.next
                head.next = pre
                pre = head
                head = next_node
            return pre

        slow = head
        fast = head

        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next

        slow.next = reverseList(slow.next)

        slow = slow.next


        while slow:
            if head.val != slow.val:
                return False
            head = head.next
            slow = slow.next
        return True


