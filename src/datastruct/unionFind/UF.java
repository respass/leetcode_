package datastruct.unionFind;

/**
 * @Author: respass
 * @Date: 2018
 */
public interface UF {
    int getSize();
    boolean isConnected(int p, int q);
    void unionElements(int p, int q);
}
