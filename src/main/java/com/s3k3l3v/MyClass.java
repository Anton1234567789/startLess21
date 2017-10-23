package com.s3k3l3v;

import java.util.Arrays;

public class MyClass {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a = a && b);
        System.out.println(a = b && a);
        System.out.println(a = b & a);
        System.out.println(a = a & b);

        int x = 20;

        //System.out.println(x = x >> 2); //>> 5.  20/2^2
        System.out.println(x = x << 3); // >> 160. 20*2^3

        int [] arr[] = new int[5][];
        for (int j = 0; j< arr.length; j++){
            arr[j] = new int[j];
            System.out.println(Arrays.deepToString(arr));
        }

        int r = 0, y = 3;
        switch (y){
        case 1: r = 1;
        break;
            case 2: r = 2;
            default: r = 100;
        }
        System.out.println(r);

        int[] arrays = new int[5];
        int[] arrays1 = new int[5];

        System.out.println(arrays[0]);
        System.out.println(arrays1[0]);
    }
}
