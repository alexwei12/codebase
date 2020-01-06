package com.aw.util;

/**
 * @author weihongyi5
 */
public class Assert {

    public static void assertTrue(boolean b) {
        if (!b) {
            throw new RuntimeException();
        }
    }

    public static void assertFalse(boolean b) {
        if (b) {
            throw new RuntimeException();
        }
    }
}
