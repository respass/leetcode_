package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int cur = 0;
        for(int i = 0; i < t.length() && cur < s.length(); i++) {
            if(t.charAt(i) == s.charAt(cur)) {
                cur++;
            }
        }

        return cur == s.length();
    }


//    public boolean isSubsequence(String s, String t) {
//        for (int i = 0, offset = 0; i < s.length(); i++, offset++) {
//            offset = t.indexOf(s.charAt(i), offset);
//            if (offset == -1) return false;
//        }
//        return true;
//    }
}
