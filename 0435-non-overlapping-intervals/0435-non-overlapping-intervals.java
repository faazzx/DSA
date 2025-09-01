class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       Arrays.sort(intervals, Comparator.comparing(a-> a[1]));
       int count=0;
       int last =0;
       for(int i=1;i<intervals.length;i++){
       
             if(intervals[i][0] <intervals[last][1]){
                count++;

             }
             else{
                last=i;
             }
        
       }
       return count;
    }
}