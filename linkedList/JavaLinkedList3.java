/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

public class JavaLinkedList3 {

    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        a.next = new ListNode(20);
        a.next.next = new ListNode(30);

        a = addFirst(a, 5);
        a = addAtIndex(a, 2, 35);

        ListNode start = a;
        while (start != null) {
            System.out.println(start.data);
            start = start.next;
        }

        a = remove(a, 1);
        System.out.println("---------------------");

        start = a;
        while (start != null) {
            System.out.println(start.data);
            start = start.next;
        }

    }

    static ListNode addFirst(ListNode b, int value) {
        ListNode c = new ListNode(value, b);
        return c;
    }

    static ListNode addAtIndex(ListNode b, int index, int value) {
        ListNode c = b;
        for (int i = 1; i < index; i++) {
            c = c.next;
        }
        ListNode add = new ListNode(value, c.next);
        c.next = add;
        return b;
    }

    static ListNode remove(ListNode b, int index) {
        ListNode c = b;
        for (int i = 1; i < index; i++) {
            c = c.next;
        }
        c.next = c.next.next;
        return b;
    }

}
