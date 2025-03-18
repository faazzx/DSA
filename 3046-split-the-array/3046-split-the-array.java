class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap <Integer, Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i], hash.getOrDefault(nums[i],0)+1);
        }
        List<Integer> arr= new ArrayList<>(hash.values());
         Collections.sort(arr);
         if(arr.get(arr.size()-1)>2) return false;
         return true;
    }
}