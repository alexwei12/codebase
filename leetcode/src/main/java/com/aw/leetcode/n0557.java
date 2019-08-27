package com.aw.leetcode;

/**
 * Created by 115477 on 2019/8/27.
 */
public class n0557 {

    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();

        int b = 0;
        for (int i= 0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c == ' ' || i == s.length() - 1) {
                String sub = s.substring(b, i == s.length() - 1 ? i + 1 : i);
                char[] cs = sub.toCharArray();
                reverseString(cs);
                sb.append(cs);
                if (c == ' ') {
                    sb.append(' ');
                }

                b = i + 1;
            }
        }

        return sb.toString();
    }


    public static void reverseString(char[] s) {

        int b = 0;
        int e = s.length - 1;
        while (e >= b) {
            char tp = s[b];
            s[b] = s[e];
            s[e] = tp;

            e--;
            b++;
        }
    }
}
