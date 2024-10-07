/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

import java.util.Hashtable;

public class LinearProbing {
    // Kapalı çırpılama - linear probing

    public static void main(String[] args) {
        int[] array = {18, 41, 22, 44, 59, 32, 31, 73};
        Hashtable<Integer, Integer> h1 = putValues(array);
        hashFunction(h1, array);
        System.out.println(h1);

    }

    public static void hashFunction(Hashtable<Integer, Integer> h1, int[] array) {
        for (int i = 0; i < array.length; i++) {
            int remainder = array[i] % array.length;
            if (h1.get(remainder) == 0) {
                h1.replace(remainder, array[i]);
            } else {
                for (int j = 1; j < array.length; j++) {
                    remainder = (remainder + i) % array.length;
                    if (h1.get(remainder) == 0) {
                        h1.replace(remainder, array[i]);  
                        break;
                    }
                }
            }
        }
    }

    public static Hashtable<Integer, Integer> putValues(int[] array) {
        Hashtable<Integer, Integer> h1 = new Hashtable<>();
        for (int i = 0; i < array.length; i++) {
            h1.put(i, 0);
        }
        return h1;
    }
}
