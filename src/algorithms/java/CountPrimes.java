package algorithms.java;

/**
 * @Author: respass
 * @Date: 2019
 */
public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n];
        int count = 0;
        for (int i = 2; i*i < n; i++) {
            if (!notPrimes[i]) {
                for (int j = i*i; j < n; j += i) notPrimes[j] = true;
            }
        }
        for (int i = 2; i < n; i++) {
            if (!notPrimes[i]) count++;
        }
        return count;
    }
}
