class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        
        // Step 1: Compute the prefix sum matrix
        int[][] prefix = new int[m][n];
        
        // Copy mat into prefix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                prefix[i][j] = mat[i][j];
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=1;j<mat[0].length;j++){
                prefix[i][j]+=prefix[i][j-1];
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int sum=0;
                int s=i-k;
                if(i-k<0) s=0;
                for(int l=s;l<mat.length && l<=i+k;l++){
                    if((j-k)>0 && (j+k)<mat[0].length) {
                    sum+=prefix[l][j+k]-prefix[l][j-k-1];
                    }
                    else if((j-k)>0){
                        sum+=prefix[l][mat[0].length-1]-prefix[l][j-k-1];
                    }
                     else if((j+k)<mat[0].length){
                        sum+=prefix[l][j+k];
                     }
                      else {
                        sum+=prefix[l][mat[0].length-1];
                      }
                }
                mat[i][j]=sum;
            }
        }
        return mat;

    }
}