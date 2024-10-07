import heapq

class ListNode(object):
     def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def mergeKLists(self, lists):
        dummy = ListNode(0)
        current = dummy
        heap = []

        for lst in lists:
            if lst:
                heapq.heappush(heap, (lst.val, lst))

        while heap:
            val, node = heapq.heappop(heap)
            current.next = node
            current = current.next
            if node.next:
                heapq.heappush(heap, (node.next.val, node.next))

        return dummy.next
