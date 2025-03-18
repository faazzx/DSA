class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap <Integer, Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int z= hash.getOrDefault(nums[i],0);
            if(z>=2) return false;
            hash.put(nums[i], hash.getOrDefault(nums[i],0)+1);
        }
        
         return true;
    }
}