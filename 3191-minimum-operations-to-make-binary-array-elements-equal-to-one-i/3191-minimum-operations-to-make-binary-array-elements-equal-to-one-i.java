class Solution {
    public int minOperations(int[] nums) {
        int ct=0;
        int i=0;
        while(i<nums.length-2){
            if(nums[i]==0){
                nums[i]=1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                ct++;
            }
            i++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=1) return -1;
        }
         return ct;
    }
}