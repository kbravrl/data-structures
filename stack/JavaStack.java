/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Stack;

public class JavaStack {

    public static void main(String[] args) {
        Stack stack1 = new Stack(); // Using generics

        // Initialization of Stack using Generics
        Stack<String> stack2 = new Stack<>();

        stack1.push(5);
        stack1.push("Merhaba");
        stack1.push("Dünya");

        stack2.push("Hello");
        stack2.push("Merhaba");
        stack2.push("Dünya");
    }
}
