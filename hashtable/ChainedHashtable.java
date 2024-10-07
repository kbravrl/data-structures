/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

import java.util.*;

public class ChainedHashtable  {

    public static void main(String[] args) {
        Hashtable<Integer, LinkedList<String>> ht = new Hashtable<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Key giriniz (Çıkmak için -1): ");
        int key = input.nextInt();

        while (key != -1) {
            System.out.print("Value giriniz: ");
            String value = input.next();
            if (ht.containsKey(key)) {
                ht.get(key).addFirst(value);
            } else {
                LinkedList<String> link1 = new LinkedList<>();
                link1.addFirst(value);
                ht.put(key, link1);
            }

            System.out.print("Key giriniz (Çıkmak için -1): ");
            key = input.nextInt();
        }
        input.close();
        System.out.println("Size of map is: " + ht.size());
        System.out.println(ht);
    }
}