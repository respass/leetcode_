package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class DecodeWays {

//    public int numDecodings(String s) {
//        if(s==null||s.length()==0){
//            return 0;
//        }
//        if(s.charAt(0)=='0'){
//            return 0;
//        }
//        int [] dp = new int[s.length()+1];
//        dp[0] = 1;
//        dp[1] = 1;
//        for(int i=2;i<s.length()+1;i++){
//            char first = s.charAt(i-2);
//            char second = s.charAt(i-1);
//            if(second!='0'){
//                dp[i] += dp[i-1];
//            }
//            if(first=='1'){
//                dp[i] += dp[i-2];
//            }
//            if(first=='2'&&second<='6'){
//                dp[i] += dp[i-2];
//            }
//        }
//        return dp[s.length()];
//
//    }

    public int numDecodings(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        if(s.charAt(0)=='0'){
            return 0;
        }
        int [] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<s.length()+1;i++){
            char first = s.charAt(i-2);
            char second = s.charAt(i-1);
            if(second!='0'){
                dp[i] += dp[i-1];
            }
            if(first=='1'){
                dp[i] += dp[i-2];
            }
            if(first=='2'&&second<='6'){
                dp[i] += dp[i-2];
            }
        }
        return dp[s.length()];

    }
}
