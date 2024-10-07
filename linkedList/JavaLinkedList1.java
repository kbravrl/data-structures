/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

public class JavaLinkedList1 {

    public static void main(String[] args) {

        ListNode a = new ListNode(10);
        a.next = new ListNode(20);
        a.next.next = new ListNode(30);

        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);

    }

}
