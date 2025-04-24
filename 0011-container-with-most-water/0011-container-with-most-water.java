class Solution {
    public int maxArea(int[] nums) {
        int a=0;
        int b=nums.length-1;
        int max=0;
        while(a<b){
            max= Math.max((b-a)*Math.min(nums[a], nums[b]), max);
            if(nums[a]>=nums[b]) b--;
            else{a++;}
        }
        return max;
    }
}