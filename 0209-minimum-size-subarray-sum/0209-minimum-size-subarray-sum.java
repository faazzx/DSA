class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n= nums.length, window=0, left=0, ans = n+1;
        for(int right=0;right<n; right++){
            window+=nums[right];
            while(window>=target){
                ans= Math.min(ans, right-left+1);
                window-=nums[left++];
            }

        }
        return ans==n+1?0:ans;
    }
}