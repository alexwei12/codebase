package performance;

public class SumApp1 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        long sum = 0;
        for (int i=0;i<=100000000;i++) {
            sum += i;
        }
        System.out.println("elapsed =  "+(System.currentTimeMillis() - start));
        System.out.println("sum =  "+sum);
    }
}
