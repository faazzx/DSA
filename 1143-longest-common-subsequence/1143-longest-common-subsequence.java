class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        return solver(text1, text2, text1.length(),text2.length(), dp);
       
    }

    int solver(String s1, String s2, int m , int n, int[][]dp){
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(m==0 || n==0) dp[m][n]=0;
        else{
            if(s1.charAt(m-1)==s2.charAt(n-1)){
                dp[m][n]= 1+solver(s1,s2, m-1, n-1,dp);
            }
            else{
                dp[m][n]= Math.max(solver(s1,s2,m,n-1,dp),solver(s1,s2,m-1,n,dp));
            }
        }
        return dp[m][n];

    }
}