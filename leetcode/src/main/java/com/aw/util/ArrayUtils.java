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

    public static boolean arrayEqual(int[] n1, int[] n2) {


        for (int i=0;i<n1.length;i++) {
            if (n1[i]!= n2[i]) {
                return false;
            }
        }
        return true;
    }


    public static boolean arrayEqual(char[] n1, char[] n2) {


        for (int i=0;i<n1.length;i++) {
            if (n1[i]!= n2[i]) {
                return false;
            }
        }
        return true;
    }


}
