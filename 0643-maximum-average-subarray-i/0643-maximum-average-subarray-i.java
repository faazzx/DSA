class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int n= nums.length;
        int window=0;
        int left=0;
         double ans=0;
        if(k>n) return 0;
        for(int  i=0;i<k;i++){
            window+=nums[i];
        }
         double maxAvg = (double) window / k;
        for(int i=k;i<n;i++){
            window-=nums[i-k];
            window+=nums[i];
            maxAvg=(double)Math.max(maxAvg, (double)window/k);
        }
        return maxAvg;


    }
}