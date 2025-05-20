class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0 || intervals[0].length==0){
             int[][] ne= new int[1][2];
              ne[0][0]=newInterval[0];
              ne[0][1]=newInterval[1];
               return ne;
        }
        int [][] n= new int[intervals.length+1][intervals[0].length];
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<intervals[0].length;j++){
                n[i][j]= intervals[i][j];
            }
        }
        
        n[intervals.length][0]= newInterval[0];
        n[intervals.length][1]= newInterval[1];
         Arrays.sort(n, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        ArrayList<int[]> fina= new ArrayList<>();
        int [] arr= new int[2];
        arr[0]=n[0][0];
        arr[1]=n[0][1];
        for(int i=1; i<n.length;i++){
            if(n[i][0]>arr[1]){
                fina.add(arr);
                arr=n[i];
                //arr[1]=intervals[i][1];
            }
            else{
                arr[1]= Math.max(n[i][1],arr[1]);
            }
        }
        fina.add(arr);
          return fina.toArray(new int[fina.size()][]);
    }
}