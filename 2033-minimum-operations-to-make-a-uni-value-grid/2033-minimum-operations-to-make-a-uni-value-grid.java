class Solution {
    public int minOperations(int[][] grid, int x) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
         int imp= grid[0][0]%x;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j]%x!=imp) return -1;
                pq.add(grid[i][j]);

            }
        }
         int m= grid.length;
         int n= grid[0].length;
         int [] arr=new int[m*n];
          int u=0;
         while(!pq.isEmpty()){
             arr[u++]=pq.poll();
         }
         int median=arr[arr.length/2];
         int op=0;
         for(int num : arr){
            op+=Math.abs(num-median)/x;
         }

         return op;
    }
}