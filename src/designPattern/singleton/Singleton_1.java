package designPattern.singleton;

/**
 * @Author: respass
 * @Date: 2018
 */
public class Singleton_1 {
    private Singleton_1() {}

    public static Singleton_1 getSingleton() {
        return Holder.singleton;
    }

    private static class Holder {
        private static Singleton_1 singleton = new Singleton_1();
    }
}
