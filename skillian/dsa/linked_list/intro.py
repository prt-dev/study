class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None


node0 = Node(0)
node1.prev = None
node1.next = node1

node1 = Node(1);
node1.prev = node0
node1.next = node2

node2 = Node(2)
node2.prev = node1
node2.next = node3

node3 = Node(3)
node3.prev = node2
node3.next = node4


node4 = Node(4)
node4.prev = node3
node4.next = None


class Solution:
    def reverseList(self, head: nodeList | None) -> nodeList | None:
        node = nodeList