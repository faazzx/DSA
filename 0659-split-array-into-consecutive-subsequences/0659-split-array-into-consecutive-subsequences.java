class Solution {
    public boolean isPossible(int[] nums) {
        HashMap<Integer, Integer> availmap= new HashMap<>();
        HashMap<Integer, Integer> vacmap= new HashMap<>();
        int size=nums.length;
         for(int i=0;i<size;i++){
            availmap.put(nums[i], availmap.getOrDefault(nums[i],0)+1);
         }


         for(int i=0; i<size;i++){
            if(availmap.get(nums[i])<=0) continue;
            else if(vacmap.getOrDefault(nums[i],0)>0){
                vacmap.put(nums[i], vacmap.get(nums[i])-1);
                availmap.put(nums[i], availmap.get(nums[i])-1);
                vacmap.put(nums[i]+1, vacmap.getOrDefault(nums[i]+1,0)+1);

            }
            else if( availmap.getOrDefault(nums[i]+1,0)>0 && availmap.getOrDefault(nums[i]+2,0)>0){
                availmap.put(nums[i], availmap.getOrDefault(nums[i],0)-1);
                availmap.put(nums[i]+1, availmap.getOrDefault(nums[i]+1,0)-1);
                availmap.put(nums[i]+2, availmap.getOrDefault(nums[i]+2,0)-1);
                vacmap.put(nums[i]+3, vacmap.getOrDefault(nums[i]+3,0)+1);
            }
            else {
                return false;
            }

         }
         return true;
    }
}