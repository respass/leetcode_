package interview;

/**
 * @Author: respass
 * @Date: 2018
 */
public class ThreadCrossPrint {

    public synchronized void print1() {
        for (int i = 0; i <= 1000 ; i += 2) {
            System.out.println(Thread.currentThread().getName() + ":  " + i);
            this.notify();
            try {
                this.wait();
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }

    public synchronized void print2() {
        for (int i = 1; i <= 1000 ; i += 2) {
            System.out.println(Thread.currentThread().getName() + ":  " + i);
            this.notify();
            try {
                this.wait();
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }



    public static void main(String[] args) {
        ThreadCrossPrint demo = new ThreadCrossPrint();
        new  Thread(new Runnable() {
            @Override
            public void run() {
                demo.print1();
            }
        }, "t1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.print2();
            }
        }, "t2").start();



    }
}
