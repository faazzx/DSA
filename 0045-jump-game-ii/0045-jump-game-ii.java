class Solution {
    public int jump(int[] nums) {
        if(nums.length<=1) return 0;
        int jumps=0;
        int ch=0;
        int farthest= 0;
        for(int i=0;i<nums.length;i++){
            farthest= Math.max(farthest, i+nums[i]);
            if(i==ch){
                jumps++;
                ch=farthest;
                if(ch>=nums.length-1) break;
            }
        }
         return jumps;
        
    }
}