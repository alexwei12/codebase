package algorithm;

/**
 * 计算一个整数的二进制数里有多少个1
 * 思路：
 *   10000 & 01111 一个2的n次方的数，比它小1的数做与运算，刚好等于0
 *   一个整数等于若干个 2的n次方相加
 *   一个整数有n个1 就按以上的与运算n次即可
 */
public class Count1 {

    private static int c(int i) {
        int in = i;
        int count = 0;
        while (in != 0) {
            count++;
            // a___b
            in = in & (in - 1);
            System.out.println("step : " + in);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(c(1));
        System.out.println(c(2));
        System.out.println(c(3));
//        System.out.println(c(15));
//        System.out.println(c(32));
        System.out.println(c(2345));
    }
}



