package com.aw.leetcode;

import com.aw.util.Assert;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author weihongyi5
 */
public class n0020 {

    private static Map<Character, Character> m = new HashMap<>();
    {
        {
            m.put(']','[');
            m.put('}','{');
            m.put(')','(');
        }
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (m.containsKey(c)) {
                char top = stack.isEmpty() ? '#' : stack.pop();

                if (!m.get(c).equals(top)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }


        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Assert.assertTrue(new n0020().isValid("()[]{}"));
        Assert.assertFalse(new n0020().isValid("(]"));
        Assert.assertFalse(new n0020().isValid("([)]"));
        Assert.assertTrue(new n0020().isValid("{[]}"));
    }
}
