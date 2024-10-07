/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tree;

public class Tree {
 
    static class Node {    
    int value; 
        Node left, right; 
          
        Node(int value){ 
            this.value = value; 
            left = null; 
            right = null; 
        } 
    } 
       
    public void insert(Node node, int value) {
        if (value < node.value) { 
            if (node.left != null) 
            { insert(node.left, value); } 
            else 
            { System.out.println(" Inserted " + value + " to left of " + node.value); 
            node.left = new Node(value); 
            }
        } 
        else if (value > node.value) {
          if (node.right != null) {
            insert(node.right, value);
          } 
          else {
            System.out.println("  Inserted " + value + " to right of "
                + node.value);
            node.right = new Node(value);
          }
        }
      }
     public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
     }
     
     public void traversePreOrder(Node node) {
    if (node != null) {
        System.out.print(" " + node.value);
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }
}
     
     public void traversePostOrder(Node node) {
    if (node != null) {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.print(" " + node.value);
    }
}
     
     public static void main(String args[]) 
    { 
    Tree tree = new Tree();
                Node root = new Node(5);
                System.out.println("Binary Tree Example");
                System.out.println("Building tree with root value " + root.value);
                
                tree.insert(root, 2);
                tree.insert(root, 4);
                tree.insert(root, 8);
                tree.insert(root, 6);
                tree.insert(root, 7);
                tree.insert(root, 3);
                tree.insert(root, 9);
                
                //tree.insert(root, 3);
                //tree.insert(root, 2);
                //tree.insert(root, 4);
                //tree.insert(root, 8);
                //tree.insert(root, 7);
                //tree.insert(root, 9);
                
                System.out.println("Traversing tree preorder");
                tree.traversePreOrder(root);
                System.out.println("\n");
                System.out.println("Traversing tree inorder");
                tree.traverseInOrder(root);
                System.out.println("\n");
                System.out.println("Traversing tree postorder");
                tree.traversePostOrder(root);
                System.out.println("\n");
                
              }
}
   
