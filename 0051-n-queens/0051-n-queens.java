class Solution {
    List<List<String>> arr= new ArrayList<>();
    //List<String> ar= new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        int[][]matrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=0;
            }
        }
        int row=0;
        solver(arr,row, matrix,n);
        return arr;

    }
    void solver(List<List<String>> arr, int row, int[][]matrix, int n){
            if(row==n-1){
                for(int l=0;l<n;l++){
                    if(matrix[row][l]!=-1){
                    List<String> ar1= new ArrayList<>();
                        for(int i=0;i<n;i++){
                            
                            String s="";
                            for(int j=0;j<n;j++){
                                  if(matrix[i][j]==-1){
                                    s=s+".";
                                  }
                                  else{
                                    s=s+"Q";
                                  }
                            }
                            ar1.add(s);
                            
                        }
                        arr.add(ar1);
                    }
                }
                return ;
            }
            
            for(int i=0;i<n ;i++){
                if(matrix[row][i]!=-1){
                    
                    int[][] copy = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
                     // marking new matrix with numbers
                     
                     for(int j=0;j<n;j++){
                        for(int k=0;k<n;k++){
                            if(j==row || i==k || row+i==j+k || row-i==j-k){
                                copy[j][k]=-1;
                            }
                        }
                     }
                     copy[row][i]=5;
                     solver(arr,row+1,copy,n);
                }
                
            }
    }

}