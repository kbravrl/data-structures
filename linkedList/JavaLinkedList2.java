/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

public class JavaLinkedList2 {

    public static void main(String[] args) {

        ListNode a = new ListNode(10);
        ListNode b = new ListNode(30);
        ListNode c = new ListNode(20);
        ListNode d = new ListNode(40);

        // a->c->b->d şeklinde bağlamak istiyoruz.
        a.next = c;
        c.next = b;
        b.next = d;

        ListNode start = a;
        while (start != null) {
            System.out.println(start.data);
            start = start.next;
        }

    }

}
