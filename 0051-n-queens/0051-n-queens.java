class Solution {
    List<List<String>> arr= new ArrayList<>();
        List<String> ar= new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        
        int[][]matrix=new int[n][n];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=0;
            }
        }
        int marker =0;
        int row=0;
        String s="";
        solver(ar,arr,row, matrix,n, marker);
        return arr;

    }
    void solver(List<String> ls,List<List<String>> arr, int row, int[][]matrix, int n, int marker){
            if(row==n-1){
                StringBuilder sb= new StringBuilder();
                   for(int i=0;i<n ;i++){
                      sb.append(".");
                }
                for(int i=0;i<n;i++){
                    
                    if(matrix[row][i]>=0){
                        
                        sb.setCharAt(i, 'Q');
                        ls.add(sb.toString());
                        arr.add(ls);
                         return ;
                        
                    }   
                }
            }
            
            
            for(int i=0;i<n ;i++){
                if(matrix[row][i]>-1){
                   StringBuilder sb= new StringBuilder();
                     for(int p=0;p<n ;p++){
                     sb.append(".");
                        }
                    sb.setCharAt(i, 'Q');
                    List<String> ls2= new ArrayList<>(ls);
                    ls2.add(sb.toString());
                     marker--;
                     
                     for(int j=0;j<n;j++){
                        for(int k=0;k<n;k++){
                            if(matrix[j][k]<0){}
                            else if(j==row || i==k || row+i==j+k || row-i==j-k){
                                matrix[j][k]=marker;
                            }
                            
                        }
                     } 
                     matrix[row][i]=5;
                     solver(ls2,arr,row+1,matrix,n,marker);
                     for(int j=0;j<n;j++){
                        for(int k=0;k<n;k++){
                            if(matrix[j][k]==marker){
                                matrix[j][k]=0;
                            }
                            
                        }
                     }
                     marker++;
                }
                
                
            }
    }

}