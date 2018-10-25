package interview;

/**
 * @Author: respass
 * @Date: 2018
 */
public class ThreadCrossPrint_2 {
    static volatile int n = 1;
    static volatile boolean flag = false;


    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (n < 1000) {
                    if (!flag && ( n % 2 != 0)) {
                        System.out.println(Thread.currentThread().getName() + ":  " + n++);
                        flag = !flag;
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {

                    }
                }
            }
        },"t1").start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (n < 1000) {
                    if(flag && (n % 2 == 0)) {
                        System.out.println(Thread.currentThread().getName() + ":  " + n++);
                        flag = !flag;
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {

                    }
                }
            }
        },"t2").start();
    }
}
