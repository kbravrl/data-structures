class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def reverseList(self, head):
        prev = None
        current = head

        while current:
            next_node = current.next
            current.next = prev
            prev = current
            current = next_node

        return prev

    def findMiddle(self, head):
        slow = head
        fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        return slow

    def reorderList(self, head):
        if not head or not head.next:
            return head

        middle = self.findMiddle(head)
        second_half = middle.next
        middle.next = None

        second_half = self.reverseList(second_half)

        current = head
        while second_half:
            next_node = current.next
            current.next = second_half
            second_half = second_half.next
            current.next.next = next_node
            current = next_node

        return head
