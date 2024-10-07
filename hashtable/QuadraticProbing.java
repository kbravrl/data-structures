/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hashtable;

import java.util.Hashtable;

public class QuadraticProbing {
    // kapalı çırpılama - quadratic probing
    
    public static void main(String[] args) {
        int[] array = {29,16,14,99,127};
        Hashtable<Integer,Integer> h1 = putValues(array);
        hashFunction(h1, array);
        System.out.println(h1);
    }
    
    public static void hashFunction(Hashtable<Integer, Integer> h1, int[] array) {
        for (int i = 0; i < array.length; i++) {
            int remainder = array[i] % array.length;
            if (h1.get(remainder) == 0) {
                h1.replace(remainder, array[i]);
                System.out.println(remainder);
            } else {
                for (int j = 1; j < array.length; j++) {
                    remainder = (remainder + (j*j)) % array.length ;
                    
                    if (h1.get(remainder) == 0) {
                        h1.replace(remainder, array[i]); 
                        System.out.println(remainder);
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
