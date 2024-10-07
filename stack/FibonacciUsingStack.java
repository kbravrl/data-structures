/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Stack;

public class FibonacciUsingStack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        int temp1 = 0;
        int temp2 = 1;
        for (int i=0; i<100; i++) {
            s1.push(temp1);
            s1.push(temp2);
            System.out.println(s1.peek());
            temp1 = s1.peek();
            temp2 = s1.pop()+ s1.pop();  
        }
    }

}

