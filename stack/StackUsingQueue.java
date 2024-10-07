/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.*;

public class StackUsingQueue {

    static class Stack {

        static Queue<Integer> q1 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();
        static int curr_size;

        Stack() {
            curr_size = 0;
        }

        static void push(int x) {
            curr_size++;
            // Push x first in empty q2
            q2.add(x);

            // Push all the remaining elements in q1 to q2.
            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }

            // swap the names of two queues
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }

        static int pop() {
            if (q1.isEmpty()) {
                return -1;
            } else {
                curr_size--;
                return q1.remove();
            }
        }

        static int top() {
            if (q1.isEmpty()) {
                return -1;
            }
            return q1.peek();
        }

        static int size() {
            return curr_size;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        System.out.println("-----------------------------");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println("current size: " + s.size());
        System.out.println(s.top());

    }
}
