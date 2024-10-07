import heapq

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def mergeKLists(lists):
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


list_nodes = [ListNode(val) for val in [1, 4, 5]], [ListNode(val) for val in [1, 3, 4]], [ListNode(val) for val in
                                                                                          [2, 6]]
for i in range(len(list_nodes)):
    for j in range(len(list_nodes[i]) - 1):
        list_nodes[i][j].next = list_nodes[i][j + 1]
merge_list = mergeKLists(list_nodes)

while merge_list:
    print(merge_list.val, end="->")
    merge_list = merge_list.next
