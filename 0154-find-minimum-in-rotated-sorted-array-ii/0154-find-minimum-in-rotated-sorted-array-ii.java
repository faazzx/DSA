class Solution {
    public int findMin(int[] nums) {
       PriorityQueue<Integer> n = new PriorityQueue<>();
       for(int i=0;i<nums.length;i++){
        n.add(nums[i]);
       }
       return n.poll();
    }
}