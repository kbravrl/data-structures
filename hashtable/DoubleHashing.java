/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hashtable;

import java.util.Hashtable;

public class DoubleHashing {
    // double hashing - ikili hasing
    
    public static void main(String[] args) {
        int[] array ={47,35,36,129,25,2501,65,34,23,78,11,13,24,46,90};
        Hashtable <Integer,Integer> h1 = putValues(array);
        hashFunction(h1, array, 11);
        System.out.println(h1);
        
    }
    
    public static void hashFunction(Hashtable<Integer,Integer> h1, int[] array, int num){
        for(int i=0;i<array.length;i++){
            int hash1 = array[i] % array.length;
            if(h1.get(hash1)==0)
                h1.replace(hash1,array[i]);
            else{
                for(int j =1; j<array.length; j++){
                    int hash2 = num - (array[i] %num);
                    int hash3 = (hash1+j*hash2)%array.length;
                    if(h1.get(hash3)==0) {
                        h1.replace(hash3, array[i]);
                        break;
                    }     
                }
            }
        }
        
    }

    public static Hashtable<Integer,Integer> putValues(int[] array) {
        Hashtable<Integer,Integer> h1 = new Hashtable<>();
        for(int i=0; i<array.length;i++)
            h1.put(i,0);
        return h1;
    }
}
