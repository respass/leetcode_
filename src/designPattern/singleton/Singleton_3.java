package designPattern.singleton;

/**
 * @Author: respass
 * @Date: 2018
 */
public class Singleton_3 {
    private static final Singleton_3 singleton = new Singleton_3();
    private Singleton_3() {}

    public static Singleton_3 getSingleton() {
        return singleton;
    }
}
