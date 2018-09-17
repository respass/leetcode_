package designPattern.singleton;

/**
 * @Author: respass
 * @Date: 2018
 */
public class Singleton_2 {

    private static volatile Singleton_2 singleton = null;
    private Singleton_2() {}

    public static Singleton_2 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton_2.class) {
                if (singleton == null) {
                    singleton = new Singleton_2();
                }
            }
        }
        return singleton;
    }
}
