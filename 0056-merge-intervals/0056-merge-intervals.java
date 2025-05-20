class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        ArrayList<int[]> fina= new ArrayList<>();
        int [] arr= new int[2];
        arr[0]=intervals[0][0];
        arr[1]=intervals[0][1];
        for(int i=1; i<intervals.length;i++){
            if(intervals[i][0]>arr[1]){
                fina.add(arr);
                arr=intervals[i];
                //arr[1]=intervals[i][1];
            }
            else{
                arr[1]= Math.max(intervals[i][1],arr[1]);
            }
        }
        fina.add(arr);
          return fina.toArray(new int[fina.size()][]);
    }
}