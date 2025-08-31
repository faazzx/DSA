class Solution {
    public int maxProfit(int[] nums) {
        int kharid = nums[0];
        int farokht= 0;
        int size= nums.length;
        for(int i=1;i<size;i++){
            if(nums[i]<kharid){
                kharid=nums[i];
            }
            else if(nums[i]- kharid>farokht){
                farokht = nums[i]-kharid;
            }
        }
         return farokht;
    }
}