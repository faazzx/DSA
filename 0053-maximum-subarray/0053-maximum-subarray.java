class Solution {
    public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int mul=0;
        int i=0;
        while(i<nums.length){
            mul=mul+nums[i];
            ans=Math.max(ans,mul);
            if(mul<0) mul=0;
            i++;
        }
        return ans;
    }
}