class Solution {
     int a=0;
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
         
         return solver( dp , 0 , 0, m , n);
    }



    public int solver(int[][] dp , int i , int j , int m , int n){
        if( i==m-1 && j==n-1) {
            return 1;
        }
        if(i==m ||  j== n) return 0;

        if(dp[i][j]==0){

            int down = solver(dp, i+1, j,m,n);
            int left= solver(dp, i,j+1, m,n);
            dp[i][j]= down+left;
        return dp[i][j];
        }
        else{
            return dp[i][j];
        }
        
         
        
        
       
    }
}