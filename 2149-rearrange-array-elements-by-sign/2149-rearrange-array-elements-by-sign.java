class Solution {
    public int[] rearrangeArray(int[] nums) {
        int evenpos =0;
        int oddneg=1;
        int[] nums2= new int[nums.length];
         for(int i=0;i<nums.length;i++){
            
            if(nums[i]>=0){
                if(evenpos<nums.length){
                nums2[evenpos]=nums[i];
                evenpos+=2;}
            }
             else{
                if(oddneg<nums.length){
                nums2[oddneg]=nums[i];
                oddneg+=2;}
             }
         }
         return nums2;
    }
}