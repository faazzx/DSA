class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> h= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(h.containsKey(c) && h.get(c)!=i){
                 return new int[] { h.get(c),i};
            }
        } return new int[] {0};
    }
}