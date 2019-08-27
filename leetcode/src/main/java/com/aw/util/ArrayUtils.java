package com.aw.util;

/**
 * Created by alex on 2019/8/26.
 */
public class ArrayUtils {
    public static void printArray(int A[], int n) {
        System.out.print("{");
        for(int i=0; i<n; i++) {
            System.out.print(String.format("%d, ", A[i]));
        }
        System.out.print("}\n");
    }
}
