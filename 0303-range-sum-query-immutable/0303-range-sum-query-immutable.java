class NumArray {
    int []sum;
    public NumArray(int[] nums) {
         sum= new int[nums.length];
         if(nums.length>0) sum[0]=nums[0];
         
            for(int i=1;i<nums.length;i++){
                sum[i]=sum[i-1]+nums[i];
            
         } 
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return sum[right];
        return sum[right]-sum[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */