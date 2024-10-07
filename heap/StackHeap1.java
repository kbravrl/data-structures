/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackheap;

import java.util.Arrays;

public class StackHeap1 {

    public static void main(String[] args) {
        Integer sayi1 = new Integer(7);
        Integer sayi2 = sayi1;
        sayi2++;
        System.out.println("sayi2 is " + sayi2);
        System.out.println("sayi1 is " + sayi1);

        Integer[] sayi1_array = new Integer[3];
        sayi1_array[0] = 1;
        sayi1_array[1] = 2;
        sayi1_array[2] = 3;
        Integer[] sayi2_array = sayi1_array;
        sayi2_array[1] = 10;

        System.out.println("sayi1_array is " + Arrays.toString(sayi1_array));
        System.out.println("sayi2_array is " + Arrays.toString(sayi2_array));

        int[] sayi3_array = {1, 2, 3};
        int[] sayi4_array = sayi3_array;
        sayi4_array[1] = 20;

        System.out.println("sayi3_array is " + Arrays.toString(sayi3_array));
        System.out.println("sayi4_array is " + Arrays.toString(sayi4_array));

        String[] str1_array = {"aaa", "bbb", "ccc"};
        String[] str2_array = str1_array;
        str2_array[1] = "zzz";

        System.out.println("str1_array is " + Arrays.toString(str1_array));
        System.out.println("str2_array is " + Arrays.toString(str2_array));

        StringBuilder sb1 = new StringBuilder("merhaba");
        StringBuilder sb2 = sb1;
        sb2.setCharAt(1, 'z');
        System.out.println("sb2 is " + sb2);
        System.out.println("sb1 is " + sb1);

        StringBuilder str = new StringBuilder("JavaLanguage");
        StringBuilder str2 = str;
        str2.append('A');
        System.out.println("str is " + str);
        System.out.println("str2 is " + str2);
    }
}
