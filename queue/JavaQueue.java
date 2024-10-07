/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {

    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        Queue queue = new LinkedList();
        
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.addFirst(0);
        linkedlist.addLast(30);

        while (!linkedlist.isEmpty()) {
            System.out.println(linkedlist.remove());
        }

        System.out.println("----------------");
        queue.add(10);
        queue.add(20);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
