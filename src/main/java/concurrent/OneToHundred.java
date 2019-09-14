package concurrent;

public class OneToHundred {

    private static int count = 0;

    private static final Object lock = new Object();

    public static void main(String[] args) {

        new Thread(new AddRunner(0)).start();
        new Thread(new AddRunner(1)).start();
        new Thread(new AddRunner(2)).start();

    }

    static class AddRunner implements Runnable {
        private int tNo = -1;
        public AddRunner(int tNo) {
            this.tNo = tNo;
        }

        public void run() {
            while (count <= 100) {
                synchronized (lock) {
                    try {
                        while (count <= 100 && count % 3 != tNo) {
                            lock.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "- " + count);
                    count++;
                    lock.notifyAll();
                }
            }
        }
    }
}
