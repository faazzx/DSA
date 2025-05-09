class Solution {
    public int fib(int n) {
        int [] dp= new int [n+1];
         Arrays.fill(dp, -1);
         solver(dp , n);
         return dp[n];

    }
    int solver(int[] dp , int n){
        if( dp[n]!=-1){
            return dp[n];
        
    }
    else {
        if(n==0 || n==1){
            dp[n]=n;
        }
        else {
            
              dp[n]=solver(dp, n-1)+solver(dp, n-2);
            
        }
         return dp[n];
    }
    }
}