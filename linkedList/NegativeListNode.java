/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedList;

public class NegativeListNode {
    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(-40);
        ListNode e = new ListNode(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        ListNode start = a;

        int index = 1;

        while(start.next != null){
            start = start.next;
            if(start.data < 0){
                remove(a, index);
                a = addFirst(a,start.data);
            }
            index++;
        }

        start = a;

        System.out.println("---------------------");

        while(start != null){
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
        for(int i = 1; i<index; i++) {
            c = c.next; }
        ListNode add = new ListNode(value, c.next);
        c.next = add;
        return b;
    }

    static ListNode remove(ListNode b, int index) {
        ListNode c = b;
        for(int i = 1; i<index; i++) {
            c = c.next; }
        c.next = c.next.next;
        return b;
    }
}

