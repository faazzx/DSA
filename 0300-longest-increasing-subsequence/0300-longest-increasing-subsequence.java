class Solution {
    public int lengthOfLIS(int[] nums) {
        int a= nums.length;
        int [] lis= new int[a];
        lis[0]=1;
        for(int i=1;i<a;i++){
            lis[i]=1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    lis[i]=Math.max(lis[i],lis[j]+1);
                }
            }
        }
        int max=1;
        for(int i=0;i<a;i++){
            max=Math.max(max, lis[i]);
        }
         return max;
    }
}