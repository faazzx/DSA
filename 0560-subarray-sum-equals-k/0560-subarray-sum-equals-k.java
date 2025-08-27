class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int total =0;
         int count=0;
         map.put(0,1);
        int size= nums.length;
        for(int i=0;i<size;i++){
            total+= nums[i];
            if(map.containsKey(total-k)){
              count+= map.get(total-k);
            } 

            map.put(total , map.getOrDefault(total , 0)+1);
        }
        return count;
    }
}